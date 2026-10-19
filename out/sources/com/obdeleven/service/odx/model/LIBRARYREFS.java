package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "LIBRARY-REFS")
public class LIBRARYREFS {

    @ElementList(entry = "LIBRARY-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> libraryref;

    public List<ODXLINK> getLIBRARYREF() {
        if (this.libraryref == null) {
            this.libraryref = new ArrayList();
        }
        return this.libraryref;
    }
}
