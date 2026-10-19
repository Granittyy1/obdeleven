package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DTC-CONNECTORS")
public class DTCCONNECTORS {

    @ElementList(inline = true, name = "DTC-CONNECTOR", required = true, type = DTCCONNECTOR.class)
    protected List<DTCCONNECTOR> dtcconnector;

    public List<DTCCONNECTOR> getDTCCONNECTOR() {
        if (this.dtcconnector == null) {
            this.dtcconnector = new ArrayList();
        }
        return this.dtcconnector;
    }
}
