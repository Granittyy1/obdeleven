package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATA-OBJECT-PROPS")
public class DATAOBJECTPROPS {

    @ElementList(inline = true, name = "DATA-OBJECT-PROP", required = true, type = DATAOBJECTPROP.class)
    protected List<DATAOBJECTPROP> dataobjectprop;

    public List<DATAOBJECTPROP> getDATAOBJECTPROP() {
        if (this.dataobjectprop == null) {
            this.dataobjectprop = new ArrayList();
        }
        return this.dataobjectprop;
    }
}
