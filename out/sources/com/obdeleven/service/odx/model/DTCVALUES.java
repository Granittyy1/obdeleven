package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DTC-VALUES")
public class DTCVALUES {

    @ElementList(inline = true, name = "DTC-VALUE", required = true, type = DTCVALUE.class)
    protected List<DTCVALUE> dtcvalue;

    public List<DTCVALUE> getDTCVALUE() {
        if (this.dtcvalue == null) {
            this.dtcvalue = new ArrayList();
        }
        return this.dtcvalue;
    }
}
