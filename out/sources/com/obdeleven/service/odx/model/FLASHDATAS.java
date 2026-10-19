package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FLASHDATAS")
public class FLASHDATAS {

    @ElementList(inline = true, name = "FLASHDATA", required = true, type = FLASHDATA.class)
    protected List<FLASHDATA> flashdata;

    public List<FLASHDATA> getFLASHDATA() {
        if (this.flashdata == null) {
            this.flashdata = new ArrayList();
        }
        return this.flashdata;
    }
}
