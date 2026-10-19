package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DOP-REF", "DOP-SNREF"})
@Root(name = "LENGTH-KEY")
public class LENGTHKEY extends POSITIONABLEPARAM {

    @Element(name = "DOP-REF")
    protected ODXLINK dopref;

    @Element(name = "DOP-SNREF")
    protected SNREF dopsnref;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Override // com.obdeleven.service.odx.model.PARAM
    public ODXLINK getDOPREF() {
        return this.dopref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public SNREF getDOPSNREF() {
        return this.dopsnref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public String getID() {
        return this.id;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDOPREF(ODXLINK odxlink) {
        this.dopref = odxlink;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDOPSNREF(SNREF snref) {
        this.dopsnref = snref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setID(String str) {
        this.id = str;
    }
}
