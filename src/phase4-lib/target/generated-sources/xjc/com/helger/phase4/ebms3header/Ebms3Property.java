
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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Property complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Property">
 *   <simpleContent>
 *     <extension base="<http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/>non-empty-string">
 *       <attribute name="name" use="required" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string" />
 *       <attribute name="type" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}non-empty-string" />
 *     </extension>
 *   </simpleContent>
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
@XmlType(name = "Property", propOrder = {
    "value"
})
@CodingStyleguideUnaware
public class Ebms3Property implements Serializable, IExplicitlyCloneable
{

    @XmlValue
    private String value;
    @XmlAttribute(name = "name", required = true)
    private String name;
    @XmlAttribute(name = "type")
    private String type;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3Property() {
    }

    /**
     * Constructor for value of type String<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     */
    public Ebms3Property(
        @Nullable
        final String valueParam) {
        setValue(valueParam);
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(
        @Nullable
        String value) {
        this.value = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(
        @Nullable
        String value) {
        this.type = value;
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
        final Ebms3Property rhs = ((Ebms3Property) o);
        if (!EqualsHelper.equals(name, rhs.name)) {
            return false;
        }
        if (!EqualsHelper.equals(type, rhs.type)) {
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
        return new HashCodeGenerator(this).append(name).append(type).append(value).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("name", name).append("type", type).append("value", value).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3Property ret) {
        ret.name = name;
        ret.type = type;
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
    public Ebms3Property clone() {
        Ebms3Property ret = new Ebms3Property();
        cloneTo(ret);
        return ret;
    }

}
