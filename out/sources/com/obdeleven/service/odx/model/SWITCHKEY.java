package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BYTE-POSITION", "BIT-POSITION", "DATA-OBJECT-PROP-REF"})
@Root(name = "SWITCH-KEY")
public class SWITCHKEY {

    @Element(name = "BIT-POSITION")
    protected long bitposition;

    @Element(name = "BYTE-POSITION")
    protected long byteposition;

    @Element(name = "DATA-OBJECT-PROP-REF", required = true)
    protected ODXLINK dataobjectpropref;
    private e.c mDataObjectProp;

    public long getBITPOSITION() {
        return this.bitposition;
    }

    public long getBYTEPOSITION() {
        return this.byteposition;
    }

    public ODXLINK getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public e.c getDataObjectProp() {
        return this.mDataObjectProp;
    }

    public void setBITPOSITION(Long l10) {
        this.bitposition = l10.longValue();
    }

    public void setBYTEPOSITION(long j) {
        this.byteposition = j;
    }

    public void setDATAOBJECTPROPREF(ODXLINK odxlink) {
        this.dataobjectpropref = odxlink;
    }

    public void setDataObjectProp(e.c cVar) {
        this.mDataObjectProp = cVar;
    }
}
