
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
import com.helger.xsds.xlink.XLinkTypeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This defines the content structure for identifying the
 *                 root ProcessSpecification for which this business signal is being sent. "instanceVersion"
 *                 attribute refers to the user-defined version of the ProcessSpecification identified by the "name"
 *                 attribute. The "name" attribute is set to the same value as name
 *                 attribute for the corresponding ProcessSpecification element within the
 *                 Business Process Specification instance (For example, the @name attribute of "name" attributeGroup in ebBP). The "xlink:type" attribute has a FIXED
 *                 value of "simple". This identifies the element as being an XLINK simple link. The
 *                 "xlink:href" attribute has a value that is a URI that conforms to [RFC2396].
 *                 It identifies the location of the Business Process Specification instance document that defines the
 *                 Business Collaboration. The "uuid" attribute captures the unique identifier given to
 *                 the Business Process Specification instance document that is being referred. It corresponds to the
 *                 uuid attribute of "ProcessSpecification" element in the Business Process Specification instance document.
 * 
 * <p>Java class for ProcessSpecificationInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProcessSpecificationInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attGroup ref="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}xlink.grp"/>
 *       <attribute name="instanceVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ProcessSpecificationInfoType", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
@CodingStyleguideUnaware
public class EbbpSigProcessSpecificationInfoType implements Serializable, IExplicitlyCloneable
{

    @XmlAttribute(name = "instanceVersion")
    private String instanceVersion;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "uuid", required = true)
    private String uuid;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    private XLinkTypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
    private String href;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public EbbpSigProcessSpecificationInfoType() {
    }

    /**
     * Gets the value of the instanceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * Sets the value of the instanceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceVersion(
        @Nullable
        String value) {
        this.instanceVersion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(
        @Nullable
        String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(
        @Nullable
        String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link XLinkTypeType }
     *     
     */
    @Nullable
    public XLinkTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLinkTypeType }
     *     
     */
    public void setType(
        @Nullable
        XLinkTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(
        @Nullable
        String value) {
        this.href = value;
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
        final EbbpSigProcessSpecificationInfoType rhs = ((EbbpSigProcessSpecificationInfoType) o);
        if (!EqualsHelper.equals(href, rhs.href)) {
            return false;
        }
        if (!EqualsHelper.equals(instanceVersion, rhs.instanceVersion)) {
            return false;
        }
        if (!EqualsHelper.equals(name, rhs.name)) {
            return false;
        }
        if (!EqualsHelper.equals(type, rhs.type)) {
            return false;
        }
        if (!EqualsHelper.equals(uuid, rhs.uuid)) {
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
        return new HashCodeGenerator(this).append(href).append(instanceVersion).append(name).append(type).append(uuid).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("href", href).append("instanceVersion", instanceVersion).append("name", name).append("type", type).append("uuid", uuid).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        EbbpSigProcessSpecificationInfoType ret) {
        ret.href = href;
        ret.instanceVersion = instanceVersion;
        ret.name = name;
        ret.type = type;
        ret.uuid = uuid;
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
    public EbbpSigProcessSpecificationInfoType clone() {
        EbbpSigProcessSpecificationInfoType ret = new EbbpSigProcessSpecificationInfoType();
        cloneTo(ret);
        return ret;
    }

}
