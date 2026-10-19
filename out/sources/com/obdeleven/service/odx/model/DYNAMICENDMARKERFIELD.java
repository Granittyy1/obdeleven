package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYNAMIC-ENDMARKER-FIELD")
public class DYNAMICENDMARKERFIELD extends FIELD {

    @Element(name = "DATA-OBJECT-PROP-REF", required = true)
    protected DYNENDDOPREF dataobjectpropref;

    public DYNENDDOPREF getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public void setDATAOBJECTPROPREF(DYNENDDOPREF dynenddopref) {
        this.dataobjectpropref = dynenddopref;
    }
}
