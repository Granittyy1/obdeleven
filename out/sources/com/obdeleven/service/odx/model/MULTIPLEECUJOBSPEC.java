package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"MULTIPLE-ECU-JOBS", "DIAG-DATADICTIONARY-SPEC", "FUNCT-CLASSS", "ADDITIONAL-AUDIENCES", "IMPORT-REFS"})
@Root(name = "MULTIPLE-ECU-JOB-SPEC")
public class MULTIPLEECUJOBSPEC extends ODXCATEGORY {

    @Element(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

    @Element(name = "DIAG-DATADICTIONARY-SPEC")
    protected DIAGDATADICTIONARYSPEC diagdatadictionaryspec;

    @Element(name = "FUNCT-CLASSS")
    protected FUNCTCLASSS functclasss;

    @Element(name = "IMPORT-REFS")
    protected IMPORTREFS importrefs;

    @Element(name = "MULTIPLE-ECU-JOBS")
    protected MULTIPLEECUJOBS multipleecujobs;

    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return this.additionalaudiences;
    }

    public DIAGDATADICTIONARYSPEC getDIAGDATADICTIONARYSPEC() {
        return this.diagdatadictionaryspec;
    }

    public FUNCTCLASSS getFUNCTCLASSS() {
        return this.functclasss;
    }

    public IMPORTREFS getIMPORTREFS() {
        return this.importrefs;
    }

    public MULTIPLEECUJOBS getMULTIPLEECUJOBS() {
        return this.multipleecujobs;
    }

    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES additionalaudiences) {
        this.additionalaudiences = additionalaudiences;
    }

    public void setDIAGDATADICTIONARYSPEC(DIAGDATADICTIONARYSPEC diagdatadictionaryspec) {
        this.diagdatadictionaryspec = diagdatadictionaryspec;
    }

    public void setFUNCTCLASSS(FUNCTCLASSS functclasss) {
        this.functclasss = functclasss;
    }

    public void setIMPORTREFS(IMPORTREFS importrefs) {
        this.importrefs = importrefs;
    }

    public void setMULTIPLEECUJOBS(MULTIPLEECUJOBS multipleecujobs) {
        this.multipleecujobs = multipleecujobs;
    }
}
