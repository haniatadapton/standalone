
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}MessagePartNRInformation" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = {
    "messagePartNRInformation"
})
@XmlRootElement(name = "NonRepudiationInformation", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
@CodingStyleguideUnaware
public class NonRepudiationInformation implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "MessagePartNRInformation", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0", required = true)
    private List<MessagePartNRInformation> messagePartNRInformation;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public NonRepudiationInformation() {
    }

    /**
     * Gets the value of the messagePartNRInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messagePartNRInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessagePartNRInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagePartNRInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the messagePartNRInformation property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<MessagePartNRInformation> getMessagePartNRInformation() {
        if (messagePartNRInformation == null) {
            messagePartNRInformation = new ArrayList<>();
        }
        return this.messagePartNRInformation;
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
        final NonRepudiationInformation rhs = ((NonRepudiationInformation) o);
        if (!EqualsHelper.equalsCollection(messagePartNRInformation, rhs.messagePartNRInformation)) {
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
        return new HashCodeGenerator(this).append(messagePartNRInformation).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("messagePartNRInformation", messagePartNRInformation).getToString();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setMessagePartNRInformation(
        @Nullable
        final List<MessagePartNRInformation> aList) {
        messagePartNRInformation = aList;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasMessagePartNRInformationEntries() {
        return (!getMessagePartNRInformation().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoMessagePartNRInformationEntries() {
        return getMessagePartNRInformation().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getMessagePartNRInformationCount() {
        return getMessagePartNRInformation().size();
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
    public MessagePartNRInformation getMessagePartNRInformationAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getMessagePartNRInformation().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addMessagePartNRInformation(
        @Nonnull
        final MessagePartNRInformation elem) {
        getMessagePartNRInformation().add(elem);
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        NonRepudiationInformation ret) {
        if (messagePartNRInformation == null) {
            ret.messagePartNRInformation = null;
        } else {
            List<MessagePartNRInformation> retMessagePartNRInformation = new ArrayList<>();
            for (MessagePartNRInformation aItem: getMessagePartNRInformation()) {
                retMessagePartNRInformation.add(((aItem == null)?null:aItem.clone()));
            }
            ret.messagePartNRInformation = retMessagePartNRInformation;
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
    public NonRepudiationInformation clone() {
        NonRepudiationInformation ret = new NonRepudiationInformation();
        cloneTo(ret);
        return ret;
    }

}
