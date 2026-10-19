package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NEG-RESPONSE-REFS")
public class NEGRESPONSEREFS {

    @ElementList(entry = "NEG-RESPONSE-REF", inline = true, required = true, type = ODXLINK.class)
    protected List<ODXLINK> negresponseref;

    public List<ODXLINK> getNEGRESPONSEREF() {
        if (this.negresponseref == null) {
            this.negresponseref = new ArrayList();
        }
        return this.negresponseref;
    }
}
