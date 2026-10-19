package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "CASES")
public class CASES {

    @ElementList(inline = true, name = "CASE", required = true, type = CASE.class)
    protected List<CASE> _case;

    public List<CASE> getCASE() {
        if (this._case == null) {
            this._case = new ArrayList();
        }
        return this._case;
    }
}
