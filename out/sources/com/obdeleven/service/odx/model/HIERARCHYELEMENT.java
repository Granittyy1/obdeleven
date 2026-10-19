package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "HIERARCHY-ELEMENT")
public class HIERARCHYELEMENT extends DIAGLAYER {

    @Element(name = "COMPARAM-REFS")
    protected COMPARAMREFS comparamrefs;

    public COMPARAMREFS getCOMPARAMREFS() {
        return this.comparamrefs;
    }

    public void setCOMPARAMREFS(COMPARAMREFS comparamrefs) {
        this.comparamrefs = comparamrefs;
    }
}
