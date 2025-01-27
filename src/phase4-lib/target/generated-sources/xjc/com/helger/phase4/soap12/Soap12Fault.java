
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
 *         <element name="Code" type="{http://www.w3.org/2003/05/soap-envelope}faultcode"/>
 *         <element name="Reason" type="{http://www.w3.org/2003/05/soap-envelope}faultreason"/>
 *         <element name="Node" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Role" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Detail" type="{http://www.w3.org/2003/05/soap-envelope}detail" minOccurs="0"/>
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
    "code",
    "reason",
    "node",
    "role",
    "detail"
})
@CodingStyleguideUnaware
public class Soap12Fault implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Code", required = true)
    private Soap12Faultcode code;
    @XmlElement(name = "Reason", required = true)
    private Soap12Faultreason reason;
    @XmlElement(name = "Node")
    @XmlSchemaType(name = "anyURI")
    private String node;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "anyURI")
    private String role;
    @XmlElement(name = "Detail")
    private Soap12Detail detail;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Soap12Fault() {
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Soap12Faultcode }
     *     
     */
    @Nullable
    public Soap12Faultcode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap12Faultcode }
     *     
     */
    public void setCode(
        @Nullable
        Soap12Faultcode value) {
        this.code = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Soap12Faultreason }
     *     
     */
    @Nullable
    public Soap12Faultreason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap12Faultreason }
     *     
     */
    public void setReason(
        @Nullable
        Soap12Faultreason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(
        @Nullable
        String value) {
        this.node = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(
        @Nullable
        String value) {
        this.role = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Soap12Detail }
     *     
     */
    @Nullable
    public Soap12Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap12Detail }
     *     
     */
    public void setDetail(
        @Nullable
        Soap12Detail value) {
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
        final Soap12Fault rhs = ((Soap12Fault) o);
        if (!EqualsHelper.equals(code, rhs.code)) {
            return false;
        }
        if (!EqualsHelper.equals(detail, rhs.detail)) {
            return false;
        }
        if (!EqualsHelper.equals(node, rhs.node)) {
            return false;
        }
        if (!EqualsHelper.equals(reason, rhs.reason)) {
            return false;
        }
        if (!EqualsHelper.equals(role, rhs.role)) {
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
        return new HashCodeGenerator(this).append(code).append(detail).append(node).append(reason).append(role).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("code", code).append("detail", detail).append("node", node).append("reason", reason).append("role", role).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Soap12Fault ret) {
        ret.code = ((code == null)?null:code.clone());
        ret.detail = ((detail == null)?null:detail.clone());
        ret.node = node;
        ret.reason = ((reason == null)?null:reason.clone());
        ret.role = role;
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
    public Soap12Fault clone() {
        Soap12Fault ret = new Soap12Fault();
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
     *     The created intermediary object of type Soap12Faultcode and never <code>null</code>
     */
    @Nonnull
    public Soap12Faultcode setCode(
        @Nullable
        final QName valueParam) {
        Soap12Faultcode aObj = getCode();
        if (aObj == null) {
            aObj = new Soap12Faultcode(valueParam);
            setCode(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Get the value of the contained Soap12Faultcode object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained Soap12Faultcode object or <code>null</code>
     */
    @Nullable
    public QName getCodeValue() {
        Soap12Faultcode aObj = getCode();
        return (aObj == null)?null:aObj.getValue();
    }

}
