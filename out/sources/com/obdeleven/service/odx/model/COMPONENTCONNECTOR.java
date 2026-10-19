package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ECU-VARIANT-REFS", "BASE-VARIANT-REF", "DIAG-OBJECT-CONNECTOR", "DIAG-OBJECT-CONNECTOR-REF"})
@Root(name = "COMPONENT-CONNECTOR")
public class COMPONENTCONNECTOR {

    @Element(name = "BASE-VARIANT-REF")
    protected ODXLINK basevariantref;

    @Element(name = "DIAG-OBJECT-CONNECTOR")
    protected DIAGOBJECTCONNECTOR diagobjectconnector;

    @Element(name = "DIAG-OBJECT-CONNECTOR-REF")
    protected ODXLINK diagobjectconnectorref;

    @Element(name = "ECU-VARIANT-REFS")
    protected ECUVARIANTREFS ecuvariantrefs;

    public ODXLINK getBASEVARIANTREF() {
        return this.basevariantref;
    }

    public DIAGOBJECTCONNECTOR getDIAGOBJECTCONNECTOR() {
        return this.diagobjectconnector;
    }

    public ODXLINK getDIAGOBJECTCONNECTORREF() {
        return this.diagobjectconnectorref;
    }

    public ECUVARIANTREFS getECUVARIANTREFS() {
        return this.ecuvariantrefs;
    }

    public void setBASEVARIANTREF(ODXLINK odxlink) {
        this.basevariantref = odxlink;
    }

    public void setDIAGOBJECTCONNECTOR(DIAGOBJECTCONNECTOR diagobjectconnector) {
        this.diagobjectconnector = diagobjectconnector;
    }

    public void setDIAGOBJECTCONNECTORREF(ODXLINK odxlink) {
        this.diagobjectconnectorref = odxlink;
    }

    public void setECUVARIANTREFS(ECUVARIANTREFS ecuvariantrefs) {
        this.ecuvariantrefs = ecuvariantrefs;
    }
}
