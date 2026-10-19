package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"LOWER-LIMIT", "UPPER-LIMIT", "SCALE-CONSTRS"})
@Root(name = "INTERNAL-CONSTR")
public class INTERNALCONSTR {

    @Element(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;

    @Element(name = "SCALE-CONSTRS")
    protected SCALECONSTRS scaleconstrs;

    @Element(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;

    public LIMIT getLOWERLIMIT() {
        return this.lowerlimit;
    }

    public SCALECONSTRS getSCALECONSTRS() {
        return this.scaleconstrs;
    }

    public LIMIT getUPPERLIMIT() {
        return this.upperlimit;
    }

    public void setLOWERLIMIT(LIMIT limit) {
        this.lowerlimit = limit;
    }

    public void setSCALECONSTRS(SCALECONSTRS scaleconstrs) {
        this.scaleconstrs = scaleconstrs;
    }

    public void setUPPERLIMIT(LIMIT limit) {
        this.upperlimit = limit;
    }
}
