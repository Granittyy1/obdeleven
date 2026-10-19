package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"FUNCTION-NODE-REFS", "FUNCTION-NODE-GROUPS"})
@Root(name = "FUNCTION-NODE-GROUP")
public class FUNCTIONNODEGROUP extends BASEFUNCTIONNODE {

    @Element(name = "FUNCTION-NODE-GROUPS")
    protected FUNCTIONNODEGROUPS functionnodegroups;

    @Element(name = "FUNCTION-NODE-REFS")
    protected FUNCTIONNODEREFS functionnoderefs;

    public FUNCTIONNODEGROUPS getFUNCTIONNODEGROUPS() {
        return this.functionnodegroups;
    }

    public FUNCTIONNODEREFS getFUNCTIONNODEREFS() {
        return this.functionnoderefs;
    }

    public void setFUNCTIONNODEGROUPS(FUNCTIONNODEGROUPS functionnodegroups) {
        this.functionnodegroups = functionnodegroups;
    }

    public void setFUNCTIONNODEREFS(FUNCTIONNODEREFS functionnoderefs) {
        this.functionnoderefs = functionnoderefs;
    }
}
