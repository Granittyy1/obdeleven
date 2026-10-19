package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"VALUE", "IN-PARAM-IF-SNREF", "IN-PARAM-IF-SNPATHREF"})
@Root(name = "STATE-TRANSITION-REF")
public class STATETRANSITIONREF {

    @Attribute(name = "DOCREF")
    protected String docref;

    @Attribute(name = "DOCTYPE")
    @Convert(DOCTYPE.Converter.class)
    protected DOCTYPE doctype;

    @Attribute(name = "ID-REF", required = true)
    protected String idref;

    @Element(name = "IN-PARAM-IF-SNPATHREF")
    protected SNPATHREF inparamifsnpathref;

    @Element(name = "IN-PARAM-IF-SNREF")
    protected SNREF inparamifsnref;

    @Attribute(name = "REVISION")
    protected String revision;

    @Element(name = "VALUE")
    protected String value;

    public String getDOCREF() {
        return this.docref;
    }

    public DOCTYPE getDOCTYPE() {
        return this.doctype;
    }

    public String getIDREF() {
        return this.idref;
    }

    public SNPATHREF getINPARAMIFSNPATHREF() {
        return this.inparamifsnpathref;
    }

    public SNREF getINPARAMIFSNREF() {
        return this.inparamifsnref;
    }

    public String getREVISION() {
        return this.revision;
    }

    public String getVALUE() {
        return this.value;
    }

    public void setDOCREF(String str) {
        this.docref = str;
    }

    public void setDOCTYPE(DOCTYPE doctype) {
        this.doctype = doctype;
    }

    public void setIDREF(String str) {
        this.idref = str;
    }

    public void setINPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.inparamifsnpathref = snpathref;
    }

    public void setINPARAMIFSNREF(SNREF snref) {
        this.inparamifsnref = snref;
    }

    public void setREVISION(String str) {
        this.revision = str;
    }

    public void setVALUE(String str) {
        this.value = str;
    }
}
