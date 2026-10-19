package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "GATEWAY-LOGICAL-LINK")
public class GATEWAYLOGICALLINK extends LOGICALLINK {

    @Element(name = "SEMANTIC")
    protected String semantic;

    public String getSEMANTIC() {
        return this.semantic;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }
}
