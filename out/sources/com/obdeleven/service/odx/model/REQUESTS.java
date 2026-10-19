package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "REQUESTS")
public class REQUESTS {

    @ElementList(inline = true, name = "REQUEST", required = true, type = REQUEST.class)
    protected List<REQUEST> request;

    public List<REQUEST> getREQUEST() {
        if (this.request == null) {
            this.request = new ArrayList();
        }
        return this.request;
    }
}
