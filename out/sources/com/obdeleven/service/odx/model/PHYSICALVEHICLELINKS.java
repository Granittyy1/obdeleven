package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PHYSICAL-VEHICLE-LINKS")
public class PHYSICALVEHICLELINKS {

    @ElementList(inline = true, name = "PHYSICAL-VEHICLELINK", required = true, type = PHYSICALVEHICLELINK.class)
    protected List<PHYSICALVEHICLELINK> physicalvehiclelink;

    public List<PHYSICALVEHICLELINK> getPHYSICALVEHICLELINK() {
        if (this.physicalvehiclelink == null) {
            this.physicalvehiclelink = new ArrayList();
        }
        return this.physicalvehiclelink;
    }
}
