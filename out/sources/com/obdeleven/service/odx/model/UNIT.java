package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "DISPLAY-NAME", "FACTOR-SI-TO-UNIT", "OFFSET-SI-TO-UNIT", "PHYSICAL-DIMENSION-REF"})
@Root(name = "UNIT")
public class UNIT {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DISPLAY-NAME", required = true)
    protected String displayname;

    @Element(name = "FACTOR-SI-TO-UNIT")
    protected Double factorsitounit;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "OFFSET-SI-TO-UNIT")
    protected Double offsetsitounit;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYSICAL-DIMENSION-REF")
    protected ODXLINK physicaldimensionref;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getDISPLAYNAME() {
        return this.displayname;
    }

    public Double getFACTORSITOUNIT() {
        return this.factorsitounit;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public Double getOFFSETSITOUNIT() {
        return this.offsetsitounit;
    }

    public String getOID() {
        return this.oid;
    }

    public ODXLINK getPHYSICALDIMENSIONREF() {
        return this.physicaldimensionref;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDISPLAYNAME(String str) {
        this.displayname = str;
    }

    public void setFACTORSITOUNIT(Double d10) {
        this.factorsitounit = d10;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOFFSETSITOUNIT(Double d10) {
        this.offsetsitounit = d10;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPHYSICALDIMENSIONREF(ODXLINK odxlink) {
        this.physicaldimensionref = odxlink;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
