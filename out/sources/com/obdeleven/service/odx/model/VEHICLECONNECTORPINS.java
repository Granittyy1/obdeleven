package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "VEHICLE-CONNECTOR-PINS")
public class VEHICLECONNECTORPINS {

    @ElementList(inline = true, name = "VEHICLE-CONNECTORPIN", required = true, type = VEHICLECONNECTORPIN.class)
    protected List<VEHICLECONNECTORPIN> vehicleconnectorpin;

    public List<VEHICLECONNECTORPIN> getVEHICLECONNECTORPIN() {
        if (this.vehicleconnectorpin == null) {
            this.vehicleconnectorpin = new ArrayList();
        }
        return this.vehicleconnectorpin;
    }
}
