package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "PARTNUMBER", "PRIORITY", "SESSION-SNREF", "DIAG-COMM-SNREF", "FLASH-CLASS-REFS", "SDGS", "AUDIENCE", "OWN-IDENT"})
@Root(name = "SESSION-DESC")
public class SESSIONDESC {

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-COMM-SNREF")
    protected SNREF diagcommsnref;

    @Attribute(name = "DIRECTION", required = true)
    @Convert(DIRECTION.Converter.class)
    protected DIRECTION direction;

    @Element(name = "FLASH-CLASS-REFS")
    protected FLASHCLASSREFS flashclassrefs;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "OWN-IDENT")
    protected OWNIDENT ownident;

    @Element(name = "PARTNUMBER")
    protected String partnumber;

    @Element(name = "PRIORITY")
    protected Long priority;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SESSION-SNREF", required = true)
    protected SNREF sessionsnref;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public DIRECTION getDIRECTION() {
        return this.direction;
    }

    public FLASHCLASSREFS getFLASHCLASSREFS() {
        return this.flashclassrefs;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public OWNIDENT getOWNIDENT() {
        return this.ownident;
    }

    public String getPARTNUMBER() {
        return this.partnumber;
    }

    public Long getPRIORITY() {
        return this.priority;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public SNREF getSESSIONSNREF() {
        return this.sessionsnref;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }

    public void setDIRECTION(DIRECTION direction) {
        this.direction = direction;
    }

    public void setFLASHCLASSREFS(FLASHCLASSREFS flashclassrefs) {
        this.flashclassrefs = flashclassrefs;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setOWNIDENT(OWNIDENT ownident) {
        this.ownident = ownident;
    }

    public void setPARTNUMBER(String str) {
        this.partnumber = str;
    }

    public void setPRIORITY(Long l10) {
        this.priority = l10;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSESSIONSNREF(SNREF snref) {
        this.sessionsnref = snref;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
