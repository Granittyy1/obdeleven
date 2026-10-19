package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "INFO-COMPONENTS")
public class INFOCOMPONENTS {

    @ElementList(inline = true, name = "INFO-COMPONENT", required = true, type = INFOCOMPONENT.class)
    protected List<INFOCOMPONENT> infocomponent;

    public List<INFOCOMPONENT> getINFOCOMPONENT() {
        if (this.infocomponent == null) {
            this.infocomponent = new ArrayList();
        }
        return this.infocomponent;
    }
}
