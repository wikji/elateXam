//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.23 at 12:40:13 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for config element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/java_files/eclipse/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 403)
 * <p>
 * <pre>
 * &lt;element name="config">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="pointsPerTask" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *         &lt;attribute name="noOfSelectedTasks" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *         &lt;attribute name="preserveOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface Config
    extends javax.xml.bind.Element, de.thorstenberger.taskmodel.complex.jaxb.ConfigType
{


}
