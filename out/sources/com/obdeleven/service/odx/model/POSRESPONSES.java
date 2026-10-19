package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "POS-RESPONSES")
public class POSRESPONSES {

    @ElementList(inline = true, name = "POS-RESPONSE", required = true, type = POSRESPONSE.class)
    protected List<POSRESPONSE> posresponse;

    public List<POSRESPONSE> getPOSRESPONSE() {
        if (this.posresponse == null) {
            this.posresponse = new ArrayList();
        }
        return this.posresponse;
    }
}
