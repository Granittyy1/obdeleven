package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ADMIN-DATA", "UNIT-GROUPS", "UNITS", "PHYSICAL-DIMENSIONS", "SDGS"})
@Root(name = "UNIT-SPEC")
public class UNITSPEC {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "PHYSICAL-DIMENSIONS")
    protected PHYSICALDIMENSIONS physicaldimensions;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "UNIT-GROUPS")
    protected UNITGROUPS unitgroups;

    @Element(name = "UNITS")
    protected UNITS units;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public PHYSICALDIMENSIONS getPHYSICALDIMENSIONS() {
        return this.physicaldimensions;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public UNITGROUPS getUNITGROUPS() {
        return this.unitgroups;
    }

    public UNITS getUNITS() {
        return this.units;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setPHYSICALDIMENSIONS(PHYSICALDIMENSIONS physicaldimensions) {
        this.physicaldimensions = physicaldimensions;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setUNITGROUPS(UNITGROUPS unitgroups) {
        this.unitgroups = unitgroups;
    }

    public void setUNITS(UNITS units) {
        this.units = units;
    }
}
