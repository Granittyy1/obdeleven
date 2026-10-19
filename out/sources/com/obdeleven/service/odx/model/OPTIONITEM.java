package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PHYSICAL-DEFAULT-VALUE", "ITEM-VALUES", "WRITE-AUDIENCE", "READ-AUDIENCE"})
@Root(name = "OPTION-ITEM")
public class OPTIONITEM extends CONFIGITEM {

    @Element(name = "ITEM-VALUES")
    protected ITEMVALUES itemvalues;

    @Element(name = "PHYSICAL-DEFAULT-VALUE")
    protected String physicaldefaultvalue;

    @Element(name = "READ-AUDIENCE")
    protected AUDIENCE readaudience;

    @Element(name = "WRITE-AUDIENCE")
    protected AUDIENCE writeaudience;

    public ITEMVALUES getITEMVALUES() {
        return this.itemvalues;
    }

    public String getPHYSICALDEFAULTVALUE() {
        return this.physicaldefaultvalue;
    }

    public AUDIENCE getREADAUDIENCE() {
        return this.readaudience;
    }

    public AUDIENCE getWRITEAUDIENCE() {
        return this.writeaudience;
    }

    public void setITEMVALUES(ITEMVALUES itemvalues) {
        this.itemvalues = itemvalues;
    }

    public void setPHYSICALDEFAULTVALUE(String str) {
        this.physicaldefaultvalue = str;
    }

    public void setREADAUDIENCE(AUDIENCE audience) {
        this.readaudience = audience;
    }

    public void setWRITEAUDIENCE(AUDIENCE audience) {
        this.writeaudience = audience;
    }
}
