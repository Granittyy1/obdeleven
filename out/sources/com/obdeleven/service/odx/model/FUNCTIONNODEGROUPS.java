package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"FUNCTION-NODE-GROUP"})
@Root(name = "FUNCTION-NODE-GROUPS")
public class FUNCTIONNODEGROUPS {

    @ElementList(inline = true, name = "FUNCTION-NODE-GROUP", required = true, type = FUNCTIONALGROUP.class)
    protected List<FUNCTIONNODEGROUP> functionnodegroup;

    public List<FUNCTIONNODEGROUP> getFUNCTIONNODEGROUP() {
        if (this.functionnodegroup == null) {
            this.functionnodegroup = new ArrayList();
        }
        return this.functionnodegroup;
    }
}
