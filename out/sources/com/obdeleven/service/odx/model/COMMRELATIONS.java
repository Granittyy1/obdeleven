package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMM-RELATION"})
@Root(name = "COMM-RELATIONS")
public class COMMRELATIONS {

    @ElementList(inline = true, name = "COMM-RELATION", required = true, type = COMMRELATION.class)
    protected List<COMMRELATION> commrelation;

    public List<COMMRELATION> getCOMMRELATION() {
        if (this.commrelation == null) {
            this.commrelation = new ArrayList();
        }
        return this.commrelation;
    }
}
