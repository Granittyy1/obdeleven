package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "VALID-BASE-VARIANTS")
public class VALIDBASEVARIANTS {

    @ElementList(inline = true, name = "VALID-BASE-VARIANT", required = true, type = VALIDBASEVARIANT.class)
    protected List<VALIDBASEVARIANT> validbasevariant;

    public List<VALIDBASEVARIANT> getVALIDBASEVARIANT() {
        if (this.validbasevariant == null) {
            this.validbasevariant = new ArrayList();
        }
        return this.validbasevariant;
    }
}
