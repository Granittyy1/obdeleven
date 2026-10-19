package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PHYSICAL-DIMENSIONS")
public class PHYSICALDIMENSIONS {

    @ElementList(inline = true, name = "PHYSICAL-DIMENSION", required = true, type = PHYSICALDIMENSION.class)
    protected List<PHYSICALDIMENSION> physicaldimension;

    public List<PHYSICALDIMENSION> getPHYSICALDIMENSION() {
        if (this.physicaldimension == null) {
            this.physicaldimension = new ArrayList();
        }
        return this.physicaldimension;
    }
}
