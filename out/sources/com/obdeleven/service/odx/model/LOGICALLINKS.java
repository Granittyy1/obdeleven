package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LOGICAL-LINKS")
public class LOGICALLINKS {

    @ElementList(inline = true, name = "LOGICAL-LINK", required = true, type = LOGICALLINK.class)
    protected List<LOGICALLINK> logicallink;

    public List<LOGICALLINK> getLOGICALLINK() {
        if (this.logicallink == null) {
            this.logicallink = new ArrayList();
        }
        return this.logicallink;
    }
}
