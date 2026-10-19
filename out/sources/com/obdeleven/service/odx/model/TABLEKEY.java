package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "TABLE-KEY")
public class TABLEKEY extends POSITIONABLEPARAM {

    @Attribute(name = "ID")
    protected String id;

    @ElementUnion({@Element(name = "TABLE-ROW-REF", required = false, type = ODXLINK.class), @Element(name = "TABLE-REF", required = false, type = ODXLINK.class), @Element(name = "TABLE-ROW-SNREF", required = false, type = SNREF.class), @Element(name = "TABLE-SNREF", required = false, type = SNREF.class)})
    protected Object rest;

    @Override // com.obdeleven.service.odx.model.PARAM
    public String getID() {
        return this.id;
    }

    public Object getRest() {
        return this.rest;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setID(String str) {
        this.id = str;
    }
}
