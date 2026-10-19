package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"NOT-INHERITED-DIAG-COMMS", "NOT-INHERITED-VARIABLES", "NOT-INHERITED-DOPS", "NOT-INHERITED-TABLES", "NOT-INHERITED-GLOBAL-NEG-RESPONSES"})
@Root(name = "PARENT-REF", strict = false)
public class PARENTREF {

    @Attribute(name = "DOCREF")
    protected String docref;

    @Attribute(name = "DOCTYPE")
    protected DOCTYPE doctype;

    @Attribute(name = "ID-REF", required = true)
    protected String idref;

    @Element(name = "NOT-INHERITED-DIAG-COMMS")
    protected NOTINHERITEDDIAGCOMMS notinheriteddiagcomms;

    @Element(name = "NOT-INHERITED-DOPS")
    protected NOTINHERITEDDOPS notinheriteddops;

    @Element(name = "NOT-INHERITED-GLOBAL-NEG-RESPONSES")
    protected NOTINHERITEDGLOBALNEGRESPONSES notinheritedglobalnegresponses;

    @Element(name = "NOT-INHERITED-TABLES")
    protected NOTINHERITEDTABLES notinheritedtables;

    @Element(name = "NOT-INHERITED-VARIABLES")
    protected NOTINHERITEDVARIABLES notinheritedvariables;

    @Attribute(name = "REVISION")
    protected String revision;

    @Attribute(name = "type")
    protected String type;

    public String getDOCREF() {
        return this.docref;
    }

    public DOCTYPE getDOCTYPE() {
        return this.doctype;
    }

    public String getIDREF() {
        return this.idref;
    }

    public NOTINHERITEDDIAGCOMMS getNOTINHERITEDDIAGCOMMS() {
        return this.notinheriteddiagcomms;
    }

    public NOTINHERITEDDOPS getNOTINHERITEDDOPS() {
        return this.notinheriteddops;
    }

    public NOTINHERITEDGLOBALNEGRESPONSES getNOTINHERITEDGLOBALNEGRESPONSES() {
        return this.notinheritedglobalnegresponses;
    }

    public NOTINHERITEDTABLES getNOTINHERITEDTABLES() {
        return this.notinheritedtables;
    }

    public NOTINHERITEDVARIABLES getNOTINHERITEDVARIABLES() {
        return this.notinheritedvariables;
    }

    public String getREVISION() {
        return this.revision;
    }

    public String getType() {
        return this.type;
    }

    public void setDOCREF(String str) {
        this.docref = str;
    }

    public void setDOCTYPE(DOCTYPE doctype) {
        this.doctype = doctype;
    }

    public void setIDREF(String str) {
        this.idref = str;
    }

    public void setNOTINHERITEDDIAGCOMMS(NOTINHERITEDDIAGCOMMS notinheriteddiagcomms) {
        this.notinheriteddiagcomms = notinheriteddiagcomms;
    }

    public void setNOTINHERITEDDOPS(NOTINHERITEDDOPS notinheriteddops) {
        this.notinheriteddops = notinheriteddops;
    }

    public void setNOTINHERITEDGLOBALNEGRESPONSES(NOTINHERITEDGLOBALNEGRESPONSES notinheritedglobalnegresponses) {
        this.notinheritedglobalnegresponses = notinheritedglobalnegresponses;
    }

    public void setNOTINHERITEDTABLES(NOTINHERITEDTABLES notinheritedtables) {
        this.notinheritedtables = notinheritedtables;
    }

    public void setNOTINHERITEDVARIABLES(NOTINHERITEDVARIABLES notinheritedvariables) {
        this.notinheritedvariables = notinheritedvariables;
    }

    public void setREVISION(String str) {
        this.revision = str;
    }
}
