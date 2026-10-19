package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "GROUP-MEMBERS")
public class GROUPMEMBERS {

    @ElementList(inline = true, name = "GROUP-MEMBER", required = true, type = GROUPMEMBER.class)
    protected List<GROUPMEMBER> groupmember;

    public List<GROUPMEMBER> getGROUPMEMBER() {
        if (this.groupmember == null) {
            this.groupmember = new ArrayList();
        }
        return this.groupmember;
    }
}
