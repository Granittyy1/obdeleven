package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "LOGICAL-BLOCK-INDEX", "FLASHDATA-REF", "FILTERS", "SEGMENTS", "TARGET-ADDR-OFFSET", "OWN-IDENTS", "SECURITYS", "SDGS", "AUDIENCE"})
@Root(name = "DATABLOCK")
public class DATABLOCK {

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "FILTERS")
    protected FILTERS filters;

    @Element(name = "FLASHDATA-REF")
    protected ODXLINK flashdataref;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LOGICAL-BLOCK-INDEX", type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] logicalblockindex;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "OWN-IDENTS")
    protected OWNIDENTS ownidents;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SECURITYS")
    protected SECURITYS securitys;

    @Element(name = "SEGMENTS")
    protected SEGMENTS segments;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TARGET-ADDR-OFFSET")
    protected TARGETADDROFFSET targetaddroffset;

    @Attribute(name = "TYPE", required = true)
    protected String type;

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public FILTERS getFILTERS() {
        return this.filters;
    }

    public ODXLINK getFLASHDATAREF() {
        return this.flashdataref;
    }

    public String getID() {
        return this.id;
    }

    public byte[] getLOGICALBLOCKINDEX() {
        return this.logicalblockindex;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public OWNIDENTS getOWNIDENTS() {
        return this.ownidents;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public SECURITYS getSECURITYS() {
        return this.securitys;
    }

    public SEGMENTS getSEGMENTS() {
        return this.segments;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public TARGETADDROFFSET getTARGETADDROFFSET() {
        return this.targetaddroffset;
    }

    public String getTYPE() {
        return this.type;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setFILTERS(FILTERS filters) {
        this.filters = filters;
    }

    public void setFLASHDATAREF(ODXLINK odxlink) {
        this.flashdataref = odxlink;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLOGICALBLOCKINDEX(byte[] bArr) {
        this.logicalblockindex = bArr;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setOWNIDENTS(OWNIDENTS ownidents) {
        this.ownidents = ownidents;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSECURITYS(SECURITYS securitys) {
        this.securitys = securitys;
    }

    public void setSEGMENTS(SEGMENTS segments) {
        this.segments = segments;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTARGETADDROFFSET(TARGETADDROFFSET targetaddroffset) {
        this.targetaddroffset = targetaddroffset;
    }

    public void setTYPE(String str) {
        this.type = str;
    }
}
