package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "TABLES")
public class TABLES {

    @ElementList(inline = true, name = "TABLE", required = true, type = TABLE.class)
    protected List<TABLE> table;

    public List<TABLE> getTABLE() {
        if (this.table == null) {
            this.table = new ArrayList();
        }
        return this.table;
    }
}
