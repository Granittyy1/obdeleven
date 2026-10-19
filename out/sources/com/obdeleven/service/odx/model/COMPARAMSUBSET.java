package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPARAMS", "COMPLEX-COMPARAMS", "DATA-OBJECT-PROPS", "UNIT-SPEC"})
@Root(name = "COMPARAM-SUBSET")
public class COMPARAMSUBSET extends ODXCATEGORY {

    @Attribute(name = "CATEGORY", required = true)
    protected String category;

    @Element(name = "COMPARAMS")
    protected COMPARAMS comparams;

    @Element(name = "COMPLEX-COMPARAMS")
    protected COMPLEXCOMPARAMS complexcomparams;

    @Element(name = "DATA-OBJECT-PROPS")
    protected DATAOBJECTPROPS dataobjectprops;

    @Element(name = "UNIT-SPEC")
    protected UNITSPEC unitspec;

    public String getCATEGORY() {
        return this.category;
    }

    public COMPARAMS getCOMPARAMS() {
        return this.comparams;
    }

    public COMPLEXCOMPARAMS getCOMPLEXCOMPARAMS() {
        return this.complexcomparams;
    }

    public DATAOBJECTPROPS getDATAOBJECTPROPS() {
        return this.dataobjectprops;
    }

    public UNITSPEC getUNITSPEC() {
        return this.unitspec;
    }

    public void setCATEGORY(String str) {
        this.category = str;
    }

    public void setCOMPARAMS(COMPARAMS comparams) {
        this.comparams = comparams;
    }

    public void setCOMPLEXCOMPARAMS(COMPLEXCOMPARAMS complexcomparams) {
        this.complexcomparams = complexcomparams;
    }

    public void setDATAOBJECTPROPS(DATAOBJECTPROPS dataobjectprops) {
        this.dataobjectprops = dataobjectprops;
    }

    public void setUNITSPEC(UNITSPEC unitspec) {
        this.unitspec = unitspec;
    }
}
