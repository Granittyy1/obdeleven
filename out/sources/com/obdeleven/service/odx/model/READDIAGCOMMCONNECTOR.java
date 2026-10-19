package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"READ-PARAM-VALUES", "READ-DIAG-COMM-REF", "READ-DIAG-COMM-SNREF", "READ-DATA-SNREF", "READ-DATA-SNPATHREF"})
@Root(name = "READ-DIAG-COMM-CONNECTOR")
public class READDIAGCOMMCONNECTOR {

    @Element(name = "READ-DATA-SNPATHREF")
    protected SNPATHREF readdatasnpathref;

    @Element(name = "READ-DATA-SNREF")
    protected SNREF readdatasnref;

    @Element(name = "READ-DIAG-COMM-REF")
    protected ODXLINK readdiagcommref;

    @Element(name = "READ-DIAG-COMM-SNREF")
    protected SNREF readdiagcommsnref;

    @Element(name = "READ-PARAM-VALUES")
    protected READPARAMVALUES readparamvalues;

    public SNPATHREF getREADDATASNPATHREF() {
        return this.readdatasnpathref;
    }

    public SNREF getREADDATASNREF() {
        return this.readdatasnref;
    }

    public ODXLINK getREADDIAGCOMMREF() {
        return this.readdiagcommref;
    }

    public SNREF getREADDIAGCOMMSNREF() {
        return this.readdiagcommsnref;
    }

    public READPARAMVALUES getREADPARAMVALUES() {
        return this.readparamvalues;
    }

    public void setREADDATASNPATHREF(SNPATHREF snpathref) {
        this.readdatasnpathref = snpathref;
    }

    public void setREADDATASNREF(SNREF snref) {
        this.readdatasnref = snref;
    }

    public void setREADDIAGCOMMREF(ODXLINK odxlink) {
        this.readdiagcommref = odxlink;
    }

    public void setREADDIAGCOMMSNREF(SNREF snref) {
        this.readdiagcommsnref = snref;
    }

    public void setREADPARAMVALUES(READPARAMVALUES readparamvalues) {
        this.readparamvalues = readparamvalues;
    }
}
