package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PROG-CODE", "COMPU-SCALES", "COMPU-DEFAULT-VALUE"})
@Root(name = "COMPU-PHYS-TO-INTERNAL")
public class COMPUPHYSTOINTERNAL {

    @Element(name = "COMPU-DEFAULT-VALUE")
    protected COMPUDEFAULTVALUE compudefaultvalue;

    @Element(name = "COMPU-SCALES")
    protected COMPUSCALES compuscales;

    @Element(name = "PROG-CODE")
    protected PROGCODE progcode;

    public COMPUDEFAULTVALUE getCOMPUDEFAULTVALUE() {
        return this.compudefaultvalue;
    }

    public COMPUSCALES getCOMPUSCALES() {
        return this.compuscales;
    }

    public PROGCODE getPROGCODE() {
        return this.progcode;
    }

    public void setCOMPUDEFAULTVALUE(COMPUDEFAULTVALUE compudefaultvalue) {
        this.compudefaultvalue = compudefaultvalue;
    }

    public void setCOMPUSCALES(COMPUSCALES compuscales) {
        this.compuscales = compuscales;
    }

    public void setPROGCODE(PROGCODE progcode) {
        this.progcode = progcode;
    }
}
