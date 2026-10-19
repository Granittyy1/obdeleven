package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "INFO-COMPONENT-REFS", "VEHICLE-CONNECTORS", "LOGICAL-LINKS", "ECU-GROUPS", "PHYSICAL-VEHICLE-LINKS"})
@Root(name = "VEHICLE-INFORMATION")
public class VEHICLEINFORMATION {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ECU-GROUPS")
    protected ECUGROUPS ecugroups;

    @Element(name = "INFO-COMPONENT-REFS")
    protected INFOCOMPONENTREFS infocomponentrefs;

    @Element(name = "LOGICAL-LINKS")
    protected LOGICALLINKS logicallinks;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYSICAL-VEHICLE-LINKS")
    protected PHYSICALVEHICLELINKS physicalvehiclelinks;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "VEHICLE-CONNECTORS")
    protected VEHICLECONNECTORS vehicleconnectors;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ECUGROUPS getECUGROUPS() {
        return this.ecugroups;
    }

    public INFOCOMPONENTREFS getINFOCOMPONENTREFS() {
        return this.infocomponentrefs;
    }

    public LOGICALLINKS getLOGICALLINKS() {
        return this.logicallinks;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public PHYSICALVEHICLELINKS getPHYSICALVEHICLELINKS() {
        return this.physicalvehiclelinks;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public VEHICLECONNECTORS getVEHICLECONNECTORS() {
        return this.vehicleconnectors;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setECUGROUPS(ECUGROUPS ecugroups) {
        this.ecugroups = ecugroups;
    }

    public void setINFOCOMPONENTREFS(INFOCOMPONENTREFS infocomponentrefs) {
        this.infocomponentrefs = infocomponentrefs;
    }

    public void setLOGICALLINKS(LOGICALLINKS logicallinks) {
        this.logicallinks = logicallinks;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPHYSICALVEHICLELINKS(PHYSICALVEHICLELINKS physicalvehiclelinks) {
        this.physicalvehiclelinks = physicalvehiclelinks;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setVEHICLECONNECTORS(VEHICLECONNECTORS vehicleconnectors) {
        this.vehicleconnectors = vehicleconnectors;
    }
}
