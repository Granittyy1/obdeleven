package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import com.obdeleven.service.odx.converter.ShortConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "TROUBLE-CODE", "DISPLAY-TROUBLE-CODE", "TEXT", "LEVEL", "SDGS"})
@Root(name = "DTC")
public class DTC {

    @Element(name = "DISPLAY-TROUBLE-CODE")
    protected String displaytroublecode;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Attribute(name = "IS-TEMPORARY")
    protected Boolean istemporary;

    @Element(name = "LEVEL")
    @Convert(ShortConverter.class)
    protected Short level;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TEXT", required = true)
    protected TEXT text;

    @Element(name = "TROUBLE-CODE")
    protected long troublecode;

    public String getDISPLAYTROUBLECODE() {
        return this.displaytroublecode;
    }

    public String getID() {
        return this.id;
    }

    public Short getLEVEL() {
        return this.level;
    }

    public String getOID() {
        return this.oid;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public TEXT getTEXT() {
        return this.text;
    }

    public long getTROUBLECODE() {
        return this.troublecode;
    }

    public boolean isISTEMPORARY() {
        Boolean bool = this.istemporary;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setDISPLAYTROUBLECODE(String str) {
        this.displaytroublecode = str;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setISTEMPORARY(Boolean bool) {
        this.istemporary = bool;
    }

    public void setLEVEL(Short sh) {
        this.level = sh;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTEXT(TEXT text) {
        this.text = text;
    }

    public void setTROUBLECODE(long j) {
        this.troublecode = j;
    }
}
