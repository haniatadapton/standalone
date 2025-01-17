/*
 * Copyright (C) 2023-204 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.phase4.peppolstandalone.servlet;

import java.io.File;
import java.security.KeyStore;

import javax.annotation.Nonnull;

import com.helger.commons.http.EHttpMethod;
import com.helger.commons.url.URLHelper;
import com.helger.phase4.dump.AS4DumpManager;
import com.helger.phase4.dump.AS4IncomingDumperFileBased;
import com.helger.phase4.dump.AS4OutgoingDumperFileBased;
import com.helger.phase4.incoming.AS4IncomingProfileSelectorFromGlobal;
import com.helger.phase4.incoming.AS4RequestHandler;
import com.helger.phase4.mgr.MetaAS4Manager;
import com.helger.phase4.peppol.servlet.Phase4PeppolDefaultReceiverConfiguration;
import com.helger.phase4.profile.peppol.PeppolCRLDownloader;
import com.helger.phase4.profile.peppol.Phase4PeppolHttpClientSettings;
import com.helger.phase4.servlet.AS4UnifiedResponse;
import com.helger.phase4.servlet.AS4XServletHandler;
import com.helger.phase4.servlet.IAS4ServletRequestHandlerCustomizer;
import com.helger.smpclient.peppol.SMPClientReadOnly;
import com.helger.web.scope.IRequestWebScopeWithoutResponse;
import com.helger.xservlet.AbstractXServlet;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.exception.InitializationException;
import com.helger.commons.mime.CMimeType;
import com.helger.commons.string.StringHelper;
import com.helger.httpclient.HttpDebugger;
import com.helger.phase4.config.AS4Configuration;
import com.helger.phase4.crypto.AS4CryptoFactoryProperties;
import com.helger.phase4.crypto.IAS4CryptoFactory;
import com.helger.phase4.incoming.AS4ServerInitializer;
import com.helger.phase4.incoming.mgr.AS4ProfileSelector;
//import com.helger.phase4.profile.peppol.AS4PeppolProfileRegistarSPI;
import com.helger.phase4.profile.bdew.AS4BDEWProfileRegistarSPI;
import com.helger.photon.io.WebFileIO;
import com.helger.servlet.ServletHelper;
import com.helger.web.scope.mgr.WebScopeManager;
import com.helger.xservlet.requesttrack.RequestTrackerSettings;

import jakarta.activation.CommandMap;
import jakarta.servlet.ServletContext;

//@Configuration
//public class ServletConfig {
//  private static final Logger LOGGER = LoggerFactory.getLogger (ServletConfig.class);
//
//  @Bean
//  public ServletRegistrationBean<AS4BDEWServlet> registerAS4BDWEWServlet(final ServletContext servletContext) {
//    init(servletContext);
//    final AS4BDEWServlet servlet = new AS4BDEWServlet();
//    ServletRegistrationBean<AS4BDEWServlet> bean = new ServletRegistrationBean<>(servlet, true, "/as4");
//    bean.setLoadOnStartup(1);
//    return bean;
//  }
//
//  private void init(final ServletContext servletContext) {
//
//    // Do it only once
//    if (!WebScopeManager.isGlobalScopePresent()) {
//      WebScopeManager.onGlobalBegin(servletContext);
//      initGlobalSettings(servletContext);
//      initAS4();
//    }
//  }
//
//  /**
//   * This method is used to initialize the global settings for the application.
//   *
//   * @param servletContext The servlet context of the application.
//   */
//  private void initGlobalSettings(@Nonnull final ServletContext servletContext) {
//    // Logging: JUL to SLF4J
//    SLF4JBridgeHandler.removeHandlersForRootLogger();
//    SLF4JBridgeHandler.install();
//
//    if (GlobalDebug.isDebugMode()) {
//      RequestTrackerSettings.setLongRunningRequestsCheckEnabled(false);
//      RequestTrackerSettings.setParallelRunningRequestsCheckEnabled(false);
//      HttpDebugger.setEnabled(false);
//    }
//
//    // Sanity check
//    if (CommandMap.getDefaultCommandMap().createDataContentHandler(CMimeType.MULTIPART_RELATED.getAsString()) ==
//            null) {
//      throw new IllegalStateException("No DataContentHandler for MIME Type '" +
//              CMimeType.MULTIPART_RELATED.getAsString() +
//              "' is available. There seems to be a problem with the dependencies/packaging");
//    }
//
//    // Init the data path
//    {
//      // Get the ServletContext base path
//      final String sServletContextPath = ServletHelper.getServletContextBasePath (servletContext);
//      // Get the data path
//      final String sDataPath = AS4Configuration.getDataPath ();
//      if (StringHelper.hasNoText (sDataPath))
//        throw new InitializationException ("No data path was provided!");
//      final boolean bFileAccessCheck = false;
//      // Init the IO layer
//      WebFileIO.initPaths (new File (sDataPath).getAbsoluteFile (), sServletContextPath, bFileAccessCheck);
//    }
//  }
//
//  private void initAS4() {
//    AS4ProfileSelector.setCustomAS4ProfileID(AS4BDEWProfileRegistarSPI.AS4_PROFILE_ID);
//    AS4ServerInitializer.initAS4Server();

