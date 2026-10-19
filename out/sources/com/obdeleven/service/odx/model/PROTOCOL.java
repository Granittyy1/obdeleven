package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPARAM-SPEC-REF", "PROT-STACK-SNREF", "PARENT-REFS"})
@Root(name = "PROTOCOL", strict = false)
public class PROTOCOL extends HIERARCHYELEMENT {

    @Element(name = "COMPARAM-SPEC-REF", required = true)
    protected ODXLINK comparamspecref;

    @Element(name = "PARENT-REFS")
    protected PARENTREFS parentrefs;

    @Element(name = "PROT-STACK-SNREF")
    protected SNREF protstacksnref;

    public ODXLINK getCOMPARAMSPECREF() {
        return this.comparamspecref;
    }

    public PARENTREFS getPARENTREFS() {
        return this.parentrefs;
    }

    public SNREF getPROTSTACKSNREF() {
        return this.protstacksnref;
    }

    public void setCOMPARAMSPECREF(ODXLINK odxlink) {
        this.comparamspecref = odxlink;
    }

    public void setPARENTREFS(PARENTREFS parentrefs) {
        this.parentrefs = parentrefs;
    }

    public void setPROTSTACKSNREF(SNREF snref) {
        this.protstacksnref = snref;
    }
}
