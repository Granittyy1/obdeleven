package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SIMPLE-VALUE", "COMPLEX-VALUE"})
@Root(name = "COMPLEX-VALUE")
public class COMPLEXVALUE extends BASEVALUE {

    @ElementListUnion({@ElementList(inline = true, name = "SIMPLE-VALUE", type = SIMPLEVALUE.class), @ElementList(inline = true, name = "COMPLEX-VALUE", type = COMPLEXVALUE.class)})
    protected List<Object> simplevalueOrCOMPLEXVALUE;

    public List<Object> getSIMPLEVALUEOrCOMPLEXVALUE() {
        if (this.simplevalueOrCOMPLEXVALUE == null) {
            this.simplevalueOrCOMPLEXVALUE = new ArrayList();
        }
        return this.simplevalueOrCOMPLEXVALUE;
    }
}
