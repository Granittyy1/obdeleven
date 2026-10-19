package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SOURCE-START-ADDRESS", "COMPRESSED-SIZE", "UNCOMPRESSED-SIZE", "SOURCE-END-ADDRESS", "ENCRYPT-COMPRESS-METHOD"})
@Root(name = "SEGMENT")
public class SEGMENT {

    @Element(name = "COMPRESSED-SIZE")
    protected Long compressedsize;

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

    @Element(name = "SOURCE-END-ADDRESS")
    protected SOURCEENDADDRESS sourceendaddress;

    @Element(name = "SOURCE-START-ADDRESS", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] sourcestartaddress;

    @Element(name = "UNCOMPRESSED-SIZE")
    protected UNCOMPRESSEDSIZE uncompressedsize;

    public Long getCOMPRESSEDSIZE() {
        return this.compressedsize;
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

    public SOURCEENDADDRESS getSOURCEENDADDRESS() {
        return this.sourceendaddress;
    }

    public byte[] getSOURCESTARTADDRESS() {
        return this.sourcestartaddress;
    }

    public UNCOMPRESSEDSIZE getUNCOMPRESSEDSIZE() {
        return this.uncompressedsize;
    }

    public void setCOMPRESSEDSIZE(Long l10) {
        this.compressedsize = l10;
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

    public void setSOURCEENDADDRESS(SOURCEENDADDRESS sourceendaddress) {
        this.sourceendaddress = sourceendaddress;
    }

    public void setSOURCESTARTADDRESS(byte[] bArr) {
        this.sourcestartaddress = bArr;
    }

    public void setUNCOMPRESSEDSIZE(UNCOMPRESSEDSIZE uncompressedsize) {
        this.uncompressedsize = uncompressedsize;
    }
}
