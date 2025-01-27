
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
import jakarta.xml.bind.annotation.XmlAnyElement;
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
 *     <extension base="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}SignalIdentificationInformation">
 *       <sequence>
 *         <element name="ExceptionType">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="ReceiptException">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="Syntax"/>
 *                         <enumeration value="Authorization"/>
 *                         <enumeration value="Signature"/>
 *                         <enumeration value="Sequence"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="AcceptanceException">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="Business"/>
 *                         <enumeration value="Performance"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="GeneralException">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Reason" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string"/>
 *         <element name="ExceptionMessage" type="{http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0}non-empty-string" minOccurs="0"/>
 *         <any namespace='##other' minOccurs="0"/>
 *       </sequence>
 *     </extension>
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
@XmlType(name = "", propOrder = {
    "exceptionType",
    "reason",
    "exceptionMessage",
    "any"
})
@XmlRootElement(name = "Exception", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
@CodingStyleguideUnaware
public class Exception
    extends EbbpSigSignalIdentificationInformation
{

    @XmlElement(name = "ExceptionType", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0", required = true)
    private Exception.ExceptionType exceptionType;
    @XmlElement(name = "Reason", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0", required = true)
    private String reason;
    @XmlElement(name = "ExceptionMessage", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
    private String exceptionMessage;
    @XmlAnyElement(lax = true)
    private Object any;

    /**
     * Default constructor<br>
     * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
     * 
     */
    public Exception() {
    }

    /**
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link Exception.ExceptionType }
     *     
     */
    @Nullable
    public Exception.ExceptionType getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception.ExceptionType }
     *     
     */
    public void setExceptionType(
        @Nullable
        Exception.ExceptionType value) {
        this.exceptionType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(
        @Nullable
        String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(
        @Nullable
        String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Nullable
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(
        @Nullable
        Object value) {
        this.any = value;
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
        if (!super.equals(o)) {
            return false;
        }
        final Exception rhs = ((Exception) o);
        if (!EqualsHelper.equals(any, rhs.any)) {
            return false;
        }
        if (!EqualsHelper.equals(exceptionMessage, rhs.exceptionMessage)) {
            return false;
        }
        if (!EqualsHelper.equals(exceptionType, rhs.exceptionType)) {
            return false;
        }
        if (!EqualsHelper.equals(reason, rhs.reason)) {
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
        return HashCodeGenerator.getDerived(super.hashCode()).append(any).append(exceptionMessage).append(exceptionType).append(reason).getHashCode();
    }

    /**
     * Created by ph-jaxb-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return ToStringGenerator.getDerived(super.toString()).append("any", any).append("exceptionMessage", exceptionMessage).append("exceptionType", exceptionType).append("reason", reason).getToString();
    }

    /**
     * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
     * 
     * @param ret
     *     The target object to clone to. May not be <code>null</code>.
     */
    public void cloneTo(
        @Nonnull
        Exception ret) {
        super.cloneTo(ret);
        ret.any = any;
        ret.exceptionMessage = exceptionMessage;
        ret.exceptionType = ((exceptionType == null)?null:exceptionType.clone());
        ret.reason = reason;
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
    public Exception clone() {
        Exception ret = new Exception();
        cloneTo(ret);
        return ret;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="ReceiptException">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="Syntax"/>
     *               <enumeration value="Authorization"/>
     *               <enumeration value="Signature"/>
     *               <enumeration value="Sequence"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AcceptanceException">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="Business"/>
     *               <enumeration value="Performance"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="GeneralException">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </choice>
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
    @XmlType(name = "", propOrder = {
        "receiptException",
        "acceptanceException",
        "generalException"
    })
    @CodingStyleguideUnaware
    public static class ExceptionType implements Serializable, IExplicitlyCloneable
    {

        @XmlElement(name = "ReceiptException", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
        private String receiptException;
        @XmlElement(name = "AcceptanceException", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
        private String acceptanceException;
        @XmlElement(name = "GeneralException", namespace = "http://docs.oasis-open.org/ebxml-bp/ebbp-signals-2.0")
        private String generalException;

        /**
         * Default constructor<br>
         * Note: automatically created by ph-jaxb-plugin -Xph-value-extender
         * 
         */
        public ExceptionType() {
        }

        /**
         * Gets the value of the receiptException property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Nullable
        public String getReceiptException() {
            return receiptException;
        }

        /**
         * Sets the value of the receiptException property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiptException(
            @Nullable
            String value) {
            this.receiptException = value;
        }

        /**
         * Gets the value of the acceptanceException property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Nullable
        public String getAcceptanceException() {
            return acceptanceException;
        }

        /**
         * Sets the value of the acceptanceException property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcceptanceException(
            @Nullable
            String value) {
            this.acceptanceException = value;
        }

        /**
         * Gets the value of the generalException property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Nullable
        public String getGeneralException() {
            return generalException;
        }

        /**
         * Sets the value of the generalException property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeneralException(
            @Nullable
            String value) {
            this.generalException = value;
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
            final Exception.ExceptionType rhs = ((Exception.ExceptionType) o);
            if (!EqualsHelper.equals(acceptanceException, rhs.acceptanceException)) {
                return false;
            }
            if (!EqualsHelper.equals(generalException, rhs.generalException)) {
                return false;
            }
            if (!EqualsHelper.equals(receiptException, rhs.receiptException)) {
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
            return new HashCodeGenerator(this).append(acceptanceException).append(generalException).append(receiptException).getHashCode();
        }

        /**
         * Created by ph-jaxb-plugin -Xph-tostring
         * 
         */
        @Override
        public String toString() {
            return new ToStringGenerator(this).append("acceptanceException", acceptanceException).append("generalException", generalException).append("receiptException", receiptException).getToString();
        }

        /**
         * This method clones all values from <code>this</code> to the passed object. All data in the parameter object is overwritten!Created by ph-jaxb-plugin -Xph-cloneable2
         * 
         * @param ret
         *     The target object to clone to. May not be <code>null</code>.
         */
        public void cloneTo(
            @Nonnull
            Exception.ExceptionType ret) {
            ret.acceptanceException = acceptanceException;
            ret.generalException = generalException;
            ret.receiptException = receiptException;
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
        public Exception.ExceptionType clone() {
            Exception.ExceptionType ret = new Exception.ExceptionType();
            cloneTo(ret);
            return ret;
        }

    }

}
