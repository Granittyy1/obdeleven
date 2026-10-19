package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NOT-INHERITED-DOP")
public class NOTINHERITEDDOP {

    @Element(name = "DOP-BASE-SNREF", required = true)
    protected SNREF dopbasesnref;

    public SNREF getDOPBASESNREF() {
        return this.dopbasesnref;
    }

    public void setDOPBASESNREF(SNREF snref) {
        this.dopbasesnref = snref;
    }
}
