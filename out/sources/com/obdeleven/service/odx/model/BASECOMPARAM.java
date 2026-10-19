package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAM", "LONG-NAME", "DESC"})
@Root(name = "BASE-COMPARAM")
public class BASECOMPARAM {

    @Attribute(name = "CPTYPE", required = true)
    @Convert(STANDARDISATIONLEVEL.Converter.class)
    protected STANDARDISATIONLEVEL cptype;

    @Attribute(name = "CPUSAGE", required = true)
    @Convert(USAGE.Converter.class)
    protected USAGE cpusage;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "DISPLAY-LEVEL")
    protected Long displaylevel;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Attribute(name = "PARAM-CLASS", required = true)
    protected String paramclass;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public STANDARDISATIONLEVEL getCPTYPE() {
        return this.cptype;
    }

    public USAGE getCPUSAGE() {
        return this.cpusage;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public Long getDISPLAYLEVEL() {
        return this.displaylevel;
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

    public String getPARAMCLASS() {
        return this.paramclass;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setCPTYPE(STANDARDISATIONLEVEL standardisationlevel) {
        this.cptype = standardisationlevel;
    }

    public void setCPUSAGE(USAGE usage) {
        this.cpusage = usage;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDISPLAYLEVEL(Long l10) {
        this.displaylevel = l10;
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

    public void setPARAMCLASS(String str) {
        this.paramclass = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
