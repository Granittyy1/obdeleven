package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "POS-RESPONSE-REFS")
public class POSRESPONSEREFS {

    @ElementList(entry = "POS-RESPONSE-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> posresponseref;

    public List<ODXLINK> getPOSRESPONSEREF() {
        if (this.posresponseref == null) {
            this.posresponseref = new ArrayList();
        }
        return this.posresponseref;
    }
}
