package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTIONAL-GROUPS")
public class FUNCTIONALGROUPS {

    @ElementList(inline = true, name = "FUNCTIONAL-GROUP", required = true, type = FUNCTIONALGROUP.class)
    protected List<FUNCTIONALGROUP> functionalgroup;

    public List<FUNCTIONALGROUP> getFUNCTIONALGROUP() {
        if (this.functionalgroup == null) {
            this.functionalgroup = new ArrayList();
        }
        return this.functionalgroup;
    }
}
