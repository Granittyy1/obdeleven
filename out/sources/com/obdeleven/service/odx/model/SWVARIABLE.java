package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ORIGIN"})
@Root(name = "SW-VARIABLE")
public class SWVARIABLE {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "ORIGIN")
    protected String origin;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getORIGIN() {
        return this.origin;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setORIGIN(String str) {
        this.origin = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
