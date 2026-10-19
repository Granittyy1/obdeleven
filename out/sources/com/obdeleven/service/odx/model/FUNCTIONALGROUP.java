package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-VARIABLES", "VARIABLE-GROUPS", "PARENT-REFS"})
@Root(name = "FUNCTIONAL-GROUP")
public class FUNCTIONALGROUP extends HIERARCHYELEMENT {

    @Element(name = "DIAG-VARIABLES")
    protected DIAGVARIABLES diagvariables;

    @Element(name = "PARENT-REFS")
    protected PARENTREFS parentrefs;

    @Element(name = "VARIABLE-GROUPS")
    protected VARIABLEGROUPS variablegroups;

    public DIAGVARIABLES getDIAGVARIABLES() {
        return this.diagvariables;
    }

    public PARENTREFS getPARENTREFS() {
        return this.parentrefs;
    }

    public VARIABLEGROUPS getVARIABLEGROUPS() {
        return this.variablegroups;
    }

    public void setDIAGVARIABLES(DIAGVARIABLES diagvariables) {
        this.diagvariables = diagvariables;
    }

    public void setPARENTREFS(PARENTREFS parentrefs) {
        this.parentrefs = parentrefs;
    }

    public void setVARIABLEGROUPS(VARIABLEGROUPS variablegroups) {
        this.variablegroups = variablegroups;
    }
}
