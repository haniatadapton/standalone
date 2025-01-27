
package com.helger.phase4.ebms3header;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.IExplicitlyCloneable;
import com.helger.commons.string.ToStringGenerator;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * In the core part of ebMS-3 specification, an eb:Signal Message is allowed to
 * 	contain eb:MessageInfo and at most one Receipt Signal, at most one eb:PullRequest
 * 	element, and/or a series of eb:Error elements. In part 2 of the ebMS-3 
 * 	specification, new signals may be introduced, and for this reason, 
 * 	an extensibility point is added here to the eb:SignalMessage element to 
 * 	allow it to contain any elements.
 * 
 * <p>Java class for SignalMessage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignalMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MessageInfo" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}MessageInfo"/>
 *         <element name="PullRequest" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}PullRequest" minOccurs="0"/>
 *         <element name="Receipt" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Receipt" minOccurs="0"/>
 *         <element name="Error" type="{http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/}Error" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
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
@XmlType(name = "SignalMessage", propOrder = {
    "messageInfo",
    "pullRequest",
    "receipt",
    "error",
    "any"
})
@CodingStyleguideUnaware
public class Ebms3SignalMessage implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "MessageInfo", required = true)
    private Ebms3MessageInfo messageInfo;
    @XmlElement(name = "PullRequest")
    private Ebms3PullRequest pullRequest;
    @XmlElement(name = "Receipt")
    private Ebms3Receipt receipt;
    @XmlElement(name = "Error")
    private List<Ebms3Error> error;
    @XmlAnyElement(lax = true)
    private List<Object> any;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3SignalMessage() {
    }

    /**
     * Gets the value of the messageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3MessageInfo }
     *     
     */
    @Nullable
    public Ebms3MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Sets the value of the messageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3MessageInfo }
     *     
     */
    public void setMessageInfo(
        @Nullable
        Ebms3MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Gets the value of the pullRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3PullRequest }
     *     
     */
    @Nullable
    public Ebms3PullRequest getPullRequest() {
        return pullRequest;
    }

    /**
     * Sets the value of the pullRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3PullRequest }
     *     
     */
    public void setPullRequest(
        @Nullable
        Ebms3PullRequest value) {
        this.pullRequest = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link Ebms3Receipt }
     *     
     */
    @Nullable
    public Ebms3Receipt getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebms3Receipt }
     *     
     */
    public void setReceipt(
        @Nullable
        Ebms3Receipt value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ebms3Error }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<Ebms3Error> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
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
        final Ebms3SignalMessage rhs = ((Ebms3SignalMessage) o);
        if (!EqualsHelper.equalsCollection(any, rhs.any)) {
            return false;
        }
        if (!EqualsHelper.equalsCollection(error, rhs.error)) {
            return false;
        }
        if (!EqualsHelper.equals(messageInfo, rhs.messageInfo)) {
            return false;
        }
        if (!EqualsHelper.equals(pullRequest, rhs.pullRequest)) {
            return false;
        }
        if (!EqualsHelper.equals(receipt, rhs.receipt)) {
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
        return new HashCodeGenerator(this).append(any).append(error).append(messageInfo).append(pullRequest).append(receipt).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("any", any).append("error", error).append("messageInfo", messageInfo).append("pullRequest", pullRequest).append("receipt", receipt).getToString();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setError(
        @Nullable
        final List<Ebms3Error> aList) {
        error = aList;
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
    public boolean hasErrorEntries() {
        return (!getError().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoErrorEntries() {
        return getError().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getErrorCount() {
        return getError().size();
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
    public Ebms3Error getErrorAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getError().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addError(
        @Nonnull
        final Ebms3Error elem) {
        getError().add(elem);
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
        Ebms3SignalMessage ret) {
        if (any == null) {
            ret.any = null;
        } else {
            List<Object> retAny = new ArrayList<>();
            for (Object aItem: getAny()) {
                retAny.add(aItem);
            }
            ret.any = retAny;
        }
        if (error == null) {
            ret.error = null;
        } else {
            List<Ebms3Error> retError = new ArrayList<>();
            for (Ebms3Error aItem: getError()) {
                retError.add(((aItem == null)?null:aItem.clone()));
            }
            ret.error = retError;
        }
        ret.messageInfo = ((messageInfo == null)?null:messageInfo.clone());
        ret.pullRequest = ((pullRequest == null)?null:pullRequest.clone());
        ret.receipt = ((receipt == null)?null:receipt.clone());
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
    public Ebms3SignalMessage clone() {
        Ebms3SignalMessage ret = new Ebms3SignalMessage();
        cloneTo(ret);
        return ret;
    }

}
