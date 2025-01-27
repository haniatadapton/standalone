
package com.helger.phase4.soap12;

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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpgradeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupportedEnvelope" type="{http://www.w3.org/2003/05/soap-envelope}SupportedEnvType" maxOccurs="unbounded"/>
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
@XmlType(name = "UpgradeType", propOrder = {
    "supportedEnvelope"
})
@CodingStyleguideUnaware
public class Soap12UpgradeType implements Serializable, IExplicitlyCloneable
{

    @XmlElement(name = "SupportedEnvelope", required = true)
    private List<Soap12SupportedEnvType> supportedEnvelope;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Soap12UpgradeType() {
    }

    /**
     * Gets the value of the supportedEnvelope property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEnvelope property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEnvelope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Soap12SupportedEnvType }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedEnvelope property.
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<Soap12SupportedEnvType> getSupportedEnvelope() {
        if (supportedEnvelope == null) {
            supportedEnvelope = new ArrayList<>();
        }
        return this.supportedEnvelope;
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
        final Soap12UpgradeType rhs = ((Soap12UpgradeType) o);
        if (!EqualsHelper.equalsCollection(supportedEnvelope, rhs.supportedEnvelope)) {
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
        return new HashCodeGenerator(this).append(supportedEnvelope).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("supportedEnvelope", supportedEnvelope).getToString();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setSupportedEnvelope(
        @Nullable
        final List<Soap12SupportedEnvType> aList) {
        supportedEnvelope = aList;
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasSupportedEnvelopeEntries() {
        return (!getSupportedEnvelope().isEmpty());
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoSupportedEnvelopeEntries() {
        return getSupportedEnvelope().isEmpty();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getSupportedEnvelopeCount() {
        return getSupportedEnvelope().size();
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
    public Soap12SupportedEnvType getSupportedEnvelopeAtIndex(
        @Nonnegative
        final int index)
        throws IndexOutOfBoundsException
    {
        return getSupportedEnvelope().get(index);
    }

    /**
     * Created by ph-jaxb-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addSupportedEnvelope(
        @Nonnull
        final Soap12SupportedEnvType elem) {
        getSupportedEnvelope().add(elem);
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Soap12UpgradeType ret) {
        if (supportedEnvelope == null) {
            ret.supportedEnvelope = null;
        } else {
            List<Soap12SupportedEnvType> retSupportedEnvelope = new ArrayList<>();
            for (Soap12SupportedEnvType aItem: getSupportedEnvelope()) {
                retSupportedEnvelope.add(((aItem == null)?null:aItem.clone()));
            }
            ret.supportedEnvelope = retSupportedEnvelope;
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
    public Soap12UpgradeType clone() {
        Soap12UpgradeType ret = new Soap12UpgradeType();
        cloneTo(ret);
        return ret;
    }

}
