package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DYN-END-DOP-REF")
public class DYNENDDOPREF {

    @Attribute(name = "DOCREF")
    protected String docref;

    @Attribute(name = "DOCTYPE")
    @Convert(DOCTYPE.Converter.class)
    protected DOCTYPE doctype;

    @Attribute(name = "ID-REF", required = true)
    protected String idref;

    @Attribute(name = "REVISION")
    protected String revision;

    @Element(name = "TERMINATION-VALUE", required = true)
    protected String terminationvalue;

    public String getDOCREF() {
        return this.docref;
    }

    public DOCTYPE getDOCTYPE() {
        return this.doctype;
    }

    public String getIDREF() {
        return this.idref;
    }

    public String getREVISION() {
        return this.revision;
    }

    public String getTERMINATIONVALUE() {
        return this.terminationvalue;
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

    public void setREVISION(String str) {
        this.revision = str;
    }

    public void setTERMINATIONVALUE(String str) {
        this.terminationvalue = str;
    }
}
