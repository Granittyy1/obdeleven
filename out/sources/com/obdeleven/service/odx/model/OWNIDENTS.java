package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "OWN-IDENTS")
public class OWNIDENTS {

    @ElementList(inline = true, name = "OWN-IDENT", required = true, type = OWNIDENT.class)
    protected List<OWNIDENT> ownident;

    public List<OWNIDENT> getOWNIDENT() {
        if (this.ownident == null) {
            this.ownident = new ArrayList();
        }
        return this.ownident;
    }
}
