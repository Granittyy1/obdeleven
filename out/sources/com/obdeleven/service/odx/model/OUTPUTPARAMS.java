package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "OUTPUT-PARAMS")
public class OUTPUTPARAMS {

    @ElementList(inline = true, name = "OUTPUT-PARAM", required = true, type = OUTPUTPARAM.class)
    protected List<OUTPUTPARAM> outputparam;

    public List<OUTPUTPARAM> getOUTPUTPARAM() {
        if (this.outputparam == null) {
            this.outputparam = new ArrayList();
        }
        return this.outputparam;
    }
}
