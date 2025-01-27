
package com.helger.phase4.ebms3header;

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
 * generated in the com.helger.phase4.ebms3header package. 
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

    public static final QName _Messaging_QNAME = new QName("http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/", "Messaging");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.phase4.ebms3header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception } The created Exception object and never <code>null</code>.
     */
    @Nonnull
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link EbbpSigSignalIdentificationInformation }
     * 
     * @return
     *     the new instance of {@link EbbpSigSignalIdentificationInformation } The created EbbpSigSignalIdentificationInformation object and never <code>null</code>.
     */
    @Nonnull
    public EbbpSigSignalIdentificationInformation createEbbpSigSignalIdentificationInformation() {
        return new EbbpSigSignalIdentificationInformation();
    }

    /**
     * Create an instance of {@link EbbpSigPartyInfoType }
     * 
     * @return
     *     the new instance of {@link EbbpSigPartyInfoType } The created EbbpSigPartyInfoType object and never <code>null</code>.
     */
    @Nonnull
    public EbbpSigPartyInfoType createEbbpSigPartyInfoType() {
        return new EbbpSigPartyInfoType();
    }

    /**
     * Create an instance of {@link EbbpSigRoleType }
     * 
     * @return
     *     the new instance of {@link EbbpSigRoleType } The created EbbpSigRoleType object and never <code>null</code>.
     */
    @Nonnull
    public EbbpSigRoleType createEbbpSigRoleType() {
        return new EbbpSigRoleType();
    }

    /**
     * Create an instance of {@link EbbpSigProcessSpecificationInfoType }
     * 
     * @return
     *     the new instance of {@link EbbpSigProcessSpecificationInfoType } The created EbbpSigProcessSpecificationInfoType object and never <code>null</code>.
     */
    @Nonnull
    public EbbpSigProcessSpecificationInfoType createEbbpSigProcessSpecificationInfoType() {
        return new EbbpSigProcessSpecificationInfoType();
    }

    /**
     * Create an instance of {@link Exception.ExceptionType }
     * 
     * @return
     *     the new instance of {@link Exception.ExceptionType } The created ExceptionType object and never <code>null</code>.
     */
    @Nonnull
    public Exception.ExceptionType createExceptionExceptionType() {
        return new Exception.ExceptionType();
    }

    /**
     * Create an instance of {@link ReceiptAcknowledgement }
     * 
     * @return
     *     the new instance of {@link ReceiptAcknowledgement } The created ReceiptAcknowledgement object and never <code>null</code>.
     */
    @Nonnull
    public ReceiptAcknowledgement createReceiptAcknowledgement() {
        return new ReceiptAcknowledgement();
    }

    /**
     * Create an instance of {@link NonRepudiationInformation }
     * 
     * @return
     *     the new instance of {@link NonRepudiationInformation } The created NonRepudiationInformation object and never <code>null</code>.
     */
    @Nonnull
    public NonRepudiationInformation createNonRepudiationInformation() {
        return new NonRepudiationInformation();
    }

    /**
     * Create an instance of {@link MessagePartNRInformation }
     * 
     * @return
     *     the new instance of {@link MessagePartNRInformation } The created MessagePartNRInformation object and never <code>null</code>.
     */
    @Nonnull
    public MessagePartNRInformation createMessagePartNRInformation() {
        return new MessagePartNRInformation();
    }

    /**
     * Create an instance of {@link AcceptanceAcknowledgement }
     * 
     * @return
     *     the new instance of {@link AcceptanceAcknowledgement } The created AcceptanceAcknowledgement object and never <code>null</code>.
     */
    @Nonnull
    public AcceptanceAcknowledgement createAcceptanceAcknowledgement() {
        return new AcceptanceAcknowledgement();
    }

    /**
     * Create an instance of {@link Ebms3Messaging }
     * 
     * @return
     *     the new instance of {@link Ebms3Messaging } The created Ebms3Messaging object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Messaging createEbms3Messaging() {
        return new Ebms3Messaging();
    }

    /**
     * Create an instance of {@link Ebms3SignalMessage }
     * 
     * @return
     *     the new instance of {@link Ebms3SignalMessage } The created Ebms3SignalMessage object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3SignalMessage createEbms3SignalMessage() {
        return new Ebms3SignalMessage();
    }

    /**
     * Create an instance of {@link Ebms3Error }
     * 
     * @return
     *     the new instance of {@link Ebms3Error } The created Ebms3Error object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Error createEbms3Error() {
        return new Ebms3Error();
    }

    /**
     * Create an instance of {@link Ebms3PullRequest }
     * 
     * @return
     *     the new instance of {@link Ebms3PullRequest } The created Ebms3PullRequest object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PullRequest createEbms3PullRequest() {
        return new Ebms3PullRequest();
    }

    /**
     * Create an instance of {@link Ebms3Receipt }
     * 
     * @return
     *     the new instance of {@link Ebms3Receipt } The created Ebms3Receipt object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Receipt createEbms3Receipt() {
        return new Ebms3Receipt();
    }

    /**
     * Create an instance of {@link Ebms3UserMessage }
     * 
     * @return
     *     the new instance of {@link Ebms3UserMessage } The created Ebms3UserMessage object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3UserMessage createEbms3UserMessage() {
        return new Ebms3UserMessage();
    }

    /**
     * Create an instance of {@link Ebms3MessageInfo }
     * 
     * @return
     *     the new instance of {@link Ebms3MessageInfo } The created Ebms3MessageInfo object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3MessageInfo createEbms3MessageInfo() {
        return new Ebms3MessageInfo();
    }

    /**
     * Create an instance of {@link Ebms3PartyInfo }
     * 
     * @return
     *     the new instance of {@link Ebms3PartyInfo } The created Ebms3PartyInfo object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PartyInfo createEbms3PartyInfo() {
        return new Ebms3PartyInfo();
    }

    /**
     * Create an instance of {@link Ebms3PartyId }
     * 
     * @return
     *     the new instance of {@link Ebms3PartyId } The created Ebms3PartyId object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PartyId createEbms3PartyId() {
        return new Ebms3PartyId();
    }

    /**
     * Create an instance of {@link Ebms3From }
     * 
     * @return
     *     the new instance of {@link Ebms3From } The created Ebms3From object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3From createEbms3From() {
        return new Ebms3From();
    }

    /**
     * Create an instance of {@link Ebms3To }
     * 
     * @return
     *     the new instance of {@link Ebms3To } The created Ebms3To object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3To createEbms3To() {
        return new Ebms3To();
    }

    /**
     * Create an instance of {@link Ebms3CollaborationInfo }
     * 
     * @return
     *     the new instance of {@link Ebms3CollaborationInfo } The created Ebms3CollaborationInfo object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3CollaborationInfo createEbms3CollaborationInfo() {
        return new Ebms3CollaborationInfo();
    }

    /**
     * Create an instance of {@link Ebms3Service }
     * 
     * @return
     *     the new instance of {@link Ebms3Service } The created Ebms3Service object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Service createEbms3Service() {
        return new Ebms3Service();
    }

    /**
     * Create an instance of {@link Ebms3AgreementRef }
     * 
     * @return
     *     the new instance of {@link Ebms3AgreementRef } The created Ebms3AgreementRef object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3AgreementRef createEbms3AgreementRef() {
        return new Ebms3AgreementRef();
    }

    /**
     * Create an instance of {@link Ebms3PayloadInfo }
     * 
     * @return
     *     the new instance of {@link Ebms3PayloadInfo } The created Ebms3PayloadInfo object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PayloadInfo createEbms3PayloadInfo() {
        return new Ebms3PayloadInfo();
    }

    /**
     * Create an instance of {@link Ebms3PartInfo }
     * 
     * @return
     *     the new instance of {@link Ebms3PartInfo } The created Ebms3PartInfo object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PartInfo createEbms3PartInfo() {
        return new Ebms3PartInfo();
    }

    /**
     * Create an instance of {@link Ebms3Schema }
     * 
     * @return
     *     the new instance of {@link Ebms3Schema } The created Ebms3Schema object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Schema createEbms3Schema() {
        return new Ebms3Schema();
    }

    /**
     * Create an instance of {@link Ebms3Property }
     * 
     * @return
     *     the new instance of {@link Ebms3Property } The created Ebms3Property object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Property createEbms3Property() {
        return new Ebms3Property();
    }

    /**
     * Create an instance of {@link Ebms3PartProperties }
     * 
     * @return
     *     the new instance of {@link Ebms3PartProperties } The created Ebms3PartProperties object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3PartProperties createEbms3PartProperties() {
        return new Ebms3PartProperties();
    }

    /**
     * Create an instance of {@link Ebms3MessageProperties }
     * 
     * @return
     *     the new instance of {@link Ebms3MessageProperties } The created Ebms3MessageProperties object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3MessageProperties createEbms3MessageProperties() {
        return new Ebms3MessageProperties();
    }

    /**
     * Create an instance of {@link Ebms3Description }
     * 
     * @return
     *     the new instance of {@link Ebms3Description } The created Ebms3Description object and never <code>null</code>.
     */
    @Nonnull
    public Ebms3Description createEbms3Description() {
        return new Ebms3Description();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ebms3Messaging }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ebms3Messaging }{@code >} The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/", name = "Messaging")
    @Nonnull
    public JAXBElement<Ebms3Messaging> createMessaging(
        @Nullable
        final Ebms3Messaging value) {
        return new JAXBElement<>(_Messaging_QNAME, Ebms3Messaging.class, null, value);
    }

}
