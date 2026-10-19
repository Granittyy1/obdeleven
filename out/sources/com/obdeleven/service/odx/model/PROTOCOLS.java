package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PROTOCOLS")
public class PROTOCOLS {

    @ElementList(inline = true, name = "PROTOCOL", required = true, type = PROTOCOL.class)
    protected List<PROTOCOL> protocol;

    public List<PROTOCOL> getPROTOCOL() {
        if (this.protocol == null) {
            this.protocol = new ArrayList();
        }
        return this.protocol;
    }
}
