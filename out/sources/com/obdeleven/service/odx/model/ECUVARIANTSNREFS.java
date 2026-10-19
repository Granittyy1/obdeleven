package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-VARIANT-SNREFS")
public class ECUVARIANTSNREFS {

    @ElementList(inline = true, name = "ECU-VARIANT-SNREF", required = true, type = SNREF.class)
    protected List<SNREF> ecuvariantsnref;

    public List<SNREF> getECUVARIANTSNREF() {
        if (this.ecuvariantsnref == null) {
            this.ecuvariantsnref = new ArrayList();
        }
        return this.ecuvariantsnref;
    }
}
