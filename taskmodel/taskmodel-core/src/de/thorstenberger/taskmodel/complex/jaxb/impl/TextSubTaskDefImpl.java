//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.15 at 05:07:42 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class TextSubTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "textSubTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "textSubTaskDef");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.TextSubTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000b\u00a5T\u00a0p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000b\u00a5T\u0095ppsq\u0000~\u0000\u0007\t\u00ab\u00cf\u0097ppsq\u0000~\u0000\u0007\b\'\u00b4\u0080ppsq\u0000~\u0000\u0007\u0005\u00e3\u00b7\u0012ppsq\u0000~\u0000\u0007\u0005:\u00f2\u00f6ppsq\u0000~"
+"\u0000\u0007\u0003\u0098wyppsq\u0000~\u0000\u0000\u0002-\u00ab\u00aepp\u0000sq\u0000~\u0000\u0007\u0002-\u00ab\u00a3ppsr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u0000\u0010I\u00e3pps"
+"r\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlways"
+"Validxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'co"
+"m.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespace"
+"Urit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0019L\u0000\nwhiteSpacet\u0000.Lcom"
+"/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3"
+".org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype"
+".xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.gramma"
+"r.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nppsr\u0000\u001bcom"
+".sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0019L\u0000\fnames"
+"paceURIq\u0000~\u0000\u0019xpq\u0000~\u0000\u001dq\u0000~\u0000\u001csr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u001da\u00bbppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0002\u001da\u00b0sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0011\u0000\u00af\u0099Nppsr\u0000\"com.sun.msv.dat"
+"atype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0016q\u0000~\u0000\u001ct\u0000\u0005QNamesr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u001fq\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000.q\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0019L\u0000\fnamespaceURIq\u0000~\u0000\u0019xr\u0000\u001dcom.s"
+"un.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3"
+".org/2001/XMLSchema-instancesr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tsq\u0000~\u0000)\u0001psq\u0000~\u00002t\u0000\u0007pr"
+"oblemt\u00009http://complex.taskmodel.thorstenberger.de/complexTa"
+"skDefsq\u0000~\u0000%\u0001j\u00cb\u00c6ppsq\u0000~\u0000\u0000\u0001j\u00cb\u00bbq\u0000~\u0000*p\u0000sq\u0000~\u0000\u0007\u0001j\u00cb\u00b0ppq\u0000~\u0000\u0014sq\u0000~\u0000%\u0001Z\u0081"
+"\u00c8ppsq\u0000~\u0000\'\u0001Z\u0081\u00bdq\u0000~\u0000*pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000~\u00002t\u0000\u0004hintq\u0000"
+"~\u0000<q\u0000~\u00008sq\u0000~\u0000%\u0001\u00a2{xppsq\u0000~\u0000\u0000\u0001\u00a2{mq\u0000~\u0000*p\u0000sq\u0000~\u0000\u0007\u0001\u00a2{bppq\u0000~\u0000\u0014sq\u0000~\u0000%"
+"\u0001\u00921zppsq\u0000~\u0000\'\u0001\u00921oq\u0000~\u0000*pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000~\u00002t\u0000\u000ecor"
+"rectionHintq\u0000~\u0000<q\u0000~\u00008sq\u0000~\u0000\'\u0000\u00a8\u00c4\u0017ppq\u0000~\u0000\u0014sq\u0000~\u00002t\u0000\u0002idt\u0000\u0000sq\u0000~\u0000%\u0002C"
+"\u00fdippsq\u0000~\u0000\'\u0002C\u00fd^q\u0000~\u0000*psq\u0000~\u0000\u0011\u0001\u00c5F{ppsr\u0000*com.sun.msv.datatype.xsd"
+".MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.Ra"
+"ngeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u00009com"
+".sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7"
+"\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun"
+"/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/"
+"msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000\u0019xq\u0000~\u0000\u0018q\u0000~\u0000<pq"
+"\u0000~\u00000\u0000\u0000sr\u0000 com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com"
+".sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFa"
+"cetsq\u0000~\u0000Yxq\u0000~\u0000\u0016q\u0000~\u0000\u001ct\u0000\u0003intq\u0000~\u00000sr\u0000*com.sun.msv.datatype.xsd."
+"MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Uppq\u0000~\u00000\u0000\u0001sq\u0000~\u0000Tppq\u0000~\u00000\u0000\u0000sr"
+"\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000]q\u0000~\u0000\u001ct\u0000\u0004"
+"longq\u0000~\u00000sq\u0000~\u0000`ppq\u0000~\u00000\u0000\u0001sq\u0000~\u0000Tppq\u0000~\u00000\u0000\u0000sr\u0000$com.sun.msv.datat"
+"ype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000]q\u0000~\u0000\u001ct\u0000\u0007integerq\u0000~\u00000sr\u0000,"
+"com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005sc"
+"alexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConstrain"
+"tFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Xppq\u0000~\u00000\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd"
+".NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0016q\u0000~\u0000\u001ct\u0000\u0007decimalq\u0000~\u00000q\u0000~\u0000ot\u0000\u000efrac"
+"tionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000it\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df"
+"\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000it\u0000\f"
+"maxInclusivesq\u0000~\u0000s\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000dq\u0000~\u0000rsr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0"
+"\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000t\u0080\u0000\u0000\u0000q\u0000~\u0000dq\u0000~\u0000vsq\u0000~\u0000x\u007f\u00ff\u00ff\u00ffq\u0000~\u0000^q\u0000~\u0000rsq\u0000~"
+"\u0000x\u0000\u0000\u0000\u0001q\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u000bint-derivedq\u0000~\u0000<sq\u0000~\u00002t\u0000\u000ftextFieldHeight"
+"q\u0000~\u0000Pq\u0000~\u00008sq\u0000~\u0000%\u0001\u0084\u001b\u0012ppsq\u0000~\u0000\'\u0001\u0084\u001b\u0007q\u0000~\u0000*psq\u0000~\u0000\u0011\u0000kI}ppsq\u0000~\u0000Tq\u0000~\u0000"
+"<pq\u0000~\u00000\u0000\u0000q\u0000~\u0000^q\u0000~\u0000^q\u0000~\u0000rsq\u0000~\u0000x\u0000\u0000\u0000\u0001q\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u000bint-derivedq"
+"\u0000~\u0000<sq\u0000~\u00002t\u0000\u000etextFieldWidthq\u0000~\u0000Pq\u0000~\u00008sq\u0000~\u0000%\u0001\u00f9\u0084\u00f9ppsq\u0000~\u0000\'\u0001\u00f9\u0084\u00eeq"
+"\u0000~\u0000*pq\u0000~\u0000+sq\u0000~\u00002q\u0000~\u00005q\u0000~\u00006q\u0000~\u00008sq\u0000~\u00002t\u0000\u000etextSubTaskDefq\u0000~\u0000<s"
+"r\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet"
+"\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.s"
+"un.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI"
+"\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u008f[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Ex"
+"pression;xp\u0000\u0000\u0000\u0011\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D"
+"\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpq\u0000~\u0000\u0080pppppq\u0000~\u0000\u0089pppppppppppppppq\u0000~\u0000\u0010ppq\u0000~\u0000&ppp"
+"ppppppppppppppppq\u0000~\u0000\u000bpppppq\u0000~\u0000\npppppppppppq\u0000~\u0000\tppppppq\u0000~\u0000Qpp"
+"ppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000?ppq\u0000~\u0000@pppppppp"
+"pppppppppq\u0000~\u0000Gq\u0000~\u0000=pq\u0000~\u0000Hpppppppq\u0000~\u0000\rppppppppppq\u0000~\u0000Epppq\u0000~\u0000\f"
+"pppppppppppppq\u0000~\u0000\u000eppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("textSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("textSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.TextSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                        case  1 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
