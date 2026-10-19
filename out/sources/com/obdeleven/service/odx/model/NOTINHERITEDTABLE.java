package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-TABLE")
public class NOTINHERITEDTABLE {

    @Element(name = "TABLE-SNREF", required = true)
    protected SNREF tablesnref;

    public SNREF getTABLESNREF() {
        return this.tablesnref;
    }

    public void setTABLESNREF(SNREF snref) {
        this.tablesnref = snref;
    }
}
