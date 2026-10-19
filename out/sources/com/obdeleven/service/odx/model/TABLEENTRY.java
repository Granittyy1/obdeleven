package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"TARGET", "TABLE-ROW-REF"})
@Root(name = "TABLE-ENTRY")
public class TABLEENTRY extends POSITIONABLEPARAM {

    @Element(name = "TABLE-ROW-REF", required = true)
    protected ODXLINK tablerowref;

    @Element(name = "TARGET", required = true)
    @Convert(ROWFRAGMENT.Converter.class)
    protected ROWFRAGMENT target;

    public ODXLINK getTABLEROWREF() {
        return this.tablerowref;
    }

    public ROWFRAGMENT getTARGET() {
        return this.target;
    }

    public void setTABLEROWREF(ODXLINK odxlink) {
        this.tablerowref = odxlink;
    }

    public void setTARGET(ROWFRAGMENT rowfragment) {
        this.target = rowfragment;
    }
}
