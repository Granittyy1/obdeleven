package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DTC-DOPS")
public class DTCDOPS {

    @ElementList(inline = true, name = "DTC-DOP", required = true, type = DTCDOP.class)
    protected List<DTCDOP> dtcdop;

    public List<DTCDOP> getDTCDOP() {
        if (this.dtcdop == null) {
            this.dtcdop = new ArrayList();
        }
        return this.dtcdop;
    }
}
