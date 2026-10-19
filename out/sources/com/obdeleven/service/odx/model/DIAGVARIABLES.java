package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DIAG-VARIABLES")
public class DIAGVARIABLES {

    @ElementListUnion({@ElementList(inline = true, name = "DIAG-VARIABLE-REF", type = ODXLINK.class), @ElementList(inline = true, name = "DIAG-VARIABLE", type = DIAGVARIABLE.class)})
    protected List<Object> diagvariableproxy;

    public List<Object> getDIAGVARIABLEPROXY() {
        if (this.diagvariableproxy == null) {
            this.diagvariableproxy = new ArrayList();
        }
        return this.diagvariableproxy;
    }
}
