
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserMessage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UserMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MessageInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageInfo"/>
 *         <element name="PartyInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PartyInfo"/>
 *         <element name="CollaborationInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}CollaborationInfo"/>
 *         <element name="MessageProperties" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageProperties" minOccurs="0"/>
 *         <element name="PayloadInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PayloadInfo" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="mpc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
@XmlType(name = "UserMessage", propOrder = {
    "messageInfo",
    "partyInfo",
    "collaborationInfo",
    "messageProperties",
    "payloadInfo"
})
@CodingStyleguideUnaware
public class Ebms3UserMessage implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "MessageInfo", required = true)
    private Ebms3MessageInfo messageInfo;
    @XmlElement(name = "PartyInfo", required = true)
    private Ebms3PartyInfo partyInfo;
    @XmlElement(name = "CollaborationInfo", required = true)
    private Ebms3CollaborationInfo collaborationInfo;
    @XmlElement(name = "MessageProperties")
    private Ebms3MessageProperties messageProperties;
    @XmlElement(name = "PayloadInfo")
    private Ebms3PayloadInfo payloadInfo;
    @XmlAttribute(name = "mpc")
    @XmlSchemaType(name = "anyURI")
    private String mpc;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3UserMessage() {
    }

    /**
     * Gets the value of the messageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3MessageInfo }
     *     
     */
    @Nullable
    public Ebms3MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Sets the value of the messageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3MessageInfo }
     *     
     */
    public void setMessageInfo(
        @Nullable
        Ebms3MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Gets the value of the partyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3PartyInfo }
     *     
     */
    @Nullable
    public Ebms3PartyInfo getPartyInfo() {
        return partyInfo;
    }

    /**
     * Sets the value of the partyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3PartyInfo }
     *     
     */
    public void setPartyInfo(
        @Nullable
        Ebms3PartyInfo value) {
        this.partyInfo = value;
    }

    /**
     * Gets the value of the collaborationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3CollaborationInfo }
     *     
     */
    @Nullable
    public Ebms3CollaborationInfo getCollaborationInfo() {
        return collaborationInfo;
    }

    /**
     * Sets the value of the collaborationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3CollaborationInfo }
     *     
     */
    public void setCollaborationInfo(
        @Nullable
        Ebms3CollaborationInfo value) {
        this.collaborationInfo = value;
    }

    /**
     * Gets the value of the messageProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3MessageProperties }
     *     
     */
    @Nullable
    public Ebms3MessageProperties getMessageProperties() {
        return messageProperties;
    }

    /**
     * Sets the value of the messageProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3MessageProperties }
     *     
     */
    public void setMessageProperties(
        @Nullable
        Ebms3MessageProperties value) {
        this.messageProperties = value;
    }

    /**
     * Gets the value of the payloadInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3PayloadInfo }
     *     
     */
    @Nullable
    public Ebms3PayloadInfo getPayloadInfo() {
        return payloadInfo;
    }

    /**
     * Sets the value of the payloadInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3PayloadInfo }
     *     
     */
    public void setPayloadInfo(
        @Nullable
        Ebms3PayloadInfo value) {
        this.payloadInfo = value;
    }

    /**
     * Gets the value of the mpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getMpc() {
        return mpc;
    }

    /**
     * Sets the value of the mpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpc(
        @Nullable
        String value) {
        this.mpc = value;
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
        final Ebms3UserMessage rhs = ((Ebms3UserMessage) o);
        if (!EqualsHelper.equals(collaborationInfo, rhs.collaborationInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(messageInfo, rhs.messageInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(messageProperties, rhs.messageProperties)) {
            return false;
        }
        if (!EqualsHelper.equals(mpc, rhs.mpc)) {
            return false;
        }
        if (!EqualsHelper.equals(partyInfo, rhs.partyInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(payloadInfo, rhs.payloadInfo)) {
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
        return new HashCodeGenerator(this).append(collaborationInfo).append(messageInfo).append(messageProperties).append(mpc).append(partyInfo).append(payloadInfo).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("collaborationInfo", collaborationInfo).append("messageInfo", messageInfo).append("messageProperties", messageProperties).append("mpc", mpc).append("partyInfo", partyInfo).append("payloadInfo", payloadInfo).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3UserMessage ret) {
        ret.collaborationInfo = ((collaborationInfo == null)?null:collaborationInfo.clone());
        ret.messageInfo = ((messageInfo == null)?null:messageInfo.clone());
        ret.messageProperties = ((messageProperties == null)?null:messageProperties.clone());
        ret.mpc = mpc;
        ret.partyInfo = ((partyInfo == null)?null:partyInfo.clone());
        ret.payloadInfo = ((payloadInfo == null)?null:payloadInfo.clone());
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
    public Ebms3UserMessage clone() {
        Ebms3UserMessage ret = new Ebms3UserMessage();
        cloneTo(ret);
        return ret;
    }

}
