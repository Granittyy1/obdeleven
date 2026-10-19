package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "UNITS")
public class UNITS {

    @ElementList(inline = true, name = "UNIT", required = true, type = UNIT.class)
    protected List<UNIT> unit;

    public List<UNIT> getUNIT() {
        if (this.unit == null) {
            this.unit = new ArrayList();
        }
        return this.unit;
    }
}
