
package com.helger.phase4.ebms3header;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.datetime.XMLOffsetDateTime;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.IExplicitlyCloneable;
import com.helger.commons.string.ToStringGenerator;
import com.helger.jaxb.adapter.AdapterXMLOffsetDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This defines the content structure for identiying various parameters
 * 				pertaining to the business signal. "OriginalMessageIdentifier" captures the value of
 * 				the transport message identifier for original message to which this business signal
 * 				is being sent. If business message has an identifier, that can be captured by the
 * 				"OriginalDocumentIdentifier" attribute. "OriginalMessageDateTime" is the time when
 * 				the original message was sent. "ThisMessageDateTime" is the time when this signal
 * 				message is being sent. The following optional elements are there to provide access
 * 				to information that can be used by processing logic outside the business process
 * 				engine. One example of this could be a monitoring application which can use this
 * 				information to provide status of a collaboration. "FromPartyInfo" describes the
 * 				party id that is sending the signal message. "ToPartyInfo" describes the party id
 * 				that is being sent the signal message. The roles described below are based on the
 * 				implicit relationship between the partner sending the signal message and the partner
 * 				who sent the original message to which this particular signal is being sent. The
 * 				role relationship between partner sending the business message and the partner
 * 				receiving it is captured in the process definition (ebBP). "FromRole" captures the
 * 				role being played by the party that is sending the signal message. "ToRole" captures
 * 				the role played by the party that is being sent the signal message.
 * 				"ProcessSpecificationInfo" type descibes the process information (ebBP) which
 * 				defines the runtime collaborations for which this signal is being sent
 * 				"CollaborationIdentifier" is the unique identifer that associates the signal with a
 * 				particular collaboration. This could come from the business message itself or in
 * 				case of ebXML MSH, could be the messaging level header "ConversationId"
 * 				"BusinessActivityIdentifier" identifies the business Requesting or Responding
 * 				activity to which this signal is being sent. This would identify the
 * 				"BusinessAction" from the process definition (ebBP) and could be implemented using
 * 				the "name" attribute on either the RequestingBusinessActivity or the
 * 				RespondingBusinessActivity.
 * 
 * <p>Java class for SignalIdentificationInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignalIdentificationInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OriginalMessageIdentifier" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string"/>
 *         <element name="OriginalDocumentIdentifier" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string" minOccurs="0"/>
 *         <element name="OriginalMessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="ThisMessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="FromPartyInfo" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}PartyInfoType" minOccurs="0"/>
 *         <element name="ToPartyInfo" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}PartyInfoType" minOccurs="0"/>
 *         <element name="FromRole" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}RoleType" minOccurs="0"/>
 *         <element name="ToRole" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}RoleType" minOccurs="0"/>
 *         <element name="ProcessSpecificationInfo" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}ProcessSpecificationInfoType" minOccurs="0"/>
 *         <element name="CollaborationIdentifier" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string" minOccurs="0"/>
 *         <element name="BusinessActivityIdentifier" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * <p>This class was annotated by ph-jaxb-plugin -Xph-annotate</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-equalshashcode</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-tostring</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-cloneable2</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-value-extender</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-offset-dt-extension</p>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalIdentificationInformation", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0", propOrder = {
    "originalMessageIdentifier",
    "originalDocumentIdentifier",
    "originalMessageDateTime",
    "thisMessageDateTime",
    "fromPartyInfo",
    "toPartyInfo",
    "fromRole",
    "toRole",
    "processSpecificationInfo",
    "collaborationIdentifier",
    "businessActivityIdentifier"
})
@XmlSeeAlso({
    AcceptanceAcknowledgement.class,
    ReceiptAcknowledgement.class,
    Exception.class
})
@CodingStyleguideUnaware
public class EbbpSigSignalIdentificationInformation implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "OriginalMessageIdentifier", required = true)
    private String originalMessageIdentifier;
    @XmlElement(name = "OriginalDocumentIdentifier")
    private String originalDocumentIdentifier;
    @XmlElement(name = "OriginalMessageDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(AdapterXMLOffsetDateTime.class)
    @XmlSchemaType(name = "dateTime")
    private XMLOffsetDateTime originalMessageDateTime;
    @XmlElement(name = "ThisMessageDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(AdapterXMLOffsetDateTime.class)
    @XmlSchemaType(name = "dateTime")
    private XMLOffsetDateTime thisMessageDateTime;
    @XmlElement(name = "FromPartyInfo")
    private EbbpSigPartyInfoType fromPartyInfo;
    @XmlElement(name = "ToPartyInfo")
    private EbbpSigPartyInfoType toPartyInfo;
    @XmlElement(name = "FromRole")
    private EbbpSigRoleType fromRole;
    @XmlElement(name = "ToRole")
    private EbbpSigRoleType toRole;
    @XmlElement(name = "ProcessSpecificationInfo")
    private EbbpSigProcessSpecificationInfoType processSpecificationInfo;
    @XmlElement(name = "CollaborationIdentifier")
    private String collaborationIdentifier;
    @XmlElement(name = "BusinessActivityIdentifier")
    private String businessActivityIdentifier;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public EbbpSigSignalIdentificationInformation() {
    }

    /**
     * Gets the value of the originalMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getOriginalMessageIdentifier() {
        return originalMessageIdentifier;
    }

    /**
     * Sets the value of the originalMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalMessageIdentifier(
        @Nullable
        String value) {
        this.originalMessageIdentifier = value;
    }

    /**
     * Gets the value of the originalDocumentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getOriginalDocumentIdentifier() {
        return originalDocumentIdentifier;
    }

    /**
     * Sets the value of the originalDocumentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDocumentIdentifier(
        @Nullable
        String value) {
        this.originalDocumentIdentifier = value;
    }

    /**
     * Gets the value of the originalMessageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public XMLOffsetDateTime getOriginalMessageDateTime() {
        return originalMessageDateTime;
    }

    /**
     * Sets the value of the originalMessageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalMessageDateTime(
        @Nullable
        XMLOffsetDateTime value) {
        this.originalMessageDateTime = value;
    }

    /**
     * Gets the value of the thisMessageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public XMLOffsetDateTime getThisMessageDateTime() {
        return thisMessageDateTime;
    }

    /**
     * Sets the value of the thisMessageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisMessageDateTime(
        @Nullable
        XMLOffsetDateTime value) {
        this.thisMessageDateTime = value;
    }

    /**
     * Gets the value of the fromPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EbbpSigPartyInfoType }
     *     
     */
    @Nullable
    public EbbpSigPartyInfoType getFromPartyInfo() {
        return fromPartyInfo;
    }

    /**
     * Sets the value of the fromPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbbpSigPartyInfoType }
     *     
     */
    public void setFromPartyInfo(
        @Nullable
        EbbpSigPartyInfoType value) {
        this.fromPartyInfo = value;
    }

    /**
     * Gets the value of the toPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EbbpSigPartyInfoType }
     *     
     */
    @Nullable
    public EbbpSigPartyInfoType getToPartyInfo() {
        return toPartyInfo;
    }

    /**
     * Sets the value of the toPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbbpSigPartyInfoType }
     *     
     */
    public void setToPartyInfo(
        @Nullable
        EbbpSigPartyInfoType value) {
        this.toPartyInfo = value;
    }

    /**
     * Gets the value of the fromRole property.
     * 
     * @return
     *     possible object is
     *     {@link EbbpSigRoleType }
     *     
     */
    @Nullable
    public EbbpSigRoleType getFromRole() {
        return fromRole;
    }

    /**
     * Sets the value of the fromRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbbpSigRoleType }
     *     
     */
    public void setFromRole(
        @Nullable
        EbbpSigRoleType value) {
        this.fromRole = value;
    }

    /**
     * Gets the value of the toRole property.
     * 
     * @return
     *     possible object is
     *     {@link EbbpSigRoleType }
     *     
     */
    @Nullable
    public EbbpSigRoleType getToRole() {
        return toRole;
    }

    /**
     * Sets the value of the toRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbbpSigRoleType }
     *     
     */
    public void setToRole(
        @Nullable
        EbbpSigRoleType value) {
        this.toRole = value;
    }

    /**
     * Gets the value of the processSpecificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EbbpSigProcessSpecificationInfoType }
     *     
     */
    @Nullable
    public EbbpSigProcessSpecificationInfoType getProcessSpecificationInfo() {
        return processSpecificationInfo;
    }

    /**
     * Sets the value of the processSpecificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EbbpSigProcessSpecificationInfoType }
     *     
     */
    public void setProcessSpecificationInfo(
        @Nullable
        EbbpSigProcessSpecificationInfoType value) {
        this.processSpecificationInfo = value;
    }

    /**
     * Gets the value of the collaborationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getCollaborationIdentifier() {
        return collaborationIdentifier;
    }

    /**
     * Sets the value of the collaborationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborationIdentifier(
        @Nullable
        String value) {
        this.collaborationIdentifier = value;
    }

    /**
     * Gets the value of the businessActivityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getBusinessActivityIdentifier() {
        return businessActivityIdentifier;
    }

    /**
     * Sets the value of the businessActivityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessActivityIdentifier(
        @Nullable
        String value) {
        this.businessActivityIdentifier = value;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-equalshashcode
     * 
     */
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null)||(!getClass().equals(o.getClass()))) {
            return false;
        }
        final EbbpSigSignalIdentificationInformation rhs = ((EbbpSigSignalIdentificationInformation) o);
        if (!EqualsHelper.equals(businessActivityIdentifier, rhs.businessActivityIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(collaborationIdentifier, rhs.collaborationIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(fromPartyInfo, rhs.fromPartyInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(fromRole, rhs.fromRole)) {
            return false;
        }
        if (!EqualsHelper.equals(originalDocumentIdentifier, rhs.originalDocumentIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(originalMessageDateTime, rhs.originalMessageDateTime)) {
            return false;
        }
        if (!EqualsHelper.equals(originalMessageIdentifier, rhs.originalMessageIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(processSpecificationInfo, rhs.processSpecificationInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(thisMessageDateTime, rhs.thisMessageDateTime)) {
            return false;
        }
        if (!EqualsHelper.equals(toPartyInfo, rhs.toPartyInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(toRole, rhs.toRole)) {
            return false;
        }
        return true;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-equalshashcode
     * 
     */
    @Override
    public int hashCode() {
        return new HashCodeGenerator(this).append(businessActivityIdentifier).append(collaborationIdentifier).append(fromPartyInfo).append(fromRole).append(originalDocumentIdentifier).append(originalMessageDateTime).append(originalMessageIdentifier).append(processSpecificationInfo).append(thisMessageDateTime).append(toPartyInfo).append(toRole).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("businessActivityIdentifier", businessActivityIdentifier).append("collaborationIdentifier", collaborationIdentifier).append("fromPartyInfo", fromPartyInfo).append("fromRole", fromRole).append("originalDocumentIdentifier", originalDocumentIdentifier).append("originalMessageDateTime", originalMessageDateTime).append("originalMessageIdentifier", originalMessageIdentifier).append("processSpecificationInfo", processSpecificationInfo).append("thisMessageDateTime", thisMessageDateTime).append("toPartyInfo", toPartyInfo).append("toRole", toRole).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        EbbpSigSignalIdentificationInformation ret) {
        ret.businessActivityIdentifier = businessActivityIdentifier;
        ret.collaborationIdentifier = collaborationIdentifier;
        ret.fromPartyInfo = ((fromPartyInfo == null)?null:fromPartyInfo.clone());
        ret.fromRole = ((fromRole == null)?null:fromRole.clone());
        ret.originalDocumentIdentifier = originalDocumentIdentifier;
        ret.originalMessageDateTime = originalMessageDateTime;
        ret.originalMessageIdentifier = originalMessageIdentifier;
        ret.processSpecificationInfo = ((processSpecificationInfo == null)?null:processSpecificationInfo.clone());
        ret.thisMessageDateTime = thisMessageDateTime;
        ret.toPartyInfo = ((toPartyInfo == null)?null:toPartyInfo.clone());
        ret.toRole = ((toRole == null)?null:toRole.clone());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @return
     *     The cloned object. Never <code>null</code>.
     */
    @Nonnull
    @ReturnsMutableCopy
    @Override
    public EbbpSigSignalIdentificationInformation clone() {
        EbbpSigSignalIdentificationInformation ret = new EbbpSigSignalIdentificationInformation();
        cloneTo(ret);
        return ret;
    }

    /**
     * Special setter with value of type String<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     * @return
     *     The created intermediary object of type EbbpSigPartyInfoType and never <code>null</code>
     */
    @Nonnull
    public EbbpSigPartyInfoType setFromPartyInfo(
        @Nullable
        final String valueParam) {
        EbbpSigPartyInfoType aObj = getFromPartyInfo();
        if (aObj == null) {
            aObj = new EbbpSigPartyInfoType(valueParam);
            setFromPartyInfo(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Special setter with value of type String<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     * @return
     *     The created intermediary object of type EbbpSigPartyInfoType and never <code>null</code>
     */
    @Nonnull
    public EbbpSigPartyInfoType setToPartyInfo(
        @Nullable
        final String valueParam) {
        EbbpSigPartyInfoType aObj = getToPartyInfo();
        if (aObj == null) {
            aObj = new EbbpSigPartyInfoType(valueParam);
            setToPartyInfo(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Get the value of the contained EbbpSigPartyInfoType object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained EbbpSigPartyInfoType object or <code>null</code>
     */
    @Nullable
    public String getFromPartyInfoValue() {
        EbbpSigPartyInfoType aObj = getFromPartyInfo();
        return (aObj == null)?null:aObj.getValue();
    }

    /**
     * Get the value of the contained EbbpSigPartyInfoType object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained EbbpSigPartyInfoType object or <code>null</code>
     */
    @Nullable
    public String getToPartyInfoValue() {
        EbbpSigPartyInfoType aObj = getToPartyInfo();
        return (aObj == null)?null:aObj.getValue();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @return
     *     The LocalDateTime representation of originalMessageDateTime. May be <code>null</code>.
     */
    @Nullable
    public LocalDateTime getOriginalMessageDateTimeLocal() {
        return (originalMessageDateTime == null)?null:originalMessageDateTime.toLocalDateTime();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @param aValue
     *     The LocalDateTime to set. May be <code>null</code>.
     */
    public void setOriginalMessageDateTime(
        @Nullable
        final LocalDateTime aValue) {
        originalMessageDateTime = (aValue == null)?null:XMLOffsetDateTime.of(aValue, null);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @return
     *     The LocalDateTime representation of thisMessageDateTime. May be <code>null</code>.
     */
    @Nullable
    public LocalDateTime getThisMessageDateTimeLocal() {
        return (thisMessageDateTime == null)?null:thisMessageDateTime.toLocalDateTime();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @param aValue
     *     The LocalDateTime to set. May be <code>null</code>.
     */
    public void setThisMessageDateTime(
        @Nullable
        final LocalDateTime aValue) {
        thisMessageDateTime = (aValue == null)?null:XMLOffsetDateTime.of(aValue, null);
    }

}
