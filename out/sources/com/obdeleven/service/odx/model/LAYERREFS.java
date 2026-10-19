package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LAYER-REFS")
public class LAYERREFS {

    @ElementList(entry = "LAYER-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> layerref;

    public List<ODXLINK> getLAYERREF() {
        if (this.layerref == null) {
            this.layerref = new ArrayList();
        }
        return this.layerref;
    }
}
