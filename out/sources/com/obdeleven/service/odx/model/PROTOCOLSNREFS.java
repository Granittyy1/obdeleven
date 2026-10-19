package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "PROTOCOL-SNREFS")
public class PROTOCOLSNREFS {

    @ElementList(inline = true, name = "PROTOCOL-SNREF", required = true, type = SNREF.class)
    protected List<SNREF> protocolsnref;

    public List<SNREF> getPROTOCOLSNREF() {
        if (this.protocolsnref == null) {
            this.protocolsnref = new ArrayList();
        }
        return this.protocolsnref;
    }
}
