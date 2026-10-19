package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-OUT-PARAMS")
public class FUNCTIONOUTPARAMS {

    @ElementList(inline = true, name = "FUNCTION-OUT-PARAM", required = true, type = FUNCTIONINPARAM.class)
    protected List<FUNCTIONOUTPARAM> functionoutparam;

    public List<FUNCTIONOUTPARAM> getFUNCTIONOUTPARAM() {
        if (this.functionoutparam == null) {
            this.functionoutparam = new ArrayList();
        }
        return this.functionoutparam;
    }
}
