
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
import com.helger.xsds.xmldsig.ReferenceType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MessagePartIdentifier" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}Reference"/>
 *       </choice>
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
@XmlType(name = "", propOrder = {
    "messagePartIdentifier",
    "reference"
})
@XmlRootElement(name = "MessagePartNRInformation", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
@CodingStyleguideUnaware
public class MessagePartNRInformation implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "MessagePartIdentifier", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
    private String messagePartIdentifier;
    @XmlElement(name = "Reference", namespace = "http://www.w3.org/2000/09/xmldsig#")
    private ReferenceType reference;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public MessagePartNRInformation() {
    }

    /**
     * Gets the value of the messagePartIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getMessagePartIdentifier() {
        return messagePartIdentifier;
    }

    /**
     * Sets the value of the messagePartIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePartIdentifier(
        @Nullable
        String value) {
        this.messagePartIdentifier = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    @Nullable
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReference(
        @Nullable
        ReferenceType value) {
        this.reference = value;
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
        final MessagePartNRInformation rhs = ((MessagePartNRInformation) o);
        if (!EqualsHelper.equals(messagePartIdentifier, rhs.messagePartIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(reference, rhs.reference)) {
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
        return new HashCodeGenerator(this).append(messagePartIdentifier).append(reference).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("messagePartIdentifier", messagePartIdentifier).append("reference", reference).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        MessagePartNRInformation ret) {
        ret.messagePartIdentifier = messagePartIdentifier;
        ret.reference = ((reference == null)?null:reference.clone());
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
    public MessagePartNRInformation clone() {
        MessagePartNRInformation ret = new MessagePartNRInformation();
        cloneTo(ret);
        return ret;
    }

}
