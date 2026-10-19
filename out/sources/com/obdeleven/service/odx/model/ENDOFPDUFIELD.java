package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"MAX-NUMBER-OF-ITEMS", "MIN-NUMBER-OF-ITEMS"})
@Root(name = "END-OF-PDU-FIELD")
public class ENDOFPDUFIELD extends FIELD {
    private e.c mDopBaseResult;

    @Element(name = "MAX-NUMBER-OF-ITEMS")
    protected Long maxnumberofitems;

    @Element(name = "MIN-NUMBER-OF-ITEMS")
    protected Long minnumberofitems;

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public Long getMAXNUMBEROFITEMS() {
        return this.maxnumberofitems;
    }

    public Long getMINNUMBEROFITEMS() {
        return this.minnumberofitems;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
    }

    public void setMAXNUMBEROFITEMS(Long l10) {
        this.maxnumberofitems = l10;
    }

    public void setMINNUMBEROFITEMS(Long l10) {
        this.minnumberofitems = l10;
    }
}
