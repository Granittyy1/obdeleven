package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-VARIABLE")
public class NOTINHERITEDVARIABLE {

    @Element(name = "DIAG-VARIABLE-SNREF", required = true)
    protected SNREF diagvariablesnref;

    public SNREF getDIAGVARIABLESNREF() {
        return this.diagvariablesnref;
    }

    public void setDIAGVARIABLESNREF(SNREF snref) {
        this.diagvariablesnref = snref;
    }
}
