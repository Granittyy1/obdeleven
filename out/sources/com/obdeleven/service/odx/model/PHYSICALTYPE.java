package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PHYSICAL-TYPE")
public class PHYSICALTYPE {

    @Attribute(name = "BASE-DATA-TYPE", required = true)
    @Convert(PHYSICALDATATYPE.Converter.class)
    protected PHYSICALDATATYPE basedatatype;

    @Attribute(name = "DISPLAY-RADIX")
    protected RADIX displayradix;

    @Element(name = "PRECISION")
    protected long precision;

    public PHYSICALDATATYPE getBASEDATATYPE() {
        return this.basedatatype;
    }

    public RADIX getDISPLAYRADIX() {
        return this.displayradix;
    }

    public long getPRECISION() {
        return this.precision;
    }

    public void setBASEDATATYPE(PHYSICALDATATYPE physicaldatatype) {
        this.basedatatype = physicaldatatype;
    }

    public void setDISPLAYRADIX(RADIX radix) {
        this.displayradix = radix;
    }

    public void setPRECISION(long j) {
        this.precision = j;
    }
}
