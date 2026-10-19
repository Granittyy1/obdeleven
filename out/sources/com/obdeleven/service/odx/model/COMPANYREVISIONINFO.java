package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPANY-DATA-REF", "REVISION-LABEL", "STATE"})
@Root(name = "COMPANY-REVISION-INFO")
public class COMPANYREVISIONINFO {

    @Element(name = "COMPANY-DATA-REF", required = true)
    protected ODXLINK companydataref;

    @Element(name = "REVISION-LABEL")
    protected String revisionlabel;

    @Element(name = "STATE")
    protected String state;

    public ODXLINK getCOMPANYDATAREF() {
        return this.companydataref;
    }

    public String getREVISIONLABEL() {
        return this.revisionlabel;
    }

    public String getSTATE() {
        return this.state;
    }

    public void setCOMPANYDATAREF(ODXLINK odxlink) {
        this.companydataref = odxlink;
    }

    public void setREVISIONLABEL(String str) {
        this.revisionlabel = str;
    }

    public void setSTATE(String str) {
        this.state = str;
    }
}
