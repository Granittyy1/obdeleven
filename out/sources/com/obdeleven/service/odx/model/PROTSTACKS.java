package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PROT-STACKS")
public class PROTSTACKS {

    @ElementList(inline = true, name = "PROT-STACK", required = true, type = PROTSTACK.class)
    protected List<PROTSTACK> protstack;

    public List<PROTSTACK> getPROTSTACK() {
        if (this.protstack == null) {
            this.protstack = new ArrayList();
        }
        return this.protstack;
    }
}
