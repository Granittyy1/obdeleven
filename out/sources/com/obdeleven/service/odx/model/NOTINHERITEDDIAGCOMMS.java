package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-DIAG-COMMS")
public class NOTINHERITEDDIAGCOMMS {

    @ElementList(inline = true, name = "NOT-INHERITEDDIAG-COMM", required = true, type = NOTINHERITEDDIAGCOMM.class)
    protected List<NOTINHERITEDDIAGCOMM> notinheriteddiagcomm;

    public List<NOTINHERITEDDIAGCOMM> getNOTINHERITEDDIAGCOMM() {
        if (this.notinheriteddiagcomm == null) {
            this.notinheriteddiagcomm = new ArrayList();
        }
        return this.notinheriteddiagcomm;
    }
}
