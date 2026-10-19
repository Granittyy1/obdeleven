package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FLASH-CLASS-REFS")
public class FLASHCLASSREFS {

    @ElementList(entry = "FLASH-CLASS-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> flashclassref;

    public List<ODXLINK> getFLASHCLASSREF() {
        if (this.flashclassref == null) {
            this.flashclassref = new ArrayList();
        }
        return this.flashclassref;
    }
}
