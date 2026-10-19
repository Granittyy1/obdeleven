package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "STRUCTURE-REF", "STRUCTURE-SNREF"})
@Root(name = "DEFAULT-CASE")
public class DEFAULTCASE {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;
    private e.c mDopBaseResult;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STRUCTURE-REF")
    protected ODXLINK structureref;

    @Element(name = "STRUCTURE-SNREF")
    protected SNREF structuresnref;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public ODXLINK getSTRUCTUREREF() {
        return this.structureref;
    }

    public SNREF getSTRUCTURESNREF() {
        return this.structuresnref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSTRUCTUREREF(ODXLINK odxlink) {
        this.structureref = odxlink;
    }

    public void setSTRUCTURESNREF(SNREF snref) {
        this.structuresnref = snref;
    }
}
