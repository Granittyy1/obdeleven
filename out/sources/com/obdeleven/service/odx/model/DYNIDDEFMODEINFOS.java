package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYN-ID-DEF-MODE-INFOS")
public class DYNIDDEFMODEINFOS {

    @ElementList(inline = true, name = "DYN-ID-DEF-MODEINFO", required = true, type = DYNIDDEFMODEINFO.class)
    protected List<DYNIDDEFMODEINFO> dyniddefmodeinfo;

    public List<DYNIDDEFMODEINFO> getDYNIDDEFMODEINFO() {
        if (this.dyniddefmodeinfo == null) {
            this.dyniddefmodeinfo = new ArrayList();
        }
        return this.dyniddefmodeinfo;
    }
}
