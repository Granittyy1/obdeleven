package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "SDGS", "FUNCT-CLASS-REFS", "AUDIENCE", "PROTOCOL-SNREFS", "RELATED-DIAG-COMM-REFS", "PRE-CONDITION-STATE-REFS", "STATE-TRANSITION-REFS"})
@Root(name = "DIAG-COMM")
public class DIAGCOMM {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "DIAGNOSTIC-CLASS")
    @Convert(DIAGCLASSTYPE.Converter.class)
    protected DIAGCLASSTYPE diagnosticclass;

    @Element(name = "FUNCT-CLASS-REFS")
    protected FUNCTCLASSREFS functclassrefs;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Attribute(name = "IS-EXECUTABLE")
    protected Boolean isexecutable;

    @Attribute(name = "IS-FINAL")
    protected Boolean isfinal;

    @Attribute(name = "IS-MANDATORY")
    protected Boolean ismandatory;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PRE-CONDITION-STATE-REFS")
    protected PRECONDITIONSTATEREFS preconditionstaterefs;

    @Element(name = "PROTOCOL-SNREFS")
    protected PROTOCOLSNREFS protocolsnrefs;

    @Element(name = "RELATED-DIAG-COMM-REFS")
    protected RELATEDDIAGCOMMREFS relateddiagcommrefs;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STATE-TRANSITION-REFS")
    protected STATETRANSITIONREFS statetransitionrefs;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DIAGCLASSTYPE getDIAGNOSTICCLASS() {
        return this.diagnosticclass;
    }

    public FUNCTCLASSREFS getFUNCTCLASSREFS() {
        return this.functclassrefs;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public PRECONDITIONSTATEREFS getPRECONDITIONSTATEREFS() {
        return this.preconditionstaterefs;
    }

    public PROTOCOLSNREFS getPROTOCOLSNREFS() {
        return this.protocolsnrefs;
    }

    public RELATEDDIAGCOMMREFS getRELATEDDIAGCOMMREFS() {
        return this.relateddiagcommrefs;
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

    public STATETRANSITIONREFS getSTATETRANSITIONREFS() {
        return this.statetransitionrefs;
    }

    public boolean isISEXECUTABLE() {
        Boolean bool = this.isexecutable;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean isISFINAL() {
        Boolean bool = this.isfinal;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isISMANDATORY() {
        Boolean bool = this.ismandatory;
        if (bool == null) {
            return false;
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

    public void setDIAGNOSTICCLASS(DIAGCLASSTYPE diagclasstype) {
        this.diagnosticclass = diagclasstype;
    }

    public void setFUNCTCLASSREFS(FUNCTCLASSREFS functclassrefs) {
        this.functclassrefs = functclassrefs;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setISEXECUTABLE(Boolean bool) {
        this.isexecutable = bool;
    }

    public void setISFINAL(Boolean bool) {
        this.isfinal = bool;
    }

    public void setISMANDATORY(Boolean bool) {
        this.ismandatory = bool;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPRECONDITIONSTATEREFS(PRECONDITIONSTATEREFS preconditionstaterefs) {
        this.preconditionstaterefs = preconditionstaterefs;
    }

    public void setPROTOCOLSNREFS(PROTOCOLSNREFS protocolsnrefs) {
        this.protocolsnrefs = protocolsnrefs;
    }

    public void setRELATEDDIAGCOMMREFS(RELATEDDIAGCOMMREFS relateddiagcommrefs) {
        this.relateddiagcommrefs = relateddiagcommrefs;
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

    public void setSTATETRANSITIONREFS(STATETRANSITIONREFS statetransitionrefs) {
        this.statetransitionrefs = statetransitionrefs;
    }
}
