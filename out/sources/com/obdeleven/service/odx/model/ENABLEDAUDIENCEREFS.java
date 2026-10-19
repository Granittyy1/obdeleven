package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "ENABLED-AUDIENCE-REFS")
public class ENABLEDAUDIENCEREFS {

    @ElementList(entry = "ENABLED-AUDIENCE-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> enabledaudienceref;

    public List<ODXLINK> getENABLEDAUDIENCEREF() {
        if (this.enabledaudienceref == null) {
            this.enabledaudienceref = new ArrayList();
        }
        return this.enabledaudienceref;
    }
}
