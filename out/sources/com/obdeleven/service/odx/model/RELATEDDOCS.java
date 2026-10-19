package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "RELATED-DOCS")
public class RELATEDDOCS {

    @ElementList(inline = true, name = "RELATED-DOC", required = true, type = RELATEDDOC.class)
    protected List<RELATEDDOC> relateddoc;

    public List<RELATEDDOC> getRELATEDDOC() {
        if (this.relateddoc == null) {
            this.relateddoc = new ArrayList();
        }
        return this.relateddoc;
    }
}
