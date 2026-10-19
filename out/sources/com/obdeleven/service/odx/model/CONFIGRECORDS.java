package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "CONFIG-RECORDS")
public class CONFIGRECORDS {

    @ElementList(inline = true, name = "CONFIG-RECORD", required = true, type = CONFIGRECORD.class)
    protected List<CONFIGRECORD> configrecord;

    public List<CONFIGRECORD> getCONFIGRECORD() {
        if (this.configrecord == null) {
            this.configrecord = new ArrayList();
        }
        return this.configrecord;
    }
}
