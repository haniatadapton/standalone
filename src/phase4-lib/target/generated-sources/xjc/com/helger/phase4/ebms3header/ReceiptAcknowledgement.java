
package com.helger.phase4.ebms3header;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.xsds.xmldsig.SignatureType;
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
 *     <extension base="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}SignalIdentificationInformation">
 *       <sequence>
 *         <element ref="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}NonRepudiationInformation" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       </sequence>
 *     </extension>
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
    "nonRepudiationInformation",
    "signature"
})
@XmlRootElement(name = "ReceiptAcknowledgement", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
@CodingStyleguideUnaware
public class ReceiptAcknowledgement
    extends EbbpSigSignalIdentificationInformation
{

    @XmlElement(name = "NonRepudiationInformation", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
    private NonRepudiationInformation nonRepudiationInformation;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    private SignatureType signature;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public ReceiptAcknowledgement() {
    }

    /**
     * Gets the value of the nonRepudiationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NonRepudiationInformation }
     *     
     */
    @Nullable
    public NonRepudiationInformation getNonRepudiationInformation() {
        return nonRepudiationInformation;
    }

    /**
     * Sets the value of the nonRepudiationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonRepudiationInformation }
     *     
     */
    public void setNonRepudiationInformation(
        @Nullable
        NonRepudiationInformation value) {
        this.nonRepudiationInformation = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    @Nullable
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(
        @Nullable
        SignatureType value) {
        this.signature = value;
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
        if (!super.equals(o)) {
            return false;
        }
        final ReceiptAcknowledgement rhs = ((ReceiptAcknowledgement) o);
        if (!EqualsHelper.equals(nonRepudiationInformation, rhs.nonRepudiationInformation)) {
            return false;
        }
        if (!EqualsHelper.equals(signature, rhs.signature)) {
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
        return HashCodeGenerator.getDerived(super.hashCode()).append(nonRepudiationInformation).append(signature).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return ToStringGenerator.getDerived(super.toString()).append("nonRepudiationInformation", nonRepudiationInformation).append("signature", signature).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        ReceiptAcknowledgement ret) {
        super.cloneTo(ret);
        ret.nonRepudiationInformation = ((nonRepudiationInformation == null)?null:nonRepudiationInformation.clone());
        ret.signature = ((signature == null)?null:signature.clone());
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
    public ReceiptAcknowledgement clone() {
        ReceiptAcknowledgement ret = new ReceiptAcknowledgement();
        cloneTo(ret);
        return ret;
    }

}
