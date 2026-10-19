package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PARAM-SNREF", "PARAM-SNPATHREF", "ENV-DATA-REFS"})
@Root(name = "ENV-DATA-DESC")
public class ENVDATADESC extends COMPLEXDOP {

    @Element(name = "ENV-DATA-REFS")
    protected ENVDATAREFS envdatarefs;

    @Element(name = "ENV-DATAS")
    protected ENVDATAS envdatas;

    @Element(name = "PARAM-SNPATHREF")
    protected SNPATHREF paramsnpathref;

    @Element(name = "PARAM-SNREF")
    protected SNREF paramsnref;

    public ENVDATAREFS getENVDATAREFS() {
        return this.envdatarefs;
    }

    public SNPATHREF getPARAMSNPATHREF() {
        return this.paramsnpathref;
    }

    public SNREF getPARAMSNREF() {
        return this.paramsnref;
    }

    public void setENVDATAREFS(ENVDATAREFS envdatarefs) {
        this.envdatarefs = envdatarefs;
    }

    public void setPARAMSNPATHREF(SNPATHREF snpathref) {
        this.paramsnpathref = snpathref;
    }

    public void setPARAMSNREF(SNREF snref) {
        this.paramsnref = snref;
    }
}
