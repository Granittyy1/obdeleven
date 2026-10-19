package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYNAMIC-LENGTH-FIELDS")
public class DYNAMICLENGTHFIELDS {

    @ElementList(inline = true, name = "DYNAMIC-LENGTHFIELD", required = true, type = DYNAMICLENGTHFIELD.class)
    protected List<DYNAMICLENGTHFIELD> dynamiclengthfield;

    public List<DYNAMICLENGTHFIELD> getDYNAMICLENGTHFIELD() {
        if (this.dynamiclengthfield == null) {
            this.dynamiclengthfield = new ArrayList();
        }
        return this.dynamiclengthfield;
    }
}
