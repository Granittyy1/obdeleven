package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "VEHICLE-CONNECTOR-PIN-REFS", "LINK-COMPARAM-REFS"})
@Root(name = "PHYSICAL-VEHICLE-LINK")
public class PHYSICALVEHICLELINK {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LINK-COMPARAM-REFS")
    protected LINKCOMPARAMREFS linkcomparamrefs;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Attribute(name = "TYPE", required = true)
    protected String type;

    @Element(name = "VEHICLE-CONNECTOR-PIN-REFS", required = true)
    protected VEHICLECONNECTORPINREFS vehicleconnectorpinrefs;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public LINKCOMPARAMREFS getLINKCOMPARAMREFS() {
        return this.linkcomparamrefs;
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

    public String getTYPE() {
        return this.type;
    }

    public VEHICLECONNECTORPINREFS getVEHICLECONNECTORPINREFS() {
        return this.vehicleconnectorpinrefs;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLINKCOMPARAMREFS(LINKCOMPARAMREFS linkcomparamrefs) {
        this.linkcomparamrefs = linkcomparamrefs;
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

    public void setTYPE(String str) {
        this.type = str;
    }

    public void setVEHICLECONNECTORPINREFS(VEHICLECONNECTORPINREFS vehicleconnectorpinrefs) {
        this.vehicleconnectorpinrefs = vehicleconnectorpinrefs;
    }
}
