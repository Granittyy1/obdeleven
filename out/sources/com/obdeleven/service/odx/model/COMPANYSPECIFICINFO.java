package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"RELATED-DOCS", "SDGS"})
@Root(name = "COMPANY-SPECIFIC-INFO")
public class COMPANYSPECIFICINFO {

    @Element(name = "RELATED-DOCS")
    protected RELATEDDOCS relateddocs;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    public RELATEDDOCS getRELATEDDOCS() {
        return this.relateddocs;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public void setRELATEDDOCS(RELATEDDOCS relateddocs) {
        this.relateddocs = relateddocs;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }
}
