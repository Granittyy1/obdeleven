package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "VEHICLE-CONNECTORS")
public class VEHICLECONNECTORS {

    @ElementList(inline = true, name = "VEHICLE-CONNECTOR", required = true, type = VEHICLECONNECTOR.class)
    protected List<VEHICLECONNECTOR> vehicleconnector;

    public List<VEHICLECONNECTOR> getVEHICLECONNECTOR() {
        if (this.vehicleconnector == null) {
            this.vehicleconnector = new ArrayList();
        }
        return this.vehicleconnector;
    }
}
