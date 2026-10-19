package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DESC", "RELATION-TYPE", "DIAG-COMM-REF", "DIAG-COMM-SNREF", "IN-PARAM-IF-SNREF", "IN-PARAM-IF-SNPATHREF", "OUT-PARAM-IF-SNREF", "OUT-PARAM-IF-SNPATHREF"})
@Root(name = "COMM-RELATION")
public class COMMRELATION {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-COMM-REF")
    protected ODXLINK diagcommref;

    @Element(name = "DIAG-COMM-SNREF")
    protected SNREF diagcommsnref;

    @Element(name = "IN-PARAM-IF-SNPATHREF")
    protected SNPATHREF inparamifsnpathref;

    @Element(name = "IN-PARAM-IF-SNREF")
    protected SNREF inparamifsnref;

    @Element(name = "OUT-PARAM-IF-SNPATHREF")
    protected SNPATHREF outparamifsnpathref;

    @Element(name = "OUT-PARAM-IF-SNREF")
    protected SNREF outparamifsnref;

    @Element(name = "RELATION-TYPE", required = true)
    protected String relationtype;

    @Attribute(name = "VALUE-TYPE")
    @Convert(COMMRELATIONVALUETYPE.Converter.class)
    protected COMMRELATIONVALUETYPE valuetype;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getDIAGCOMMREF() {
        return this.diagcommref;
    }

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public SNPATHREF getINPARAMIFSNPATHREF() {
        return this.inparamifsnpathref;
    }

    public SNREF getINPARAMIFSNREF() {
        return this.inparamifsnref;
    }

    public SNPATHREF getOUTPARAMIFSNPATHREF() {
        return this.outparamifsnpathref;
    }

    public SNREF getOUTPARAMIFSNREF() {
        return this.outparamifsnref;
    }

    public String getRELATIONTYPE() {
        return this.relationtype;
    }

    public COMMRELATIONVALUETYPE getVALUETYPE() {
        return this.valuetype;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCOMMREF(ODXLINK odxlink) {
        this.diagcommref = odxlink;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }

    public void setINPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.inparamifsnpathref = snpathref;
    }

    public void setINPARAMIFSNREF(SNREF snref) {
        this.inparamifsnref = snref;
    }

    public void setOUTPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.outparamifsnpathref = snpathref;
    }

    public void setOUTPARAMIFSNREF(SNREF snref) {
        this.outparamifsnref = snref;
    }

    public void setRELATIONTYPE(String str) {
        this.relationtype = str;
    }

    public void setVALUETYPE(COMMRELATIONVALUETYPE commrelationvaluetype) {
        this.valuetype = commrelationvaluetype;
    }
}
