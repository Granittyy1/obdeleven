package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PROT-STACKS"})
@Root(name = "COMPARAM-SPEC")
public class COMPARAMSPEC extends ODXCATEGORY {

    @Element(name = "PROT-STACKS")
    protected PROTSTACKS protstacks;

    public PROTSTACKS getPROTSTACKS() {
        return this.protstacks;
    }

    public void setPROTSTACKS(PROTSTACKS protstacks) {
        this.protstacks = protstacks;
    }
}
