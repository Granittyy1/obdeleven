package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"TABLE-KEY-REF", "TABLE-KEY-SNREF"})
@Root(name = "TABLE-STRUCT")
public class TABLESTRUCT extends POSITIONABLEPARAM {

    @Element(name = "TABLE-KEY-REF")
    protected ODXLINK tablekeyref;

    @Element(name = "TABLE-KEY-SNREF")
    protected SNREF tablekeysnref;

    public ODXLINK getTABLEKEYREF() {
        return this.tablekeyref;
    }

    public SNREF getTABLEKEYSNREF() {
        return this.tablekeysnref;
    }

    public void setTABLEKEYREF(ODXLINK odxlink) {
        this.tablekeyref = odxlink;
    }

    public void setTABLEKEYSNREF(SNREF snref) {
        this.tablekeysnref = snref;
    }
}
