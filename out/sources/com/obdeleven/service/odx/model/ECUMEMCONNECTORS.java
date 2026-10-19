package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-MEM-CONNECTORS")
public class ECUMEMCONNECTORS {

    @ElementList(inline = true, name = "ECU-MEM-CONNECTOR", required = true, type = ECUMEMCONNECTOR.class)
    protected List<ECUMEMCONNECTOR> ecumemconnector;

    public List<ECUMEMCONNECTOR> getECUMEMCONNECTOR() {
        if (this.ecumemconnector == null) {
            this.ecumemconnector = new ArrayList();
        }
        return this.ecumemconnector;
    }
}
