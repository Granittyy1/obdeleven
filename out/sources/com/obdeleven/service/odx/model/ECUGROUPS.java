package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-GROUPS")
public class ECUGROUPS {

    @ElementList(inline = true, name = "ECU-GROUP", required = true, type = ECUGROUP.class)
    protected List<ECUGROUP> ecugroup;

    public List<ECUGROUP> getECUGROUP() {
        if (this.ecugroup == null) {
            this.ecugroup = new ArrayList();
        }
        return this.ecugroup;
    }
}
