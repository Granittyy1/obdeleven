package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "MULTIPLE-ECU-JOBS")
public class MULTIPLEECUJOBS {

    @ElementList(inline = true, name = "MULTIPLE-ECU-JOB", required = true, type = MULTIPLEECUJOB.class)
    protected List<MULTIPLEECUJOB> multipleecujob;

    public List<MULTIPLEECUJOB> getMULTIPLEECUJOB() {
        if (this.multipleecujob == null) {
            this.multipleecujob = new ArrayList();
        }
        return this.multipleecujob;
    }
}
