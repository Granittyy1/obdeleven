package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "CONFIG-ID-ITEM", "DIAG-COMM-DATA-CONNECTORS", "CONFIG-ID", "DATA-RECORDS", "AUDIENCE", "SYSTEM-ITEMS", "DATA-ID-ITEM", "OPTION-ITEMS", "DEFAULT-DATA-RECORD-SNREF", "SDGS"})
@Root(name = "CONFIG-RECORD")
public class CONFIGRECORD {

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "CONFIG-ID")
    protected IDENTVALUE configid;

    @Element(name = "CONFIG-ID-ITEM")
    protected CONFIGIDITEM configiditem;

    @Element(name = "DATA-ID-ITEM")
    protected DATAIDITEM dataiditem;

    @Element(name = "DATA-RECORDS")
    protected DATARECORDS datarecords;

    @Element(name = "DEFAULT-DATA-RECORD-SNREF")
    protected SNREF defaultdatarecordsnref;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-COMM-DATA-CONNECTORS", required = true)
    protected DIAGCOMMDATACONNECTORS diagcommdataconnectors;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "OPTION-ITEMS")
    protected OPTIONITEMS optionitems;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SYSTEM-ITEMS")
    protected SYSTEMITEMS systemitems;

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public IDENTVALUE getCONFIGID() {
        return this.configid;
    }

    public CONFIGIDITEM getCONFIGIDITEM() {
        return this.configiditem;
    }

    public DATAIDITEM getDATAIDITEM() {
        return this.dataiditem;
    }

    public DATARECORDS getDATARECORDS() {
        return this.datarecords;
    }

    public SNREF getDEFAULTDATARECORDSNREF() {
        return this.defaultdatarecordsnref;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DIAGCOMMDATACONNECTORS getDIAGCOMMDATACONNECTORS() {
        return this.diagcommdataconnectors;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public OPTIONITEMS getOPTIONITEMS() {
        return this.optionitems;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public SYSTEMITEMS getSYSTEMITEMS() {
        return this.systemitems;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setCONFIGID(IDENTVALUE identvalue) {
        this.configid = identvalue;
    }

    public void setCONFIGIDITEM(CONFIGIDITEM configiditem) {
        this.configiditem = configiditem;
    }

    public void setDATAIDITEM(DATAIDITEM dataiditem) {
        this.dataiditem = dataiditem;
    }

    public void setDATARECORDS(DATARECORDS datarecords) {
        this.datarecords = datarecords;
    }

    public void setDEFAULTDATARECORDSNREF(SNREF snref) {
        this.defaultdatarecordsnref = snref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCOMMDATACONNECTORS(DIAGCOMMDATACONNECTORS diagcommdataconnectors) {
        this.diagcommdataconnectors = diagcommdataconnectors;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOPTIONITEMS(OPTIONITEMS optionitems) {
        this.optionitems = optionitems;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSYSTEMITEMS(SYSTEMITEMS systemitems) {
        this.systemitems = systemitems;
    }
}
