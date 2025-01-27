
package com.helger.phase4.soap12;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.namespace.QName;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.helger.phase4.soap12 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.<p>This class was annotated by ph-jaxb-plugin -Xph-annotate</p>
 * 
 * 
 */
@XmlRegistry
@CodingStyleguideUnaware
public class ObjectFactory {

    public static final QName _Envelope_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Envelope");
    public static final QName _Header_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Header");
    public static final QName _Body_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Body");
    public static final QName _Fault_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Fault");
    public static final QName _NotUnderstood_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "NotUnderstood");
    public static final QName _Upgrade_QNAME = new QName("http://www.w3.org/2003/05/soap-envelope", "Upgrade");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.phase4.soap12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Soap12Envelope }
     * 
     * @return
     *     the new instance of {@link Soap12Envelope } The created Soap12Envelope object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Envelope createSoap12Envelope() {
        return new Soap12Envelope();
    }

    /**
     * Create an instance of {@link Soap12Header }
     * 
     * @return
     *     the new instance of {@link Soap12Header } The created Soap12Header object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Header createSoap12Header() {
        return new Soap12Header();
    }

    /**
     * Create an instance of {@link Soap12Body }
     * 
     * @return
     *     the new instance of {@link Soap12Body } The created Soap12Body object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Body createSoap12Body() {
        return new Soap12Body();
    }

    /**
     * Create an instance of {@link Soap12Fault }
     * 
     * @return
     *     the new instance of {@link Soap12Fault } The created Soap12Fault object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Fault createSoap12Fault() {
        return new Soap12Fault();
    }

    /**
     * Create an instance of {@link Soap12NotUnderstoodType }
     * 
     * @return
     *     the new instance of {@link Soap12NotUnderstoodType } The created Soap12NotUnderstoodType object and never <code>null</code>.
     */
    @Nonnull
    public Soap12NotUnderstoodType createSoap12NotUnderstoodType() {
        return new Soap12NotUnderstoodType();
    }

    /**
     * Create an instance of {@link Soap12UpgradeType }
     * 
     * @return
     *     the new instance of {@link Soap12UpgradeType } The created Soap12UpgradeType object and never <code>null</code>.
     */
    @Nonnull
    public Soap12UpgradeType createSoap12UpgradeType() {
        return new Soap12UpgradeType();
    }

    /**
     * Create an instance of {@link Soap12Faultreason }
     * 
     * @return
     *     the new instance of {@link Soap12Faultreason } The created Soap12Faultreason object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Faultreason createSoap12Faultreason() {
        return new Soap12Faultreason();
    }

    /**
     * Create an instance of {@link Soap12Reasontext }
     * 
     * @return
     *     the new instance of {@link Soap12Reasontext } The created Soap12Reasontext object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Reasontext createSoap12Reasontext() {
        return new Soap12Reasontext();
    }

    /**
     * Create an instance of {@link Soap12Faultcode }
     * 
     * @return
     *     the new instance of {@link Soap12Faultcode } The created Soap12Faultcode object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Faultcode createSoap12Faultcode() {
        return new Soap12Faultcode();
    }

    /**
     * Create an instance of {@link Soap12Subcode }
     * 
     * @return
     *     the new instance of {@link Soap12Subcode } The created Soap12Subcode object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Subcode createSoap12Subcode() {
        return new Soap12Subcode();
    }

    /**
     * Create an instance of {@link Soap12Detail }
     * 
     * @return
     *     the new instance of {@link Soap12Detail } The created Soap12Detail object and never <code>null</code>.
     */
    @Nonnull
    public Soap12Detail createSoap12Detail() {
        return new Soap12Detail();
    }

    /**
     * Create an instance of {@link Soap12SupportedEnvType }
     * 
     * @return
     *     the new instance of {@link Soap12SupportedEnvType } The created Soap12SupportedEnvType object and never <code>null</code>.
     */
    @Nonnull
    public Soap12SupportedEnvType createSoap12SupportedEnvType() {
        return new Soap12SupportedEnvType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12Envelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12Envelope }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Envelope")
    @Nonnull
    public JAXBElement<Soap12Envelope> createEnvelope(
        @Nullable
        final Soap12Envelope value) {
        return new JAXBElement<>(_Envelope_QNAME, Soap12Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12Header }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12Header }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Header")
    @Nonnull
    public JAXBElement<Soap12Header> createHeader(
        @Nullable
        final Soap12Header value) {
        return new JAXBElement<>(_Header_QNAME, Soap12Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12Body }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12Body }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Body")
    @Nonnull
    public JAXBElement<Soap12Body> createBody(
        @Nullable
        final Soap12Body value) {
        return new JAXBElement<>(_Body_QNAME, Soap12Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12Fault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12Fault }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Fault")
    @Nonnull
    public JAXBElement<Soap12Fault> createFault(
        @Nullable
        final Soap12Fault value) {
        return new JAXBElement<>(_Fault_QNAME, Soap12Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12NotUnderstoodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12NotUnderstoodType }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "NotUnderstood")
    @Nonnull
    public JAXBElement<Soap12NotUnderstoodType> createNotUnderstood(
        @Nullable
        final Soap12NotUnderstoodType value) {
        return new JAXBElement<>(_NotUnderstood_QNAME, Soap12NotUnderstoodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap12UpgradeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap12UpgradeType }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2003/05/soap-envelope", name = "Upgrade")
    @Nonnull
    public JAXBElement<Soap12UpgradeType> createUpgrade(
        @Nullable
        final Soap12UpgradeType value) {
        return new JAXBElement<>(_Upgrade_QNAME, Soap12UpgradeType.class, null, value);
    }

}
