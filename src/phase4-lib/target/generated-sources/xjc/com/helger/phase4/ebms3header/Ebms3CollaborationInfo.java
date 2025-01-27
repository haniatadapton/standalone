
package com.helger.phase4.ebms3header;

import java.io.Serializable;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.IExplicitlyCloneable;
import com.helger.commons.string.ToStringGenerator;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CollaborationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CollaborationInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgreementRef" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}AgreementRef" minOccurs="0"/>
 *         <element name="Service" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Service"/>
 *         <element name="Action" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         <element name="ConversationId" type="{http://www.w3.org/2001/XMLSchema}token"/>
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborationInfo", propOrder = {
    "agreementRef",
    "service",
    "action",
    "conversationId"
})
@CodingStyleguideUnaware
public class Ebms3CollaborationInfo implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "AgreementRef")
    private Ebms3AgreementRef agreementRef;
    @XmlElement(name = "Service", required = true)
    private Ebms3Service service;
    @XmlElement(name = "Action", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String action;
    @XmlElement(name = "ConversationId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String conversationId;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3CollaborationInfo() {
    }

    /**
     * Gets the value of the agreementRef property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3AgreementRef }
     *     
     */
    @Nullable
    public Ebms3AgreementRef getAgreementRef() {
        return agreementRef;
    }

    /**
     * Sets the value of the agreementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3AgreementRef }
     *     
     */
    public void setAgreementRef(
        @Nullable
        Ebms3AgreementRef value) {
        this.agreementRef = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3Service }
     *     
     */
    @Nullable
    public Ebms3Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3Service }
     *     
     */
    public void setService(
        @Nullable
        Ebms3Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(
        @Nullable
        String value) {
        this.action = value;
    }

    /**
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(
        @Nullable
        String value) {
        this.conversationId = value;
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
        final Ebms3CollaborationInfo rhs = ((Ebms3CollaborationInfo) o);
        if (!EqualsHelper.equals(action, rhs.action)) {
            return false;
        }
        if (!EqualsHelper.equals(agreementRef, rhs.agreementRef)) {
            return false;
        }
        if (!EqualsHelper.equals(conversationId, rhs.conversationId)) {
            return false;
        }
        if (!EqualsHelper.equals(service, rhs.service)) {
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
        return new HashCodeGenerator(this).append(action).append(agreementRef).append(conversationId).append(service).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("action", action).append("agreementRef", agreementRef).append("conversationId", conversationId).append("service", service).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3CollaborationInfo ret) {
        ret.action = action;
        ret.agreementRef = ((agreementRef == null)?null:agreementRef.clone());
        ret.conversationId = conversationId;
        ret.service = ((service == null)?null:service.clone());
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
    public Ebms3CollaborationInfo clone() {
        Ebms3CollaborationInfo ret = new Ebms3CollaborationInfo();
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
     *     The created intermediary object of type Ebms3AgreementRef and never <code>null</code>
     */
    @Nonnull
    public Ebms3AgreementRef setAgreementRef(
        @Nullable
        final String valueParam) {
        Ebms3AgreementRef aObj = getAgreementRef();
        if (aObj == null) {
            aObj = new Ebms3AgreementRef(valueParam);
            setAgreementRef(aObj);
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
     *     The created intermediary object of type Ebms3Service and never <code>null</code>
     */
    @Nonnull
    public Ebms3Service setService(
        @Nullable
        final String valueParam) {
        Ebms3Service aObj = getService();
        if (aObj == null) {
            aObj = new Ebms3Service(valueParam);
            setService(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Get the value of the contained Ebms3AgreementRef object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained Ebms3AgreementRef object or <code>null</code>
     */
    @Nullable
    public String getAgreementRefValue() {
        Ebms3AgreementRef aObj = getAgreementRef();
        return (aObj == null)?null:aObj.getValue();
    }

    /**
     * Get the value of the contained Ebms3Service object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained Ebms3Service object or <code>null</code>
     */
    @Nullable
    public String getServiceValue() {
        Ebms3Service aObj = getService();
        return (aObj == null)?null:aObj.getValue();
    }

}
