package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SD")
public class SD {

    @Attribute(name = "SI")
    protected String si;

    @Attribute(name = "TI")
    protected String ti;

    @Text
    protected String value;

    public String getSI() {
        return this.si;
    }

    public String getTI() {
        return this.ti;
    }

    public String getValue() {
        return this.value;
    }

    public void setSI(String str) {
        this.si = str;
    }

    public void setTI(String str) {
        this.ti = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
