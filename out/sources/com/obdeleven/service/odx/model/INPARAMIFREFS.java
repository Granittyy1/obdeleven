package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "IN-PARAM-IF-REFS")
public class INPARAMIFREFS {

    @ElementListUnion({@ElementList(inline = true, name = "IN-PARAM-IF-SNREF", type = SNREF.class), @ElementList(inline = true, name = "IN-PARAM-IF-SNPATHREF", type = SNPATHREF.class)})
    protected List<Object> inparamifsnrefOrINPARAMIFSNPATHREF;

    public List<Object> getINPARAMIFSNREFOrINPARAMIFSNPATHREF() {
        if (this.inparamifsnrefOrINPARAMIFSNPATHREF == null) {
            this.inparamifsnrefOrINPARAMIFSNPATHREF = new ArrayList();
        }
        return this.inparamifsnrefOrINPARAMIFSNPATHREF;
    }
}
