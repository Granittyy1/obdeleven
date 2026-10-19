package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SEGMENTS")
public class SEGMENTS {

    @ElementList(inline = true, name = "SEGMENT", required = true, type = SEGMENT.class)
    protected List<SEGMENT> segment;

    public List<SEGMENT> getSEGMENT() {
        if (this.segment == null) {
            this.segment = new ArrayList();
        }
        return this.segment;
    }
}
