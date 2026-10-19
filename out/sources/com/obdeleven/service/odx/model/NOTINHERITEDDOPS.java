package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-DOPS")
public class NOTINHERITEDDOPS {

    @ElementList(inline = true, name = "NOT-INHERITED-DOP", required = true, type = NOTINHERITEDDOP.class)
    protected List<NOTINHERITEDDOP> notinheriteddop;

    public List<NOTINHERITEDDOP> getNOTINHERITEDDOP() {
        if (this.notinheriteddop == null) {
            this.notinheriteddop = new ArrayList();
        }
        return this.notinheriteddop;
    }
}
