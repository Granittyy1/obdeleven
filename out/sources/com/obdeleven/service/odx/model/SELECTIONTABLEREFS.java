package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "SELECTION-TABLE-REFS")
public class SELECTIONTABLEREFS {

    @ElementListUnion({@ElementList(inline = true, name = "SELECTION-TABLE-REF", type = ODXLINK.class), @ElementList(inline = true, name = "SELECTION-TABLE-SNREF", type = SNREF.class)})
    protected List<Object> selectiontablerefOrSELECTIONTABLESNREF;

    public List<Object> getSELECTIONTABLEREFOrSELECTIONTABLESNREF() {
        if (this.selectiontablerefOrSELECTIONTABLESNREF == null) {
            this.selectiontablerefOrSELECTIONTABLESNREF = new ArrayList();
        }
        return this.selectiontablerefOrSELECTIONTABLESNREF;
    }
}
