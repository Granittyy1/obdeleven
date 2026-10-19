package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-DIAG-COMM-CONNECTORS")
public class FUNCTIONDIAGCOMMCONNECTORS {

    @ElementList(inline = true, name = "FUNCTIONDIAG-COMM-CONNECTOR", required = true, type = FUNCTIONDIAGCOMMCONNECTOR.class)
    protected List<FUNCTIONDIAGCOMMCONNECTOR> functiondiagcommconnector;

    public List<FUNCTIONDIAGCOMMCONNECTOR> getFUNCTIONDIAGCOMMCONNECTOR() {
        if (this.functiondiagcommconnector == null) {
            this.functiondiagcommconnector = new ArrayList();
        }
        return this.functiondiagcommconnector;
    }
}
