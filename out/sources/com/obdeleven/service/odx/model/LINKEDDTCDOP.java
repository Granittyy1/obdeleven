package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"NOT-INHERITED-DTC-SNREFS", "DTC-DOP-REF"})
@Root(name = "LINKED-DTC-DOP")
public class LINKEDDTCDOP {

    @Element(name = "DTC-DOP-REF", required = true)
    protected ODXLINK dtcdopref;

    @Element(name = "NOT-INHERITED-DTC-SNREFS")
    protected NOTINHERITEDDTCSNREFS notinheriteddtcsnrefs;

    public ODXLINK getDTCDOPREF() {
        return this.dtcdopref;
    }

    public NOTINHERITEDDTCSNREFS getNOTINHERITEDDTCSNREFS() {
        return this.notinheriteddtcsnrefs;
    }

    public void setDTCDOPREF(ODXLINK odxlink) {
        this.dtcdopref = odxlink;
    }

    public void setNOTINHERITEDDTCSNREFS(NOTINHERITEDDTCSNREFS notinheriteddtcsnrefs) {
        this.notinheriteddtcsnrefs = notinheriteddtcsnrefs;
    }
}
