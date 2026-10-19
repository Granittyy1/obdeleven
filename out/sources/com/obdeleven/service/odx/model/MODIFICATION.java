package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CHANGE", "REASON"})
@Root(name = "MODIFICATION")
public class MODIFICATION {

    @Element(name = "CHANGE", required = true)
    protected String change;

    @Element(name = "REASON")
    protected String reason;

    public String getCHANGE() {
        return this.change;
    }

    public String getREASON() {
        return this.reason;
    }

    public void setCHANGE(String str) {
        this.change = str;
    }

    public void setREASON(String str) {
        this.reason = str;
    }
}
