package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-SHARED-DATAS")
public class ECUSHAREDDATAS {

    @ElementList(inline = true, name = "ECU-SHARED-DATA", required = true, type = ECUSHAREDDATA.class)
    protected List<ECUSHAREDDATA> ecushareddata;

    public List<ECUSHAREDDATA> getECUSHAREDDATA() {
        if (this.ecushareddata == null) {
            this.ecushareddata = new ArrayList();
        }
        return this.ecushareddata;
    }
}
