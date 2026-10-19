package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCT-CLASS-REFS")
public class FUNCTCLASSREFS {

    @ElementList(entry = "FUNCT-CLASS-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> functclassref;

    public List<ODXLINK> getFUNCTCLASSREF() {
        if (this.functclassref == null) {
            this.functclassref = new ArrayList();
        }
        return this.functclassref;
    }
}
