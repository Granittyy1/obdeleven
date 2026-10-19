package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"EXPECTED-VALUE", "OUT-PARAM-IF-SNREF", "OUT-PARAM-IF-SNPATHREF", "MULTIPLE-ECU-JOB-REF", "DIAG-COMM-REF"})
@Root(name = "MATCHING-COMPONENT")
public class MATCHINGCOMPONENT {

    @Element(name = "DIAG-COMM-REF")
    protected ODXLINK diagcommref;

    @Element(name = "EXPECTED-VALUE", required = true)
    protected String expectedvalue;

    @Element(name = "MULTIPLE-ECU-JOB-REF")
    protected ODXLINK multipleecujobref;

    @Element(name = "OUT-PARAM-IF-SNPATHREF")
    protected SNPATHREF outparamifsnpathref;

    @Element(name = "OUT-PARAM-IF-SNREF")
    protected SNREF outparamifsnref;

    public ODXLINK getDIAGCOMMREF() {
        return this.diagcommref;
    }

    public String getEXPECTEDVALUE() {
        return this.expectedvalue;
    }

    public ODXLINK getMULTIPLEECUJOBREF() {
        return this.multipleecujobref;
    }

    public SNPATHREF getOUTPARAMIFSNPATHREF() {
        return this.outparamifsnpathref;
    }

    public SNREF getOUTPARAMIFSNREF() {
        return this.outparamifsnref;
    }

    public void setDIAGCOMMREF(ODXLINK odxlink) {
        this.diagcommref = odxlink;
    }

    public void setEXPECTEDVALUE(String str) {
        this.expectedvalue = str;
    }

    public void setMULTIPLEECUJOBREF(ODXLINK odxlink) {
        this.multipleecujobref = odxlink;
    }

    public void setOUTPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.outparamifsnpathref = snpathref;
    }

    public void setOUTPARAMIFSNREF(SNREF snref) {
        this.outparamifsnref = snref;
    }
}
