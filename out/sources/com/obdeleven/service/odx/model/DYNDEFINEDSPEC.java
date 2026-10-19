package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYN-DEFINED-SPEC")
public class DYNDEFINEDSPEC {

    @Element(name = "DYN-ID-DEF-MODE-INFOS")
    protected DYNIDDEFMODEINFOS dyniddefmodeinfos;

    public DYNIDDEFMODEINFOS getDYNIDDEFMODEINFOS() {
        return this.dyniddefmodeinfos;
    }

    public void setDYNIDDEFMODEINFOS(DYNIDDEFMODEINFOS dyniddefmodeinfos) {
        this.dyniddefmodeinfos = dyniddefmodeinfos;
    }
}
