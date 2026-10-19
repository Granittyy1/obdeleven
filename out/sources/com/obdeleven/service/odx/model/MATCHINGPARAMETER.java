package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"EXPECTED-VALUE", "DIAG-COMM-SNREF", "OUT-PARAM-IF-SNREF", "OUT-PARAM-IF-SNPATHREF"})
@Root(name = "MATCHING-PARAMETER")
public class MATCHINGPARAMETER {

    @Element(name = "DIAG-COMM-SNREF", required = true)
    protected SNREF diagcommsnref;

    @Element(name = "EXPECTED-VALUE", required = true)
    protected String expectedvalue;

    @Element(name = "OUT-PARAM-IF-SNPATHREF")
    protected SNPATHREF outparamifsnpathref;

    @Element(name = "OUT-PARAM-IF-SNREF")
    protected SNREF outparamifsnref;

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public String getEXPECTEDVALUE() {
        return this.expectedvalue;
    }

    public SNPATHREF getOUTPARAMIFSNPATHREF() {
        return this.outparamifsnpathref;
    }

    public SNREF getOUTPARAMIFSNREF() {
        return this.outparamifsnref;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }

    public void setEXPECTEDVALUE(String str) {
        this.expectedvalue = str;
    }

    public void setOUTPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.outparamifsnpathref = snpathref;
    }

    public void setOUTPARAMIFSNREF(SNREF snref) {
        this.outparamifsnref = snref;
    }
}
