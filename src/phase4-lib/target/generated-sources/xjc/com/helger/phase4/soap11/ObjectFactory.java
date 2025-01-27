
package com.helger.phase4.soap11;

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
 * generated in the com.helger.phase4.soap11 package. 
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

    public static final QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    public static final QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");
    public static final QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    public static final QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.phase4.soap11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Soap11Envelope }
     * 
     * @return
     *     the new instance of {@link Soap11Envelope } The created Soap11Envelope object and never <code>null</code>.
     */
    @Nonnull
    public Soap11Envelope createSoap11Envelope() {
        return new Soap11Envelope();
    }

    /**
     * Create an instance of {@link Soap11Header }
     * 
     * @return
     *     the new instance of {@link Soap11Header } The created Soap11Header object and never <code>null</code>.
     */
    @Nonnull
    public Soap11Header createSoap11Header() {
        return new Soap11Header();
    }

    /**
     * Create an instance of {@link Soap11Body }
     * 
     * @return
     *     the new instance of {@link Soap11Body } The created Soap11Body object and never <code>null</code>.
     */
    @Nonnull
    public Soap11Body createSoap11Body() {
        return new Soap11Body();
    }

    /**
     * Create an instance of {@link Soap11Fault }
     * 
     * @return
     *     the new instance of {@link Soap11Fault } The created Soap11Fault object and never <code>null</code>.
     */
    @Nonnull
    public Soap11Fault createSoap11Fault() {
        return new Soap11Fault();
    }

    /**
     * Create an instance of {@link Soap11Detail }
     * 
     * @return
     *     the new instance of {@link Soap11Detail } The created Soap11Detail object and never <code>null</code>.
     */
    @Nonnull
    public Soap11Detail createSoap11Detail() {
        return new Soap11Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap11Envelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap11Envelope }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    @Nonnull
    public JAXBElement<Soap11Envelope> createEnvelope(
        @Nullable
        final Soap11Envelope value) {
        return new JAXBElement<>(_Envelope_QNAME, Soap11Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap11Header }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap11Header }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
    @Nonnull
    public JAXBElement<Soap11Header> createHeader(
        @Nullable
        final Soap11Header value) {
        return new JAXBElement<>(_Header_QNAME, Soap11Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap11Body }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap11Body }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
    @Nonnull
    public JAXBElement<Soap11Body> createBody(
        @Nullable
        final Soap11Body value) {
        return new JAXBElement<>(_Body_QNAME, Soap11Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soap11Fault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soap11Fault }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
    @Nonnull
    public JAXBElement<Soap11Fault> createFault(
        @Nullable
        final Soap11Fault value) {
        return new JAXBElement<>(_Fault_QNAME, Soap11Fault.class, null, value);
    }

}
