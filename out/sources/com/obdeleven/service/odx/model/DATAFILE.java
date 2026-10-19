package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATAFILE")
public class DATAFILE {

    @Attribute(name = "LATEBOUND-DATAFILE", required = true)
    protected boolean latebounddatafile;

    @Text
    protected String value;

    public String getValue() {
        return this.value;
    }

    public boolean isLATEBOUNDDATAFILE() {
        return this.latebounddatafile;
    }

    public void setLATEBOUNDDATAFILE(boolean z10) {
        this.latebounddatafile = z10;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
