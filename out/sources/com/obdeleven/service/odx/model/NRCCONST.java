package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CODED-VALUES", "DIAG-CODED-TYPE"})
@Root(name = "NRC-CONST")
public class NRCCONST extends POSITIONABLEPARAM {

    @Element(name = "CODED-VALUES", required = true)
    protected CODEDVALUES codedvalues;

    @Element(name = "DIAG-CODED-TYPE", required = true)
    protected DIAGCODEDTYPE diagcodedtype;

    public CODEDVALUES getCODEDVALUES() {
        return this.codedvalues;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return this.diagcodedtype;
    }

    public void setCODEDVALUES(CODEDVALUES codedvalues) {
        this.codedvalues = codedvalues;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setDIAGCODEDTYPE(DIAGCODEDTYPE diagcodedtype) {
        this.diagcodedtype = diagcodedtype;
    }
}
