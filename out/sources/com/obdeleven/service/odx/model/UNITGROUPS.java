package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "UNIT-GROUPS")
public class UNITGROUPS {

    @ElementList(inline = true, name = "UNIT-GROUP", required = true, type = UNITGROUP.class)
    protected List<UNITGROUP> unitgroup;

    public List<UNITGROUP> getUNITGROUP() {
        if (this.unitgroup == null) {
            this.unitgroup = new ArrayList();
        }
        return this.unitgroup;
    }
}
