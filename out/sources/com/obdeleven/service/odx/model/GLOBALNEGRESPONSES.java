package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "GLOBAL-NEG-RESPONSES")
public class GLOBALNEGRESPONSES {

    @ElementList(inline = true, name = "GLOBAL-NEG-RESPONSE", required = true, type = GLOBALNEGRESPONSE.class)
    protected List<GLOBALNEGRESPONSE> globalnegresponse;

    public List<GLOBALNEGRESPONSE> getGLOBALNEGRESPONSE() {
        if (this.globalnegresponse == null) {
            this.globalnegresponse = new ArrayList();
        }
        return this.globalnegresponse;
    }
}
