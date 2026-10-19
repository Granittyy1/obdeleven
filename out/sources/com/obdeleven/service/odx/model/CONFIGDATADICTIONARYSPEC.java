package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DATA-OBJECT-PROPS", "UNIT-SPEC"})
@Root(name = "CONFIG-DATA-DICTIONARY-SPEC")
public class CONFIGDATADICTIONARYSPEC {

    @Element(name = "DATA-OBJECT-PROPS")
    protected DATAOBJECTPROPS dataobjectprops;

    @Element(name = "UNIT-SPEC")
    protected UNITSPEC unitspec;

    public DATAOBJECTPROPS getDATAOBJECTPROPS() {
        return this.dataobjectprops;
    }

    public UNITSPEC getUNITSPEC() {
        return this.unitspec;
    }

    public void setDATAOBJECTPROPS(DATAOBJECTPROPS dataobjectprops) {
        this.dataobjectprops = dataobjectprops;
    }

    public void setUNITSPEC(UNITSPEC unitspec) {
        this.unitspec = unitspec;
    }
}
