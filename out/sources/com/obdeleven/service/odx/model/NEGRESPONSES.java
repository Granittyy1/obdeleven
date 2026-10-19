package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NEG-RESPONSES")
public class NEGRESPONSES {

    @ElementList(inline = true, name = "NEG-RESPONSE", required = true, type = NEGRESPONSE.class)
    protected List<NEGRESPONSE> negresponse;

    public List<NEGRESPONSE> getNEGRESPONSE() {
        if (this.negresponse == null) {
            this.negresponse = new ArrayList();
        }
        return this.negresponse;
    }
}
