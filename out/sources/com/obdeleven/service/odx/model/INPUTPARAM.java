package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "PHYSICAL-DEFAULT-VALUE", "DOP-BASE-REF"})
@Root(name = "INPUT-PARAM")
public class INPUTPARAM {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DOP-BASE-REF", required = true)
    protected ODXLINK dopbaseref;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getDOPBASEREF() {
        return this.dopbaseref;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getPHYSICALDEFAULTVALUE() {
        return this.physicaldefaultvalue;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDOPBASEREF(ODXLINK odxlink) {
        this.dopbaseref = odxlink;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPHYSICALDEFAULTVALUE(String str) {
        this.physicaldefaultvalue = str;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
