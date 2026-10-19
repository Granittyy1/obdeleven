package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "CODE-FILE", "ENCRYPTION", "SYNTAX", "REVISION", "ENTRYPOINT"})
@Root(name = "LIBRARY")
public class LIBRARY {

    @Element(name = "CODE-FILE", required = true)
    protected String codefile;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ENCRYPTION")
    protected String encryption;

    @Element(name = "ENTRYPOINT")
    protected String entrypoint;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "REVISION", required = true)
    protected String revision;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SYNTAX", required = true)
    protected String syntax;

    public String getCODEFILE() {
        return this.codefile;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getENCRYPTION() {
        return this.encryption;
    }

    public String getENTRYPOINT() {
        return this.entrypoint;
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

    public String getREVISION() {
        return this.revision;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public String getSYNTAX() {
        return this.syntax;
    }

    public void setCODEFILE(String str) {
        this.codefile = str;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setENCRYPTION(String str) {
        this.encryption = str;
    }

    public void setENTRYPOINT(String str) {
        this.entrypoint = str;
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

    public void setREVISION(String str) {
        this.revision = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSYNTAX(String str) {
        this.syntax = str;
    }
}
