package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "RELATED-DIAG-COMM-REF")
public class RELATEDDIAGCOMMREF {

    @Attribute(name = "DOCREF")
    protected String docref;

    @Attribute(name = "DOCTYPE")
    @Convert(DOCTYPE.Converter.class)
    protected DOCTYPE doctype;

    @Attribute(name = "ID-REF", required = true)
    protected String idref;

    @Element(name = "RELATION-TYPE", required = true)
    protected String relationtype;

    @Attribute(name = "REVISION")
    protected String revision;

    public String getDOCREF() {
        return this.docref;
    }

    public DOCTYPE getDOCTYPE() {
        return this.doctype;
    }

    public String getIDREF() {
        return this.idref;
    }

    public String getRELATIONTYPE() {
        return this.relationtype;
    }

    public String getREVISION() {
        return this.revision;
    }

    public void setDOCREF(String str) {
        this.docref = str;
    }

    public void setDOCTYPE(DOCTYPE doctype) {
        this.doctype = doctype;
    }

    public void setIDREF(String str) {
        this.idref = str;
    }

    public void setRELATIONTYPE(String str) {
        this.relationtype = str;
    }

    public void setREVISION(String str) {
        this.revision = str;
    }
}
