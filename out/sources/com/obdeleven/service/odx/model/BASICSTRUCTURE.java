package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BYTE-SIZE", "PARAMS"})
@Root(name = "BASIC-STRUCTURE")
public class BASICSTRUCTURE extends COMPLEXDOP {

    @Element(name = "BYTE-SIZE")
    protected int bytesize;

    @Element(name = "PARAMS")
    protected PARAMS params;

    public int getBYTESIZE() {
        return this.bytesize;
    }

    public PARAMS getPARAMS() {
        return this.params;
    }

    public void setBYTESIZE(int i10) {
        this.bytesize = i10;
    }

    public void setPARAMS(PARAMS params) {
        this.params = params;
    }
}
