//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.21 um 01:55:07 GMT+01:00 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 368)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *       &lt;sequence>
 *         &lt;element name="displayedAnswers">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="correct" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incorrect" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="singleSelect"/>
 *             &lt;enumeration value="multipleSelect"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxCorrectAnswers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minCorrectAnswers">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="preserveOrderOfAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface McSubTaskDefType
    extends de.thorstenberger.taskmodel.complex.jaxb.SubTaskDefType
{


    /**
     * Gets the value of the displayedAnswers property.
     * 
     */
    int getDisplayedAnswers();

    /**
     * Sets the value of the displayedAnswers property.
     * 
     */
    void setDisplayedAnswers(int value);

    boolean isSetDisplayedAnswers();

    void unsetDisplayedAnswers();

    /**
     * Gets the value of the preserveOrderOfAnswers property.
     * 
     */
    boolean isPreserveOrderOfAnswers();

    /**
     * Sets the value of the preserveOrderOfAnswers property.
     * 
     */
    void setPreserveOrderOfAnswers(boolean value);

    boolean isSetPreserveOrderOfAnswers();

    void unsetPreserveOrderOfAnswers();

    /**
     * Gets the value of the minCorrectAnswers property.
     * 
     */
    int getMinCorrectAnswers();

    /**
     * Sets the value of the minCorrectAnswers property.
     * 
     */
    void setMinCorrectAnswers(int value);

    boolean isSetMinCorrectAnswers();

    void unsetMinCorrectAnswers();

    /**
     * Gets the value of the maxCorrectAnswers property.
     * 
     */
    int getMaxCorrectAnswers();

    /**
     * Sets the value of the maxCorrectAnswers property.
     * 
     */
    void setMaxCorrectAnswers(int value);

    boolean isSetMaxCorrectAnswers();

    void unsetMaxCorrectAnswers();

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCategory();

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCategory(java.lang.String value);

    boolean isSetCategory();

    void unsetCategory();

    /**
     * Gets the value of the Incorrect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Incorrect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncorrect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.IncorrectType}
     * 
     */
    java.util.List getIncorrect();

    boolean isSetIncorrect();

    void unsetIncorrect();

    /**
     * Gets the value of the Correct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Correct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.CorrectType}
     * 
     */
    java.util.List getCorrect();

    boolean isSetCorrect();

    void unsetCorrect();


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 380)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface CorrectType {


        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setId(java.lang.String value);

        boolean isSetId();

        void unsetId();

    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 389)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface IncorrectType {


        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setId(java.lang.String value);

        boolean isSetId();

        void unsetId();

    }

}
