package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STATES")
public class STATES {

    @ElementList(inline = true, name = "STATE", required = true, type = STATE.class)
    protected List<STATE> state;

    public List<STATE> getSTATE() {
        if (this.state == null) {
            this.state = new ArrayList();
        }
        return this.state;
    }
}
