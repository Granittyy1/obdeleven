package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "UNIT-REF", "PHYSICAL-TYPE", "IN-PARAM-IF-SNREF", "FUNCTION-DIAG-COMMCONNECTOR"})
@Root(name = "FUNCTION-IN-PARAM")
public class FUNCTIONINPARAM {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "FUNCTION-DIAG-COMMCONNECTOR")
    protected FUNCTIONDIAGCOMMCONNECTOR functiondiagcommconnector;

    @Element(name = "IN-PARAM-IF-SNREF")
    protected SNREF inparamifsnref;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "PHYSICAL-TYPE", required = true)
    protected PHYSICALTYPE physicaltype;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "UNIT-REF")
    protected ODXLINK unitref;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public FUNCTIONDIAGCOMMCONNECTOR getFUNCTIONDIAGCOMMCONNECTOR() {
        return this.functiondiagcommconnector;
    }

    public SNREF getINPARAMIFSNREF() {
        return this.inparamifsnref;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public PHYSICALTYPE getPHYSICALTYPE() {
        return this.physicaltype;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public ODXLINK getUNITREF() {
        return this.unitref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setFUNCTIONDIAGCOMMCONNECTOR(FUNCTIONDIAGCOMMCONNECTOR functiondiagcommconnector) {
        this.functiondiagcommconnector = functiondiagcommconnector;
    }

    public void setINPARAMIFSNREF(SNREF snref) {
        this.inparamifsnref = snref;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setPHYSICALTYPE(PHYSICALTYPE physicaltype) {
        this.physicaltype = physicaltype;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setUNITREF(ODXLINK odxlink) {
        this.unitref = odxlink;
    }
}
