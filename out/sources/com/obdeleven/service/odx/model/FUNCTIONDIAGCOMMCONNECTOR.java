package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"LOGICAL-LINK-REF", "DIAG-COMM-REF"})
@Root(name = "FUNCTION-DIAG-COMM-CONNECTOR")
public class FUNCTIONDIAGCOMMCONNECTOR {

    @Element(name = "DIAG-COMM-REF", required = true)
    protected ODXLINK diagcommref;

    @Element(name = "LOGICAL-LINK-REF")
    protected ODXLINK logicallinkref;

    public ODXLINK getDIAGCOMMREF() {
        return this.diagcommref;
    }

    public ODXLINK getLOGICALLINKREF() {
        return this.logicallinkref;
    }

    public void setDIAGCOMMREF(ODXLINK odxlink) {
        this.diagcommref = odxlink;
    }

    public void setLOGICALLINKREF(ODXLINK odxlink) {
        this.logicallinkref = odxlink;
    }
}
