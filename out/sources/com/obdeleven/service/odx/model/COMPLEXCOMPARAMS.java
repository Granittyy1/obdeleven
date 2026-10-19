package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPLEX-COMPARAMS")
public class COMPLEXCOMPARAMS {

    @ElementList(inline = true, name = "COMPLEX-COMPARAM", required = true, type = COMPLEXCOMPARAM.class)
    protected List<COMPLEXCOMPARAM> complexcomparam;

    public List<COMPLEXCOMPARAM> getCOMPLEXCOMPARAM() {
        if (this.complexcomparam == null) {
            this.complexcomparam = new ArrayList();
        }
        return this.complexcomparam;
    }
}
