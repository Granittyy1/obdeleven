package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "AUDIENCE", "FUNCTION-IN-PARAMS", "FUNCTION-OUT-PARAMS", "COMPONENT-CONNECTORS", "MULTIPLE-ECU-JOB-REFS", "ADMIN-DATA", "SDG"})
@Root(name = "BASE-FUNCTION-NODE")
public class BASEFUNCTIONNODE {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "COMPONENT-CONNECTORS")
    protected COMPONENTCONNECTORS componentconnectors;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "FUNCTION-IN-PARAMS")
    protected FUNCTIONINPARAMS functioninparams;

    @Element(name = "FUNCTION-OUT-PARAMS")
    protected FUNCTIONOUTPARAMS functionoutparams;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "MULTIPLE-ECU-JOB-REFS")
    protected MULTIPLEECUJOBREFS multipleecujobrefs;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDG")
    protected SDG sdg;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public COMPONENTCONNECTORS getCOMPONENTCONNECTORS() {
        return this.componentconnectors;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public FUNCTIONINPARAMS getFUNCTIONINPARAMS() {
        return this.functioninparams;
    }

    public FUNCTIONOUTPARAMS getFUNCTIONOUTPARAMS() {
        return this.functionoutparams;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public MULTIPLEECUJOBREFS getMULTIPLEECUJOBREFS() {
        return this.multipleecujobrefs;
    }

    public String getOID() {
        return this.oid;
    }

    public SDG getSDG() {
        return this.sdg;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setAUDIENCE(AUDIENCE audience) {
        this.audience = audience;
    }

    public void setCOMPONENTCONNECTORS(COMPONENTCONNECTORS componentconnectors) {
        this.componentconnectors = componentconnectors;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setFUNCTIONINPARAMS(FUNCTIONINPARAMS functioninparams) {
        this.functioninparams = functioninparams;
    }

    public void setFUNCTIONOUTPARAMS(FUNCTIONOUTPARAMS functionoutparams) {
        this.functionoutparams = functionoutparams;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setMULTIPLEECUJOBREFS(MULTIPLEECUJOBREFS multipleecujobrefs) {
        this.multipleecujobrefs = multipleecujobrefs;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSDG(SDG sdg) {
        this.sdg = sdg;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
