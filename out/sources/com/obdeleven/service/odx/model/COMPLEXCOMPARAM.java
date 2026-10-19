package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPARAM", "COMPLEX-COMPARAM", "COMPLEXPHYSICAL-DEFAULT-VALUE"})
@Root(name = "COMPLEX-COMPARAM")
public class COMPLEXCOMPARAM extends BASECOMPARAM {

    @Attribute(name = "ALLOW-MULTIPLE-VALUES")
    protected Boolean allowmultiplevalues;

    @ElementListUnion({@ElementList(inline = true, name = "COMPARAM", type = COMPARAM.class), @ElementList(inline = true, name = "COMPLEX-COMPARAM", type = COMPLEXCOMPARAM.class)})
    protected List<BASECOMPARAM> comparamOrCOMPLEXCOMPARAM;

    @Element(name = "COMPLEXPHYSICAL-DEFAULT-VALUE")
    protected COMPLEXPHYSICALDEFAULTVALUE complexphysicaldefaultvalue;

    public List<BASECOMPARAM> getCOMPARAMOrCOMPLEXCOMPARAM() {
        if (this.comparamOrCOMPLEXCOMPARAM == null) {
            this.comparamOrCOMPLEXCOMPARAM = new ArrayList();
        }
        return this.comparamOrCOMPLEXCOMPARAM;
    }

    public COMPLEXPHYSICALDEFAULTVALUE getCOMPLEXPHYSICALDEFAULTVALUE() {
        return this.complexphysicaldefaultvalue;
    }

    public boolean isALLOWMULTIPLEVALUES() {
        Boolean bool = this.allowmultiplevalues;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setALLOWMULTIPLEVALUES(Boolean bool) {
        this.allowmultiplevalues = bool;
    }

    public void setCOMPLEXPHYSICALDEFAULTVALUE(COMPLEXPHYSICALDEFAULTVALUE complexphysicaldefaultvalue) {
        this.complexphysicaldefaultvalue = complexphysicaldefaultvalue;
    }
}
