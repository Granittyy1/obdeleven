package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "IDENT-VALUE")
public class IDENTVALUE {

    @Attribute(name = "TYPE", required = true)
    @Convert(IDENTVALUETYPE.Converter.class)
    protected IDENTVALUETYPE type;

    @Text
    protected String value;

    public IDENTVALUETYPE getTYPE() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setTYPE(IDENTVALUETYPE identvaluetype) {
        this.type = identvaluetype;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
