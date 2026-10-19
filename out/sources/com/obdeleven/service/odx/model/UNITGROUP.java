package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "CATEGORY", "UNIT-REFS"})
@Root(name = "UNIT-GROUP")
public class UNITGROUP {

    @Element(name = "CATEGORY", required = true)
    @Convert(UNITGROUPCATEGORY.Converter.class)
    protected UNITGROUPCATEGORY category;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "UNIT-REFS")
    protected UNITREFS unitrefs;

    public UNITGROUPCATEGORY getCATEGORY() {
        return this.category;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
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

    public UNITREFS getUNITREFS() {
        return this.unitrefs;
    }

    public void setCATEGORY(UNITGROUPCATEGORY unitgroupcategory) {
        this.category = unitgroupcategory;
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

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setUNITREFS(UNITREFS unitrefs) {
        this.unitrefs = unitrefs;
    }
}
