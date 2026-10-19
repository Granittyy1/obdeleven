package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LIBRARYS")
public class LIBRARYS {

    @ElementList(inline = true, name = "LIBRARY", required = true, type = LIBRARY.class)
    protected List<LIBRARY> library;

    public List<LIBRARY> getLIBRARY() {
        if (this.library == null) {
            this.library = new ArrayList();
        }
        return this.library;
    }
}
