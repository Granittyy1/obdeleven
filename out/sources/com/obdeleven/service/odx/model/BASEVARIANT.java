package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-VARIABLES", "VARIABLE-GROUPS", "DYN-DEFINED-SPEC", "BASE-VARIANTPATTERN", "PARENT-REFS"})
@Root(name = "BASE-VARIANT")
public class BASEVARIANT extends HIERARCHYELEMENT {

    @Element(name = "BASE-VARIANTPATTERN")
    protected BASEVARIANTPATTERN basevariantpattern;

    @Element(name = "DIAG-VARIABLES")
    protected DIAGVARIABLES diagvariables;

    @Element(name = "DYN-DEFINED-SPEC")
    protected DYNDEFINEDSPEC dyndefinedspec;

    @Element(name = "PARENT-REFS")
    protected PARENTREFS parentrefs;

    @Element(name = "VARIABLE-GROUPS")
    protected VARIABLEGROUPS variablegroups;

    public BASEVARIANTPATTERN getBASEVARIANTPATTERN() {
        return this.basevariantpattern;
    }

    public DIAGVARIABLES getDIAGVARIABLES() {
        return this.diagvariables;
    }

    public DYNDEFINEDSPEC getDYNDEFINEDSPEC() {
        return this.dyndefinedspec;
    }

    public PARENTREFS getPARENTREFS() {
        return this.parentrefs;
    }

    public VARIABLEGROUPS getVARIABLEGROUPS() {
        return this.variablegroups;
    }

    public void setBASEVARIANTPATTERN(BASEVARIANTPATTERN basevariantpattern) {
        this.basevariantpattern = basevariantpattern;
    }

    public void setDIAGVARIABLES(DIAGVARIABLES diagvariables) {
        this.diagvariables = diagvariables;
    }

    public void setDYNDEFINEDSPEC(DYNDEFINEDSPEC dyndefinedspec) {
        this.dyndefinedspec = dyndefinedspec;
    }

    public void setPARENTREFS(PARENTREFS parentrefs) {
        this.parentrefs = parentrefs;
    }

    public void setVARIABLEGROUPS(VARIABLEGROUPS variablegroups) {
        this.variablegroups = variablegroups;
    }
}
