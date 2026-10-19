package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ALL-VALUE", "DTC-VALUES"})
@Root(name = "ENV-DATA")
public class ENVDATA extends BASICSTRUCTURE {

    @Element(name = "ALL-VALUE")
    protected ALLVALUE allvalue;

    @Element(name = "DTC-VALUES")
    protected DTCVALUES dtcvalues;

    public ALLVALUE getALLVALUE() {
        return this.allvalue;
    }

    public DTCVALUES getDTCVALUES() {
        return this.dtcvalues;
    }

    public void setALLVALUE(ALLVALUE allvalue) {
        this.allvalue = allvalue;
    }

    public void setDTCVALUES(DTCVALUES dtcvalues) {
        this.dtcvalues = dtcvalues;
    }
}
