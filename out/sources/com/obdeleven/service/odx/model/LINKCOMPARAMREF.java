package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SIMPLE-VALUE", "COMPLEX-VALUE", "DESC"})
@Root(name = "LINK-COMPARAM-REF")
public class LINKCOMPARAMREF {

    @Element(name = "COMPLEX-VALUE")
    protected COMPLEXVALUE complexvalue;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "DOCREF")
    protected String docref;

    @Attribute(name = "DOCTYPE")
    @Convert(DOCTYPE.Converter.class)
    protected DOCTYPE doctype;

    @Attribute(name = "ID-REF", required = true)
    protected String idref;

    @Attribute(name = "REVISION")
    protected String revision;

    @Element(name = "SIMPLE-VALUE")
    protected SIMPLEVALUE simplevalue;

    public COMPLEXVALUE getCOMPLEXVALUE() {
        return this.complexvalue;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

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

    public SIMPLEVALUE getSIMPLEVALUE() {
        return this.simplevalue;
    }

    public void setCOMPLEXVALUE(COMPLEXVALUE complexvalue) {
        this.complexvalue = complexvalue;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
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

    public void setSIMPLEVALUE(SIMPLEVALUE simplevalue) {
        this.simplevalue = simplevalue;
    }
}
