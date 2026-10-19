package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "IDENT-DESCS")
public class IDENTDESCS {

    @ElementList(inline = true, name = "IDENT-DESC", required = true, type = IDENTDESC.class)
    protected List<IDENTDESC> identdesc;

    public List<IDENTDESC> getIDENTDESC() {
        if (this.identdesc == null) {
            this.identdesc = new ArrayList();
        }
        return this.identdesc;
    }
}
