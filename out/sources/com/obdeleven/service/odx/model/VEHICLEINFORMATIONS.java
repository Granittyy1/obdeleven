package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "VEHICLE-INFORMATIONS")
public class VEHICLEINFORMATIONS {

    @ElementList(inline = true, name = "VEHICLE-INFORMATION", required = true, type = VEHICLEINFORMATION.class)
    protected List<VEHICLEINFORMATION> vehicleinformation;

    public List<VEHICLEINFORMATION> getVEHICLEINFORMATION() {
        if (this.vehicleinformation == null) {
            this.vehicleinformation = new ArrayList();
        }
        return this.vehicleinformation;
    }
}
