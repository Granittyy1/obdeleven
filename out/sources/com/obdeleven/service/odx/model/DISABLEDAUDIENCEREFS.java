package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DISABLED-AUDIENCE-REFS")
public class DISABLEDAUDIENCEREFS {

    @ElementList(entry = "DISABLED-AUDIENCE-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> disabledaudienceref;

    public List<ODXLINK> getDISABLEDAUDIENCEREF() {
        if (this.disabledaudienceref == null) {
            this.disabledaudienceref = new ArrayList();
        }
        return this.disabledaudienceref;
    }
}
