package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SEMANTIC", "DIAG-COMM-REF", "DIAG-COMM-SNREF"})
@Root(name = "TABLE-DIAG-COMM-CONNECTOR")
public class TABLEDIAGCOMMCONNECTOR {

    @Element(name = "DIAG-COMM-REF")
    protected ODXLINK diagcommref;

    @Element(name = "DIAG-COMM-SNREF")
    protected SNREF diagcommsnref;

    @Element(name = "SEMANTIC", required = true)
    protected String semantic;

    public ODXLINK getDIAGCOMMREF() {
        return this.diagcommref;
    }

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public void setDIAGCOMMREF(ODXLINK odxlink) {
        this.diagcommref = odxlink;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }
}
