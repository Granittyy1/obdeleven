package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "BYTE-POSITION", "BIT-POSITION", "DATA-OBJECT-PROP-REF", "DATA-OBJECT-PROP-SNREF", "SDGS"})
@Root(name = "CONFIG-ITEM")
public class CONFIGITEM {

    @Element(name = "BIT-POSITION")
    protected Long bitposition;

    @Element(name = "BYTE-POSITION")
    protected long byteposition;

    @Element(name = "DATA-OBJECT-PROP-REF")
    protected ODXLINK dataobjectpropref;

    @Element(name = "DATA-OBJECT-PROP-SNREF")
    protected SNREF dataobjectpropsnref;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public Long getBITPOSITION() {
        return this.bitposition;
    }

    public long getBYTEPOSITION() {
        return this.byteposition;
    }

    public ODXLINK getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public SNREF getDATAOBJECTPROPSNREF() {
        return this.dataobjectpropsnref;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
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

    public void setBITPOSITION(Long l10) {
        this.bitposition = l10;
    }

    public void setBYTEPOSITION(long j) {
        this.byteposition = j;
    }

    public void setDATAOBJECTPROPREF(ODXLINK odxlink) {
        this.dataobjectpropref = odxlink;
    }

    public void setDATAOBJECTPROPSNREF(SNREF snref) {
        this.dataobjectpropsnref = snref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
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
}
