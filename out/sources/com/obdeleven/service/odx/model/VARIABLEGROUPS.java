package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"VARIABLE-GROUP"})
@Root(name = "VARIABLE-GROUPS")
public class VARIABLEGROUPS {

    @ElementList(inline = true, name = "VARIABLE-GROUP", required = true, type = VARIABLEGROUP.class)
    protected List<VARIABLEGROUP> variablegroup;

    public List<VARIABLEGROUP> getVARIABLEGROUP() {
        if (this.variablegroup == null) {
            this.variablegroup = new ArrayList();
        }
        return this.variablegroup;
    }
}
