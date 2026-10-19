package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PARAM-LENGTH-INFO-TYPE")
public class PARAMLENGTHINFOTYPE extends DIAGCODEDTYPE {

    @Element(name = "LENGTH-KEY-REF", required = true)
    protected ODXLINK lengthkeyref;

    public ODXLINK getLENGTHKEYREF() {
        return this.lengthkeyref;
    }

    public void setLENGTHKEYREF(ODXLINK odxlink) {
        this.lengthkeyref = odxlink;
    }
}