//
//  public static IAS4CryptoFactory getCryptoFactoryToUse() {
//      return AS4CryptoFactoryProperties.getDefaultInstance();
//  }
//}


@Configuration
public class ServletConfig
{
  private static final Logger LOGGER = LoggerFactory.getLogger (ServletConfig.class);

  /**
   * This method is a placeholder for retrieving a custom
   * {@link IAS4CryptoFactory}.
   *
   * @return the {@link IAS4CryptoFactory} to use. May not be <code>null</code>.
   */
  @Nonnull
  public static IAS4CryptoFactory getCryptoFactoryToUse ()
  {
      // If you have a custom crypto factory, build/return it here
    return AS4CryptoFactoryProperties.getDefaultInstance ();
  }

  public static class AS4BDEWServlet extends AbstractXServlet
  {
    public AS4BDEWServlet ()
    {
      // Multipart is handled specifically inside
      settings ().setMultipartEnabled (false);
      // HTTP POST only
      final AS4XServletHandler hdl = new AS4XServletHandler ();
      hdl.setRequestHandlerCustomizer (new IAS4ServletRequestHandlerCustomizer()
      {
        public void customizeBeforeHandling (@Nonnull final IRequestWebScopeWithoutResponse aRequestScope,
                                             @Nonnull final AS4UnifiedResponse aUnifiedResponse,
                                             @Nonnull final AS4RequestHandler aRequestHandler)
        {
          aRequestHandler.setCryptoFactory (ServletConfig.getCryptoFactoryToUse ());
//          aRequestHandler.setIncomingProfileSelector (new AS4IncomingProfileSelectorFromGlobal()
//          {
//            public boolean validateAgainstProfile ()
//            {
//              // override;
//              return false;
//            }
//          });
        }

        public void customizeAfterHandling (@Nonnull final IRequestWebScopeWithoutResponse aRequestScope,
                                            @Nonnull final AS4UnifiedResponse aUnifiedResponse,
                                            @Nonnull final AS4RequestHandler aRequestHandler)
        {}

      });
      handlerRegistry ().registerHandler (EHttpMethod.POST, hdl);
    }
  }

  @Bean
  public ServletRegistrationBean <AS4BDEWServlet> registerAS4BDWEWServlet (final ServletContext servletContext)
  {
    // Must be called BEFORE the servlet is instantiated
    _init (servletContext);
    final AS4BDEWServlet servlet = new AS4BDEWServlet();
    final ServletRegistrationBean <AS4BDEWServlet> bean = new ServletRegistrationBean <> (servlet,
                                                                                        true,
                                                                                        "/as4");
    bean.setLoadOnStartup (1);
    return bean;
  }

  private void _init (@Nonnull final ServletContext aSC)
  {
    // Do it only once
    if (!WebScopeManager.isGlobalScopePresent ())
    {
      WebScopeManager.onGlobalBegin (aSC);
      _initGlobalSettings (aSC);
      _initAS4 ();
      //_initPeppolAS4 ();
    }
  }

  private static void _initGlobalSettings (@Nonnull final ServletContext aSC)
  {
    // Logging: JUL to SLF4J
    SLF4JBridgeHandler.removeHandlersForRootLogger ();
    SLF4JBridgeHandler.install ();

    if (GlobalDebug.isDebugMode ())
    {
      RequestTrackerSettings.setLongRunningRequestsCheckEnabled (false);
      RequestTrackerSettings.setParallelRunningRequestsCheckEnabled (false);
    }

    HttpDebugger.setEnabled (false);

    // Sanity check
    if (CommandMap.getDefaultCommandMap ().createDataContentHandler (CMimeType.MULTIPART_RELATED.getAsString ()) ==
        null)
    {
      throw new IllegalStateException ("No DataContentHandler for MIME Type '" +
                                       CMimeType.MULTIPART_RELATED.getAsString () +
                                       "' is available. There seems to be a problem with the dependencies/packaging");
    }

    // Init the data path
    {
      // Get the ServletContext base path
      final String sServletContextPath = ServletHelper.getServletContextBasePath (aSC);
      // Get the data path
      final String sDataPath = AS4Configuration.getDataPath ();
      if (StringHelper.hasNoText (sDataPath))
        throw new InitializationException ("No data path was provided!");
      final boolean bFileAccessCheck = false;
      // Init the IO layer
      WebFileIO.initPaths (new File (sDataPath).getAbsoluteFile (), sServletContextPath, bFileAccessCheck);
    }
  }

