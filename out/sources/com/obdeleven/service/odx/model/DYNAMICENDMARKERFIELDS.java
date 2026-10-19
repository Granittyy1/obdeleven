package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYNAMIC-ENDMARKER-FIELDS")
public class DYNAMICENDMARKERFIELDS {

    @ElementList(inline = true, name = "DYNAMIC-ENDMARKERFIELD", required = true, type = DYNAMICENDMARKERFIELD.class)
    protected List<DYNAMICENDMARKERFIELD> dynamicendmarkerfield;

    public List<DYNAMICENDMARKERFIELD> getDYNAMICENDMARKERFIELD() {
        if (this.dynamicendmarkerfield == null) {
            this.dynamicendmarkerfield = new ArrayList();
        }
        return this.dynamicendmarkerfield;
    }
}
