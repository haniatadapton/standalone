
package com.helger.phase4.soap11;

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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fault reporting structure
 * 
 * <p>Java class for Fault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Fault">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         <element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="detail" type="{http://schemas.xmlsoap.org/soap/envelope/}detail" minOccurs="0"/>
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
@XmlType(name = "Fault", propOrder = {
    "faultcode",
    "faultstring",
    "faultactor",
    "detail"
})
@CodingStyleguideUnaware
public class Soap11Fault implements Serializable, IExplicitlyCloneable
{

    @XmlElement(required = true)
    private QName faultcode;
    @XmlElement(required = true)
    private String faultstring;
    @XmlSchemaType(name = "anyURI")
    private String faultactor;
    private Soap11Detail detail;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Soap11Fault() {
    }

    /**
     * Gets the value of the faultcode property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    @Nullable
    public QName getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setFaultcode(
        @Nullable
        QName value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultstring(
        @Nullable
        String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the faultactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getFaultactor() {
        return faultactor;
    }

    /**
     * Sets the value of the faultactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultactor(
        @Nullable
        String value) {
        this.faultactor = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Soap11Detail }
     *     
     */
    @Nullable
    public Soap11Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap11Detail }
     *     
     */
    public void setDetail(
        @Nullable
        Soap11Detail value) {
        this.detail = value;
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
        final Soap11Fault rhs = ((Soap11Fault) o);
        if (!EqualsHelper.equals(detail, rhs.detail)) {
            return false;
        }
        if (!EqualsHelper.equals(faultactor, rhs.faultactor)) {
            return false;
        }
        if (!EqualsHelper.equals(faultcode, rhs.faultcode)) {
            return false;
        }
        if (!EqualsHelper.equals(faultstring, rhs.faultstring)) {
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
        return new HashCodeGenerator(this).append(detail).append(faultactor).append(faultcode).append(faultstring).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("detail", detail).append("faultactor", faultactor).append("faultcode", faultcode).append("faultstring", faultstring).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Soap11Fault ret) {
        ret.detail = ((detail == null)?null:detail.clone());
        ret.faultactor = faultactor;
        ret.faultcode = faultcode;
        ret.faultstring = faultstring;
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
    public Soap11Fault clone() {
        Soap11Fault ret = new Soap11Fault();
        cloneTo(ret);
        return ret;
    }

}
