package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SCALE-CONSTRS")
public class SCALECONSTRS {

    @ElementList(inline = true, name = "SCALE-CONSTR", required = true, type = SCALECONSTR.class)
    protected List<SCALECONSTR> scaleconstr;

    public List<SCALECONSTR> getSCALECONSTR() {
        if (this.scaleconstr == null) {
            this.scaleconstr = new ArrayList();
        }
        return this.scaleconstr;
    }
}
