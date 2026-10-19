package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STATIC-FIELDS")
public class STATICFIELDS {

    @ElementList(inline = true, name = "STATIC-FIELD", required = true, type = STATICFIELD.class)
    protected List<STATICFIELD> staticfield;

    public List<STATICFIELD> getSTATICFIELD() {
        if (this.staticfield == null) {
            this.staticfield = new ArrayList();
        }
        return this.staticfield;
    }
}
