package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SDGS"})
@Root(name = "PARAM", strict = false)
public class PARAM {

    @Element(name = "BIT-LENGTH")
    protected long bitlength;

    @Element(name = "CODED-VALUE")
    protected String codedvalue;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-CODED-TYPE")
    protected DIAGCODEDTYPE diagcodedtype;

    @Element(name = "DOP-REF")
    protected ODXLINK dopref;

    @Element(name = "DOP-SNREF")
    protected SNREF dopsnref;

    @Attribute(name = "ID")
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;
    private e.c mDopBaseResult;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYS-CONSTANT-VALUE")
    protected String physconstantvalue;

    @Element(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TABLE-REF", required = false, type = ODXLINK.class)
    protected ODXLINK tableref;

    @Element(name = "TABLE-ROW-REF", required = false, type = ODXLINK.class)
    protected ODXLINK tablerowref;

    @Element(name = "TABLE-ROW-SNREF", required = false, type = SNREF.class)
    protected SNREF tablerowsnref;

    @Element(name = "TABLE-SNREF", required = false, type = SNREF.class)
    protected SNREF tablesnref;

    @Attribute(name = "type")
    protected String type;

    @Element(name = "BYTE-POSITION")
    protected int byteposition = 0;

    @Element(name = "BIT-POSITION")
    protected int bitposition = 0;

    public long getBITLENGTH() {
        return this.bitlength;
    }

    public int getBITPOSITION() {
        return this.bitposition;
    }

    public int getBYTEPOSITION() {
        return this.byteposition;
    }

    public String getCODEDVALUE() {
        return this.codedvalue;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return this.diagcodedtype;
    }

    public ODXLINK getDOPREF() {
        return this.dopref;
    }

    public SNREF getDOPSNREF() {
        return this.dopsnref;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
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

    public String getPHYSCONSTANTVALUE() {
        return this.physconstantvalue;
    }

    public String getPHYSICALDEFAULTVALUE() {
        return this.physicaldefaultvalue;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public ODXLINK getTableref() {
        return this.tableref;
    }

    public ODXLINK getTablerowref() {
        return this.tablerowref;
    }

    public SNREF getTablerowsnref() {
        return this.tablerowsnref;
    }

    public SNREF getTablesnref() {
        return this.tablesnref;
    }

    public String getType() {
        return this.type;
    }

    public void setBITLENGTH(long j) {
        this.bitlength = j;
    }

    public void setBITPOSITION(int i10) {
        this.bitposition = i10;
    }

    public void setBYTEPOSITION(int i10) {
        this.byteposition = i10;
    }

    public void setCODEDVALUE(String str) {
        this.codedvalue = str;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCODEDTYPE(DIAGCODEDTYPE diagcodedtype) {
        this.diagcodedtype = diagcodedtype;
    }

    public void setDOPREF(ODXLINK odxlink) {
        this.dopref = odxlink;
    }

    public void setDOPSNREF(SNREF snref) {
        this.dopsnref = snref;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
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

    public void setPHYSCONSTANTVALUE(String str) {
        this.physconstantvalue = str;
    }

    public void setPHYSICALDEFAULTVALUE(String str) {
        this.physicaldefaultvalue = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTableref(ODXLINK odxlink) {
        this.tableref = odxlink;
    }

    public void setTablerowref(ODXLINK odxlink) {
        this.tablerowref = odxlink;
    }

    public void setTablerowsnref(SNREF snref) {
        this.tablerowsnref = snref;
    }

    public void setTablesnref(SNREF snref) {
        this.tablesnref = snref;
    }
}
