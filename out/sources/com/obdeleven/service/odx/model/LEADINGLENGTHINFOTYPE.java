package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LEADING-LENGTH-INFO-TYPE")
public class LEADINGLENGTHINFOTYPE extends DIAGCODEDTYPE {

    @Element(name = "BIT-LENGTH")
    protected long bitlength;

    public long getBITLENGTH() {
        return this.bitlength;
    }

    public void setBITLENGTH(long j) {
        this.bitlength = j;
    }
}
