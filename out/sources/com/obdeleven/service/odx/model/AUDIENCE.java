package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ENABLED-AUDIENCE-REFS", "DISABLED-AUDIENCE-REFS"})
@Root(name = "AUDIENCE")
public class AUDIENCE {

    @Element(name = "DISABLED-AUDIENCE-REFS")
    protected DISABLEDAUDIENCEREFS disabledaudiencerefs;

    @Element(name = "ENABLED-AUDIENCE-REFS")
    protected ENABLEDAUDIENCEREFS enabledaudiencerefs;

    @Attribute(name = "IS-AFTERMARKET")
    protected Boolean isaftermarket;

    @Attribute(name = "IS-AFTERSALES")
    protected Boolean isaftersales;

    @Attribute(name = "IS-DEVELOPMENT")
    protected Boolean isdevelopment;

    @Attribute(name = "IS-MANUFACTURING")
    protected Boolean ismanufacturing;

    @Attribute(name = "IS-SUPPLIER")
    protected Boolean issupplier;

    public DISABLEDAUDIENCEREFS getDISABLEDAUDIENCEREFS() {
        return this.disabledaudiencerefs;
    }

    public ENABLEDAUDIENCEREFS getENABLEDAUDIENCEREFS() {
        return this.enabledaudiencerefs;
    }

    public boolean isISAFTERMARKET() {
        Boolean bool = this.isaftermarket;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isISAFTERSALES() {
        Boolean bool = this.isaftersales;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isISDEVELOPMENT() {
        Boolean bool = this.isdevelopment;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isISMANUFACTURING() {
        Boolean bool = this.ismanufacturing;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isISSUPPLIER() {
        Boolean bool = this.issupplier;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setDISABLEDAUDIENCEREFS(DISABLEDAUDIENCEREFS disabledaudiencerefs) {
        this.disabledaudiencerefs = disabledaudiencerefs;
    }

    public void setENABLEDAUDIENCEREFS(ENABLEDAUDIENCEREFS enabledaudiencerefs) {
        this.enabledaudiencerefs = enabledaudiencerefs;
    }

    public void setISAFTERMARKET(Boolean bool) {
        this.isaftermarket = bool;
    }

    public void setISAFTERSALES(Boolean bool) {
        this.isaftersales = bool;
    }

    public void setISDEVELOPMENT(Boolean bool) {
        this.isdevelopment = bool;
    }

    public void setISMANUFACTURING(Boolean bool) {
        this.ismanufacturing = bool;
    }

    public void setISSUPPLIER(Boolean bool) {
        this.issupplier = bool;
    }
}
