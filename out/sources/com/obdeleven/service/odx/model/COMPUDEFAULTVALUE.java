package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"V", "VT", "COMPU-INVERSE-VALUE"})
@Root(name = "COMPU-DEFAULT-VALUE")
public class COMPUDEFAULTVALUE {

    @Element(name = "COMPU-INVERSE-VALUE")
    protected COMPUINVERSEVALUE compuinversevalue;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Element(name = "V")
    protected V f29513v;

    @Element(name = "VT")
    protected VT vt;

    public COMPUINVERSEVALUE getCOMPUINVERSEVALUE() {
        return this.compuinversevalue;
    }

    public V getV() {
        return this.f29513v;
    }

    public VT getVT() {
        return this.vt;
    }

    public void setCOMPUINVERSEVALUE(COMPUINVERSEVALUE compuinversevalue) {
        this.compuinversevalue = compuinversevalue;
    }

    public void setV(V v10) {
        this.f29513v = v10;
    }

    public void setVT(VT vt) {
        this.vt = vt;
    }
}
