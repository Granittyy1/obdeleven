package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CODE-FILE", "ENCRYPTION", "SYNTAX", "REVISION", "ENTRYPOINT", "LIBRARY-REFS"})
@Root(name = "PROG-CODE")
public class PROGCODE {

    @Element(name = "CODE-FILE", required = true)
    protected String codefile;

    @Element(name = "ENCRYPTION")
    protected String encryption;

    @Element(name = "ENTRYPOINT")
    protected String entrypoint;

    @Element(name = "LIBRARY-REFS")
    protected LIBRARYREFS libraryrefs;

    @Element(name = "REVISION", required = true)
    protected String revision;

    @Element(name = "SYNTAX", required = true)
    protected String syntax;

    public String getCODEFILE() {
        return this.codefile;
    }

    public String getENCRYPTION() {
        return this.encryption;
    }

    public String getENTRYPOINT() {
        return this.entrypoint;
    }

    public LIBRARYREFS getLIBRARYREFS() {
        return this.libraryrefs;
    }

    public String getREVISION() {
        return this.revision;
    }

    public String getSYNTAX() {
        return this.syntax;
    }

    public void setCODEFILE(String str) {
        this.codefile = str;
    }

    public void setENCRYPTION(String str) {
        this.encryption = str;
    }

    public void setENTRYPOINT(String str) {
        this.entrypoint = str;
    }

    public void setLIBRARYREFS(LIBRARYREFS libraryrefs) {
        this.libraryrefs = libraryrefs;
    }

    public void setREVISION(String str) {
        this.revision = str;
    }

    public void setSYNTAX(String str) {
        this.syntax = str;
    }
}
