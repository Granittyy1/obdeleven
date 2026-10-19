package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "STATE-CHARTS")
public class STATECHARTS {

    @ElementList(inline = true, name = "STATE-CHART", required = true, type = STATECHART.class)
    protected List<STATECHART> statechart;

    public List<STATECHART> getSTATECHART() {
        if (this.statechart == null) {
            this.statechart = new ArrayList();
        }
        return this.statechart;
    }
}
