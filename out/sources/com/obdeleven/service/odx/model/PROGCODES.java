package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PROG-CODES")
public class PROGCODES {

    @ElementList(inline = true, name = "PROG-CODE", required = true, type = PROGCODE.class)
    protected List<PROGCODE> progcode;

    public List<PROGCODE> getPROGCODE() {
        if (this.progcode == null) {
            this.progcode = new ArrayList();
        }
        return this.progcode;
    }
}
