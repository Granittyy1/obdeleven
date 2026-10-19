package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BASIC-STRUCTURE-REF", "BASIC-STRUCTURE-SNREF", "ENV-DATA-DESC-REF", "ENV-DATA-DESC-SNREF"})
@Root(name = "FIELD")
public class FIELD extends COMPLEXDOP {

    @Element(name = "BASIC-STRUCTURE-REF")
    protected ODXLINK basicstructureref;

    @Element(name = "BASIC-STRUCTURE-SNREF")
    protected SNREF basicstructuresnref;

    @Element(name = "ENV-DATA-DESC-REF")
    protected ODXLINK envdatadescref;

    @Element(name = "ENV-DATA-DESC-SNREF")
    protected SNREF envdatadescsnref;

    @Attribute(name = "IS-VISIBLE")
    protected Boolean isvisible;

    public ODXLINK getBASICSTRUCTUREREF() {
        return this.basicstructureref;
    }

    public SNREF getBASICSTRUCTURESNREF() {
        return this.basicstructuresnref;
    }

    public ODXLINK getENVDATADESCREF() {
        return this.envdatadescref;
    }

    public SNREF getENVDATADESCSNREF() {
        return this.envdatadescsnref;
    }

    public boolean isISVISIBLE() {
        Boolean bool = this.isvisible;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setBASICSTRUCTUREREF(ODXLINK odxlink) {
        this.basicstructureref = odxlink;
    }

    public void setBASICSTRUCTURESNREF(SNREF snref) {
        this.basicstructuresnref = snref;
    }

    public void setENVDATADESCREF(ODXLINK odxlink) {
        this.envdatadescref = odxlink;
    }

    public void setENVDATADESCSNREF(SNREF snref) {
        this.envdatadescsnref = snref;
    }

    public void setISVISIBLE(Boolean bool) {
        this.isvisible = bool;
    }
}
