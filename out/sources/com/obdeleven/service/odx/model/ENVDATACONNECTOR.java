package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ENV-DATA-DESC-REF", "ENV-DATA-SNREF"})
@Root(name = "ENV-DATA-CONNECTOR")
public class ENVDATACONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ENV-DATA-DESC-REF", required = true)
    protected ODXLINK envdatadescref;

    @Element(name = "ENV-DATA-SNREF", required = true)
    protected SNREF envdatasnref;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getENVDATADESCREF() {
        return this.envdatadescref;
    }

    public SNREF getENVDATASNREF() {
        return this.envdatasnref;
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

    public void setENVDATADESCREF(ODXLINK odxlink) {
        this.envdatadescref = odxlink;
    }

    public void setENVDATASNREF(SNREF snref) {
        this.envdatasnref = snref;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
