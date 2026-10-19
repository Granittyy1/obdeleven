package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ECU-VARIANT-SNREFS", "BASE-VARIANT-SNREF"})
@Root(name = "VALID-BASE-VARIANT")
public class VALIDBASEVARIANT {

    @Element(name = "BASE-VARIANT-SNREF", required = true)
    protected SNREF basevariantsnref;

    @Element(name = "ECU-VARIANT-SNREFS")
    protected ECUVARIANTSNREFS ecuvariantsnrefs;

    public SNREF getBASEVARIANTSNREF() {
        return this.basevariantsnref;
    }

    public ECUVARIANTSNREFS getECUVARIANTSNREFS() {
        return this.ecuvariantsnrefs;
    }

    public void setBASEVARIANTSNREF(SNREF snref) {
        this.basevariantsnref = snref;
    }

    public void setECUVARIANTSNREFS(ECUVARIANTSNREFS ecuvariantsnrefs) {
        this.ecuvariantsnrefs = ecuvariantsnrefs;
    }
}
