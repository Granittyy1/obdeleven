package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "TABLE-ROW-CONNECTORS")
public class TABLEROWCONNECTORS {

    @ElementList(inline = true, name = "TABLE-ROW-CONNECTOR", required = true, type = TABLEROWCONNECTOR.class)
    protected List<TABLEROWCONNECTOR> tablerowconnector;

    public List<TABLEROWCONNECTOR> getTABLEROWCONNECTOR() {
        if (this.tablerowconnector == null) {
            this.tablerowconnector = new ArrayList();
        }
        return this.tablerowconnector;
    }
}
