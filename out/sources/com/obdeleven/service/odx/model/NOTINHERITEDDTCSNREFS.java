package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-DTC-SNREFS")
public class NOTINHERITEDDTCSNREFS {

    @ElementList(inline = true, name = "NOT-INHERITED-DTC-SNREF", required = true, type = SNREF.class)
    protected List<SNREF> notinheriteddtcsnref;

    public List<SNREF> getNOTINHERITEDDTCSNREF() {
        if (this.notinheriteddtcsnref == null) {
            this.notinheriteddtcsnref = new ArrayList();
        }
        return this.notinheriteddtcsnref;
    }
}
