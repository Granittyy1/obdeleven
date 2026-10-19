package com.obdeleven.service.odx.model;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"TEAM-MEMBER-REF", "REVISION-LABEL", "STATE", "DATE", "TOOL", "COMPANY-REVISION-INFOS", "MODIFICATIONS"})
@Root(name = "DOC-REVISION")
public class DOCREVISION {

    @Element(name = "COMPANY-REVISION-INFOS")
    protected COMPANYREVISIONINFOS companyrevisioninfos;

    @Element(name = "DATE", required = true)
    protected Date date;

    @Element(name = "MODIFICATIONS")
    protected MODIFICATIONS modifications;

    @Element(name = "REVISION-LABEL")
    protected String revisionlabel;

    @Element(name = "STATE")
    protected String state;

    @Element(name = "TEAM-MEMBER-REF")
    protected ODXLINK teammemberref;

    @Element(name = "TOOL")
    protected String tool;

    public COMPANYREVISIONINFOS getCOMPANYREVISIONINFOS() {
        return this.companyrevisioninfos;
    }

    public Date getDATE() {
        return this.date;
    }

    public MODIFICATIONS getMODIFICATIONS() {
        return this.modifications;
    }

    public String getREVISIONLABEL() {
        return this.revisionlabel;
    }

    public String getSTATE() {
        return this.state;
    }

    public ODXLINK getTEAMMEMBERREF() {
        return this.teammemberref;
    }

    public String getTOOL() {
        return this.tool;
    }

    public void setCOMPANYREVISIONINFOS(COMPANYREVISIONINFOS companyrevisioninfos) {
        this.companyrevisioninfos = companyrevisioninfos;
    }

    public void setDATE(Date date) {
        this.date = date;
    }

    public void setMODIFICATIONS(MODIFICATIONS modifications) {
        this.modifications = modifications;
    }

    public void setREVISIONLABEL(String str) {
        this.revisionlabel = str;
    }

    public void setSTATE(String str) {
        this.state = str;
    }

    public void setTEAMMEMBERREF(ODXLINK odxlink) {
        this.teammemberref = odxlink;
    }

    public void setTOOL(String str) {
        this.tool = str;
    }
}
