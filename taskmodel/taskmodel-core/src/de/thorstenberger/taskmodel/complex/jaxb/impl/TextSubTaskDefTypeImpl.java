//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.15 at 05:07:42 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class TextSubTaskDefTypeImpl implements de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDefType, java.io.Serializable, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    protected boolean has_TextFieldWidth;
    protected int _TextFieldWidth;
    protected java.lang.String _CorrectionHint;
    protected java.lang.String _Hint;
    protected java.lang.String _Problem;
    protected boolean has_TextFieldHeight;
    protected int _TextFieldHeight;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDefType.class);
    }

    public int getTextFieldWidth() {
        return _TextFieldWidth;
    }

    public void setTextFieldWidth(int value) {
        _TextFieldWidth = value;
        has_TextFieldWidth = true;
    }

    public boolean isSetTextFieldWidth() {
        return has_TextFieldWidth;
    }

    public void unsetTextFieldWidth() {
        has_TextFieldWidth = false;
    }

    public java.lang.String getCorrectionHint() {
        return _CorrectionHint;
    }

    public void setCorrectionHint(java.lang.String value) {
        _CorrectionHint = value;
    }

    public boolean isSetCorrectionHint() {
        return (_CorrectionHint!= null);
    }

    public void unsetCorrectionHint() {
        _CorrectionHint = null;
    }

    public java.lang.String getHint() {
        return _Hint;
    }

    public void setHint(java.lang.String value) {
        _Hint = value;
    }

    public boolean isSetHint() {
        return (_Hint!= null);
    }

    public void unsetHint() {
        _Hint = null;
    }

    public java.lang.String getProblem() {
        return _Problem;
    }

    public void setProblem(java.lang.String value) {
        _Problem = value;
    }

    public boolean isSetProblem() {
        return (_Problem!= null);
    }

    public void unsetProblem() {
        _Problem = null;
    }

    public int getTextFieldHeight() {
        return _TextFieldHeight;
    }

    public void setTextFieldHeight(int value) {
        _TextFieldHeight = value;
        has_TextFieldHeight = true;
    }

    public boolean isSetTextFieldHeight() {
        return has_TextFieldHeight;
    }

    public void unsetTextFieldHeight() {
        has_TextFieldHeight = false;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public boolean isSetId() {
        return (_Id!= null);
    }

    public void unsetId() {
        _Id = null;
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "problem");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Problem), "Problem");
        } catch (java.lang.Exception e) {
            de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        if (_Hint!= null) {
            context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "hint");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Hint), "Hint");
            } catch (java.lang.Exception e) {
                de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_CorrectionHint!= null) {
            context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "correctionHint");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _CorrectionHint), "CorrectionHint");
            } catch (java.lang.Exception e) {
                de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "id");
        try {
            context.text(((java.lang.String) _Id), "Id");
        } catch (java.lang.Exception e) {
            de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (has_TextFieldHeight) {
            context.startAttribute("", "textFieldHeight");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _TextFieldHeight)), "TextFieldHeight");
            } catch (java.lang.Exception e) {
                de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (has_TextFieldWidth) {
            context.startAttribute("", "textFieldWidth");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printInt(((int) _TextFieldWidth)), "TextFieldWidth");
            } catch (java.lang.Exception e) {
                de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDefType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\t\u00ab\u00cf\u0097ppsq\u0000~\u0000\u0000\b\'\u00b4\u0080ppsq\u0000~\u0000\u0000\u0005"
+"\u00e3\u00b7\u0012ppsq\u0000~\u0000\u0000\u0005:\u00f2\u00f6ppsq\u0000~\u0000\u0000\u0003\u0098wyppsr\u0000\'com.sun.msv.grammar.trex.El"
+"ementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/N"
+"ameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aign"
+"oreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0002-\u00ab\u00aepp\u0000sq\u0000~"
+"\u0000\u0000\u0002-\u00ab\u00a3ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u0010I\u00e3ppsr\u0000#com.sun.msv.datatype.x"
+"sd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.data"
+"type.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatyp"
+"e.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XS"
+"DatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L"
+"\u0000\btypeNameq\u0000~\u0000\u0017L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whi"
+"teSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006str"
+"ingsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0"
+"t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000\u0017xpq\u0000~\u0000\u001bq\u0000~\u0000\u001as"
+"r\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0002\u001da\u00bbppsr\u0000 c"
+"om.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tname"
+"Classq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0002\u001da\u00b0sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005value"
+"xp\u0000psq\u0000~\u0000\u000f\u0000\u00af\u0099Nppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001dq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000,q\u0000~\u0000\u001as"
+"r\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNam"
+"eq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000\u0017xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-insta"
+"ncesr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tsq\u0000~\u0000\'\u0001psq\u0000~\u00000t\u0000\u0007problemt\u00009http://complex.ta"
+"skmodel.thorstenberger.de/complexTaskDefsq\u0000~\u0000#\u0001j\u00cb\u00c6ppsq\u0000~\u0000\n\u0001j"
+"\u00cb\u00bbq\u0000~\u0000(p\u0000sq\u0000~\u0000\u0000\u0001j\u00cb\u00b0ppq\u0000~\u0000\u0012sq\u0000~\u0000#\u0001Z\u0081\u00c8ppsq\u0000~\u0000%\u0001Z\u0081\u00bdq\u0000~\u0000(pq\u0000~\u0000)s"
+"q\u0000~\u00000q\u0000~\u00003q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00000t\u0000\u0004hintq\u0000~\u0000:q\u0000~\u00006sq\u0000~\u0000#\u0001\u00a2{xppsq\u0000~\u0000"
+"\n\u0001\u00a2{mq\u0000~\u0000(p\u0000sq\u0000~\u0000\u0000\u0001\u00a2{bppq\u0000~\u0000\u0012sq\u0000~\u0000#\u0001\u00921zppsq\u0000~\u0000%\u0001\u00921oq\u0000~\u0000(pq\u0000~"
+"\u0000)sq\u0000~\u00000q\u0000~\u00003q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00000t\u0000\u000ecorrectionHintq\u0000~\u0000:q\u0000~\u00006sq\u0000~"
+"\u0000%\u0000\u00a8\u00c4\u0017ppq\u0000~\u0000\u0012sq\u0000~\u00000t\u0000\u0002idt\u0000\u0000sq\u0000~\u0000#\u0002C\u00fdippsq\u0000~\u0000%\u0002C\u00fd^q\u0000~\u0000(psq\u0000~\u0000"
+"\u000f\u0001\u00c5F{ppsr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlim"
+"itValuet\u0000\u0012Ljava/lang/Object;xr\u00009com.sun.msv.datatype.xsd.Dat"
+"aTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.data"
+"type.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needV"
+"alueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatat"
+"ypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concrete"
+"Type;L\u0000\tfacetNameq\u0000~\u0000\u0017xq\u0000~\u0000\u0016q\u0000~\u0000:pq\u0000~\u0000.\u0000\u0000sr\u0000 com.sun.msv.dat"
+"atype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.Int"
+"egerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000Wxq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0003in"
+"tq\u0000~\u0000.sr\u0000*com.sun.msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000Sppq\u0000~\u0000.\u0000\u0001sq\u0000~\u0000Rppq\u0000~\u0000.\u0000\u0000sr\u0000!com.sun.msv.datatype.xs"
+"d.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000[q\u0000~\u0000\u001at\u0000\u0004longq\u0000~\u0000.sq\u0000~\u0000^ppq\u0000~\u0000.\u0000\u0001s"
+"q\u0000~\u0000Rppq\u0000~\u0000.\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000[q\u0000~\u0000\u001at\u0000\u0007integerq\u0000~\u0000.sr\u0000,com.sun.msv.datatype.xsd."
+"FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.dataty"
+"pe.xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Vpp"
+"q\u0000~\u0000.\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0007decimalq\u0000~\u0000.q\u0000~\u0000mt\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000gt\u0000\fmin"
+"Inclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang."
+"Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000gt\u0000\fmaxInclusivesq\u0000~\u0000q\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff"
+"\u00ffq\u0000~\u0000bq\u0000~\u0000psr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000r\u0080\u0000\u0000"
+"\u0000q\u0000~\u0000bq\u0000~\u0000tsq\u0000~\u0000v\u007f\u00ff\u00ff\u00ffq\u0000~\u0000\\q\u0000~\u0000psq\u0000~\u0000v\u0000\u0000\u0000\u0001q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000bint-d"
+"erivedq\u0000~\u0000:sq\u0000~\u00000t\u0000\u000ftextFieldHeightq\u0000~\u0000Nq\u0000~\u00006sq\u0000~\u0000#\u0001\u0084\u001b\u0012ppsq\u0000"
+"~\u0000%\u0001\u0084\u001b\u0007q\u0000~\u0000(psq\u0000~\u0000\u000f\u0000kI}ppsq\u0000~\u0000Rq\u0000~\u0000:pq\u0000~\u0000.\u0000\u0000q\u0000~\u0000\\q\u0000~\u0000\\q\u0000~\u0000ps"
+"q\u0000~\u0000v\u0000\u0000\u0000\u0001q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000bint-derivedq\u0000~\u0000:sq\u0000~\u00000t\u0000\u000etextFieldWid"
+"thq\u0000~\u0000Nq\u0000~\u00006sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0088[\u0000\u0005tablet\u0000![Lcom/sun/m"
+"sv/grammar/Expression;xp\u0000\u0000\u0000\u000f\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.E"
+"xpression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpq\u0000~\u0000~pppppppppppppppppppppq\u0000~\u0000\u000ep"
+"pq\u0000~\u0000$pppppppppppppppppppq\u0000~\u0000\u0006pppppq\u0000~\u0000\u0005ppppppppppppppppppq\u0000"
+"~\u0000Oppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000=ppq\u0000~\u0000>ppp"
+"ppppppppppppppq\u0000~\u0000Eq\u0000~\u0000;pq\u0000~\u0000Fpppppppq\u0000~\u0000\bppppppppppq\u0000~\u0000Cppp"
+"q\u0000~\u0000\u0007pppppppppppppq\u0000~\u0000\tppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------------");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  15 :
                        if (("correctionHint" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        state = 18;
                        continue outer;
                    case  18 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "textFieldHeight");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  9 :
                        if (("problem" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        break;
                    case  12 :
                        if (("hint" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _TextFieldHeight = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_TextFieldHeight = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _TextFieldWidth = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_TextFieldWidth = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  14 :
                        if (("hint" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 15;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  18 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        if (("problem" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "textFieldHeight");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  17 :
                        if (("correctionHint" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 18;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  18 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("textFieldHeight" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        if (("textFieldWidth" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  18 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "textFieldHeight");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "textFieldWidth");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  8 :
                        if (("textFieldWidth" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  5 :
                        if (("textFieldHeight" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  0 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  10 :
                            eatText4(value);
                            state = 11;
                            return ;
                        case  15 :
                            state = 18;
                            continue outer;
                        case  18 :
                            revertToParentFromText(value);
                            return ;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "textFieldHeight");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 6;
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  6 :
                            attIdx = context.getAttribute("", "textFieldWidth");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 9;
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  7 :
                            eatText3(value);
                            state = 8;
                            return ;
                        case  16 :
                            eatText5(value);
                            state = 17;
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  12 :
                            state = 15;
                            continue outer;
                        case  13 :
                            eatText6(value);
                            state = 14;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Problem = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _CorrectionHint = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Hint = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
