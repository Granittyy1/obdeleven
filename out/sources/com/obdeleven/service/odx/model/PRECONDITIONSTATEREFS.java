package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PRE-CONDITION-STATE-REFS")
public class PRECONDITIONSTATEREFS {

    @ElementList(inline = true, name = "PRE-CONDITIONSTATE-REF", required = true, type = PRECONDITIONSTATEREF.class)
    protected List<PRECONDITIONSTATEREF> preconditionstateref;

    public List<PRECONDITIONSTATEREF> getPRECONDITIONSTATEREF() {
        if (this.preconditionstateref == null) {
            this.preconditionstateref = new ArrayList();
        }
        return this.preconditionstateref;
    }
}
