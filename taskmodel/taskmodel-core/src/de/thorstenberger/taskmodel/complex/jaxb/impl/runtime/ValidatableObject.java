//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.23 at 12:40:13 CEST 
//

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package de.thorstenberger.taskmodel.complex.jaxb.impl.runtime;

import com.sun.msv.verifier.DocumentDeclaration;

/**
 * This interface is implemented by generated classes
 * to indicate that the class supports validation.
 */
public interface ValidatableObject extends XMLSerializable
{
    /** Gets the schema fragment associated with this class. */
    DocumentDeclaration createRawValidator();
    
    /**
     * Gets the main interface that this object implements.
     * 
     * For example, <code>FooImpl</code> will return <code>Foo</code>
     * from this method.
     */
    Class getPrimaryInterface();
}
