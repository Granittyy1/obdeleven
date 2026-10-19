package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-CODED-TYPE", "PHYSICAL-TYPE", "COMPU-METHOD", "DTCS", "LINKED-DTC-DOPS"})
@Root(name = "DTC-DOP")
public class DTCDOP extends DOPBASE {

    @Element(name = "COMPU-METHOD", required = true)
    protected COMPUMETHOD compumethod;

    @Element(name = "DIAG-CODED-TYPE", required = true)
    protected DIAGCODEDTYPE diagcodedtype;

    @Element(name = "DTCS", required = true)
    protected DTCS dtcs;

    @Attribute(name = "IS-VISIBLE")
    protected Boolean isvisible;

    @Element(name = "LINKED-DTC-DOPS")
    protected LINKEDDTCDOPS linkeddtcdops;

    @Element(name = "PHYSICAL-TYPE", required = true)
    protected PHYSICALTYPE physicaltype;

    public COMPUMETHOD getCOMPUMETHOD() {
        return this.compumethod;
    }

    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return this.diagcodedtype;
    }

    public DTCS getDTCS() {
        return this.dtcs;
    }

    public LINKEDDTCDOPS getLINKEDDTCDOPS() {
        return this.linkeddtcdops;
    }

    public PHYSICALTYPE getPHYSICALTYPE() {
        return this.physicaltype;
    }

    public boolean isISVISIBLE() {
        Boolean bool = this.isvisible;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setCOMPUMETHOD(COMPUMETHOD compumethod) {
        this.compumethod = compumethod;
    }

    public void setDIAGCODEDTYPE(DIAGCODEDTYPE diagcodedtype) {
        this.diagcodedtype = diagcodedtype;
    }

    public void setDTCS(DTCS dtcs) {
        this.dtcs = dtcs;
    }

    public void setISVISIBLE(Boolean bool) {
        this.isvisible = bool;
    }

    public void setLINKEDDTCDOPS(LINKEDDTCDOPS linkeddtcdops) {
        this.linkeddtcdops = linkeddtcdops;
    }

    public void setPHYSICALTYPE(PHYSICALTYPE physicaltype) {
        this.physicaltype = physicaltype;
    }
}
