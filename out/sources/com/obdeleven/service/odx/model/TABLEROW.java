package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import com.obdeleven.service.odx.e;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "KEY", "DATA-OBJECT-PROP-REF", "DATA-OBJECT-PROP-SNREF", "STRUCTURE-REF", "STRUCTURE-SNREF", "SDGS", "AUDIENCE", "FUNCT-CLASS-REFS", "STATE-TRANSITION-REFS", "PRE-CONDITION-STATE-REFS", "ADMIN-DATA"})
@Root(name = "TABLE-ROW")
public class TABLEROW {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "AUDIENCE")
    protected AUDIENCE audience;

    @Element(name = "DATA-OBJECT-PROP-REF")
    protected ODXLINK dataobjectpropref;

    @Element(name = "DATA-OBJECT-PROP-SNREF")
    protected SNREF dataobjectpropsnref;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

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

    @Element(name = "KEY", required = true)
    protected String key;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;
    private e.c mDopBaseResult;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PRE-CONDITION-STATE-REFS")
    protected PRECONDITIONSTATEREFS preconditionstaterefs;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STATE-TRANSITION-REFS")
    protected STATETRANSITIONREFS statetransitionrefs;

    @Element(name = "STRUCTURE-REF")
    protected ODXLINK structureref;

    @Element(name = "STRUCTURE-SNREF")
    protected SNREF structuresnref;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public AUDIENCE getAUDIENCE() {
        return this.audience;
    }

    public ODXLINK getDATAOBJECTPROPREF() {
        return this.dataobjectpropref;
    }

    public SNREF getDATAOBJECTPROPSNREF() {
        return this.dataobjectpropsnref;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public e.c getDopBaseResult() {
        return this.mDopBaseResult;
    }

    public FUNCTCLASSREFS getFUNCTCLASSREFS() {
        return this.functclassrefs;
    }

    public String getID() {
        return this.id;
    }

    public String getKEY() {
        return this.key;
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

    public ODXLINK getSTRUCTUREREF() {
        return this.structureref;
    }

    public SNREF getSTRUCTURESNREF() {
        return this.structuresnref;
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

    public void setDATAOBJECTPROPREF(ODXLINK odxlink) {
        this.dataobjectpropref = odxlink;
    }

    public void setDATAOBJECTPROPSNREF(SNREF snref) {
        this.dataobjectpropsnref = snref;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDopBaseResult(e.c cVar) {
        this.mDopBaseResult = cVar;
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

    public void setKEY(String str) {
        this.key = str;
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

    public void setSTRUCTUREREF(ODXLINK odxlink) {
        this.structureref = odxlink;
    }

    public void setSTRUCTURESNREF(SNREF snref) {
        this.structuresnref = snref;
    }
}
