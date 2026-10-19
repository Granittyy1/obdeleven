package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-VARIABLES", "VARIABLE-GROUPS"})
@Root(name = "ECU-SHARED-DATA")
public class ECUSHAREDDATA extends DIAGLAYER {

    @Element(name = "DIAG-VARIABLES")
    protected DIAGVARIABLES diagvariables;

    @Element(name = "VARIABLE-GROUPS")
    protected VARIABLEGROUPS variablegroups;

    public DIAGVARIABLES getDIAGVARIABLES() {
        return this.diagvariables;
    }

    public VARIABLEGROUPS getVARIABLEGROUPS() {
        return this.variablegroups;
    }

    public void setDIAGVARIABLES(DIAGVARIABLES diagvariables) {
        this.diagvariables = diagvariables;
    }

    public void setVARIABLEGROUPS(VARIABLEGROUPS variablegroups) {
        this.variablegroups = variablegroups;
    }
}
