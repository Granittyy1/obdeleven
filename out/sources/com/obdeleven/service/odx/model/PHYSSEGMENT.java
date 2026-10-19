package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "FILLBYTE", "BLOCK-SIZE", "START-ADDRESS"})
@Root(name = "PHYS-SEGMENT")
public class PHYSSEGMENT {

    @Element(name = "BLOCK-SIZE")
    protected Long blocksize;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "FILLBYTE", type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] fillbyte;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "START-ADDRESS", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] startaddress;

    public Long getBLOCKSIZE() {
        return this.blocksize;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public byte[] getFILLBYTE() {
        return this.fillbyte;
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

    public byte[] getSTARTADDRESS() {
        return this.startaddress;
    }

    public void setBLOCKSIZE(Long l10) {
        this.blocksize = l10;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setFILLBYTE(byte[] bArr) {
        this.fillbyte = bArr;
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

    public void setSTARTADDRESS(byte[] bArr) {
        this.startaddress = bArr;
    }
}
