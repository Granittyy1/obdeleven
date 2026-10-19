package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SECURITYS")
public class SECURITYS {

    @ElementList(inline = true, name = "SECURITY", required = true, type = SECURITY.class)
    protected List<SECURITY> security;

    public List<SECURITY> getSECURITY() {
        if (this.security == null) {
            this.security = new ArrayList();
        }
        return this.security;
    }
}
