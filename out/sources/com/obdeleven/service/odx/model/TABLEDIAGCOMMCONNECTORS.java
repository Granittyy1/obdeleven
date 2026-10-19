package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "TABLE-DIAG-COMM-CONNECTORS")
public class TABLEDIAGCOMMCONNECTORS {

    @ElementList(inline = true, name = "TABLE-DIAG-COMMCONNECTOR", required = true, type = TABLEDIAGCOMMCONNECTOR.class)
    protected List<TABLEDIAGCOMMCONNECTOR> tablediagcommconnector;

    public List<TABLEDIAGCOMMCONNECTOR> getTABLEDIAGCOMMCONNECTOR() {
        if (this.tablediagcommconnector == null) {
            this.tablediagcommconnector = new ArrayList();
        }
        return this.tablediagcommconnector;
    }
}
