package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "IMPORT-REFS")
public class IMPORTREFS {

    @ElementList(entry = "IMPORT-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> importref;

    public List<ODXLINK> getIMPORTREF() {
        if (this.importref == null) {
            this.importref = new ArrayList();
        }
        return this.importref;
    }
}
