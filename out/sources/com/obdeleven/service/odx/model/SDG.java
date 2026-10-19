package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SDG-CAPTION-REF", "SDG-CAPTION"})
@Root(name = "SDG")
public class SDG extends SPECIALDATA {

    @ElementListUnion({@ElementList(inline = true, name = "SDG", type = SDG.class), @ElementList(inline = true, name = "SD", type = SD.class)})
    protected List<Object> sdgOrSD;

    @Element(name = "SDG-CAPTION")
    protected SDGCAPTION sdgcaption;

    @Element(name = "SDG-CAPTION-REF")
    protected ODXLINK sdgcaptionref;

    @Attribute(name = "SI")
    protected String si;

    public SDGCAPTION getSDGCAPTION() {
        return this.sdgcaption;
    }

    public ODXLINK getSDGCAPTIONREF() {
        return this.sdgcaptionref;
    }

    public List<Object> getSDGOrSD() {
        if (this.sdgOrSD == null) {
            this.sdgOrSD = new ArrayList();
        }
        return this.sdgOrSD;
    }

    public String getSI() {
        return this.si;
    }

    public void setSDGCAPTION(SDGCAPTION sdgcaption) {
        this.sdgcaption = sdgcaption;
    }

    public void setSDGCAPTIONREF(ODXLINK odxlink) {
        this.sdgcaptionref = odxlink;
    }

    public void setSI(String str) {
        this.si = str;
    }
}
