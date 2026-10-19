package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPANY-DOC-INFOS")
public class COMPANYDOCINFOS {

    @ElementList(inline = true, name = "COMPANY-DOC-INFO", required = true, type = COMPANYDOCINFO.class)
    protected List<COMPANYDOCINFO> companydocinfo;

    public List<COMPANYDOCINFO> getCOMPANYDOCINFO() {
        if (this.companydocinfo == null) {
            this.companydocinfo = new ArrayList();
        }
        return this.companydocinfo;
    }
}
