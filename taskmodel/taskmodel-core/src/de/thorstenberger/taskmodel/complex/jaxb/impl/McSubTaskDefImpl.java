//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.21 um 01:55:07 GMT+01:00 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class McSubTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.McSubTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "mcSubTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.McSubTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "mcSubTaskDef");
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
        return (de.thorstenberger.taskmodel.complex.jaxb.McSubTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv."
+"grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Data"
+"type;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq"
+"\u0000~\u0000\u0004ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ri"
+"sAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fna"
+"mespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpace"
+"t\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:/"
+"/www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv"
+".grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001b"
+"com.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fna"
+"mespaceURIq\u0000~\u0000!xpq\u0000~\u0000%q\u0000~\u0000$sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolea"
+"n\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0019ppsr\u0000\"com.sun.msv.datatype.xsd"
+".QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0005QNamesr\u00005com.sun.msv.data"
+"type.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\'q\u0000~\u0000*s"
+"q\u0000~\u0000+q\u0000~\u00006q\u0000~\u0000$sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001"
+"/XMLSchema-instancesr\u00000com.sun.msv.grammar.Expression$Epsilo"
+"nExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u00001\u0001q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u0007problemt\u00009h"
+"ttp://complex.taskmodel.thorstenberger.de/complexTaskDefsq\u0000~"
+"\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u00002p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000\u001csq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<"
+"q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u0004hintq\u0000~\u0000Dq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000\u0000q\u0000~\u00002p\u0000sq\u0000~\u0000\u0007ppq\u0000~"
+"\u0000\u001csq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u000ecorrectionHint"
+"q\u0000~\u0000Dq\u0000~\u0000@sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0019ppsr\u0000*com.sun.msv.datatype."
+"xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd"
+".RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u00009"
+"com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7R"
+"o\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/"
+"sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/s"
+"un/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u0000 q\u0000~\u0000"
+"Dpq\u0000~\u00008\u0000\u0000sr\u0000 com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+"
+"com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbas"
+"eFacetsq\u0000~\u0000[xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0003intq\u0000~\u00008sr\u0000*com.sun.msv.datatype.x"
+"sd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Wppq\u0000~\u00008\u0000\u0001sq\u0000~\u0000Vppq\u0000~\u00008\u0000"
+"\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000_q\u0000~\u0000$"
+"t\u0000\u0004longq\u0000~\u00008sq\u0000~\u0000bppq\u0000~\u00008\u0000\u0001sq\u0000~\u0000Vppq\u0000~\u00008\u0000\u0000sr\u0000$com.sun.msv.da"
+"tatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000_q\u0000~\u0000$t\u0000\u0007integerq\u0000~\u00008s"
+"r\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000"
+"\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConstr"
+"aintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Zppq\u0000~\u00008\u0001\u0000sr\u0000#com.sun.msv.datatype."
+"xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0007decimalq\u0000~\u00008q\u0000~\u0000qt\u0000\u000ef"
+"ractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000kt\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc"
+"\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000k"
+"t\u0000\fmaxInclusivesq\u0000~\u0000u\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000fq\u0000~\u0000tsr\u0000\u0011java.lang.Integer"
+"\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000v\u0080\u0000\u0000\u0000q\u0000~\u0000fq\u0000~\u0000xsq\u0000~\u0000z\u007f\u00ff\u00ff\u00ffq\u0000~\u0000`q\u0000~\u0000ts"
+"q\u0000~\u0000z\u0000\u0000\u0000\u0001q\u0000~\u0000*sq\u0000~\u0000+t\u0000\u000bint-derivedq\u0000~\u0000Dsq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq"
+"\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u0010displayedAnswersq\u0000~\u0000Dsr\u0000 com.sun.msv."
+"grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Unary"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000s"
+"q\u0000~\u0000-ppsq\u0000~\u0000\u0084q\u0000~\u00002psq\u0000~\u0000/q\u0000~\u00002psr\u00002com.sun.msv.grammar.Expre"
+"ssion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000Aq\u0000~\u0000\u008esr\u0000 com."
+"sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@sq\u0000~\u0000:t\u0000Ed"
+"e.thorstenberger.taskmodel.complex.jaxb.McSubTaskDefType.Cor"
+"rectTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000-"
+"ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\u0007correctq\u0000~\u0000Dsq\u0000~\u0000-ppsq"
+"\u0000~\u0000\u0084q\u0000~\u00002psq\u0000~\u0000\u0000q\u0000~\u00002p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000-ppsq\u0000~\u0000\u0084q\u0000~\u00002p"
+"sq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u0000\u008eq\u0000~\u0000\u0090q\u0000~\u0000@sq\u0000~\u0000:t\u0000Gde.thorstenberger.taskmo"
+"del.complex.jaxb.McSubTaskDefType.IncorrectTypeq\u0000~\u0000\u0093sq\u0000~\u0000-pp"
+"sq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\tincorrectq\u0000~\u0000Dq\u0000~\u0000@sq\u0000~\u0000"
+"-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u0000\u001csq\u0000~\u0000:t\u0000\u0002idt\u0000\u0000q\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002ps"
+"q\u0000~\u0000\u0019ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xq\u0000~\u0000Yq\u0000~\u0000Dpq\u0000~\u0000(\u0000\u0000q\u0000~\u0000#q\u0000~\u0000#t"
+"\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000"
+"\u0005t\u0000\u0002det\u0000\u0002est\u0000\u0002ent\u0000\u0002frt\u0000\u0002ruxq\u0000~\u0000*sq\u0000~\u0000+t\u0000\u000estring-derivedq\u0000~\u0000D"
+"sq\u0000~\u0000:t\u0000\rinputLanguageq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002psq\u0000~\u0000\u0019pp"
+"sr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~"
+"\u0000$t\u0000\u0007booleanq\u0000~\u00008q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000\u00c2q\u0000~\u0000$sq\u0000~\u0000:t\u0000\u0013interactiveFe"
+"edbackq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u0000\u00bfsq\u0000~\u0000:t\u0000\u0005trashq\u0000~\u0000\u00aa"
+"q\u0000~\u0000@sq\u0000~\u0000/ppsq\u0000~\u0000\u0019ppsq\u0000~\u0000\u00aeq\u0000~\u0000Dpq\u0000~\u0000(\u0000\u0000q\u0000~\u0000#q\u0000~\u0000#q\u0000~\u0000\u00b1sq\u0000~\u0000"
+"\u00b2w\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0002t\u0000\fsingleSelectt\u0000\u000emultipleSelectxq\u0000~\u0000*sq\u0000~\u0000+t"
+"\u0000\u000estring-derivedq\u0000~\u0000Dsq\u0000~\u0000:t\u0000\bcategoryq\u0000~\u0000\u00aasq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~"
+"\u00002psq\u0000~\u0000\u0019ppq\u0000~\u0000`q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000aq\u0000~\u0000$sq\u0000~\u0000:t\u0000\u0011maxCorrectAnsw"
+"ersq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002psq\u0000~\u0000\u0019ppsq\u0000~\u0000Vq\u0000~\u0000Dpq\u0000~\u00008\u0000\u0000"
+"q\u0000~\u0000`q\u0000~\u0000`q\u0000~\u0000tsq\u0000~\u0000z\u0000\u0000\u0000\u0001q\u0000~\u0000*sq\u0000~\u0000+t\u0000\u000bint-derivedq\u0000~\u0000Dsq\u0000~\u0000"
+":t\u0000\u0011minCorrectAnswersq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~\u0000\u00bfsq\u0000~"
+"\u0000:t\u0000\u0016preserveOrderOfAnswersq\u0000~\u0000\u00aaq\u0000~\u0000@sq\u0000~\u0000-ppsq\u0000~\u0000/q\u0000~\u00002pq\u0000~"
+"\u00003q\u0000~\u0000<q\u0000~\u0000@sq\u0000~\u0000:t\u0000\fmcSubTaskDefq\u0000~\u0000Dsr\u0000\"com.sun.msv.gramma"
+"r.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramma"
+"r/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expres"
+"sionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006par"
+"entt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000+\u0001pq\u0000~\u0000\u00e3q\u0000~\u0000\u00d4"
+"q\u0000~\u0000\u00abq\u0000~\u0000\u0018q\u0000~\u0000Gq\u0000~\u0000Nq\u0000~\u0000\u0014q\u0000~\u0000\u0015q\u0000~\u0000\u0098q\u0000~\u0000Eq\u0000~\u0000Lq\u0000~\u0000\u00c6q\u0000~\u0000.q\u0000~\u0000H"
+"q\u0000~\u0000Oq\u0000~\u0000\u0080q\u0000~\u0000\u0094q\u0000~\u0000\u00a2q\u0000~\u0000\u0088q\u0000~\u0000\u0013q\u0000~\u0000\u009bq\u0000~\u0000\u00e7q\u0000~\u0000\nq\u0000~\u0000Tq\u0000~\u0000\u00a6q\u0000~\u0000\u008b"
+"q\u0000~\u0000\u009eq\u0000~\u0000\tq\u0000~\u0000\u0086q\u0000~\u0000\u0099q\u0000~\u0000\fq\u0000~\u0000\u0012q\u0000~\u0000\u00bdq\u0000~\u0000\u0016q\u0000~\u0000\rq\u0000~\u0000\u00daq\u0000~\u0000\u0010q\u0000~\u0000\u008a"
+"q\u0000~\u0000\u009dq\u0000~\u0000\u000eq\u0000~\u0000\u0011q\u0000~\u0000\u000fq\u0000~\u0000\u000bx"));
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
            return de.thorstenberger.taskmodel.complex.jaxb.impl.McSubTaskDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("mcSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "category");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
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
                        if (("mcSubTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "category");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("category" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((de.thorstenberger.taskmodel.complex.jaxb.impl.McSubTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.McSubTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "category");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "category");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
