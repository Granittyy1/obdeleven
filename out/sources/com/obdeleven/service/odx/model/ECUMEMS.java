package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-MEMS")
public class ECUMEMS {

    @ElementList(inline = true, name = "ECU-MEM", required = true, type = ECUMEM.class)
    protected List<ECUMEM> ecumem;

    public List<ECUMEM> getECUMEM() {
        if (this.ecumem == null) {
            this.ecumem = new ArrayList();
        }
        return this.ecumem;
    }
}
