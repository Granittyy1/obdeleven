package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "SDGS", "FUNCT-CLASS-REFS", "PROG-CODES", "INPUT-PARAMS", "OUTPUT-PARAMS", "NEG-OUTPUT-PARAMS", "DIAG-LAYER-REFS", "AUDIENCE"})
@Root(name = "MULTIPLE-ECU-JOB")
public class MULTIPLEECUJOB {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-LAYER-REFS")
    protected DIAGLAYERREFS diaglayerrefs;

    @Element(name = "FUNCT-CLASS-REFS")
    protected FUNCTCLASSREFS functclassrefs;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "INPUT-PARAMS")
    protected INPUTPARAMS inputparams;

    @Attribute(name = "IS-EXECUTABLE")
    protected Boolean isexecutable;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "NEG-OUTPUT-PARAMS")
    protected NEGOUTPUTPARAMS negoutputparams;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "OUTPUT-PARAMS")
    protected OUTPUTPARAMS outputparams;

    @Element(name = "PROG-CODES", required = true)
    protected PROGCODES progcodes;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DIAGLAYERREFS getDIAGLAYERREFS() {
        return this.diaglayerrefs;
    }

    public FUNCTCLASSREFS getFUNCTCLASSREFS() {
        return this.functclassrefs;
    }

    public String getID() {
        return this.id;
    }

    public INPUTPARAMS getINPUTPARAMS() {
        return this.inputparams;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public NEGOUTPUTPARAMS getNEGOUTPUTPARAMS() {
        return this.negoutputparams;
    }

    public String getOID() {
        return this.oid;
    }

    public OUTPUTPARAMS getOUTPUTPARAMS() {
        return this.outputparams;
    }

    public PROGCODES getPROGCODES() {
        return this.progcodes;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public boolean isISEXECUTABLE() {
        Boolean bool = this.isexecutable;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGLAYERREFS(DIAGLAYERREFS diaglayerrefs) {
        this.diaglayerrefs = diaglayerrefs;
    }

    public void setFUNCTCLASSREFS(FUNCTCLASSREFS functclassrefs) {
        this.functclassrefs = functclassrefs;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setINPUTPARAMS(INPUTPARAMS inputparams) {
        this.inputparams = inputparams;
    }

    public void setISEXECUTABLE(Boolean bool) {
        this.isexecutable = bool;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setNEGOUTPUTPARAMS(NEGOUTPUTPARAMS negoutputparams) {
        this.negoutputparams = negoutputparams;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setOUTPUTPARAMS(OUTPUTPARAMS outputparams) {
        this.outputparams = outputparams;
    }

    public void setPROGCODES(PROGCODES progcodes) {
        this.progcodes = progcodes;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
