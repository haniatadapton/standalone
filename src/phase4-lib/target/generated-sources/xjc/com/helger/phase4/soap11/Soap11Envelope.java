
package com.helger.phase4.soap11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.namespace.QName;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.IExplicitlyCloneable;
import com.helger.commons.string.ToStringGenerator;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Envelope complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Envelope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://schemas.xmlsoap.org/soap/envelope/}Header" minOccurs="0"/>
 *         <element ref="{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * <p>This class was annotated by ph-jaxb-plugin -Xph-annotate</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-equalshashcode</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-tostring</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-list-extension</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-cloneable2</p>
 * <p>This class contains methods created by ph-jaxb-plugin -Xph-value-extender</p>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Envelope", propOrder = {
    "header",
    "body",
    "any"
})
@CodingStyleguideUnaware
public class Soap11Envelope implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "Header", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private Soap11Header header;
    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/", required = true)
    private Soap11Body body;
    @XmlAnyElement(lax = true)
    private List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Soap11Envelope() {
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Soap11Header }
     *     
     */
    @Nullable
    public Soap11Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap11Header }
     *     
     */
    public void setHeader(
        @Nullable
        Soap11Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Soap11Body }
     *     
     */
    @Nullable
    public Soap11Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soap11Body }
     *     
     */
    public void setBody(
        @Nullable
        Soap11Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    @Nullable
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
        final Soap11Envelope rhs = ((Soap11Envelope) o);
        if (!EqualsHelper.equalsCollection(any, rhs.any)) {
            return false;
        }
        if (!EqualsHelper.equals(body, rhs.body)) {
            return false;
        }
        if (!EqualsHelper.equals(header, rhs.header)) {
            return false;
        }
        if (!EqualsHelper.equals(otherAttributes, rhs.otherAttributes)) {
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
        return new HashCodeGenerator(this).append(any).append(body).append(header).append(otherAttributes).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("any", any).append("body", body).append("header", header).append("otherAttributes", otherAttributes).getToString();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setAny(
        @Nullable
        final List<Object> aList) {
        any = aList;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasAnyEntries() {
        return (!getAny().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoAnyEntries() {
        return getAny().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getAnyCount() {
        return getAny().size();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param index
     *     The index to retrieve
     * @return
     *     The element at the specified index. May be <code>null</code>
     * @throws IndexOutOfBoundsException
     *     if the index is invalid!
     */
    @Nullable
    public Object getAnyAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getAny().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addAny(
        @Nonnull
        final Object elem) {
        getAny().add(elem);
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Soap11Envelope ret) {
        if (any == null) {
            ret.any = null;
        } else {
            List<Object> retAny = new ArrayList<>();
            for (Object aItem: getAny()) {
                retAny.add(aItem);
            }
            ret.any = retAny;
        }
        ret.body = ((body == null)?null:body.clone());
        ret.header = ((header == null)?null:header.clone());
        if (otherAttributes == null) {
            ret.otherAttributes = null;
        } else {
            ret.otherAttributes = new HashMap<>(otherAttributes);
        }
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
    public Soap11Envelope clone() {
        Soap11Envelope ret = new Soap11Envelope();
        cloneTo(ret);
        return ret;
    }

}
