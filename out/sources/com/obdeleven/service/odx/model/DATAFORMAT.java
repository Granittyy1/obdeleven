package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATAFORMAT")
public class DATAFORMAT {

    @Attribute(name = "SELECTION", required = true)
    @Convert(DATAFORMATSELECTION.Converter.class)
    protected DATAFORMATSELECTION selection;

    @Attribute(name = "USER-SELECTION")
    protected String userselection;

    public DATAFORMATSELECTION getSELECTION() {
        return this.selection;
    }

    public String getUSERSELECTION() {
        return this.userselection;
    }

    public void setSELECTION(DATAFORMATSELECTION dataformatselection) {
        this.selection = dataformatselection;
    }

    public void setUSERSELECTION(String str) {
        this.userselection = str;
    }
}
