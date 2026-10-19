package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYS-CONSTANT-VALUE", "IN-PARAM-IF-SNREF", "IN-PARAM-IF-SNPATHREF"})
@Root(name = "WRITE-PARAM-VALUE")
public class WRITEPARAMVALUE {

    @Element(name = "IN-PARAM-IF-SNPATHREF")
    protected SNPATHREF inparamifsnpathref;

    @Element(name = "IN-PARAM-IF-SNREF")
    protected SNREF inparamifsnref;

    @Element(name = "PHYS-CONSTANT-VALUE", required = true)
    protected String physconstantvalue;

    @Attribute(name = "SEMANTIC", required = true)
    protected String semantic;

    public SNPATHREF getINPARAMIFSNPATHREF() {
        return this.inparamifsnpathref;
    }

    public SNREF getINPARAMIFSNREF() {
        return this.inparamifsnref;
    }

    public String getPHYSCONSTANTVALUE() {
        return this.physconstantvalue;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public void setINPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.inparamifsnpathref = snpathref;
    }

    public void setINPARAMIFSNREF(SNREF snref) {
        this.inparamifsnref = snref;
    }

    public void setPHYSCONSTANTVALUE(String str) {
        this.physconstantvalue = str;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }
}
