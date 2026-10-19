package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PARENT-REFS")
public class PARENTREFS {

    @ElementList(entry = "PARENT-REF", inline = true, name = "PARENT-REF", required = true, type = PARENTREF.class)
    protected List<PARENTREF> parentref;

    public List<PARENTREF> getPARENTREF() {
        if (this.parentref == null) {
            this.parentref = new ArrayList();
        }
        return this.parentref;
    }
}
