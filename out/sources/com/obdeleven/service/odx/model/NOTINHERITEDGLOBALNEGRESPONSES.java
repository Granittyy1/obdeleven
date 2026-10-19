package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-GLOBAL-NEG-RESPONSES")
public class NOTINHERITEDGLOBALNEGRESPONSES {

    @ElementList(inline = true, name = "NOTINHERITED-GLOBAL-NEG-RESPONSE", required = true, type = NOTINHERITEDGLOBALNEGRESPONSE.class)
    protected List<NOTINHERITEDGLOBALNEGRESPONSE> notinheritedglobalnegresponse;

    public List<NOTINHERITEDGLOBALNEGRESPONSE> getNOTINHERITEDGLOBALNEGRESPONSE() {
        if (this.notinheritedglobalnegresponse == null) {
            this.notinheritedglobalnegresponse = new ArrayList();
        }
        return this.notinheritedglobalnegresponse;
    }
}
