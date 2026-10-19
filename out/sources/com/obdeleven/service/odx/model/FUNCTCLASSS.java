package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCT-CLASSS")
public class FUNCTCLASSS {

    @ElementList(inline = true, name = "FUNCT-CLASS", required = true, type = FUNCTCLASS.class)
    protected List<FUNCTCLASS> functclass;

    public List<FUNCTCLASS> getFUNCTCLASS() {
        if (this.functclass == null) {
            this.functclass = new ArrayList();
        }
        return this.functclass;
    }
}
