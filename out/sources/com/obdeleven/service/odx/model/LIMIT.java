package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LIMIT")
public class LIMIT {

    @Attribute(name = "INTERVAL-TYPE")
    @Convert(INTERVALTYPE.Converter.class)
    protected INTERVALTYPE intervaltype;

    @Text
    protected String value;

    public INTERVALTYPE getINTERVALTYPE() {
        INTERVALTYPE intervaltype = this.intervaltype;
        return intervaltype == null ? INTERVALTYPE.CLOSED : intervaltype;
    }

    public String getValue() {
        return this.value;
    }

    public void setINTERVALTYPE(INTERVALTYPE intervaltype) {
        this.intervaltype = intervaltype;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
