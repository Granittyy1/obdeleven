package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "INTERN-FLASHDATA")
public class INTERNFLASHDATA extends FLASHDATA {

    @Element(name = "DATA", required = true)
    protected String data;

    public String getDATA() {
        return this.data;
    }

    public void setDATA(String str) {
        this.data = str;
    }
}
