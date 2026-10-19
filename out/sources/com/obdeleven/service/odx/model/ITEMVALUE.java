package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYS-CONSTANT-VALUE", "MEANING", "KEY", "RULE", "DESCRIPTION", "SDGS", "AUDIENCE"})
@Root(name = "ITEM-VALUE")
public class ITEMVALUE {

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DESCRIPTION")
    protected TEXT description;

    @Element(name = "KEY")
    protected String key;

    @Element(name = "MEANING")
    protected TEXT meaning;

    @Element(name = "PHYS-CONSTANT-VALUE", required = true)
    protected String physconstantvalue;

    @Element(name = "RULE")
    protected String rule;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public TEXT getDESCRIPTION() {
        return this.description;
    }

    public String getKEY() {
        return this.key;
    }

    public TEXT getMEANING() {
        return this.meaning;
    }

    public String getPHYSCONSTANTVALUE() {
        return this.physconstantvalue;
    }

    public String getRULE() {
        return this.rule;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setDESCRIPTION(TEXT text) {
        this.description = text;
    }

    public void setKEY(String str) {
        this.key = str;
    }

    public void setMEANING(TEXT text) {
        this.meaning = text;
    }

    public void setPHYSCONSTANTVALUE(String str) {
        this.physconstantvalue = str;
    }

    public void setRULE(String str) {
        this.rule = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }
}
