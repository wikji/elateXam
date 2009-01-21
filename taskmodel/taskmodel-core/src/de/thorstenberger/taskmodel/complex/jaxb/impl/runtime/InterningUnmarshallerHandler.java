//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.21 um 01:55:07 GMT+01:00 
//

package de.thorstenberger.taskmodel.complex.jaxb.impl.runtime;

import javax.xml.bind.JAXBException;
import javax.xml.bind.ValidationEvent;

import org.xml.sax.SAXException;

import com.sun.xml.bind.unmarshaller.InterningXMLReader;

/**
 * Filter {@link SAXUnmarshallerHandler} that interns all the Strings
 * in the SAX events. 
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
final class InterningUnmarshallerHandler extends InterningXMLReader implements SAXUnmarshallerHandler {
    
    private final SAXUnmarshallerHandler core;
    
    InterningUnmarshallerHandler( SAXUnmarshallerHandler core ) {
        super();
        setContentHandler(core);
        this.core = core;
    }
    
    public void handleEvent(ValidationEvent event, boolean canRecover) throws SAXException {
        core.handleEvent(event,canRecover);
    }

    public Object getResult() throws JAXBException, IllegalStateException {
        return core.getResult();
    }

}
