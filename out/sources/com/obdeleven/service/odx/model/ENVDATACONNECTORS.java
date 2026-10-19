package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENV-DATA-CONNECTORS")
public class ENVDATACONNECTORS {

    @ElementList(inline = true, name = "ENV-DATA-CONNECTOR", required = true, type = ENVDATACONNECTOR.class)
    protected List<ENVDATACONNECTOR> envdataconnector;

    public List<ENVDATACONNECTOR> getENVDATACONNECTOR() {
        if (this.envdataconnector == null) {
            this.envdataconnector = new ArrayList();
        }
        return this.envdataconnector;
    }
}
