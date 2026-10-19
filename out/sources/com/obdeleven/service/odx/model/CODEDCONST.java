package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CODED-VALUE", "DIAG-CODED-TYPE"})
@Root(name = "CODED-CONST")
public class CODEDCONST extends POSITIONABLEPARAM {

    @Element(name = "CODED-VALUE", required = true)
    protected String codedvalue;

    @Element(name = "DIAG-CODED-TYPE", required = true)
    protected DIAGCODEDTYPE diagcodedtype;

    @Override // com.obdeleven.service.odx.model.PARAM
    public String getCODEDVALUE() {
        return this.codedvalue;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return this.diagcodedtype;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setCODEDVALUE(String str) {
        this.codedvalue = str;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDIAGCODEDTYPE(DIAGCODEDTYPE diagcodedtype) {
        this.diagcodedtype = diagcodedtype;
    }
}
