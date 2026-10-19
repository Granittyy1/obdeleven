package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYSICAL-DEFAULT-VALUE", "DATA-OBJECT-PROP-REF"})
@Root(name = "COMPARAM")
public class COMPARAM extends BASECOMPARAM {

    @Element(name = "DATA-OBJECT-PROP-REF", required = true)
    protected ODXLINK dataobjectpropref;

    @Element(name = "PHYSICAL-DEFAULT-VALUE", required = true)
    protected String physicaldefaultvalue;

    public ODXLINK getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public String getPHYSICALDEFAULTVALUE() {
        return this.physicaldefaultvalue;
    }

    public void setDATAOBJECTPROPREF(ODXLINK odxlink) {
        this.dataobjectpropref = odxlink;
    }

    public void setPHYSICALDEFAULTVALUE(String str) {
        this.physicaldefaultvalue = str;
    }
}
