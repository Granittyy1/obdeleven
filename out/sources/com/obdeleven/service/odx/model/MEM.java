package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SESSIONS", "DATABLOCKS", "FLASHDATAS"})
@Root(name = "MEM")
public class MEM {

    @Element(name = "DATABLOCKS", required = true)
    protected DATABLOCKS datablocks;

    @Element(name = "FLASHDATAS", required = true)
    protected FLASHDATAS flashdatas;

    @Element(name = "SESSIONS", required = true)
    protected SESSIONS sessions;

    public DATABLOCKS getDATABLOCKS() {
        return this.datablocks;
    }

    public FLASHDATAS getFLASHDATAS() {
        return this.flashdatas;
    }

    public SESSIONS getSESSIONS() {
        return this.sessions;
    }

    public void setDATABLOCKS(DATABLOCKS datablocks) {
        this.datablocks = datablocks;
    }

    public void setFLASHDATAS(FLASHDATAS flashdatas) {
        this.flashdatas = flashdatas;
    }

    public void setSESSIONS(SESSIONS sessions) {
        this.sessions = sessions;
    }
}
