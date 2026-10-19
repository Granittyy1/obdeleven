package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"NEG-OUTPUT-PARAM"})
@Root(name = "NEG-OUTPUT-PARAMS")
public class NEGOUTPUTPARAMS {

    @ElementList(inline = true, name = "NEG-OUTPUT-PARAM", required = true, type = NEGOUTPUTPARAM.class)
    protected List<NEGOUTPUTPARAM> negoutputparam;

    public List<NEGOUTPUTPARAM> getNEGOUTPUTPARAM() {
        if (this.negoutputparam == null) {
            this.negoutputparam = new ArrayList();
        }
        return this.negoutputparam;
    }
}
