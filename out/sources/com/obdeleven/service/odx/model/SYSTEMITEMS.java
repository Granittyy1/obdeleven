package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SYSTEM-ITEMS")
public class SYSTEMITEMS {

    @ElementList(inline = true, name = "SYSTEM-ITEM", required = true, type = SYSTEMITEM.class)
    protected List<SYSTEMITEM> systemitem;

    public List<SYSTEMITEM> getSYSTEMITEM() {
        if (this.systemitem == null) {
            this.systemitem = new ArrayList();
        }
        return this.systemitem;
    }
}
