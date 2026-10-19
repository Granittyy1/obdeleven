package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"FUNCTION-NODES", "FUNCTION-NODE-GROUPS", "ADDITIONAL-AUDIENCES"})
@Root(name = "FUNCTION-DICTIONARY")
public class FUNCTIONDICTIONARY extends ODXCATEGORY {

    @Element(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

    @Element(name = "FUNCTION-NODE-GROUPS")
    protected FUNCTIONNODEGROUPS functionnodegroups;

    @Element(name = "FUNCTION-NODES")
    protected FUNCTIONNODES functionnodes;

    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return this.additionalaudiences;
    }

    public FUNCTIONNODEGROUPS getFUNCTIONNODEGROUPS() {
        return this.functionnodegroups;
    }

    public FUNCTIONNODES getFUNCTIONNODES() {
        return this.functionnodes;
    }

    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES additionalaudiences) {
        this.additionalaudiences = additionalaudiences;
    }

    public void setFUNCTIONNODEGROUPS(FUNCTIONNODEGROUPS functionnodegroups) {
        this.functionnodegroups = functionnodegroups;
    }

    public void setFUNCTIONNODES(FUNCTIONNODES functionnodes) {
        this.functionnodes = functionnodes;
    }
}
