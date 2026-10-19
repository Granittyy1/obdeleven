package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SUB-COMPONENT-PARAM-CONNECTORS")
public class SUBCOMPONENTPARAMCONNECTORS {

    @ElementList(inline = true, name = "SUBCOMPONENT-PARAM-CONNECTOR", required = true, type = SUBCOMPONENTPARAMCONNECTOR.class)
    protected List<SUBCOMPONENTPARAMCONNECTOR> subcomponentparamconnector;

    public List<SUBCOMPONENTPARAMCONNECTOR> getSUBCOMPONENTPARAMCONNECTOR() {
        if (this.subcomponentparamconnector == null) {
            this.subcomponentparamconnector = new ArrayList();
        }
        return this.subcomponentparamconnector;
    }
}
