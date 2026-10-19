package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PARAMS")
public class PARAMS {

    @ElementList(inline = true, name = "PARAM", required = true, type = PARAM.class)
    protected List<PARAM> param;

    public List<PARAM> getPARAM() {
        if (this.param == null) {
            this.param = new ArrayList();
        }
        return this.param;
    }
}
