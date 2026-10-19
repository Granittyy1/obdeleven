package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPU-SCALES")
public class COMPUSCALES {

    @ElementList(inline = true, name = "COMPU-SCALE", required = true, type = COMPUSCALE.class)
    protected List<COMPUSCALE> compuscale;

    public List<COMPUSCALE> getCOMPUSCALE() {
        if (this.compuscale == null) {
            this.compuscale = new ArrayList();
        }
        return this.compuscale;
    }
}
