package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-IN-PARAMS")
public class FUNCTIONINPARAMS {

    @ElementList(inline = true, name = "FUNCTION-IN-PARAM", required = true, type = FUNCTIONINPARAM.class)
    protected List<FUNCTIONINPARAM> functioninparam;

    public List<FUNCTIONINPARAM> getFUNCTIONINPARAM() {
        if (this.functioninparam == null) {
            this.functioninparam = new ArrayList();
        }
        return this.functioninparam;
    }
}
