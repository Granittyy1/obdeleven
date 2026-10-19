package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPANY-DATA-REF", "TEAM-MEMBER-REF", "DOC-LABEL", "SDGS"})
@Root(name = "COMPANY-DOC-INFO")
public class COMPANYDOCINFO {

    @Element(name = "COMPANY-DATA-REF", required = true)
    protected ODXLINK companydataref;

    @Element(name = "DOC-LABEL")
    protected String doclabel;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "TEAM-MEMBER-REF")
    protected ODXLINK teammemberref;

    public ODXLINK getCOMPANYDATAREF() {
        return this.companydataref;
    }

    public String getDOCLABEL() {
        return this.doclabel;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public ODXLINK getTEAMMEMBERREF() {
        return this.teammemberref;
    }

    public void setCOMPANYDATAREF(ODXLINK odxlink) {
        this.companydataref = odxlink;
    }

    public void setDOCLABEL(String str) {
        this.doclabel = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setTEAMMEMBERREF(ODXLINK odxlink) {
        this.teammemberref = odxlink;
    }
}
