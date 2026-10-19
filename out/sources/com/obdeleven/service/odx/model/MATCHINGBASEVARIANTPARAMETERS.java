package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MATCHING-BASE-VARIANT-PARAMETERS")
public class MATCHINGBASEVARIANTPARAMETERS {

    @ElementList(inline = true, name = "MATCHINGBASE-VARIANT-PARAMETER", required = true, type = MATCHINGBASEVARIANTPARAMETER.class)
    protected List<MATCHINGBASEVARIANTPARAMETER> matchingbasevariantparameter;

    public List<MATCHINGBASEVARIANTPARAMETER> getMATCHINGBASEVARIANTPARAMETER() {
        if (this.matchingbasevariantparameter == null) {
            this.matchingbasevariantparameter = new ArrayList();
        }
        return this.matchingbasevariantparameter;
    }
}
