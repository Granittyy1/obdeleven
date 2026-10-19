package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYS-CONSTANT-VALUE", "DOP-REF", "DOP-SNREF"})
@Root(name = "PHYS-CONST")
public class PHYSCONST extends POSITIONABLEPARAM {

    @Element(name = "DOP-REF")
    protected ODXLINK dopref;

    @Element(name = "DOP-SNREF")
    protected SNREF dopsnref;

    @Element(name = "PHYS-CONSTANT-VALUE", required = true)
    protected String physconstantvalue;

    @Override // com.obdeleven.service.odx.model.PARAM
    public ODXLINK getDOPREF() {
        return this.dopref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public SNREF getDOPSNREF() {
        return this.dopsnref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public String getPHYSCONSTANTVALUE() {
        return this.physconstantvalue;
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
    public void setPHYSCONSTANTVALUE(String str) {
        this.physconstantvalue = str;
    }
}
