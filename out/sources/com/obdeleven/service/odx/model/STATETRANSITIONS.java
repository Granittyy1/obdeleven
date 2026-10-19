package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STATE-TRANSITIONS")
public class STATETRANSITIONS {

    @ElementList(inline = true, name = "STATE-TRANSITION", required = true, type = STATETRANSITION.class)
    protected List<STATETRANSITION> statetransition;

    public List<STATETRANSITION> getSTATETRANSITION() {
        if (this.statetransition == null) {
            this.statetransition = new ArrayList();
        }
        return this.statetransition;
    }
}
