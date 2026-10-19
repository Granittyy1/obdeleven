package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SUB-COMPONENT-PATTERNS")
public class SUBCOMPONENTPATTERNS {

    @ElementList(inline = true, name = "SUB-COMPONENTPATTERN", required = true, type = SUBCOMPONENTPATTERN.class)
    protected List<SUBCOMPONENTPATTERN> subcomponentpattern;

    public List<SUBCOMPONENTPATTERN> getSUBCOMPONENTPATTERN() {
        if (this.subcomponentpattern == null) {
            this.subcomponentpattern = new ArrayList();
        }
        return this.subcomponentpattern;
    }
}
