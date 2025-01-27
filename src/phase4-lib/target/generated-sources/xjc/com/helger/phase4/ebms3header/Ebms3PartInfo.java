
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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PartInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Schema" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Schema" minOccurs="0"/>
 *         <element name="Description" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Description" minOccurs="0"/>
 *         <element name="PartProperties" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PartProperties" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="href" type="{http://www.w3.org/2001/XMLSchema}token" />
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
@XmlType(name = "PartInfo", propOrder = {
    "schema",
    "description",
    "partProperties"
})
@CodingStyleguideUnaware
public class Ebms3PartInfo implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Schema")
    private Ebms3Schema schema;
    @XmlElement(name = "Description")
    private Ebms3Description description;
    @XmlElement(name = "PartProperties")
    private Ebms3PartProperties partProperties;
    @XmlAttribute(name = "href")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String href;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3PartInfo() {
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3Schema }
     *     
     */
    @Nullable
    public Ebms3Schema getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3Schema }
     *     
     */
    public void setSchema(
        @Nullable
        Ebms3Schema value) {
        this.schema = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3Description }
     *     
     */
    @Nullable
    public Ebms3Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3Description }
     *     
     */
    public void setDescription(
        @Nullable
        Ebms3Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the partProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3PartProperties }
     *     
     */
    @Nullable
    public Ebms3PartProperties getPartProperties() {
        return partProperties;
    }

    /**
     * Sets the value of the partProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3PartProperties }
     *     
     */
    public void setPartProperties(
        @Nullable
        Ebms3PartProperties value) {
        this.partProperties = value;
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
        final Ebms3PartInfo rhs = ((Ebms3PartInfo) o);
        if (!EqualsHelper.equals(description, rhs.description)) {
            return false;
        }
        if (!EqualsHelper.equals(href, rhs.href)) {
            return false;
        }
        if (!EqualsHelper.equals(partProperties, rhs.partProperties)) {
            return false;
        }
        if (!EqualsHelper.equals(schema, rhs.schema)) {
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
        return new HashCodeGenerator(this).append(description).append(href).append(partProperties).append(schema).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("description", description).append("href", href).append("partProperties", partProperties).append("schema", schema).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3PartInfo ret) {
        ret.description = ((description == null)?null:description.clone());
        ret.href = href;
        ret.partProperties = ((partProperties == null)?null:partProperties.clone());
        ret.schema = ((schema == null)?null:schema.clone());
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
    public Ebms3PartInfo clone() {
        Ebms3PartInfo ret = new Ebms3PartInfo();
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
     *     The created intermediary object of type Ebms3Description and never <code>null</code>
     */
    @Nonnull
    public Ebms3Description setDescription(
        @Nullable
        final String valueParam) {
        Ebms3Description aObj = getDescription();
        if (aObj == null) {
            aObj = new Ebms3Description(valueParam);
            setDescription(aObj);
        } else {
            aObj.setValue(valueParam);
        }
        return aObj;
    }

    /**
     * Get the value of the contained Ebms3Description object<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @return
     *     Either the value of the contained Ebms3Description object or <code>null</code>
     */
    @Nullable
    public String getDescriptionValue() {
        Ebms3Description aObj = getDescription();
        return (aObj == null)?null:aObj.getValue();
    }

}
