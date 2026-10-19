package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ALL-VARIANT-REF"})
@Root(name = "ALL-VARIANT-REFS")
public class ALLVARIANTREFS {

    @ElementList(entry = "ALL-VARIANT-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> allvariantref;

    public List<ODXLINK> getALLVARIANTREF() {
        if (this.allvariantref == null) {
            this.allvariantref = new ArrayList();
        }
        return this.allvariantref;
    }
}
