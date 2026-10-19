package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "CHECKSUMS")
public class CHECKSUMS {

    @ElementList(inline = true, name = "CHECKSUM", required = true, type = CHECKSUM.class)
    protected List<CHECKSUM> checksum;

    public List<CHECKSUM> getCHECKSUM() {
        if (this.checksum == null) {
            this.checksum = new ArrayList();
        }
        return this.checksum;
    }
}
