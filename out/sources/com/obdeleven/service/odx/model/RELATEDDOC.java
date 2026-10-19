package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"XDOC", "DESC"})
@Root(name = "RELATED-DOC")
public class RELATEDDOC {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "XDOC", required = true)
    protected XDOC xdoc;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public XDOC getXDOC() {
        return this.xdoc;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setXDOC(XDOC xdoc) {
        this.xdoc = xdoc;
    }
}
