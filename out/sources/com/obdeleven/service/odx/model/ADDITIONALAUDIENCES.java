package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ADDITIONAL-AUDIENCES")
public class ADDITIONALAUDIENCES {

    @ElementList(inline = true, name = "ADDITIONAL-AUDIENCE", required = true, type = ADDITIONALAUDIENCE.class)
    protected List<ADDITIONALAUDIENCE> additionalaudience;

    public List<ADDITIONALAUDIENCE> getADDITIONALAUDIENCE() {
        if (this.additionalaudience == null) {
            this.additionalaudience = new ArrayList();
        }
        return this.additionalaudience;
    }
}
