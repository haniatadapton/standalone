
package com.helger.phase4.soap12;

import java.io.Serializable;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.namespace.QName;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.IExplicitlyCloneable;
import com.helger.commons.string.ToStringGenerator;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faultcode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="faultcode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2003/05/soap-envelope}faultcodeEnum"/>
 *         <element name="Subcode" type="{http://www.w3.org/2003/05/soap-envelope}subcode" minOccurs="0"/>
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
@XmlType(name = "faultcode", propOrder = {
    "value",
    "subcode"
})
@CodingStyleguideUnaware
public class Soap12Faultcode implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Value", required = true)
    private QName value;
    @XmlElement(name = "Subcode")
    private Soap12Subcode subcode;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Soap12Faultcode() {
    }

    /**
     * Constructor for value of type QName<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     */
    public Soap12Faultcode(
        @Nullable
        final QName valueParam) {
        setValue(valueParam);
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    @Nullable
    public QName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValue(
        @Nullable
        QName value) {
        this.value = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link Soap12Subcode }
     *     
     */
    @Nullable
    public Soap12Subcode getSubcode() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap12Subcode }
     *     
     */
    public void setSubcode(
        @Nullable
        Soap12Subcode value) {
        this.subcode = value;
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
        final Soap12Faultcode rhs = ((Soap12Faultcode) o);
        if (!EqualsHelper.equals(subcode, rhs.subcode)) {
            return false;
        }
        if (!EqualsHelper.equals(value, rhs.value)) {
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
        return new HashCodeGenerator(this).append(subcode).append(value).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("subcode", subcode).append("value", value).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Soap12Faultcode ret) {
        ret.subcode = ((subcode == null)?null:subcode.clone());
        ret.value = value;
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
    public Soap12Faultcode clone() {
        Soap12Faultcode ret = new Soap12Faultcode();
        cloneTo(ret);
        return ret;
    }

    /**
     * Special setter with value of type QName<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     * @return
     *     The created intermediary object of type Soap12Subcode and never <code>null</code>
     */
    @Nonnull
    public Soap12Subcode setSubcode(
        @Nullable
        final QName valueParam) {
        Soap12Subcode aObj = getSubcode();
        if (aObj == null) {
            aObj = new Soap12Subcode(valueParam);
            setSubcode(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Get the value of the contained Soap12Subcode object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained Soap12Subcode object or <code>null</code>
     */
    @Nullable
    public QName getSubcodeValue() {
        Soap12Subcode aObj = getSubcode();
        return (aObj == null)?null:aObj.getValue();
    }

}
