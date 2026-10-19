package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "OUT-PARAM-IF-REFS")
public class OUTPARAMIFREFS {

    @ElementListUnion({@ElementList(inline = true, name = "OUT-PARAM-IF-SNREF", type = SNREF.class), @ElementList(inline = true, name = "OUT-PARAM-IF-SNPATHREF", type = SNPATHREF.class)})
    protected List<Object> outparamifsnrefOrOUTPARAMIFSNPATHREF;

    public List<Object> getOUTPARAMIFSNREFOrOUTPARAMIFSNPATHREF() {
        if (this.outparamifsnrefOrOUTPARAMIFSNPATHREF == null) {
            this.outparamifsnrefOrOUTPARAMIFSNPATHREF = new ArrayList();
        }
        return this.outparamifsnrefOrOUTPARAMIFSNPATHREF;
    }
}
