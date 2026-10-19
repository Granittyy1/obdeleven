package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPLEX-VALUES"})
@Root(name = "COMPLEX-PHYSICAL-DEFAULT-VALUE")
public class COMPLEXPHYSICALDEFAULTVALUE {

    @Element(name = "COMPLEX-VALUES")
    protected COMPLEXVALUES complexvalues;

    public COMPLEXVALUES getCOMPLEXVALUES() {
        return this.complexvalues;
    }

    public void setCOMPLEXVALUES(COMPLEXVALUES complexvalues) {
        this.complexvalues = complexvalues;
    }
}
