package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ROLES")
public class ROLES {

    @ElementList(entry = "ROLE", inline = true, required = true, type = String.class)
    protected List<String> role;

    public List<String> getROLE() {
        if (this.role == null) {
            this.role = new ArrayList();
        }
        return this.role;
    }
}
