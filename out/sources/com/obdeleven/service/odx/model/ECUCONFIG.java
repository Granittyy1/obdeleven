package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CONFIG-DATAS", "ADDITIONAL-AUDIENCES", "CONFIG-DATADICTIONARY-SPEC"})
@Root(name = "ECU-CONFIG")
public class ECUCONFIG extends ODXCATEGORY {

    @Element(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

    @Element(name = "CONFIG-DATADICTIONARY-SPEC")
    protected CONFIGDATADICTIONARYSPEC configdatadictionaryspec;

    @Element(name = "CONFIG-DATAS", required = true)
    protected CONFIGDATAS configdatas;

    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return this.additionalaudiences;
    }

    public CONFIGDATADICTIONARYSPEC getCONFIGDATADICTIONARYSPEC() {
        return this.configdatadictionaryspec;
    }

    public CONFIGDATAS getCONFIGDATAS() {
        return this.configdatas;
    }

    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES additionalaudiences) {
        this.additionalaudiences = additionalaudiences;
    }

    public void setCONFIGDATADICTIONARYSPEC(CONFIGDATADICTIONARYSPEC configdatadictionaryspec) {
        this.configdatadictionaryspec = configdatadictionaryspec;
    }

    public void setCONFIGDATAS(CONFIGDATAS configdatas) {
        this.configdatas = configdatas;
    }
}
