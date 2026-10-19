package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SIZEDEF-PHYS-SEGMENT")
public class SIZEDEFPHYSSEGMENT extends PHYSSEGMENT {

    @Element(name = "SIZE")
    protected long size;

    public long getSIZE() {
        return this.size;
    }

    public void setSIZE(long j) {
        this.size = j;
    }
}
