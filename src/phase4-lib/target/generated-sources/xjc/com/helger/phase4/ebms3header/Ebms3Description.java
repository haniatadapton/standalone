
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
 * <p>Java class for Description complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Description">
 *   <simpleContent>
 *     <extension base="<http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/>non-empty-string">
 *       <attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
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
@XmlType(name = "Description", propOrder = {
    "value"
})
@CodingStyleguideUnaware
public class Ebms3Description implements Serializable, IExplicitlyCloneable
{

    @XmlValue
    private String value;
    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     *      &#13;
     *       &lt;h3&gt;lang (as an attribute name)&lt;/h3&gt;&#13;
     *       &lt;p&gt;&#13;
     *        denotes an attribute whose value&#13;
     *        is a language code for the natural language of the content of&#13;
     *        any element; its value is inherited.  This name is reserved&#13;
     *        by virtue of its definition in the XML specification.&lt;/p&gt;&#13;
     *      &#13;
     *     &lt;/div&gt;
     * </pre>
     * 
     *     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     *      &lt;h4&gt;Notes&lt;/h4&gt;&#13;
     *      &lt;p&gt;&#13;
     *       Attempting to install the relevant ISO 2- and 3-letter&#13;
     *       codes as the enumerated possible values is probably never&#13;
     *       going to be a realistic possibility.  &#13;
     *      &lt;/p&gt;&#13;
     *      &lt;p&gt;&#13;
     *       See BCP 47 at &lt;a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt"&gt;&#13;
     *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt&lt;/a&gt;&#13;
     *       and the IANA language subtag registry at&#13;
     *       &lt;a href="http://www.iana.org/assignments/language-subtag-registry"&gt;&#13;
     *        http://www.iana.org/assignments/language-subtag-registry&lt;/a&gt;&#13;
     *       for further information.&#13;
     *      &lt;/p&gt;&#13;
     *      &lt;p&gt;&#13;
     *       The union allows for the 'un-declaration' of xml:lang with&#13;
     *       the empty string.&#13;
     *      &lt;/p&gt;&#13;
     *     &lt;/div&gt;
     * </pre>
     * 
     */
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    private String lang;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Ebms3Description() {
    }

    /**
     * Constructor for value of type String<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     * @param valueParam
     *     The value to be set. May be <code>null</code>.
     */
    public Ebms3Description(
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
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     *      &#13;
     *       &lt;h3&gt;lang (as an attribute name)&lt;/h3&gt;&#13;
     *       &lt;p&gt;&#13;
     *        denotes an attribute whose value&#13;
     *        is a language code for the natural language of the content of&#13;
     *        any element; its value is inherited.  This name is reserved&#13;
     *        by virtue of its definition in the XML specification.&lt;/p&gt;&#13;
     *      &#13;
     *     &lt;/div&gt;
     * </pre>
     * 
     *     
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&#13;
     *      &lt;h4&gt;Notes&lt;/h4&gt;&#13;
     *      &lt;p&gt;&#13;
     *       Attempting to install the relevant ISO 2- and 3-letter&#13;
     *       codes as the enumerated possible values is probably never&#13;
     *       going to be a realistic possibility.  &#13;
     *      &lt;/p&gt;&#13;
     *      &lt;p&gt;&#13;
     *       See BCP 47 at &lt;a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt"&gt;&#13;
     *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt&lt;/a&gt;&#13;
     *       and the IANA language subtag registry at&#13;
     *       &lt;a href="http://www.iana.org/assignments/language-subtag-registry"&gt;&#13;
     *        http://www.iana.org/assignments/language-subtag-registry&lt;/a&gt;&#13;
     *       for further information.&#13;
     *      &lt;/p&gt;&#13;
     *      &lt;p&gt;&#13;
     *       The union allows for the 'un-declaration' of xml:lang with&#13;
     *       the empty string.&#13;
     *      &lt;/p&gt;&#13;
     *     &lt;/div&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLang()
     */
    public void setLang(
        @Nullable
        String value) {
        this.lang = value;
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
        final Ebms3Description rhs = ((Ebms3Description) o);
        if (!EqualsHelper.equals(lang, rhs.lang)) {
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
        return new HashCodeGenerator(this).append(lang).append(value).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("lang", lang).append("value", value).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Ebms3Description ret) {
        ret.lang = lang;
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
    public Ebms3Description clone() {
        Ebms3Description ret = new Ebms3Description();
        cloneTo(ret);
        return ret;
    }

}
