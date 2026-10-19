package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-LABEL", "DESC", "LOWER-LIMIT", "UPPER-LIMIT"})
@Root(name = "SCALE-CONSTR")
public class SCALECONSTR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LOWER-LIMIT", required = true)
    protected LIMIT lowerlimit;

    @Element(name = "SHORT-LABEL")
    protected TEXT shortlabel;

    @Element(name = "UPPER-LIMIT", required = true)
    protected LIMIT upperlimit;

    @Attribute(name = "VALIDITY", required = true)
    @Convert(VALIDTYPE.Converter.class)
    protected VALIDTYPE validity;

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

    public VALIDTYPE getVALIDITY() {
        return this.validity;
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

    public void setVALIDITY(VALIDTYPE validtype) {
        this.validity = validtype;
    }
}
