
package com.helger.phase4.ebms3header;

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
import com.helger.phase4.ebms3header.runtime.ZeroOneBooleanAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * The eb:Messaging element is the top element of ebMS-3 headers, and it is 
 * 	placed within the SOAP Header element (either SOAP 1.1 or SOAP 1.2). The 
 * 	eb:Messaging element may contain several instances of eb:SignalMessage 
 * 	and eb:UserMessage elements. However in the core part of the ebMS-3
 * 	specification, only one instance of either eb:UserMessage or eb:SignalMessage 
 * 	must be present. The second part of ebMS-3 specification may need to include 
 * 	multiple instances of either eb:SignalMessage, eb:UserMessage or both. 
 * 	Therefore, this schema is allowing multiple instances of eb:SignalMessage 
 * 	and eb:UserMessage elements for part 2 of the ebMS-3 specification. Note
 * 	that the eb:Messaging element cannot be empty (at least one of 
 * 	eb:SignalMessage or eb:UserMessage element must present).
 * 
 * <p>Java class for Messaging complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Messaging">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SignalMessage" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}SignalMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UserMessage" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}UserMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}headerExtension"/>
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
@XmlType(name = "Messaging", propOrder = {
    "signalMessage",
    "userMessage",
    "any"
})
@CodingStyleguideUnaware
public class Ebms3Messaging implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "SignalMessage")
    private List<Ebms3SignalMessage> signalMessage;
    @XmlElement(name = "UserMessage")
    private List<Ebms3UserMessage> userMessage;
    @XmlAnyElement(lax = true)
    private List<Object> any;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    private String id;
    /**
     * if SOAP 1.1 is being used, this attribute is required
     * 
     */
    @XmlAttribute(name = "mustUnderstand", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    private Boolean s11MustUnderstand;
    /**
     * if SOAP 1.2 is being used, this attribute is required
     * 
     */
    @XmlAttribute(name = "mustUnderstand", namespace = "http://www.w3.org/2003/05/soap-envelope")
    private Boolean s12MustUnderstand;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3Messaging() {
    }

    /**
     * Gets the value of the signalMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signalMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignalMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ebms3SignalMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the signalMessage property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<Ebms3SignalMessage> getSignalMessage() {
        if (signalMessage == null) {
            signalMessage = new ArrayList<>();
        }
        return this.signalMessage;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ebms3UserMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the userMessage property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<Ebms3UserMessage> getUserMessage() {
        if (userMessage == null) {
            userMessage = new ArrayList<>();
        }
        return this.userMessage;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(
        @Nullable
        String value) {
        this.id = value;
    }

    /**
     * if SOAP 1.1 is being used, this attribute is required
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isS11MustUnderstand() {
        return s11MustUnderstand;
    }

    /**
     * Sets the value of the s11MustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #isS11MustUnderstand()
     */
    public void setS11MustUnderstand(
        @Nullable
        Boolean value) {
        this.s11MustUnderstand = value;
    }

    /**
     * if SOAP 1.2 is being used, this attribute is required
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isS12MustUnderstand() {
        if (s12MustUnderstand == null) {
            return false;
        } else {
            return s12MustUnderstand;
        }
    }

    /**
     * Sets the value of the s12MustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isS12MustUnderstand()
     */
    public void setS12MustUnderstand(
        @Nullable
        Boolean value) {
        this.s12MustUnderstand = value;
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
        final Ebms3Messaging rhs = ((Ebms3Messaging) o);
        if (!EqualsHelper.equalsCollection(any, rhs.any)) {
            return false;
        }
        if (!EqualsHelper.equals(id, rhs.id)) {
            return false;
        }
        if (!EqualsHelper.equals(otherAttributes, rhs.otherAttributes)) {
            return false;
        }
        if (!EqualsHelper.equals(s11MustUnderstand, rhs.s11MustUnderstand)) {
            return false;
        }
        if (!EqualsHelper.equals(s12MustUnderstand, rhs.s12MustUnderstand)) {
            return false;
        }
        if (!EqualsHelper.equalsCollection(signalMessage, rhs.signalMessage)) {
            return false;
        }
        if (!EqualsHelper.equalsCollection(userMessage, rhs.userMessage)) {
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
        return new HashCodeGenerator(this).append(any).append(id).append(otherAttributes).append(s11MustUnderstand).append(s12MustUnderstand).append(signalMessage).append(userMessage).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("any", any).append("id", id).append("otherAttributes", otherAttributes).append("s11MustUnderstand", s11MustUnderstand).append("s12MustUnderstand", s12MustUnderstand).append("signalMessage", signalMessage).append("userMessage", userMessage).getToString();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setSignalMessage(
        @Nullable
        final List<Ebms3SignalMessage> aList) {
        signalMessage = aList;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setUserMessage(
        @Nullable
        final List<Ebms3UserMessage> aList) {
        userMessage = aList;
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
    public boolean hasSignalMessageEntries() {
        return (!getSignalMessage().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoSignalMessageEntries() {
        return getSignalMessage().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getSignalMessageCount() {
        return getSignalMessage().size();
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
    public Ebms3SignalMessage getSignalMessageAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getSignalMessage().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addSignalMessage(
        @Nonnull
        final Ebms3SignalMessage elem) {
        getSignalMessage().add(elem);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasUserMessageEntries() {
        return (!getUserMessage().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoUserMessageEntries() {
        return getUserMessage().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getUserMessageCount() {
        return getUserMessage().size();
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
    public Ebms3UserMessage getUserMessageAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getUserMessage().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addUserMessage(
        @Nonnull
        final Ebms3UserMessage elem) {
        getUserMessage().add(elem);
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
        Ebms3Messaging ret) {
        if (any == null) {
            ret.any = null;
        } else {
            List<Object> retAny = new ArrayList<>();
            for (Object aItem: getAny()) {
                retAny.add(aItem);
            }
            ret.any = retAny;
        }
        ret.id = id;
        if (otherAttributes == null) {
            ret.otherAttributes = null;
        } else {
            ret.otherAttributes = new HashMap<>(otherAttributes);
        }
        ret.s11MustUnderstand = s11MustUnderstand;
        ret.s12MustUnderstand = s12MustUnderstand;
        if (signalMessage == null) {
            ret.signalMessage = null;
        } else {
            List<Ebms3SignalMessage> retSignalMessage = new ArrayList<>();
            for (Ebms3SignalMessage aItem: getSignalMessage()) {
                retSignalMessage.add(((aItem == null)?null:aItem.clone()));
            }
            ret.signalMessage = retSignalMessage;
        }
        if (userMessage == null) {
            ret.userMessage = null;
        } else {
            List<Ebms3UserMessage> retUserMessage = new ArrayList<>();
            for (Ebms3UserMessage aItem: getUserMessage()) {
                retUserMessage.add(((aItem == null)?null:aItem.clone()));
            }
            ret.userMessage = retUserMessage;
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
    public Ebms3Messaging clone() {
        Ebms3Messaging ret = new Ebms3Messaging();
        cloneTo(ret);
        return ret;
    }

}
