package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ECU-VARIANT-PATTERNS")
public class ECUVARIANTPATTERNS {

    @ElementList(inline = true, name = "ECU-VARIANT-PATTERN", required = true, type = ECUVARIANTPATTERN.class)
    protected List<ECUVARIANTPATTERN> ecuvariantpattern;

    public List<ECUVARIANTPATTERN> getECUVARIANTPATTERN() {
        if (this.ecuvariantpattern == null) {
            this.ecuvariantpattern = new ArrayList();
        }
        return this.ecuvariantpattern;
    }
}
