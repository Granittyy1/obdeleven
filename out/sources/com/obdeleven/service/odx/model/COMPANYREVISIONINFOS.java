package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPANY-REVISION-INFOS")
public class COMPANYREVISIONINFOS {

    @ElementList(inline = true, name = "COMPANY-REVISIONINFO", required = true, type = COMPANYREVISIONINFO.class)
    protected List<COMPANYREVISIONINFO> companyrevisioninfo;

    public List<COMPANYREVISIONINFO> getCOMPANYREVISIONINFO() {
        if (this.companyrevisioninfo == null) {
            this.companyrevisioninfo = new ArrayList();
        }
        return this.companyrevisioninfo;
    }
}
