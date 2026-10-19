package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "")
public class Ol {
    protected List<Li> li;

    public List<Li> getLi() {
        if (this.li == null) {
            this.li = new ArrayList();
        }
        return this.li;
    }
}
