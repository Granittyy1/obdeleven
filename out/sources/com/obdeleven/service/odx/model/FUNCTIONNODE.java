package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-NODE")
public class FUNCTIONNODE extends BASEFUNCTIONNODE {

    @Element(name = "FUNCTION-NODES")
    protected FUNCTIONNODES functionnodes;

    public FUNCTIONNODES getFUNCTIONNODES() {
        return this.functionnodes;
    }

    public void setFUNCTIONNODES(FUNCTIONNODES functionnodes) {
        this.functionnodes = functionnodes;
    }
}
