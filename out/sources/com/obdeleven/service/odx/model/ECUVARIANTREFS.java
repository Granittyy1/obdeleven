package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-VARIANT-REFS")
public class ECUVARIANTREFS {

    @ElementList(entry = "ECU-VARIANT-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> ecuvariantref;

    public List<ODXLINK> getECUVARIANTREF() {
        if (this.ecuvariantref == null) {
            this.ecuvariantref = new ArrayList();
        }
        return this.ecuvariantref;
    }
}
