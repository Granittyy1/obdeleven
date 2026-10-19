package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"INFO-COMPONENTS", "VEHICLE-INFORMATIONS"})
@Root(name = "VEHICLE-INFO-SPEC")
public class VEHICLEINFOSPEC extends ODXCATEGORY {

    @Element(name = "INFO-COMPONENTS")
    protected INFOCOMPONENTS infocomponents;

    @Element(name = "VEHICLE-INFORMATIONS", required = true)
    protected VEHICLEINFORMATIONS vehicleinformations;

    public INFOCOMPONENTS getINFOCOMPONENTS() {
        return this.infocomponents;
    }

    public VEHICLEINFORMATIONS getVEHICLEINFORMATIONS() {
        return this.vehicleinformations;
    }

    public void setINFOCOMPONENTS(INFOCOMPONENTS infocomponents) {
        this.infocomponents = infocomponents;
    }

    public void setVEHICLEINFORMATIONS(VEHICLEINFORMATIONS vehicleinformations) {
        this.vehicleinformations = vehicleinformations;
    }
}
