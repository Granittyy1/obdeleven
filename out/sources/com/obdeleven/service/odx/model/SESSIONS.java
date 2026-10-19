package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SESSIONS")
public class SESSIONS {

    @ElementList(inline = true, name = "SESSION", required = true, type = SESSION.class)
    protected List<SESSION> session;

    public List<SESSION> getSESSION() {
        if (this.session == null) {
            this.session = new ArrayList();
        }
        return this.session;
    }
}
