package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "EXPECTED-IDENTS")
public class EXPECTEDIDENTS {

    @ElementList(inline = true, name = "EXPECTED-IDENT", required = true, type = EXPECTEDIDENT.class)
    protected List<EXPECTEDIDENT> expectedident;

    public List<EXPECTEDIDENT> getEXPECTEDIDENT() {
        if (this.expectedident == null) {
            this.expectedident = new ArrayList();
        }
        return this.expectedident;
    }
}
