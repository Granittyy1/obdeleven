package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYSICAL-DEFAULT-VALUE", "DOP-REF", "DOP-SNREF"})
@Root(name = "VALUE")
public class VALUE extends POSITIONABLEPARAM {

    @Element(name = "DOP-REF")
    protected ODXLINK dopref;

    @Element(name = "DOP-SNREF")
    protected SNREF dopsnref;

    @Element(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;

    @Override // com.obdeleven.service.odx.model.PARAM
    public ODXLINK getDOPREF() {
        return this.dopref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public SNREF getDOPSNREF() {
        return this.dopsnref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public String getPHYSICALDEFAULTVALUE() {
        return this.physicaldefaultvalue;
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
    public void setPHYSICALDEFAULTVALUE(String str) {
        this.physicaldefaultvalue = str;
    }
}
