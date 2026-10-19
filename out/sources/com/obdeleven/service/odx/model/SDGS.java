package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SDGS")
public class SDGS {

    @ElementList(inline = true, name = "SDG", required = true, type = SDG.class)
    protected List<SDG> sdg;

    public List<SDG> getSDG() {
        if (this.sdg == null) {
            this.sdg = new ArrayList();
        }
        return this.sdg;
    }
}
