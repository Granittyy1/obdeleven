package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENV-DATA-DESCS")
public class ENVDATADESCS {

    @ElementList(inline = true, name = "ENV-DATA-DESC", required = true, type = ENVDATADESC.class)
    protected List<ENVDATADESC> envdatadesc;

    public List<ENVDATADESC> getENVDATADESC() {
        if (this.envdatadesc == null) {
            this.envdatadesc = new ArrayList();
        }
        return this.envdatadesc;
    }
}
