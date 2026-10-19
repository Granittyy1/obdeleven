package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "ADMIN-DATA", "FLASH-CLASSS", "SESSION-DESCS", "IDENT-DESCS", "ECU-MEM-REF", "LAYER-REFS", "ALL-VARIANT-REFS", "SDGS"})
@Root(name = "ECU-MEM-CONNECTOR")
public class ECUMEMCONNECTOR {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "ALL-VARIANT-REFS")
    protected ALLVARIANTREFS allvariantrefs;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "ECU-MEM-REF", required = true)
    protected ODXLINK ecumemref;

    @Element(name = "FLASH-CLASSS")
    protected FLASHCLASSS flashclasss;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "IDENT-DESCS")
    protected IDENTDESCS identdescs;

    @Element(name = "LAYER-REFS")
    protected LAYERREFS layerrefs;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SESSION-DESCS")
    protected SESSIONDESCS sessiondescs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public ALLVARIANTREFS getALLVARIANTREFS() {
        return this.allvariantrefs;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public ODXLINK getECUMEMREF() {
        return this.ecumemref;
    }

    public FLASHCLASSS getFLASHCLASSS() {
        return this.flashclasss;
    }

    public String getID() {
        return this.id;
    }

    public IDENTDESCS getIDENTDESCS() {
        return this.identdescs;
    }

    public LAYERREFS getLAYERREFS() {
        return this.layerrefs;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public SESSIONDESCS getSESSIONDESCS() {
        return this.sessiondescs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setALLVARIANTREFS(ALLVARIANTREFS allvariantrefs) {
        this.allvariantrefs = allvariantrefs;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setECUMEMREF(ODXLINK odxlink) {
        this.ecumemref = odxlink;
    }

    public void setFLASHCLASSS(FLASHCLASSS flashclasss) {
        this.flashclasss = flashclasss;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setIDENTDESCS(IDENTDESCS identdescs) {
        this.identdescs = identdescs;
    }

    public void setLAYERREFS(LAYERREFS layerrefs) {
        this.layerrefs = layerrefs;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSESSIONDESCS(SESSIONDESCS sessiondescs) {
        this.sessiondescs = sessiondescs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
