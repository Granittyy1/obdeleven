package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPARAMS")
public class COMPARAMS {

    @ElementList(inline = true, name = "COMPARAM", required = true, type = COMPARAM.class)
    protected List<COMPARAM> comparam;

    public List<COMPARAM> getCOMPARAM() {
        if (this.comparam == null) {
            this.comparam = new ArrayList();
        }
        return this.comparam;
    }
}
