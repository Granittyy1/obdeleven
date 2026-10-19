package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "DTC-DOP-REF", "DTC-SNREF"})
@Root(name = "DTC-CONNECTOR")
public class DTCCONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DTC-DOP-REF", required = true)
    protected ODXLINK dtcdopref;

    @Element(name = "DTC-SNREF", required = true)
    protected SNREF dtcsnref;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getDTCDOPREF() {
        return this.dtcdopref;
    }

    public SNREF getDTCSNREF() {
        return this.dtcsnref;
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

    public void setDTCDOPREF(ODXLINK odxlink) {
        this.dtcdopref = odxlink;
    }

    public void setDTCSNREF(SNREF snref) {
        this.dtcsnref = snref;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
