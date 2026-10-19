package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MODIFICATIONS")
public class MODIFICATIONS {

    @ElementList(inline = true, name = "MODIFICATION", required = true, type = MODIFICATION.class)
    protected List<MODIFICATION> modification;

    public List<MODIFICATION> getMODIFICATION() {
        if (this.modification == null) {
            this.modification = new ArrayList();
        }
        return this.modification;
    }
}
