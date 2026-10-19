package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPLEX-VALUES")
public class COMPLEXVALUES {

    @ElementList(inline = true, name = "COMPLEX-VALUE", required = true, type = COMPLEXVALUE.class)
    protected List<COMPLEXVALUE> complexvalue;

    public List<COMPLEXVALUE> getCOMPLEXVALUE() {
        if (this.complexvalue == null) {
            this.complexvalue = new ArrayList();
        }
        return this.complexvalue;
    }
}
