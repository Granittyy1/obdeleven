package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DIAG-LAYER-REFS")
public class DIAGLAYERREFS {

    @ElementList(entry = "DIAG-LAYER-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> diaglayerref;

    public List<ODXLINK> getDIAGLAYERREF() {
        if (this.diaglayerref == null) {
            this.diaglayerref = new ArrayList();
        }
        return this.diaglayerref;
    }
}
