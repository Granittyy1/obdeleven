package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATABLOCKS")
public class DATABLOCKS {

    @ElementList(inline = true, name = "DATABLOCK", required = true, type = DATABLOCK.class)
    protected List<DATABLOCK> datablock;

    public List<DATABLOCK> getDATABLOCK() {
        if (this.datablock == null) {
            this.datablock = new ArrayList();
        }
        return this.datablock;
    }
}
