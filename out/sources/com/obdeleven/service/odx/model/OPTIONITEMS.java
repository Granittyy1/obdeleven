package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "OPTION-ITEMS")
public class OPTIONITEMS {

    @ElementList(inline = true, name = "OPTION-ITEM", required = true, type = OPTIONITEM.class)
    protected List<OPTIONITEM> optionitem;

    public List<OPTIONITEM> getOPTIONITEM() {
        if (this.optionitem == null) {
            this.optionitem = new ArrayList();
        }
        return this.optionitem;
    }
}
