package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "END-OF-PDU-FIELDS")
public class ENDOFPDUFIELDS {

    @ElementList(inline = true, name = "END-OF-PDU-FIELD", required = true, type = ENDOFPDUFIELD.class)
    protected List<ENDOFPDUFIELD> endofpdufield;

    public List<ENDOFPDUFIELD> getENDOFPDUFIELD() {
        if (this.endofpdufield == null) {
            this.endofpdufield = new ArrayList();
        }
        return this.endofpdufield;
    }
}
