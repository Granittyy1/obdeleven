package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "RESERVED")
public class RESERVED extends POSITIONABLEPARAM {

    @Element(name = "BIT-LENGTH")
    protected long bitlength;

    @Override // com.obdeleven.service.odx.model.PARAM
    public long getBITLENGTH() {
        return this.bitlength;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setBITLENGTH(long j) {
        this.bitlength = j;
    }
}
