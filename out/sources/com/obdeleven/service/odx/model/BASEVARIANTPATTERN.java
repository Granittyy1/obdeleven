package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"MATCHING-BASE-VARIANT-PARAMETERS"})
@Root(name = "BASE-VARIANT-PATTERN")
public class BASEVARIANTPATTERN {

    @Element(name = "MATCHING-BASE-VARIANT-PARAMETERS", required = true)
    protected MATCHINGBASEVARIANTPARAMETERS matchingbasevariantparameters;

    public MATCHINGBASEVARIANTPARAMETERS getMATCHINGBASEVARIANTPARAMETERS() {
        return this.matchingbasevariantparameters;
    }

    public void setMATCHINGBASEVARIANTPARAMETERS(MATCHINGBASEVARIANTPARAMETERS matchingbasevariantparameters) {
        this.matchingbasevariantparameters = matchingbasevariantparameters;
    }
}
