package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "VARIABLE-GROUP-REF", "SW-VARIABLES", "COMM-RELATIONS", "SNREF-TO-TABLEROW", "SDGS"})
@Root(name = "DIAG-VARIABLE")
public class DIAGVARIABLE {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "COMM-RELATIONS")
    protected COMMRELATIONS commrelations;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Attribute(name = "IS-READ-BEFORE-WRITE")
    protected Boolean isreadbeforewrite;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SNREF-TO-TABLEROW")
    protected SNREFTOTABLEROW snreftotablerow;

    @Element(name = "SW-VARIABLES")
    protected SWVARIABLES swvariables;

    @Element(name = "VARIABLE-GROUP-REF")
    protected ODXLINK variablegroupref;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public COMMRELATIONS getCOMMRELATIONS() {
        return this.commrelations;
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

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public SNREFTOTABLEROW getSNREFTOTABLEROW() {
        return this.snreftotablerow;
    }

    public SWVARIABLES getSWVARIABLES() {
        return this.swvariables;
    }

    public ODXLINK getVARIABLEGROUPREF() {
        return this.variablegroupref;
    }

    public boolean isISREADBEFOREWRITE() {
        Boolean bool = this.isreadbeforewrite;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setCOMMRELATIONS(COMMRELATIONS commrelations) {
        this.commrelations = commrelations;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setISREADBEFOREWRITE(Boolean bool) {
        this.isreadbeforewrite = bool;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSNREFTOTABLEROW(SNREFTOTABLEROW snreftotablerow) {
        this.snreftotablerow = snreftotablerow;
    }

    public void setSWVARIABLES(SWVARIABLES swvariables) {
        this.swvariables = swvariables;
    }

    public void setVARIABLEGROUPREF(ODXLINK odxlink) {
        this.variablegroupref = odxlink;
    }
}
