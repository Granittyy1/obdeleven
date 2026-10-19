package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FILTERS")
public class FILTERS {

    @ElementList(inline = true, name = "FILTER", required = true, type = FILTER.class)
    protected List<FILTER> filter;

    public List<FILTER> getFILTER() {
        if (this.filter == null) {
            this.filter = new ArrayList();
        }
        return this.filter;
    }
}
