package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "WRITE-PARAM-VALUES")
public class WRITEPARAMVALUES {

    @ElementList(inline = true, name = "WRITE-PARAM-VALUE", required = true, type = WRITEPARAMVALUE.class)
    protected List<WRITEPARAMVALUE> writeparamvalue;

    public List<WRITEPARAMVALUE> getWRITEPARAMVALUE() {
        if (this.writeparamvalue == null) {
            this.writeparamvalue = new ArrayList();
        }
        return this.writeparamvalue;
    }
}
