//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.15 at 05:07:42 CEST 
//

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * @(#)$Id$
 */
package de.thorstenberger.taskmodel.complex.jaxb.impl.runtime;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * Implemented by the generated code to unmarshall an object
 * from unmarshaller events.
 * 
 * <p>
 * AbstractUnmarshallingEventHandlerImpl throws a SAXException when a problem is encountered
 * and that problem is not reported. It is the responsibility of the caller
 * of this interface to report it to the client's ValidationEventHandler
 * and re-wrap it into UnmarshalException.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public interface UnmarshallingEventHandler {
    
    /**
     * Returns the content-tree object for which this unmarshaller
     * is working for.
     */
    Object owner();

    //
    // event handlers
    //
    void enterElement(String uri, String local, String qname, Attributes atts) throws SAXException;
    void leaveElement(String uri, String local, String qname ) throws SAXException;
    void text(String s) throws SAXException;
    void enterAttribute(String uri, String local, String qname ) throws SAXException;
    void leaveAttribute(String uri, String local, String qname ) throws SAXException;
    void leaveChild(int nextState) throws SAXException;
}
