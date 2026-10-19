package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-VARIABLES", "VARIABLE-GROUPS", "ECU-VARIANT-PATTERNS", "DYN-DEFINED-SPEC", "PARENT-REFS"})
@Root(name = "ECU-VARIANT")
public class ECUVARIANT extends HIERARCHYELEMENT {

    @Element(name = "DIAG-VARIABLES")
    protected DIAGVARIABLES diagvariables;

    @Element(name = "DYN-DEFINED-SPEC")
    protected DYNDEFINEDSPEC dyndefinedspec;

    @Element(name = "ECU-VARIANT-PATTERNS")
    protected ECUVARIANTPATTERNS ecuvariantpatterns;

    @Element(name = "PARENT-REFS")
    protected PARENTREFS parentrefs;

    @Element(name = "VARIABLE-GROUPS")
    protected VARIABLEGROUPS variablegroups;

    public DIAGVARIABLES getDIAGVARIABLES() {
        return this.diagvariables;
    }

    public DYNDEFINEDSPEC getDYNDEFINEDSPEC() {
        return this.dyndefinedspec;
    }

    public ECUVARIANTPATTERNS getECUVARIANTPATTERNS() {
        return this.ecuvariantpatterns;
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

    public void setDYNDEFINEDSPEC(DYNDEFINEDSPEC dyndefinedspec) {
        this.dyndefinedspec = dyndefinedspec;
    }

    public void setECUVARIANTPATTERNS(ECUVARIANTPATTERNS ecuvariantpatterns) {
        this.ecuvariantpatterns = ecuvariantpatterns;
    }

    public void setPARENTREFS(PARENTREFS parentrefs) {
        this.parentrefs = parentrefs;
    }

    public void setVARIABLEGROUPS(VARIABLEGROUPS variablegroups) {
        this.variablegroups = variablegroups;
    }
}
