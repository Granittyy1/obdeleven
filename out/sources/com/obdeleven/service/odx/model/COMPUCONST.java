package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"V", "VT"})
@Root(name = "COMPU-CONST")
public class COMPUCONST {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Element(name = "V")
    protected V f29512v;

    @Element(name = "VT")
    protected VT vt;

    public V getV() {
        return this.f29512v;
    }

    public VT getVT() {
        return this.vt;
    }

    public void setV(V v10) {
        this.f29512v = v10;
    }

    public void setVT(VT vt) {
        this.vt = vt;
    }
}
