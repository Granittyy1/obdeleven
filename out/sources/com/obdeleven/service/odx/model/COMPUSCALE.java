package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-LABEL", "DESC", "LOWER-LIMIT", "UPPER-LIMIT", "COMPU-INVERSE-VALUE", "COMPU-CONST", "COMPU-RATIONAL-COEFFS"})
@Root(name = "COMPU-SCALE")
public class COMPUSCALE {

    @Element(name = "COMPU-CONST")
    protected COMPUCONST compuconst;

    @Element(name = "COMPU-INVERSE-VALUE")
    protected COMPUINVERSEVALUE compuinversevalue;

    @Element(name = "COMPU-RATIONAL-COEFFS")
    protected COMPURATIONALCOEFFS compurationalcoeffs;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LOWER-LIMIT")
    protected LIMIT lowerlimit;

    @Element(name = "SHORT-LABEL")
    protected TEXT shortlabel;

    @Element(name = "UPPER-LIMIT")
    protected LIMIT upperlimit;

    public COMPUCONST getCOMPUCONST() {
        return this.compuconst;
    }

    public COMPUINVERSEVALUE getCOMPUINVERSEVALUE() {
        return this.compuinversevalue;
    }

    public COMPURATIONALCOEFFS getCOMPURATIONALCOEFFS() {
        return this.compurationalcoeffs;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LIMIT getLOWERLIMIT() {
        return this.lowerlimit;
    }

    public TEXT getSHORTLABEL() {
        return this.shortlabel;
    }

    public LIMIT getUPPERLIMIT() {
        return this.upperlimit;
    }

    public void setCOMPUCONST(COMPUCONST compuconst) {
        this.compuconst = compuconst;
    }

    public void setCOMPUINVERSEVALUE(COMPUINVERSEVALUE compuinversevalue) {
        this.compuinversevalue = compuinversevalue;
    }

    public void setCOMPURATIONALCOEFFS(COMPURATIONALCOEFFS compurationalcoeffs) {
        this.compurationalcoeffs = compurationalcoeffs;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLOWERLIMIT(LIMIT limit) {
        this.lowerlimit = limit;
    }

    public void setSHORTLABEL(TEXT text) {
        this.shortlabel = text;
    }

    public void setUPPERLIMIT(LIMIT limit) {
        this.upperlimit = limit;
    }
}
