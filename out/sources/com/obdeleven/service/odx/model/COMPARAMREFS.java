package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPARAM-REF"})
@Root(name = "COMPARAM-REFS")
public class COMPARAMREFS {

    @ElementList(inline = true, name = "COMPARAM-REF", required = true, type = COMPARAMREF.class)
    protected List<COMPARAMREF> comparamref;

    public List<COMPARAMREF> getCOMPARAMREF() {
        if (this.comparamref == null) {
            this.comparamref = new ArrayList();
        }
        return this.comparamref;
    }
}
