package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"REQUEST-BYTE-POS", "BYTE-LENGTH"})
@Root(name = "MATCHING-REQUEST-PARAM")
public class MATCHINGREQUESTPARAM extends POSITIONABLEPARAM {

    @Element(name = "BYTE-LENGTH")
    protected long bytelength;

    @Element(name = "REQUEST-BYTE-POS")
    protected int requestbytepos;

    public long getBYTELENGTH() {
        return this.bytelength;
    }

    public int getREQUESTBYTEPOS() {
        return this.requestbytepos;
    }

    public void setBYTELENGTH(long j) {
        this.bytelength = j;
    }

    public void setREQUESTBYTEPOS(int i10) {
        this.requestbytepos = i10;
    }
}
