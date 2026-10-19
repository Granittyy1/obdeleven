package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STRUCTURES")
public class STRUCTURES {

    @ElementList(inline = true, name = "STRUCTURE", required = true, type = STRUCTURE.class)
    protected List<STRUCTURE> structure;

    public List<STRUCTURE> getSTRUCTURE() {
        if (this.structure == null) {
            this.structure = new ArrayList();
        }
        return this.structure;
    }
}
