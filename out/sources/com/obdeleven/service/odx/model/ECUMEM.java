package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "MEM", "PHYS-MEM", "SDGS"})
@Root(name = "ECU-MEM")
public class ECUMEM {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "MEM", required = true)
    protected MEM mem;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYS-MEM")
    protected PHYSMEM physmem;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
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

    public MEM getMEM() {
        return this.mem;
    }

    public String getOID() {
        return this.oid;
    }

    public PHYSMEM getPHYSMEM() {
        return this.physmem;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
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

    public void setMEM(MEM mem) {
        this.mem = mem;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPHYSMEM(PHYSMEM physmem) {
        this.physmem = physmem;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
