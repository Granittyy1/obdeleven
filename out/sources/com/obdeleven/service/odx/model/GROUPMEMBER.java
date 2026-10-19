package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BASE-VARIANT-REF", "FUNCT-RESOLUTION-LINK-REF", "PHYS-RESOLUTION-LINK-REF"})
@Root(name = "GROUP-MEMBER")
public class GROUPMEMBER {

    @Element(name = "BASE-VARIANT-REF", required = true)
    protected ODXLINK basevariantref;

    @Element(name = "FUNCT-RESOLUTION-LINK-REF")
    protected ODXLINK functresolutionlinkref;

    @Element(name = "PHYS-RESOLUTION-LINK-REF")
    protected ODXLINK physresolutionlinkref;

    public ODXLINK getBASEVARIANTREF() {
        return this.basevariantref;
    }

    public ODXLINK getFUNCTRESOLUTIONLINKREF() {
        return this.functresolutionlinkref;
    }

    public ODXLINK getPHYSRESOLUTIONLINKREF() {
        return this.physresolutionlinkref;
    }

    public void setBASEVARIANTREF(ODXLINK odxlink) {
        this.basevariantref = odxlink;
    }

    public void setFUNCTRESOLUTIONLINKREF(ODXLINK odxlink) {
        this.functresolutionlinkref = odxlink;
    }

    public void setPHYSRESOLUTIONLINKREF(ODXLINK odxlink) {
        this.physresolutionlinkref = odxlink;
    }
}
