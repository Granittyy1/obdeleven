package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SUPPORTED-DYN-IDS")
public class SUPPORTEDDYNIDS {

    @ElementList(inline = true, name = "SUPPORTED-DYN-ID", required = true, type = SUPPORTEDDYNID.class)
    protected List<SUPPORTEDDYNID> supporteddynid;

    public List<SUPPORTEDDYNID> getSUPPORTEDDYNID() {
        if (this.supporteddynid == null) {
            this.supporteddynid = new ArrayList();
        }
        return this.supporteddynid;
    }
}
