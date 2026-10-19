package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STATE-TRANSITION-REFS")
public class STATETRANSITIONREFS {

    @ElementList(inline = true, name = "STATE-TRANSITIONREF", required = true, type = STATETRANSITIONREF.class)
    protected List<STATETRANSITIONREF> statetransitionref;

    public List<STATETRANSITIONREF> getSTATETRANSITIONREF() {
        if (this.statetransitionref == null) {
            this.statetransitionref = new ArrayList();
        }
        return this.statetransitionref;
    }
}
