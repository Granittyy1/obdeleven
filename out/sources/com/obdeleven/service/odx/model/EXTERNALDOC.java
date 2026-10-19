package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "EXTERNAL-DOC")
public class EXTERNALDOC {

    @Attribute(name = "HREF", required = true)
    protected String href;

    @Text
    protected String value;

    public String getHREF() {
        return this.href;
    }

    public String getValue() {
        return this.value;
    }

    public void setHREF(String str) {
        this.href = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
