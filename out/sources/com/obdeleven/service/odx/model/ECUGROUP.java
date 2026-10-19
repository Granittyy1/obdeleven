package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "GROUP-MEMBERS"})
@Root(name = "ECU-GROUP")
public class ECUGROUP {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "GROUP-MEMBERS", required = true)
    protected GROUPMEMBERS groupmembers;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public GROUPMEMBERS getGROUPMEMBERS() {
        return this.groupmembers;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setGROUPMEMBERS(GROUPMEMBERS groupmembers) {
        this.groupmembers = groupmembers;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
