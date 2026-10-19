package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "DOP-BASE-REF"})
@Root(name = "NEG-OUTPUT-PARAM")
public class NEGOUTPUTPARAM {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DOP-BASE-REF", required = true)
    protected ODXLINK dopbaseref;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getDOPBASEREF() {
        return this.dopbaseref;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDOPBASEREF(ODXLINK odxlink) {
        this.dopbaseref = odxlink;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
