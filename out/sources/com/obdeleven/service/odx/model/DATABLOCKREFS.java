package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATABLOCK-REFS")
public class DATABLOCKREFS {

    @ElementList(entry = "DATABLOCK-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> datablockref;

    public List<ODXLINK> getDATABLOCKREF() {
        if (this.datablockref == null) {
            this.datablockref = new ArrayList();
        }
        return this.datablockref;
    }
}
