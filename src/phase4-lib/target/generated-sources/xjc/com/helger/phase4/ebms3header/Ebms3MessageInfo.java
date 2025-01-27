
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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MessageInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MessageInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="MessageId" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string"/>
 *         <element name="RefToMessageId" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string" minOccurs="0"/>
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
@XmlType(name = "MessageInfo", propOrder = {
    "timestamp",
    "messageId",
    "refToMessageId"
})
@CodingStyleguideUnaware
public class Ebms3MessageInfo implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(AdapterXMLOffsetDateTime.class)
    @XmlSchemaType(name = "dateTime")
    private XMLOffsetDateTime timestamp;
    @XmlElement(name = "MessageId", required = true)
    private String messageId;
    @XmlElement(name = "RefToMessageId")
    private String refToMessageId;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3MessageInfo() {
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public XMLOffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(
        @Nullable
        XMLOffsetDateTime value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(
        @Nullable
        String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the refToMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getRefToMessageId() {
        return refToMessageId;
    }

    /**
     * Sets the value of the refToMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefToMessageId(
        @Nullable
        String value) {
        this.refToMessageId = value;
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
        final Ebms3MessageInfo rhs = ((Ebms3MessageInfo) o);
        if (!EqualsHelper.equals(messageId, rhs.messageId)) {
            return false;
        }
        if (!EqualsHelper.equals(refToMessageId, rhs.refToMessageId)) {
            return false;
        }
        if (!EqualsHelper.equals(timestamp, rhs.timestamp)) {
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
        return new HashCodeGenerator(this).append(messageId).append(refToMessageId).append(timestamp).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("messageId", messageId).append("refToMessageId", refToMessageId).append("timestamp", timestamp).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3MessageInfo ret) {
        ret.messageId = messageId;
        ret.refToMessageId = refToMessageId;
        ret.timestamp = timestamp;
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
    public Ebms3MessageInfo clone() {
        Ebms3MessageInfo ret = new Ebms3MessageInfo();
        cloneTo(ret);
        return ret;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @return
     *     The LocalDateTime representation of timestamp. May be <code>null</code>.
     */
    @Nullable
    public LocalDateTime getTimestampLocal() {
        return (timestamp == null)?null:timestamp.toLocalDateTime();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-offset-dt-extension
     * 
     * @param aValue
     *     The LocalDateTime to set. May be <code>null</code>.
     */
    public void setTimestamp(
        @Nullable
        final LocalDateTime aValue) {
        timestamp = (aValue == null)?null:XMLOffsetDateTime.of(aValue, null);
    }

}
