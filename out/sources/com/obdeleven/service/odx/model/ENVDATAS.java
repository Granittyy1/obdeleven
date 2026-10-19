package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENV-DATAS")
public class ENVDATAS {

    @ElementList(inline = true, name = "ENV-DATA", required = true, type = ENVDATA.class)
    protected List<ENVDATA> envdata;

    public List<ENVDATA> getENVDATA() {
        if (this.envdata == null) {
            this.envdata = new ArrayList();
        }
        return this.envdata;
    }
}
