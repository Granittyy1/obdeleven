package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "INFO-COMPONENT-REFS")
public class INFOCOMPONENTREFS {

    @ElementList(entry = "INFO-COMPONENT-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> infocomponentref;

    public List<ODXLINK> getINFOCOMPONENTREF() {
        if (this.infocomponentref == null) {
            this.infocomponentref = new ArrayList();
        }
        return this.infocomponentref;
    }
}
