package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "EXTERNAL-DOCS")
public class EXTERNALDOCS {

    @ElementList(inline = true, name = "EXTERNAL-DOC", required = true, type = EXTERNALDOC.class)
    protected List<EXTERNALDOC> externaldoc;

    public List<EXTERNALDOC> getEXTERNALDOC() {
        if (this.externaldoc == null) {
            this.externaldoc = new ArrayList();
        }
        return this.externaldoc;
    }
}
