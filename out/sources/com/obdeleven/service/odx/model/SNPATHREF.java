package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SNPATHREF")
public class SNPATHREF {

    @Attribute(name = "SHORT-NAME-PATH", required = true)
    protected String shortnamepath;

    public String getSHORTNAMEPATH() {
        return this.shortnamepath;
    }

    public void setSHORTNAMEPATH(String str) {
        this.shortnamepath = str;
    }
}
