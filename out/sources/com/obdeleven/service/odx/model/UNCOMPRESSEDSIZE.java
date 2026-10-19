package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "UNCOMPRESSED-SIZE")
public class UNCOMPRESSEDSIZE {

    @Text
    protected long value;

    public long getValue() {
        return this.value;
    }

    public void setValue(long j) {
        this.value = j;
    }
}
