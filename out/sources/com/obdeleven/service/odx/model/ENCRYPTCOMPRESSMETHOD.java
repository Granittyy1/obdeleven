package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENCRYPT-COMPRESS-METHOD")
public class ENCRYPTCOMPRESSMETHOD {

    @Attribute(name = "TYPE", required = true)
    @Convert(ENCRYPTCOMPRESSMETHODTYPE.Converter.class)
    protected ENCRYPTCOMPRESSMETHODTYPE type;

    @Text
    protected String value;

    public ENCRYPTCOMPRESSMETHODTYPE getTYPE() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setTYPE(ENCRYPTCOMPRESSMETHODTYPE encryptcompressmethodtype) {
        this.type = encryptcompressmethodtype;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
