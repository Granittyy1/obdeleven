package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SUB-COMPONENTS")
public class SUBCOMPONENTS {

    @ElementList(inline = true, name = "SUB-COMPONENT", required = true, type = SUBCOMPONENT.class)
    protected List<SUBCOMPONENT> subcomponent;

    public List<SUBCOMPONENT> getSUBCOMPONENT() {
        if (this.subcomponent == null) {
            this.subcomponent = new ArrayList();
        }
        return this.subcomponent;
    }
}
