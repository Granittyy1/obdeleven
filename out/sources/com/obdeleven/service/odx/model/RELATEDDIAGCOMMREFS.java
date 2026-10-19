package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "RELATED-DIAG-COMM-REFS")
public class RELATEDDIAGCOMMREFS {

    @ElementList(inline = true, name = "RELATED-DIAG-COMM-REF", required = true, type = RELATEDDIAGCOMMREF.class)
    protected List<RELATEDDIAGCOMMREF> relateddiagcommref;

    public List<RELATEDDIAGCOMMREF> getRELATEDDIAGCOMMREF() {
        if (this.relateddiagcommref == null) {
            this.relateddiagcommref = new ArrayList();
        }
        return this.relateddiagcommref;
    }
}
