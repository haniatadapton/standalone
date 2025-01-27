
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Receipt complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Receipt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded"/>
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
@XmlType(name = "Receipt", propOrder = {
    "any"
})
@CodingStyleguideUnaware
public class Ebms3Receipt implements Serializable, IExplicitlyCloneable
{

    @XmlAnyElement(lax = true)
    private List<Object> any;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3Receipt() {
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
        final Ebms3Receipt rhs = ((Ebms3Receipt) o);
        if (!EqualsHelper.equalsCollection(any, rhs.any)) {
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
        return new HashCodeGenerator(this).append(any).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("any", any).getToString();
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
        Ebms3Receipt ret) {
        if (any == null) {
            ret.any = null;
        } else {
            List<Object> retAny = new ArrayList<>();
            for (Object aItem: getAny()) {
                retAny.add(aItem);
            }
            ret.any = retAny;
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
    public Ebms3Receipt clone() {
        Ebms3Receipt ret = new Ebms3Receipt();
        cloneTo(ret);
        return ret;
    }

}
