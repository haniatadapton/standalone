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
package com.helger.phase4.peppolstandalone.spi;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import com.helger.commons.annotation.IsSPIImplementation;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.http.HttpHeaderMap;
import com.helger.phase4.attachment.WSS4JAttachment;
import com.helger.phase4.ebms3header.Ebms3Error;
import com.helger.phase4.ebms3header.Ebms3SignalMessage;
import com.helger.phase4.ebms3header.Ebms3UserMessage;
import com.helger.phase4.incoming.IAS4IncomingMessageMetadata;
import com.helger.phase4.incoming.IAS4IncomingMessageState;
import com.helger.phase4.incoming.spi.AS4MessageProcessorResult;
import com.helger.phase4.incoming.spi.AS4SignalMessageProcessorResult;
import com.helger.phase4.incoming.spi.IAS4IncomingMessageProcessorSPI;
import com.helger.phase4.model.pmode.IPMode;

/**
 * This is a way of handling incoming AS4 messages
 *
 * @author Philip Helger
 */
@IsSPIImplementation
public class CustomIncomingHandlerSPI implements IAS4IncomingMessageProcessorSPI
{
  private static final Logger LOGGER = LoggerFactory.getLogger (CustomIncomingHandlerSPI.class);

  public AS4MessageProcessorResult processAS4UserMessage (@Nonnull IAS4IncomingMessageMetadata aIncomingMessageMetadata,
                                                          @Nonnull HttpHeaderMap aHttpHeaders,
                                                          @Nonnull Ebms3UserMessage aUserMessage,
                                                          @Nonnull IPMode aPMode,
                                                          @Nullable Node aPayload,
                                                          @Nullable ICommonsList <WSS4JAttachment> aIncomingAttachments,
                                                          @Nonnull IAS4IncomingMessageState aIncomingState,
                                                          @Nonnull ICommonsList <Ebms3Error> aProcessingErrorMessages)
  {
    LOGGER.info ("TODO handle incoming AS4 User Message");
    // TODO handle incoming AS4 User Message
    return AS4MessageProcessorResult.createSuccess ();
  }

  public AS4SignalMessageProcessorResult processAS4SignalMessage (@Nonnull IAS4IncomingMessageMetadata aIncomingMessageMetadata,
                                                                  @Nonnull HttpHeaderMap aHttpHeaders,
                                                                  @Nonnull Ebms3SignalMessage aSignalMessage,
                                                                  @Nullable IPMode aPMode,
                                                                  @Nonnull IAS4IncomingMessageState aIncomingState,
                                                                  @Nonnull ICommonsList <Ebms3Error> aProcessingErrorMessages)
  {
    LOGGER.info ("TODO handle incoming AS4 Signal Message");
   // TODO handle incoming AS4 Signal Message
    return AS4SignalMessageProcessorResult.createSuccess ();
  }

  public void processAS4ResponseMessage (IAS4IncomingMessageMetadata aIncomingMessageMetadata,
                                         IAS4IncomingMessageState aIncomingState,
                                         String sResponseMessageID,
                                         byte [] aResponseBytes,
                                         boolean bResponsePayloadIsAvailable)
  {
    // nothing to do
  }
}
