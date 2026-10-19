package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MULTIPLE-ECU-JOB-REFS")
public class MULTIPLEECUJOBREFS {

    @ElementList(entry = "MULTIPLE-ECU-JOB-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> multipleecujobref;

    public List<ODXLINK> getMULTIPLEECUJOBREF() {
        if (this.multipleecujobref == null) {
            this.multipleecujobref = new ArrayList();
        }
        return this.multipleecujobref;
    }
}
