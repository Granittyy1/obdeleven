package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LINKED-DTC-DOPS")
public class LINKEDDTCDOPS {

    @ElementList(inline = true, name = "LINKED-DTC-DOP", required = true, type = LINKEDDTCDOP.class)
    protected List<LINKEDDTCDOP> linkeddtcdop;

    public List<LINKEDDTCDOP> getLINKEDDTCDOP() {
        if (this.linkeddtcdop == null) {
            this.linkeddtcdop = new ArrayList();
        }
        return this.linkeddtcdop;
    }
}
