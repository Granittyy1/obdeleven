package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"FIXED-NUMBER-OF-ITEMS", "ITEM-BYTE-SIZE"})
@Root(name = "STATIC-FIELD")
public class STATICFIELD extends FIELD {

    @Element(name = "FIXED-NUMBER-OF-ITEMS")
    protected long fixednumberofitems;

    @Element(name = "ITEM-BYTE-SIZE")
    protected long itembytesize;

    public long getFIXEDNUMBEROFITEMS() {
        return this.fixednumberofitems;
    }

    public long getITEMBYTESIZE() {
        return this.itembytesize;
    }

    public void setFIXEDNUMBEROFITEMS(long j) {
        this.fixednumberofitems = j;
    }

    public void setITEMBYTESIZE(long j) {
        this.itembytesize = j;
    }
}
