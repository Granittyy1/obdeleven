package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "GATEWAY-LOGICAL-LINK-REFS", "PHYSICAL-VEHICLE-LINK-REF", "PROTOCOL-REF", "FUNCTIONAL-GROUP-REF", "BASE-VARIANT-REF", "ECU-PROXY-REFS", "LINK-COMPARAM-REFS", "PROT-STACK-SNREF"})
@Root(name = "LOGICAL-LINK")
public class LOGICALLINK {

    @Element(name = "BASE-VARIANT-REF")
    protected ODXLINK basevariantref;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ECU-PROXY-REFS")
    protected ECUPROXYREFS ecuproxyrefs;

    @Element(name = "FUNCTIONAL-GROUP-REF")
    protected ODXLINK functionalgroupref;

    @Element(name = "GATEWAY-LOGICAL-LINK-REFS")
    protected GATEWAYLOGICALLINKREFS gatewaylogicallinkrefs;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LINK-COMPARAM-REFS")
    protected LINKCOMPARAMREFS linkcomparamrefs;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PHYSICAL-VEHICLE-LINK-REF", required = true)
    protected ODXLINK physicalvehiclelinkref;

    @Element(name = "PROTOCOL-REF")
    protected ODXLINK protocolref;

    @Element(name = "PROT-STACK-SNREF")
    protected SNREF protstacksnref;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public ODXLINK getBASEVARIANTREF() {
        return this.basevariantref;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ECUPROXYREFS getECUPROXYREFS() {
        return this.ecuproxyrefs;
    }

    public ODXLINK getFUNCTIONALGROUPREF() {
        return this.functionalgroupref;
    }

    public GATEWAYLOGICALLINKREFS getGATEWAYLOGICALLINKREFS() {
        return this.gatewaylogicallinkrefs;
    }

    public String getID() {
        return this.id;
    }

    public LINKCOMPARAMREFS getLINKCOMPARAMREFS() {
        return this.linkcomparamrefs;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public ODXLINK getPHYSICALVEHICLELINKREF() {
        return this.physicalvehiclelinkref;
    }

    public ODXLINK getPROTOCOLREF() {
        return this.protocolref;
    }

    public SNREF getPROTSTACKSNREF() {
        return this.protstacksnref;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setBASEVARIANTREF(ODXLINK odxlink) {
        this.basevariantref = odxlink;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setECUPROXYREFS(ECUPROXYREFS ecuproxyrefs) {
        this.ecuproxyrefs = ecuproxyrefs;
    }

    public void setFUNCTIONALGROUPREF(ODXLINK odxlink) {
        this.functionalgroupref = odxlink;
    }

    public void setGATEWAYLOGICALLINKREFS(GATEWAYLOGICALLINKREFS gatewaylogicallinkrefs) {
        this.gatewaylogicallinkrefs = gatewaylogicallinkrefs;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLINKCOMPARAMREFS(LINKCOMPARAMREFS linkcomparamrefs) {
        this.linkcomparamrefs = linkcomparamrefs;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPHYSICALVEHICLELINKREF(ODXLINK odxlink) {
        this.physicalvehiclelinkref = odxlink;
    }

    public void setPROTOCOLREF(ODXLINK odxlink) {
        this.protocolref = odxlink;
    }

    public void setPROTSTACKSNREF(SNREF snref) {
        this.protstacksnref = snref;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
