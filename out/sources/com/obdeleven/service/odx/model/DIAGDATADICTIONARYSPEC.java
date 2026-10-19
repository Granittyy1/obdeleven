package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"ADMIN-DATA", "DTC-DOPS", "ENV-DATA-DESCS", "DATA-OBJECT-PROPS", "STRUCTURES", "STATIC-FIELDS", "DYNAMIC-LENGTH-FIELDS", "DYNAMIC-ENDMARKER-FIELDS", "END-OF-PDU-FIELDS", "MUXS", "ENV-DATAS", "UNIT-SPEC", "TABLES", "SDGS"})
@Root(name = "DIAG-DATA-DICTIONARY-SPEC")
public class DIAGDATADICTIONARYSPEC {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "DATA-OBJECT-PROPS")
    protected DATAOBJECTPROPS dataobjectprops;

    @Element(name = "DTC-DOPS")
    protected DTCDOPS dtcdops;

    @Element(name = "DYNAMIC-ENDMARKER-FIELDS")
    protected DYNAMICENDMARKERFIELDS dynamicendmarkerfields;

    @Element(name = "DYNAMIC-LENGTH-FIELDS")
    protected DYNAMICLENGTHFIELDS dynamiclengthfields;

    @Element(name = "END-OF-PDU-FIELDS")
    protected ENDOFPDUFIELDS endofpdufields;

    @Element(name = "ENV-DATA-DESCS")
    protected ENVDATADESCS envdatadescs;

    @Element(name = "ENV-DATAS")
    protected ENVDATAS envdatas;

    @Element(name = "MUXS")
    protected MUXS muxs;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "STATIC-FIELDS")
    protected STATICFIELDS staticfields;

    @Element(name = "STRUCTURES")
    protected STRUCTURES structures;

    @Element(name = "TABLES")
    protected TABLES tables;

    @Element(name = "UNIT-SPEC")
    protected UNITSPEC unitspec;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public DATAOBJECTPROPS getDATAOBJECTPROPS() {
        return this.dataobjectprops;
    }

    public DTCDOPS getDTCDOPS() {
        return this.dtcdops;
    }

    public DYNAMICENDMARKERFIELDS getDYNAMICENDMARKERFIELDS() {
        return this.dynamicendmarkerfields;
    }

    public DYNAMICLENGTHFIELDS getDYNAMICLENGTHFIELDS() {
        return this.dynamiclengthfields;
    }

    public ENDOFPDUFIELDS getENDOFPDUFIELDS() {
        return this.endofpdufields;
    }

    public ENVDATADESCS getENVDATADESCS() {
        return this.envdatadescs;
    }

    public ENVDATAS getENVDATAS() {
        return this.envdatas;
    }

    public MUXS getMUXS() {
        return this.muxs;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public STATICFIELDS getSTATICFIELDS() {
        return this.staticfields;
    }

    public STRUCTURES getSTRUCTURES() {
        return this.structures;
    }

    public TABLES getTABLES() {
        return this.tables;
    }

    public UNITSPEC getUNITSPEC() {
        return this.unitspec;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setDATAOBJECTPROPS(DATAOBJECTPROPS dataobjectprops) {
        this.dataobjectprops = dataobjectprops;
    }

    public void setDTCDOPS(DTCDOPS dtcdops) {
        this.dtcdops = dtcdops;
    }

    public void setDYNAMICENDMARKERFIELDS(DYNAMICENDMARKERFIELDS dynamicendmarkerfields) {
        this.dynamicendmarkerfields = dynamicendmarkerfields;
    }

    public void setDYNAMICLENGTHFIELDS(DYNAMICLENGTHFIELDS dynamiclengthfields) {
        this.dynamiclengthfields = dynamiclengthfields;
    }

    public void setENDOFPDUFIELDS(ENDOFPDUFIELDS endofpdufields) {
        this.endofpdufields = endofpdufields;
    }

    public void setENVDATADESCS(ENVDATADESCS envdatadescs) {
        this.envdatadescs = envdatadescs;
    }

    public void setENVDATAS(ENVDATAS envdatas) {
        this.envdatas = envdatas;
    }

    public void setMUXS(MUXS muxs) {
        this.muxs = muxs;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSTATICFIELDS(STATICFIELDS staticfields) {
        this.staticfields = staticfields;
    }

    public void setSTRUCTURES(STRUCTURES structures) {
        this.structures = structures;
    }

    public void setTABLES(TABLES tables) {
        this.tables = tables;
    }

    public void setUNITSPEC(UNITSPEC unitspec) {
        this.unitspec = unitspec;
    }
}
