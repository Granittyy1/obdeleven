package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-TABLES")
public class NOTINHERITEDTABLES {

    @ElementList(inline = true, name = "NOT-INHERITED-TABLE", required = true, type = NOTINHERITEDTABLE.class)
    protected List<NOTINHERITEDTABLE> notinheritedtable;

    public List<NOTINHERITEDTABLE> getNOTINHERITEDTABLE() {
        if (this.notinheritedtable == null) {
            this.notinheritedtable = new ArrayList();
        }
        return this.notinheritedtable;
    }
}
