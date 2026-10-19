package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DIAG-COMM-DATA-CONNECTORS")
public class DIAGCOMMDATACONNECTORS {

    @ElementList(inline = true, name = "DIAG-COMM-DATACONNECTOR", required = true, type = DIAGCOMMDATACONNECTOR.class)
    protected List<DIAGCOMMDATACONNECTOR> diagcommdataconnector;

    public List<DIAGCOMMDATACONNECTOR> getDIAGCOMMDATACONNECTOR() {
        if (this.diagcommdataconnector == null) {
            this.diagcommdataconnector = new ArrayList();
        }
        return this.diagcommdataconnector;
    }
}
