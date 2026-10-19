package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "VEHICLE-CONNECTOR-PIN-REFS")
public class VEHICLECONNECTORPINREFS {

    @ElementList(entry = "VEHICLE-CONNECTOR-PIN-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> vehicleconnectorpinref;

    public List<ODXLINK> getVEHICLECONNECTORPINREF() {
        if (this.vehicleconnectorpinref == null) {
            this.vehicleconnectorpinref = new ArrayList();
        }
        return this.vehicleconnectorpinref;
    }
}
