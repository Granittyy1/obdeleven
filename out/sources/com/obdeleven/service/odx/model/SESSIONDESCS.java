package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SESSION-DESCS")
public class SESSIONDESCS {

    @ElementList(inline = true, name = "SESSION-DESC", required = true, type = SESSIONDESC.class)
    protected List<SESSIONDESC> sessiondesc;

    public List<SESSIONDESC> getSESSIONDESC() {
        if (this.sessiondesc == null) {
            this.sessiondesc = new ArrayList();
        }
        return this.sessiondesc;
    }
}
