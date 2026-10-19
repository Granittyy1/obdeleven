package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPANY-DATA"})
@Root(name = "COMPANY-DATAS")
public class COMPANYDATAS {

    @ElementList(inline = true, name = "COMPANY-DATA", required = true, type = COMPANYDATA.class)
    protected List<COMPANYDATA> companydata;

    public List<COMPANYDATA> getCOMPANYDATA() {
        if (this.companydata == null) {
            this.companydata = new ArrayList();
        }
        return this.companydata;
    }
}
