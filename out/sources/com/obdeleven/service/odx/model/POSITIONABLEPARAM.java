package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BYTE-POSITION", "BIT-POSITION"})
@Root(name = "POSITIONABLE-PARAM")
public class POSITIONABLEPARAM extends PARAM {

    @Element(name = "BIT-POSITION")
    protected int bitposition;

    @Element(name = "BYTE-POSITION")
    protected int byteposition;

    @Override // com.obdeleven.service.odx.model.PARAM
    public int getBITPOSITION() {
        return this.bitposition;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public int getBYTEPOSITION() {
        return this.byteposition;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setBITPOSITION(int i10) {
        this.bitposition = i10;
    }

    @Override // com.obdeleven.service.odx.model.PARAM
    public void setBYTEPOSITION(int i10) {
        this.byteposition = i10;
    }
}
