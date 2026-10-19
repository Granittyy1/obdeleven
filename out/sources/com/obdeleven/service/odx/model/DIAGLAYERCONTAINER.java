package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PROTOCOLS", "FUNCTIONAL-GROUPS", "ECU-SHARED-DATAS", "BASE-VARIANTS", "ECU-VARIANTS"})
@Root(name = "DIAG-LAYER-CONTAINER")
public class DIAGLAYERCONTAINER extends ODXCATEGORY {

    @Element(name = "BASE-VARIANTS")
    protected BASEVARIANTS basevariants;

    @Element(name = "ECU-SHARED-DATAS")
    protected ECUSHAREDDATAS ecushareddatas;

    @Element(name = "ECU-VARIANTS")
    protected ECUVARIANTS ecuvariants;

    @Element(name = "FUNCTIONAL-GROUPS")
    protected FUNCTIONALGROUPS functionalgroups;

    @Element(name = "PROTOCOLS")
    protected PROTOCOLS protocols;

    public BASEVARIANTS getBASEVARIANTS() {
        return this.basevariants;
    }

    public List<DIAGLAYER> getDIAGLAYERS() {
        ArrayList arrayList = new ArrayList();
        BASEVARIANTS basevariants = this.basevariants;
        if (basevariants != null) {
            arrayList.addAll(basevariants.getBASEVARIANT());
        }
        ECUSHAREDDATAS ecushareddatas = this.ecushareddatas;
        if (ecushareddatas != null) {
            arrayList.addAll(ecushareddatas.getECUSHAREDDATA());
        }
        ECUVARIANTS ecuvariants = this.ecuvariants;
        if (ecuvariants != null) {
            arrayList.addAll(ecuvariants.getECUVARIANT());
        }
        FUNCTIONALGROUPS functionalgroups = this.functionalgroups;
        if (functionalgroups != null) {
            arrayList.addAll(functionalgroups.getFUNCTIONALGROUP());
        }
        PROTOCOLS protocols = this.protocols;
        if (protocols != null) {
            arrayList.addAll(protocols.getPROTOCOL());
        }
        return arrayList;
    }

    public ECUSHAREDDATAS getECUSHAREDDATAS() {
        return this.ecushareddatas;
    }

    public ECUVARIANTS getECUVARIANTS() {
        return this.ecuvariants;
    }

    public FUNCTIONALGROUPS getFUNCTIONALGROUPS() {
        return this.functionalgroups;
    }

    public PROTOCOLS getPROTOCOLS() {
        return this.protocols;
    }

    public void setBASEVARIANTS(BASEVARIANTS basevariants) {
        this.basevariants = basevariants;
    }

    public void setECUSHAREDDATAS(ECUSHAREDDATAS ecushareddatas) {
        this.ecushareddatas = ecushareddatas;
    }

    public void setECUVARIANTS(ECUVARIANTS ecuvariants) {
        this.ecuvariants = ecuvariants;
    }

    public void setFUNCTIONALGROUPS(FUNCTIONALGROUPS functionalgroups) {
        this.functionalgroups = functionalgroups;
    }

    public void setPROTOCOLS(PROTOCOLS protocols) {
        this.protocols = protocols;
    }
}
