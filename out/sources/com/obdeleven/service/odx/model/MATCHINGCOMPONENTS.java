package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MATCHING-COMPONENTS")
public class MATCHINGCOMPONENTS {

    @ElementList(inline = true, name = "MATCHING-COMPONENT", required = true, type = MATCHINGCOMPONENT.class)
    protected List<MATCHINGCOMPONENT> matchingcomponent;

    public List<MATCHINGCOMPONENT> getMATCHINGCOMPONENT() {
        if (this.matchingcomponent == null) {
            this.matchingcomponent = new ArrayList();
        }
        return this.matchingcomponent;
    }
}
