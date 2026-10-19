package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"OFFSET", "DETERMINE-NUMBER-OF-ITEMS"})
@Root(name = "DYNAMIC-LENGTH-FIELD")
public class DYNAMICLENGTHFIELD extends FIELD {

    @Element(name = "DETERMINE-NUMBER-OF-ITEMS", required = true)
    protected DETERMINENUMBEROFITEMS determinenumberofitems;
    private e.c mDopBaseResult;

    @Element(name = "OFFSET")
    protected long offset;

    public DETERMINENUMBEROFITEMS getDETERMINENUMBEROFITEMS() {
        return this.determinenumberofitems;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public long getOFFSET() {
        return this.offset;
    }

    public void setDETERMINENUMBEROFITEMS(DETERMINENUMBEROFITEMS determinenumberofitems) {
        this.determinenumberofitems = determinenumberofitems;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
    }

    public void setOFFSET(long j) {
        this.offset = j;
    }
}
