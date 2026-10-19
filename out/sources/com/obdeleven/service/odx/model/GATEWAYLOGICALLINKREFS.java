package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "GATEWAY-LOGICAL-LINK-REFS")
public class GATEWAYLOGICALLINKREFS {

    @ElementList(entry = "GATEWAY-LOGICAL-LINK-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> gatewaylogicallinkref;

    public List<ODXLINK> getGATEWAYLOGICALLINKREF() {
        if (this.gatewaylogicallinkref == null) {
            this.gatewaylogicallinkref = new ArrayList();
        }
        return this.gatewaylogicallinkref;
    }
}
