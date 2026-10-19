package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STRUCTURE")
public class STRUCTURE extends BASICSTRUCTURE {

    @Attribute(name = "IS-VISIBLE")
    protected Boolean isvisible;

    public boolean isISVISIBLE() {
        Boolean bool = this.isvisible;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setISVISIBLE(Boolean bool) {
        this.isvisible = bool;
    }
}
