package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "IDENT-VALUES")
public class IDENTVALUES {

    @ElementList(inline = true, name = "IDENT-VALUE", required = true, type = IDENTVALUE.class)
    protected List<IDENTVALUE> identvalue;

    public List<IDENTVALUE> getIDENTVALUE() {
        if (this.identvalue == null) {
            this.identvalue = new ArrayList();
        }
        return this.identvalue;
    }
}
