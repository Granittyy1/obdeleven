package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MATCHING-PARAMETERS")
public class MATCHINGPARAMETERS {

    @ElementList(inline = true, name = "MATCHING-PARAMETER", required = true, type = MATCHINGPARAMETER.class)
    protected List<MATCHINGPARAMETER> matchingparameter;

    public List<MATCHINGPARAMETER> getMATCHINGPARAMETER() {
        if (this.matchingparameter == null) {
            this.matchingparameter = new ArrayList();
        }
        return this.matchingparameter;
    }
}
