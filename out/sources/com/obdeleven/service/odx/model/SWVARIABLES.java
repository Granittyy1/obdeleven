package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SW-VARIABLES")
public class SWVARIABLES {

    @ElementList(inline = true, name = "SW-VARIABLE", required = true, type = SWVARIABLE.class)
    protected List<SWVARIABLE> swvariable;

    public List<SWVARIABLE> getSWVARIABLE() {
        if (this.swvariable == null) {
            this.swvariable = new ArrayList();
        }
        return this.swvariable;
    }
}
