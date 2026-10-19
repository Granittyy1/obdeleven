package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SUB-COMPONENT-PATTERN")
public class SUBCOMPONENTPATTERN {

    @Element(name = "MATCHING-PARAMETERS", required = true)
    protected MATCHINGPARAMETERS matchingparameters;

    public MATCHINGPARAMETERS getMATCHINGPARAMETERS() {
        return this.matchingparameters;
    }

    public void setMATCHINGPARAMETERS(MATCHINGPARAMETERS matchingparameters) {
        this.matchingparameters = matchingparameters;
    }
}
