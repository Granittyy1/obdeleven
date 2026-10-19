package com.obdeleven.service.odx.model;

import com.braze.Constants;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"EXTERNAL-DOCS"})
@Root(name = "DESCRIPTION")
public class DESCRIPTION {

    @ElementListUnion({@ElementList(name = Constants.BRAZE_PUSH_PRIORITY_KEY, type = P.class), @ElementList(name = "ul", type = Ul.class), @ElementList(name = "ol", type = Ol.class)})
    protected List<Object> block;

    @Element(name = "EXTERNAL-DOCS")
    protected EXTERNALDOCS externaldocs;

    @Attribute(name = "TI")
    protected String ti;

    public List<Object> getBlock() {
        if (this.block == null) {
            this.block = new ArrayList();
        }
        return this.block;
    }

    public EXTERNALDOCS getEXTERNALDOCS() {
        return this.externaldocs;
    }

    public String getTI() {
        return this.ti;
    }

    public void setEXTERNALDOCS(EXTERNALDOCS externaldocs) {
        this.externaldocs = externaldocs;
    }

    public void setTI(String str) {
        this.ti = str;
    }
}
