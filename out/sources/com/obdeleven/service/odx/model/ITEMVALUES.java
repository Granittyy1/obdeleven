package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ITEM-VALUES")
public class ITEMVALUES {

    @ElementList(inline = true, name = "ITEM-VALUE", required = true, type = ITEMVALUE.class)
    protected List<ITEMVALUE> itemvalue;

    public List<ITEMVALUE> getITEMVALUE() {
        if (this.itemvalue == null) {
            this.itemvalue = new ArrayList();
        }
        return this.itemvalue;
    }
}
