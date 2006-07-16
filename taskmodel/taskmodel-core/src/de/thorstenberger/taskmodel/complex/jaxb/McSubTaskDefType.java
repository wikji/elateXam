//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.16 at 04:14:34 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/java_files/eclipse/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 262)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="problem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;attribute name="minCorrectAnswers">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="singleSelect"/>
 *             &lt;enumeration value="multipleSelect"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxCorrectAnswers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface McSubTaskDefType {


    /**
     * 
     */
    int getDisplayedAnswers();

    /**
     * 
     */
    void setDisplayedAnswers(int value);

    boolean isSetDisplayedAnswers();

    void unsetDisplayedAnswers();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getHint();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setHint(java.lang.String value);

    boolean isSetHint();

    void unsetHint();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProblem();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProblem(java.lang.String value);

    boolean isSetProblem();

    void unsetProblem();

    /**
     * 
     */
    int getMinCorrectAnswers();

    /**
     * 
     */
    void setMinCorrectAnswers(int value);

    boolean isSetMinCorrectAnswers();

    void unsetMinCorrectAnswers();

    /**
     * 
     */
    int getMaxCorrectAnswers();

    /**
     * 
     */
    void setMaxCorrectAnswers(int value);

    boolean isSetMaxCorrectAnswers();

    void unsetMaxCorrectAnswers();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCategory();

    /**
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Incorrect property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncorrect().add(newItem);
     * </pre>
     * 
     * 
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Correct property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrect().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.CorrectType}
     * 
     */
    java.util.List getCorrect();

    boolean isSetCorrect();

    void unsetCorrect();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    boolean isSetId();

    void unsetId();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/java_files/eclipse/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 274)
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
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
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
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/java_files/eclipse/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 283)
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
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        boolean isSetValue();

        void unsetValue();

        /**
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getId();

        /**
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
