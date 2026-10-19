package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SIMPLE-VALUE", "COMPLEX-VALUE", "DESC", "PROTOCOL-SNREF", "PROT-STACK-SNREF"})
@Root(name = "COMPARAM-REF", strict = false)
public class COMPARAMREF {

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

    @Element(name = "PROTOCOL-SNREF")
    protected SNREF protocolsnref;

    @Element(name = "PROT-STACK-SNREF")
    protected SNREF protstacksnref;

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

    public SNREF getPROTOCOLSNREF() {
        return this.protocolsnref;
    }

    public SNREF getPROTSTACKSNREF() {
        return this.protstacksnref;
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

    public void setPROTOCOLSNREF(SNREF snref) {
        this.protocolsnref = snref;
    }

    public void setPROTSTACKSNREF(SNREF snref) {
        this.protstacksnref = snref;
    }

    public void setREVISION(String str) {
        this.revision = str;
    }

    public void setSIMPLEVALUE(SIMPLEVALUE simplevalue) {
        this.simplevalue = simplevalue;
    }
}
