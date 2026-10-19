package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-DIAG-COMM")
public class NOTINHERITEDDIAGCOMM {

    @Element(name = "DIAG-COMM-SNREF", required = true)
    protected SNREF diagcommsnref;

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }
}
