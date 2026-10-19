package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "CONFIG-DATAS")
public class CONFIGDATAS {

    @ElementList(inline = true, name = "CONFIG-DATA", required = true, type = CONFIGDATA.class)
    protected List<CONFIGDATA> configdata;

    public List<CONFIGDATA> getCONFIGDATA() {
        if (this.configdata == null) {
            this.configdata = new ArrayList();
        }
        return this.configdata;
    }
}
