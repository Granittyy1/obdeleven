package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DOP-REF", "DOP-SNREF"})
@Root(name = "SYSTEM")
public class SYSTEM extends POSITIONABLEPARAM {

    @Element(name = "DOP-REF")
    protected ODXLINK dopref;

    @Element(name = "DOP-SNREF")
    protected SNREF dopsnref;

    @Attribute(name = "SYSPARAM", required = true)
    protected String sysparam;

    @Override // com.obdeleven.service.odx.model.PARAM
    public ODXLINK getDOPREF() {
        return this.dopref;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public SNREF getDOPSNREF() {
        return this.dopsnref;
    }

    public String getSYSPARAM() {
        return this.sysparam;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDOPREF(ODXLINK odxlink) {
        this.dopref = odxlink;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDOPSNREF(SNREF snref) {
        this.dopsnref = snref;
    }

    public void setSYSPARAM(String str) {
        this.sysparam = str;
    }
}
