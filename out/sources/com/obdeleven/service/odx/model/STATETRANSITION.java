package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SOURCE-SNREF", "TARGET-SNREF", "EXTERNAL-ACCESS-METHOD"})
@Root(name = "STATE-TRANSITION")
public class STATETRANSITION {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "EXTERNAL-ACCESS-METHOD")
    protected EXTERNALACCESSMETHOD externalaccessmethod;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SOURCE-SNREF", required = true)
    protected SNREF sourcesnref;

    @Element(name = "TARGET-SNREF", required = true)
    protected SNREF targetsnref;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public EXTERNALACCESSMETHOD getEXTERNALACCESSMETHOD() {
        return this.externalaccessmethod;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public SNREF getSOURCESNREF() {
        return this.sourcesnref;
    }

    public SNREF getTARGETSNREF() {
        return this.targetsnref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setEXTERNALACCESSMETHOD(EXTERNALACCESSMETHOD externalaccessmethod) {
        this.externalaccessmethod = externalaccessmethod;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSOURCESNREF(SNREF snref) {
        this.sourcesnref = snref;
    }

    public void setTARGETSNREF(SNREF snref) {
        this.targetsnref = snref;
    }
}
