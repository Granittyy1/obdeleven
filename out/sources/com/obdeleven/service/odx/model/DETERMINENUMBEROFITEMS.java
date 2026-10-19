package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BYTE-POSITION", "BIT-POSITION", "DATA-OBJECT-PROP-REF"})
@Root(name = "DETERMINE-NUMBER-OF-ITEMS")
public class DETERMINENUMBEROFITEMS {

    @Element(name = "BIT-POSITION")
    protected int bitposition;

    @Element(name = "BYTE-POSITION")
    protected int byteposition;

    @Element(name = "DATA-OBJECT-PROP-REF", required = true)
    protected ODXLINK dataobjectpropref;
    private e.c mDopBaseResult;

    public int getBITPOSITION() {
        return this.bitposition;
    }

    public int getBYTEPOSITION() {
        return this.byteposition;
    }

    public ODXLINK getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public void setBITPOSITION(int i10) {
        this.bitposition = i10;
    }

    public void setBYTEPOSITION(int i10) {
        this.byteposition = i10;
    }

    public void setDATAOBJECTPROPREF(ODXLINK odxlink) {
        this.dataobjectpropref = odxlink;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
    }
}
