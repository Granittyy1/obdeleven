package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "UNIT-REFS")
public class UNITREFS {

    @ElementList(entry = "UNIT-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> unitref;

    public List<ODXLINK> getUNITREF() {
        if (this.unitref == null) {
            this.unitref = new ArrayList();
        }
        return this.unitref;
    }
}