  private static void _initAS4 ()
  {

    MetaAS4Manager.getProfileMgr().setDefaultProfile(MetaAS4Manager.getProfileMgr().getProfileOfID("bdew"));
    LOGGER.info("defualt profile:" );
    LOGGER.info(String.valueOf(MetaAS4Manager.getProfileMgr().getDefaultProfile()));


    //MetaAS4Manager.getPModeMgr()


    // Enforce BDEW profile usage
    AS4ProfileSelector.setCustomAS4ProfileID (AS4BDEWProfileRegistarSPI.AS4_PROFILE_ID);

//    LOGGER.info("available profiles after adding bdew:" );
//    LOGGER.info(MetaAS4Manager.getProfileMgr().getAllProfiles().toString());

    AS4ServerInitializer.initAS4Server ();

    // TODO dump all messages to a file
    AS4DumpManager.setIncomingDumper (new AS4IncomingDumperFileBased());
    AS4DumpManager.setOutgoingDumper (new AS4OutgoingDumperFileBased());
  }


  // -> _initPeppolAS4 is not used but kept for refrence
  private static void _initPeppolAS4 ()
  {
    // Our server expects all SBDH to contain the COUNTRY_C1 element in SBDH
    // (this is the default setting, but added it here for easy modification)
    //Phase4PeppolDefaultReceiverConfiguration.setCheckSBDHForMandatoryCountryC1 (true);

    // Our server should check all signing certificates of incoming messages if
    // they are revoked or not
    // (this is the default setting, but added it here for easy modification)
    Phase4PeppolDefaultReceiverConfiguration.setCheckSigningCertificateRevocation (true);

    // Make sure the download of CRL is using Apache HttpClient and that the
    // provided settings are used. If e.g. a proxy is needed to access outbound
    // resources, it can be configured here
    PeppolCRLDownloader.setAsDefaultCRLCache (new Phase4PeppolHttpClientSettings());

    // Check if crypto properties are okay
    final KeyStore aKS = AS4CryptoFactoryProperties.getDefaultInstance ().getKeyStore ();
    if (aKS == null)
      throw new InitializationException ("Failed to load configured AS4 Key store - fix the configuration");
    LOGGER.info ("Successfully loaded configured AS4 key store from the crypto factory");

    final KeyStore.PrivateKeyEntry aPKE = AS4CryptoFactoryProperties.getDefaultInstance ().getPrivateKeyEntry ();
    if (aPKE == null)
      throw new InitializationException ("Failed to load configured AS4 private key - fix the configuration");
    LOGGER.info ("Successfully loaded configured AS4 private key from the crypto factory");

    // Check the configured Peppol AP certificate
    // * No caching
    // * Use global certificate check mode
//    final X509Certificate aAPCert = (X509Certificate) aPKE.getCertificate ();
//    final EPeppolCertificateCheckResult eCheckResult = PeppolCertificateChecker.checkPeppolAPCertificate (aAPCert,
//                                                                                                          MetaAS4Manager.getTimestampMgr ()
//                                                                                                                        .getCurrentDateTime (),
//                                                                                                          ETriState.FALSE,
//                                                                                                          null);
//    if (eCheckResult.isInvalid ())
//    {
//      // TODO Change from "true" to "false" once you have a Peppol
//      // certificate so that an exception is thrown
//      if (false)
//        LOGGER.error ("The provided certificate is not a Peppol certificate. Check result: " + eCheckResult);
//      else
//      {
//        throw new InitializationException ("The provided certificate is not a Peppol certificate. Check result: " +
//                                           eCheckResult);
//      }
//
//    }
//    else
//      LOGGER.info ("Sucessfully checked that the provided Peppol AP certificate is valid.");

    // Eventually enable the receiver check, so that for each incoming request
    // the validity is crosscheck against the owning SMP
    final String sSMPURL = AS4Configuration.getConfig ().getAsString ("smp.url");
    final String sAPURL = AS4Configuration.getThisEndpointAddress ();
    if (StringHelper.hasText (sSMPURL) && StringHelper.hasText (sAPURL))
    {
      // To process the message even though the receiver is not registered in
      // our AP
      Phase4PeppolDefaultReceiverConfiguration.setReceiverCheckEnabled (true);
      Phase4PeppolDefaultReceiverConfiguration.setSMPClient (new SMPClientReadOnly(URLHelper.getAsURI (sSMPURL)));
      Phase4PeppolDefaultReceiverConfiguration.setAS4EndpointURL (sAPURL);
      //Phase4PeppolDefaultReceiverConfiguration.setAPCertificate (aAPCert);
      LOGGER.info ("phase4 Peppol receiver checks are enabled");
    }
    else
    {
      Phase4PeppolDefaultReceiverConfiguration.setReceiverCheckEnabled (false);
      LOGGER.warn ("phase4 Peppol receiver checks are disabled");
    }
  }

  /**
   * Special class that is only present to have a graceful shutdown.
   *
   * @author Philip Helger
   */
  private static final class Destroyer
  {
    @PreDestroy
    public void destroy ()
    {
      if (WebScopeManager.isGlobalScopePresent ())
      {
        AS4ServerInitializer.shutdownAS4Server ();
        WebFileIO.resetPaths ();
        WebScopeManager.onGlobalEnd ();
      }
    }
  }

  @Bean
  public Destroyer destroyer ()
  {
    return new Destroyer ();
  }
}
