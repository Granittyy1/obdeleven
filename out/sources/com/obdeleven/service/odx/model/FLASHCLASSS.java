package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FLASH-CLASSS")
public class FLASHCLASSS {

    @ElementList(inline = true, name = "FLASH-CLASS", required = true, type = FLASHCLASS.class)
    protected List<FLASHCLASS> flashclass;

    public List<FLASHCLASS> getFLASHCLASS() {
        if (this.flashclass == null) {
            this.flashclass = new ArrayList();
        }
        return this.flashclass;
    }
}
