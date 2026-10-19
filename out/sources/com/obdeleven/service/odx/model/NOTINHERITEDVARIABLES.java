package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-VARIABLES")
public class NOTINHERITEDVARIABLES {

    @ElementList(inline = true, name = "NOT-INHERITEDVARIABLE", required = true, type = NOTINHERITEDVARIABLE.class)
    protected List<NOTINHERITEDVARIABLE> notinheritedvariable;

    public List<NOTINHERITEDVARIABLE> getNOTINHERITEDVARIABLE() {
        if (this.notinheritedvariable == null) {
            this.notinheritedvariable = new ArrayList();
        }
        return this.notinheritedvariable;
    }
}
