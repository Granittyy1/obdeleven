package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"WRITE-DIAG-COMM-REF", "WRITE-DIAG-COMM-SNREF", "WRITE-PARAM-VALUES", "WRITE-DATA-SNREF", "WRITE-DATA-SNPATHREF"})
@Root(name = "WRITE-DIAG-COMM-CONNECTOR")
public class WRITEDIAGCOMMCONNECTOR {

    @Element(name = "WRITE-DATA-SNPATHREF")
    protected SNPATHREF writedatasnpathref;

    @Element(name = "WRITE-DATA-SNREF")
    protected SNREF writedatasnref;

    @Element(name = "WRITE-DIAG-COMM-REF")
    protected ODXLINK writediagcommref;

    @Element(name = "WRITE-DIAG-COMM-SNREF")
    protected SNREF writediagcommsnref;

    @Element(name = "WRITE-PARAM-VALUES")
    protected WRITEPARAMVALUES writeparamvalues;

    public SNPATHREF getWRITEDATASNPATHREF() {
        return this.writedatasnpathref;
    }

    public SNREF getWRITEDATASNREF() {
        return this.writedatasnref;
    }

    public ODXLINK getWRITEDIAGCOMMREF() {
        return this.writediagcommref;
    }

    public SNREF getWRITEDIAGCOMMSNREF() {
        return this.writediagcommsnref;
    }

    public WRITEPARAMVALUES getWRITEPARAMVALUES() {
        return this.writeparamvalues;
    }

    public void setWRITEDATASNPATHREF(SNPATHREF snpathref) {
        this.writedatasnpathref = snpathref;
    }

    public void setWRITEDATASNREF(SNREF snref) {
        this.writedatasnref = snref;
    }

    public void setWRITEDIAGCOMMREF(ODXLINK odxlink) {
        this.writediagcommref = odxlink;
    }

    public void setWRITEDIAGCOMMSNREF(SNREF snref) {
        this.writediagcommsnref = snref;
    }

    public void setWRITEPARAMVALUES(WRITEPARAMVALUES writeparamvalues) {
        this.writeparamvalues = writeparamvalues;
    }
}
