package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "READ-PARAM-VALUES")
public class READPARAMVALUES {

    @ElementList(inline = true, name = "READ-PARAM-VALUE", required = true, type = READPARAMVALUE.class)
    protected List<READPARAMVALUE> readparamvalue;

    public List<READPARAMVALUE> getREADPARAMVALUE() {
        if (this.readparamvalue == null) {
            this.readparamvalue = new ArrayList();
        }
        return this.readparamvalue;
    }
}
