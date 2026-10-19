package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DEF-MODE", "CLEAR-DYN-DEF-MESSAGE-REF", "CLEAR-DYN-DEF-MESSAGE-SNREF", "READ-DYN-DEF-MESSAGE-REF", "READ-DYN-DEF-MESSAGE-SNREF", "DYN-DEF-MESSAGE-REF", "DYN-DEF-MESSAGE-SNREF", "SUPPORTED-DYN-IDS", "SELECTION-TABLE-REFS"})
@Root(name = "DYN-ID-DEF-MODE-INFO")
public class DYNIDDEFMODEINFO {

    @Element(name = "CLEAR-DYN-DEF-MESSAGE-REF")
    protected ODXLINK cleardyndefmessageref;

    @Element(name = "CLEAR-DYN-DEF-MESSAGE-SNREF")
    protected SNREF cleardyndefmessagesnref;

    @Element(name = "DEF-MODE", required = true)
    protected String defmode;

    @Element(name = "DYN-DEF-MESSAGE-REF")
    protected ODXLINK dyndefmessageref;

    @Element(name = "DYN-DEF-MESSAGE-SNREF")
    protected SNREF dyndefmessagesnref;

    @Element(name = "READ-DYN-DEF-MESSAGE-REF")
    protected ODXLINK readdyndefmessageref;

    @Element(name = "READ-DYN-DEF-MESSAGE-SNREF")
    protected SNREF readdyndefmessagesnref;

    @Element(name = "SELECTION-TABLE-REFS")
    protected SELECTIONTABLEREFS selectiontablerefs;

    @Element(name = "SUPPORTED-DYN-IDS")
    protected SUPPORTEDDYNIDS supporteddynids;

    public ODXLINK getCLEARDYNDEFMESSAGEREF() {
        return this.cleardyndefmessageref;
    }

    public SNREF getCLEARDYNDEFMESSAGESNREF() {
        return this.cleardyndefmessagesnref;
    }

    public String getDEFMODE() {
        return this.defmode;
    }

    public ODXLINK getDYNDEFMESSAGEREF() {
        return this.dyndefmessageref;
    }

    public SNREF getDYNDEFMESSAGESNREF() {
        return this.dyndefmessagesnref;
    }

    public ODXLINK getREADDYNDEFMESSAGEREF() {
        return this.readdyndefmessageref;
    }

    public SNREF getREADDYNDEFMESSAGESNREF() {
        return this.readdyndefmessagesnref;
    }

    public SELECTIONTABLEREFS getSELECTIONTABLEREFS() {
        return this.selectiontablerefs;
    }

    public SUPPORTEDDYNIDS getSUPPORTEDDYNIDS() {
        return this.supporteddynids;
    }

    public void setCLEARDYNDEFMESSAGEREF(ODXLINK odxlink) {
        this.cleardyndefmessageref = odxlink;
    }

    public void setCLEARDYNDEFMESSAGESNREF(SNREF snref) {
        this.cleardyndefmessagesnref = snref;
    }

    public void setDEFMODE(String str) {
        this.defmode = str;
    }

    public void setDYNDEFMESSAGEREF(ODXLINK odxlink) {
        this.dyndefmessageref = odxlink;
    }

    public void setDYNDEFMESSAGESNREF(SNREF snref) {
        this.dyndefmessagesnref = snref;
    }

    public void setREADDYNDEFMESSAGEREF(ODXLINK odxlink) {
        this.readdyndefmessageref = odxlink;
    }

    public void setREADDYNDEFMESSAGESNREF(SNREF snref) {
        this.readdyndefmessagesnref = snref;
    }

    public void setSELECTIONTABLEREFS(SELECTIONTABLEREFS selectiontablerefs) {
        this.selectiontablerefs = selectiontablerefs;
    }

    public void setSUPPORTEDDYNIDS(SUPPORTEDDYNIDS supporteddynids) {
        this.supporteddynids = supporteddynids;
    }
}
