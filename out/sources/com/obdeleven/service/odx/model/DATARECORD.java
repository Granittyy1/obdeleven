package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "RULE", "KEY", "DATA-ID", "SDGS", "DATAFILE", "DATA", "AUDIENCE"})
@Root(name = "DATA-RECORD")
public class DATARECORD {

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DATA")
    protected DATA data;

    @Element(name = "DATAFILE")
    protected DATAFILE datafile;

    @Attribute(name = "DATAFORMAT", required = true)
    @Convert(DATAFORMATSELECTION.Converter.class)
    protected DATAFORMATSELECTION dataformat;

    @Element(name = "DATA-ID")
    protected IDENTVALUE dataid;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "KEY")
    protected String key;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "RULE")
    protected String rule;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public DATA getDATA() {
        return this.data;
    }

    public DATAFILE getDATAFILE() {
        return this.datafile;
    }

    public DATAFORMATSELECTION getDATAFORMAT() {
        return this.dataformat;
    }

    public IDENTVALUE getDATAID() {
        return this.dataid;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getKEY() {
        return this.key;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getRULE() {
        return this.rule;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setDATA(DATA data) {
        this.data = data;
    }

    public void setDATAFILE(DATAFILE datafile) {
        this.datafile = datafile;
    }

    public void setDATAFORMAT(DATAFORMATSELECTION dataformatselection) {
        this.dataformat = dataformatselection;
    }

    public void setDATAID(IDENTVALUE identvalue) {
        this.dataid = identvalue;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setKEY(String str) {
        this.key = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setRULE(String str) {
        this.rule = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
