package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATA")
public class DATA {

    @Text
    protected String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
