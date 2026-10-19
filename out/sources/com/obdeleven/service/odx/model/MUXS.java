package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MUXS")
public class MUXS {

    @ElementList(inline = true, name = "MUX", required = true, type = MUX.class)
    protected List<MUX> mux;

    public List<MUX> getMUX() {
        if (this.mux == null) {
            this.mux = new ArrayList();
        }
        return this.mux;
    }
}
