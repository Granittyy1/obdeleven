package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "TEAM-MEMBERS")
public class TEAMMEMBERS {

    @ElementList(inline = true, name = "TEAM-MEMBER", required = true, type = TEAMMEMBER.class)
    protected List<TEAMMEMBER> teammember;

    public List<TEAMMEMBER> getTEAMMEMBER() {
        if (this.teammember == null) {
            this.teammember = new ArrayList();
        }
        return this.teammember;
    }
}
