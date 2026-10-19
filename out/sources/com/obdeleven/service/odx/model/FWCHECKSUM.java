package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FW-CHECKSUM")
public class FWCHECKSUM {

    @Attribute(name = "TYPE", required = true)
    @Convert(SESSIONSUBELEMTYPE.Converter.class)
    protected SESSIONSUBELEMTYPE type;

    @Text
    protected String value;

    public SESSIONSUBELEMTYPE getTYPE() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setTYPE(SESSIONSUBELEMTYPE sessionsubelemtype) {
        this.type = sessionsubelemtype;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
