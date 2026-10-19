package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LINK-COMPARAM-REFS")
public class LINKCOMPARAMREFS {

    @ElementList(inline = true, name = "LINK-COMPARAM-REF", required = true, type = LINKCOMPARAMREF.class)
    protected List<LINKCOMPARAMREF> linkcomparamref;

    public List<LINKCOMPARAMREF> getLINKCOMPARAMREF() {
        if (this.linkcomparamref == null) {
            this.linkcomparamref = new ArrayList();
        }
        return this.linkcomparamref;
    }
}
