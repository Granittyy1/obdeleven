package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "VEHICLE-CONNECTOR-PINS"})
@Root(name = "VEHICLE-CONNECTOR")
public class VEHICLECONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "VEHICLE-CONNECTOR-PINS")
    protected VEHICLECONNECTORPINS vehicleconnectorpins;

    public DESCRIPTION getDESC() {
        return this.desc;
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

    public VEHICLECONNECTORPINS getVEHICLECONNECTORPINS() {
        return this.vehicleconnectorpins;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
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

    public void setVEHICLECONNECTORPINS(VEHICLECONNECTORPINS vehicleconnectorpins) {
        this.vehicleconnectorpins = vehicleconnectorpins;
    }
}
