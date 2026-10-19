package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"TABLE-SNREF", "TABLE-ROW-SNREF"})
@Root(name = "SNREF-TO-TABLEROW")
public class SNREFTOTABLEROW {

    @Element(name = "TABLE-ROW-SNREF", required = true)
    protected SNREF tablerowsnref;

    @Element(name = "TABLE-SNREF", required = true)
    protected SNREF tablesnref;

    public SNREF getTABLEROWSNREF() {
        return this.tablerowsnref;
    }

    public SNREF getTABLESNREF() {
        return this.tablesnref;
    }

    public void setTABLEROWSNREF(SNREF snref) {
        this.tablerowsnref = snref;
    }

    public void setTABLESNREF(SNREF snref) {
        this.tablesnref = snref;
    }
}
