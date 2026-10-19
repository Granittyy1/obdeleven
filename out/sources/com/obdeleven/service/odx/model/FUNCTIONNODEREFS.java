package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-NODE-REFS")
public class FUNCTIONNODEREFS {

    @ElementList(entry = "FUNCTION-NODE-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> functionnoderef;

    public List<ODXLINK> getFUNCTIONNODEREF() {
        if (this.functionnoderef == null) {
            this.functionnoderef = new ArrayList();
        }
        return this.functionnoderef;
    }
}
