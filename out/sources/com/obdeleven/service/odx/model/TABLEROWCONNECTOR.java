package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "TABLE-REF", "TABLE-ROW-SNREF"})
@Root(name = "TABLE-ROW-CONNECTOR")
public class TABLEROWCONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TABLE-REF", required = true)
    protected ODXLINK tableref;

    @Element(name = "TABLE-ROW-SNREF", required = true)
    protected SNREF tablerowsnref;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public ODXLINK getTABLEREF() {
        return this.tableref;
    }

    public SNREF getTABLEROWSNREF() {
        return this.tablerowsnref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTABLEREF(ODXLINK odxlink) {
        this.tableref = odxlink;
    }

    public void setTABLEROWSNREF(SNREF snref) {
        this.tablerowsnref = snref;
    }
}
