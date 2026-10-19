package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PHYS-SEGMENTS")
public class PHYSSEGMENTS {

    @ElementList(inline = true, name = "PHYS-SEGMENT", required = true, type = PHYSSEGMENT.class)
    protected List<PHYSSEGMENT> physsegment;

    public List<PHYSSEGMENT> getPHYSSEGMENT() {
        if (this.physsegment == null) {
            this.physsegment = new ArrayList();
        }
        return this.physsegment;
    }
}
