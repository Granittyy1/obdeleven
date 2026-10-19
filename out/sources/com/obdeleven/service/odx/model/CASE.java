package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "STRUCTURE-REF", "STRUCTURE-SNREF", "LOWER-LIMIT", "UPPER-LIMIT"})
@Root(name = "CASE")
public class CASE {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "LOWER-LIMIT", required = true)
    protected LIMIT lowerlimit;
    private e.c mDopBaseResult;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STRUCTURE-REF")
    protected ODXLINK structureref;

    @Element(name = "STRUCTURE-SNREF")
    protected SNREF structuresnref;

    @Element(name = "UPPER-LIMIT", required = true)
    protected LIMIT upperlimit;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public LIMIT getLOWERLIMIT() {
        return this.lowerlimit;
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

    public LIMIT getUPPERLIMIT() {
        return this.upperlimit;
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

    public void setLOWERLIMIT(LIMIT limit) {
        this.lowerlimit = limit;
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

    public void setUPPERLIMIT(LIMIT limit) {
        this.upperlimit = limit;
    }
}
