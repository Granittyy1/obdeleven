package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-GLOBAL-NEG-RESPONSE")
public class NOTINHERITEDGLOBALNEGRESPONSE {

    @Element(name = "GLOBAL-NEG-RESPONSE-SNREF", required = true)
    protected SNREF globalnegresponsesnref;

    public SNREF getGLOBALNEGRESPONSESNREF() {
        return this.globalnegresponsesnref;
    }

    public void setGLOBALNEGRESPONSESNREF(SNREF snref) {
        this.globalnegresponsesnref = snref;
    }
}
