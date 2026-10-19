package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-COMM-SNREF", "IDENT-IF-SNREF", "OUT-PARAM-IF-SNREF", "OUT-PARAM-IF-SNPATHREF"})
@Root(name = "IDENT-DESC")
public class IDENTDESC {

    @Element(name = "DIAG-COMM-SNREF", required = true)
    protected SNREF diagcommsnref;

    @Element(name = "IDENT-IF-SNREF", required = true)
    protected SNREF identifsnref;

    @Element(name = "OUT-PARAM-IF-SNPATHREF")
    protected SNPATHREF outparamifsnpathref;

    @Element(name = "OUT-PARAM-IF-SNREF")
    protected SNREF outparamifsnref;

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public SNREF getIDENTIFSNREF() {
        return this.identifsnref;
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

    public void setIDENTIFSNREF(SNREF snref) {
        this.identifsnref = snref;
    }

    public void setOUTPARAMIFSNPATHREF(SNPATHREF snpathref) {
        this.outparamifsnpathref = snpathref;
    }

    public void setOUTPARAMIFSNREF(SNREF snref) {
        this.outparamifsnref = snref;
    }
}
