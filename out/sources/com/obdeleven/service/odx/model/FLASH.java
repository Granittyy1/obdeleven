package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ECU-MEMS", "ECU-MEM-CONNECTORS", "ADDITIONAL-AUDIENCES"})
@Root(name = "FLASH")
public class FLASH extends ODXCATEGORY {

    @Element(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

    @Element(name = "ECU-MEM-CONNECTORS")
    protected ECUMEMCONNECTORS ecumemconnectors;

    @Element(name = "ECU-MEMS")
    protected ECUMEMS ecumems;

    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return this.additionalaudiences;
    }

    public ECUMEMCONNECTORS getECUMEMCONNECTORS() {
        return this.ecumemconnectors;
    }

    public ECUMEMS getECUMEMS() {
        return this.ecumems;
    }

    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES additionalaudiences) {
        this.additionalaudiences = additionalaudiences;
    }

    public void setECUMEMCONNECTORS(ECUMEMCONNECTORS ecumemconnectors) {
        this.ecumemconnectors = ecumemconnectors;
    }

    public void setECUMEMS(ECUMEMS ecumems) {
        this.ecumems = ecumems;
    }
}
