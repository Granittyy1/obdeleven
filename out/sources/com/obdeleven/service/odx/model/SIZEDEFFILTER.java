package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SIZEDEF-FILTER")
public class SIZEDEFFILTER extends FILTER {

    @Element(name = "FILTER-SIZE")
    protected long filtersize;

    public long getFILTERSIZE() {
        return this.filtersize;
    }

    public void setFILTERSIZE(long j) {
        this.filtersize = j;
    }
}
