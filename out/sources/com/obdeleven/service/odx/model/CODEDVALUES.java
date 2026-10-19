package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CODED-VALUE"})
@Root(name = "CODED-VALUES")
public class CODEDVALUES {

    @ElementList(entry = "CODED-VALUE", inline = true, required = true, type = String.class)
    protected List<String> codedvalue;

    public List<String> getCODEDVALUE() {
        if (this.codedvalue == null) {
            this.codedvalue = new ArrayList();
        }
        return this.codedvalue;
    }
}
