package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-PROXY-REFS")
public class ECUPROXYREFS {

    @ElementList(entry = "ECU-PROXY-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> ecuproxyref;

    public List<ODXLINK> getECUPROXYREF() {
        if (this.ecuproxyref == null) {
            this.ecuproxyref = new ArrayList();
        }
        return this.ecuproxyref;
    }
}
