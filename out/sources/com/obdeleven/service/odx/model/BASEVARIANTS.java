package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "BASE-VARIANTS")
public class BASEVARIANTS {

    @ElementList(inline = true, name = "BASE-VARIANT", required = true, type = BASEVARIANT.class)
    protected List<BASEVARIANT> basevariant;

    public List<BASEVARIANT> getBASEVARIANT() {
        if (this.basevariant == null) {
            this.basevariant = new ArrayList();
        }
        return this.basevariant;
    }
}
