package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPONENT-CONNECTORS")
public class COMPONENTCONNECTORS {

    @ElementList(inline = true, name = "COMPONENT-CONNECTOR", required = true, type = COMPONENTCONNECTOR.class)
    protected List<COMPONENTCONNECTOR> componentconnector;

    public List<COMPONENTCONNECTOR> getCOMPONENTCONNECTOR() {
        if (this.componentconnector == null) {
            this.componentconnector = new ArrayList();
        }
        return this.componentconnector;
    }
}
