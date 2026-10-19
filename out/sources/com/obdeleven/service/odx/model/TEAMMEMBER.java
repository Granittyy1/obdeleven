package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ROLES", "DEPARTMENT", "DEPARTMENT", "ZIP", "CITY", "PHONE", "FAX", "EMAIL"})
@Root(name = "TEAM-MEMBER")
public class TEAMMEMBER {

    @Element(name = "ADDRESS")
    protected String address;

    @Element(name = "CITY")
    protected String city;

    @Element(name = "DEPARTMENT")
    protected String department;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "EMAIL")
    protected String email;

    @Element(name = "FAX")
    protected String fax;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHONE")
    protected String phone;

    @Element(name = "ROLES")
    protected ROLES roles;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "ZIP")
    protected String zip;

    public String getADDRESS() {
        return this.address;
    }

    public String getCITY() {
        return this.city;
    }

    public String getDEPARTMENT() {
        return this.department;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getEMAIL() {
        return this.email;
    }

    public String getFAX() {
        return this.fax;
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

    public String getPHONE() {
        return this.phone;
    }

    public ROLES getROLES() {
        return this.roles;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public String getZIP() {
        return this.zip;
    }

    public void setADDRESS(String str) {
        this.address = str;
    }

    public void setCITY(String str) {
        this.city = str;
    }

    public void setDEPARTMENT(String str) {
        this.department = str;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setEMAIL(String str) {
        this.email = str;
    }

    public void setFAX(String str) {
        this.fax = str;
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

    public void setPHONE(String str) {
        this.phone = str;
    }

    public void setROLES(ROLES roles) {
        this.roles = roles;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setZIP(String str) {
        this.zip = str;
    }
}
