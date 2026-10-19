package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SIZE-LENGTH", "ADDRESS-LENGTH", "DATAFORMAT", "ENCRYPT-COMPRESS-METHOD"})
@Root(name = "FLASHDATA")
public class FLASHDATA {

    @Element(name = "ADDRESS-LENGTH")
    protected Long addresslength;

    @Element(name = "DATAFORMAT", required = true)
    protected DATAFORMAT dataformat;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ENCRYPT-COMPRESS-METHOD")
    protected ENCRYPTCOMPRESSMETHOD encryptcompressmethod;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SIZE-LENGTH")
    protected Long sizelength;

    public Long getADDRESSLENGTH() {
        return this.addresslength;
    }

    public DATAFORMAT getDATAFORMAT() {
        return this.dataformat;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ENCRYPTCOMPRESSMETHOD getENCRYPTCOMPRESSMETHOD() {
        return this.encryptcompressmethod;
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

    public String getSHORTNAME() {
        return this.shortname;
    }

    public Long getSIZELENGTH() {
        return this.sizelength;
    }

    public void setADDRESSLENGTH(Long l10) {
        this.addresslength = l10;
    }

    public void setDATAFORMAT(DATAFORMAT dataformat) {
        this.dataformat = dataformat;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setENCRYPTCOMPRESSMETHOD(ENCRYPTCOMPRESSMETHOD encryptcompressmethod) {
        this.encryptcompressmethod = encryptcompressmethod;
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

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSIZELENGTH(Long l10) {
        this.sizelength = l10;
    }
}
