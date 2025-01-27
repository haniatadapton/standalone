
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
 * <p>Java class for Error complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Error">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Description" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Description" minOccurs="0"/>
 *         <element name="ErrorDetail" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="category" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="refToMessageInError" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="errorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="severity" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       <attribute name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}token" />
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
@XmlType(name = "Error", propOrder = {
    "description",
    "errorDetail"
})
@CodingStyleguideUnaware
public class Ebms3Error implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Description")
    private Ebms3Description description;
    @XmlElement(name = "ErrorDetail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String errorDetail;
    @XmlAttribute(name = "category")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String category;
    @XmlAttribute(name = "refToMessageInError")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String refToMessageInError;
    @XmlAttribute(name = "errorCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String errorCode;
    @XmlAttribute(name = "origin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String origin;
    @XmlAttribute(name = "severity", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String severity;
    @XmlAttribute(name = "shortDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String shortDescription;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3Error() {
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
     * Gets the value of the errorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDetail(
        @Nullable
        String value) {
        this.errorDetail = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(
        @Nullable
        String value) {
        this.category = value;
    }

    /**
     * Gets the value of the refToMessageInError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getRefToMessageInError() {
        return refToMessageInError;
    }

    /**
     * Sets the value of the refToMessageInError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefToMessageInError(
        @Nullable
        String value) {
        this.refToMessageInError = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(
        @Nullable
        String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(
        @Nullable
        String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(
        @Nullable
        String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(
        @Nullable
        String value) {
        this.shortDescription = value;
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
        final Ebms3Error rhs = ((Ebms3Error) o);
        if (!EqualsHelper.equals(category, rhs.category)) {
            return false;
        }
        if (!EqualsHelper.equals(description, rhs.description)) {
            return false;
        }
        if (!EqualsHelper.equals(errorCode, rhs.errorCode)) {
            return false;
        }
        if (!EqualsHelper.equals(errorDetail, rhs.errorDetail)) {
            return false;
        }
        if (!EqualsHelper.equals(origin, rhs.origin)) {
            return false;
        }
        if (!EqualsHelper.equals(refToMessageInError, rhs.refToMessageInError)) {
            return false;
        }
        if (!EqualsHelper.equals(severity, rhs.severity)) {
            return false;
        }
        if (!EqualsHelper.equals(shortDescription, rhs.shortDescription)) {
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
        return new HashCodeGenerator(this).append(category).append(description).append(errorCode).append(errorDetail).append(origin).append(refToMessageInError).append(severity).append(shortDescription).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("category", category).append("description", description).append("errorCode", errorCode).append("errorDetail", errorDetail).append("origin", origin).append("refToMessageInError", refToMessageInError).append("severity", severity).append("shortDescription", shortDescription).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3Error ret) {
        ret.category = category;
        ret.description = ((description == null)?null:description.clone());
        ret.errorCode = errorCode;
        ret.errorDetail = errorDetail;
        ret.origin = origin;
        ret.refToMessageInError = refToMessageInError;
        ret.severity = severity;
        ret.shortDescription = shortDescription;
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
    public Ebms3Error clone() {
        Ebms3Error ret = new Ebms3Error();
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
