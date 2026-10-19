package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-VARIANTS")
public class ECUVARIANTS {

    @ElementList(inline = true, name = "ECU-VARIANT", required = true, type = ECUVARIANT.class)
    protected List<ECUVARIANT> ecuvariant;

    public List<ECUVARIANT> getECUVARIANT() {
        if (this.ecuvariant == null) {
            this.ecuvariant = new ArrayList();
        }
        return this.ecuvariant;
    }
}
