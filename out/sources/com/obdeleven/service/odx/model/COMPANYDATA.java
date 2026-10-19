package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ROLES", "TEAM-MEMBERS", "COMPANY-SPECIFIC-INFO"})
@Root(name = "COMPANY-DATA")
public class COMPANYDATA {

    @Element(name = "COMPANY-SPECIFIC-INFO")
    protected COMPANYSPECIFICINFO companyspecificinfo;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "ROLES")
    protected ROLES roles;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TEAM-MEMBERS")
    protected TEAMMEMBERS teammembers;

    public COMPANYSPECIFICINFO getCOMPANYSPECIFICINFO() {
        return this.companyspecificinfo;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public ROLES getROLES() {
        return this.roles;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public TEAMMEMBERS getTEAMMEMBERS() {
        return this.teammembers;
    }

    public void setCOMPANYSPECIFICINFO(COMPANYSPECIFICINFO companyspecificinfo) {
        this.companyspecificinfo = companyspecificinfo;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setROLES(ROLES roles) {
        this.roles = roles;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTEAMMEMBERS(TEAMMEMBERS teammembers) {
        this.teammembers = teammembers;
    }
}
