package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SNREF")
public class SNREF {

    @Attribute(name = "SHORT-NAME", required = true)
    protected String shortname;

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
