package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DOC-REVISIONS")
public class DOCREVISIONS {

    @ElementList(inline = true, name = "DOC-REVISION", required = true, type = DOCREVISION.class)
    protected List<DOCREVISION> docrevision;

    public List<DOCREVISION> getDOCREVISION() {
        if (this.docrevision == null) {
            this.docrevision = new ArrayList();
        }
        return this.docrevision;
    }
}
