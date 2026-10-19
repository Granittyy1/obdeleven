package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FUNCTION-NODES")
public class FUNCTIONNODES {

    @ElementList(inline = true, name = "FUNCTION-NODE", required = true, type = FUNCTIONNODE.class)
    protected List<FUNCTIONNODE> functionnode;

    public List<FUNCTIONNODE> getFUNCTIONNODE() {
        if (this.functionnode == null) {
            this.functionnode = new ArrayList();
        }
        return this.functionnode;
    }
}
