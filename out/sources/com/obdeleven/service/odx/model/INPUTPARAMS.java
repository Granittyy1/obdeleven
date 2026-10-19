package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "INPUT-PARAMS")
public class INPUTPARAMS {

    @ElementList(inline = true, name = "INPUT-PARAM", required = true, type = INPUTPARAM.class)
    protected List<INPUTPARAM> inputparam;

    public List<INPUTPARAM> getINPUTPARAM() {
        if (this.inputparam == null) {
            this.inputparam = new ArrayList();
        }
        return this.inputparam;
    }
}
