package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "COMPANY-DATAS", "FUNCT-CLASSS", "DIAG-DATA-DICTIONARYSPEC", "DIAG-COMMS", "REQUESTS", "POS-RESPONSES", "NEG-RESPONSES", "GLOBAL-NEG-RESPONSES", "IMPORT-REFS", "STATE-CHARTS", "ADDITIONAL-AUDIENCES", "SUB-COMPONENTS", "LIBRARYS", "SDGS"})
@Root(name = "DIAG-LAYER")
public class DIAGLAYER {

    @Element(name = "ADDITIONAL-AUDIENCES")
    protected ADDITIONALAUDIENCES additionalaudiences;

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "COMPANY-DATAS")
    protected COMPANYDATAS companydatas;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-COMMS")
    protected DIAGCOMMS diagcomms;

    @Element(name = "DIAG-DATA-DICTIONARY-SPEC")
    protected DIAGDATADICTIONARYSPEC diagdatadictionaryspec;

    @Element(name = "FUNCT-CLASSS")
    protected FUNCTCLASSS functclasss;

    @Element(name = "GLOBAL-NEG-RESPONSES")
    protected GLOBALNEGRESPONSES globalnegresponses;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "IMPORT-REFS")
    protected IMPORTREFS importrefs;

    @Element(name = "LIBRARYS")
    protected LIBRARYS librarys;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "NEG-RESPONSES")
    protected NEGRESPONSES negresponses;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "POS-RESPONSES")
    protected POSRESPONSES posresponses;

    @Element(name = "REQUESTS")
    protected REQUESTS requests;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STATE-CHARTS")
    protected STATECHARTS statecharts;

    @Element(name = "SUB-COMPONENTS")
    protected SUBCOMPONENTS subcomponents;

    public ADDITIONALAUDIENCES getADDITIONALAUDIENCES() {
        return this.additionalaudiences;
    }

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public COMPANYDATAS getCOMPANYDATAS() {
        return this.companydatas;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DIAGCOMMS getDIAGCOMMS() {
        return this.diagcomms;
    }

    public DIAGDATADICTIONARYSPEC getDIAGDATADICTIONARYSPEC() {
        return this.diagdatadictionaryspec;
    }

    public FUNCTCLASSS getFUNCTCLASSS() {
        return this.functclasss;
    }

    public GLOBALNEGRESPONSES getGLOBALNEGRESPONSES() {
        return this.globalnegresponses;
    }

    public String getID() {
        return this.id;
    }

    public IMPORTREFS getIMPORTREFS() {
        return this.importrefs;
    }

    public LIBRARYS getLIBRARYS() {
        return this.librarys;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public NEGRESPONSES getNEGRESPONSES() {
        return this.negresponses;
    }

    public String getOID() {
        return this.oid;
    }

    public POSRESPONSES getPOSRESPONSES() {
        return this.posresponses;
    }

    public REQUESTS getREQUESTS() {
        return this.requests;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public STATECHARTS getSTATECHARTS() {
        return this.statecharts;
    }

    public SUBCOMPONENTS getSUBCOMPONENTS() {
        return this.subcomponents;
    }

    public void setADDITIONALAUDIENCES(ADDITIONALAUDIENCES additionalaudiences) {
        this.additionalaudiences = additionalaudiences;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setCOMPANYDATAS(COMPANYDATAS companydatas) {
        this.companydatas = companydatas;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCOMMS(DIAGCOMMS diagcomms) {
        this.diagcomms = diagcomms;
    }

    public void setDIAGDATADICTIONARYSPEC(DIAGDATADICTIONARYSPEC diagdatadictionaryspec) {
        this.diagdatadictionaryspec = diagdatadictionaryspec;
    }

    public void setFUNCTCLASSS(FUNCTCLASSS functclasss) {
        this.functclasss = functclasss;
    }

    public void setGLOBALNEGRESPONSES(GLOBALNEGRESPONSES globalnegresponses) {
        this.globalnegresponses = globalnegresponses;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setIMPORTREFS(IMPORTREFS importrefs) {
        this.importrefs = importrefs;
    }

    public void setLIBRARYS(LIBRARYS librarys) {
        this.librarys = librarys;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setNEGRESPONSES(NEGRESPONSES negresponses) {
        this.negresponses = negresponses;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPOSRESPONSES(POSRESPONSES posresponses) {
        this.posresponses = posresponses;
    }

    public void setREQUESTS(REQUESTS requests) {
        this.requests = requests;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSTATECHARTS(STATECHARTS statecharts) {
        this.statecharts = statecharts;
    }

    public void setSUBCOMPONENTS(SUBCOMPONENTS subcomponents) {
        this.subcomponents = subcomponents;
    }
}
