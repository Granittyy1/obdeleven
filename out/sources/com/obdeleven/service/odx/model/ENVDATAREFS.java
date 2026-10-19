package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENV-DATA-REFS")
public class ENVDATAREFS {

    @ElementList(entry = "ENV-DATA-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> envdataref;

    public List<ODXLINK> getENVDATAREF() {
        if (this.envdataref == null) {
            this.envdataref = new ArrayList();
        }
        return this.envdataref;
    }
}
