package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SYSTEM-ITEM")
public class SYSTEMITEM extends CONFIGITEM {

    @Attribute(name = "SYSPARAM", required = true)
    protected String sysparam;

    public String getSYSPARAM() {
        return this.sysparam;
    }

    public void setSYSPARAM(String str) {
        this.sysparam = str;
    }
}
