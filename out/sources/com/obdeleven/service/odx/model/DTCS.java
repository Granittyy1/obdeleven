package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DTCS")
public class DTCS {

    @ElementListUnion({@ElementList(entry = "DTC-REF", inline = true, type = ODXLINK.class), @ElementList(inline = true, name = "DTC", type = DTC.class)})
    protected List<Object> dtcproxy;

    public List<Object> getDTCPROXY() {
        if (this.dtcproxy == null) {
            this.dtcproxy = new ArrayList();
        }
        return this.dtcproxy;
    }
}
