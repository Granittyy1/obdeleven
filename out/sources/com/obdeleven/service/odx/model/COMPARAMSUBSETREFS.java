package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPARAM-SUBSET-REFS")
public class COMPARAMSUBSETREFS {

    @ElementList(entry = "COMPARAM-SUBSET-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> comparamsubsetref;

    public List<ODXLINK> getCOMPARAMSUBSETREF() {
        if (this.comparamsubsetref == null) {
            this.comparamsubsetref = new ArrayList();
        }
        return this.comparamsubsetref;
    }
}
