package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"DIAG-LAYER-CONTAINER", "COMPARAM-SPEC", "VEHICLE-INFO-SPEC", "FLASH", "ECU-CONFIG", "MULTIPLE-ECU-JOB-SPEC", "COMPARAM-SUBSET", "FUNCTION-DICTIONARY"})
@Root(name = "ODX", strict = false)
public class ODX {

    @Element(name = "COMPARAM-SPEC")
    protected COMPARAMSPEC comparamspec;

    @Element(name = "COMPARAM-SUBSET")
    protected COMPARAMSUBSET comparamsubset;

    @Element(name = "DIAG-LAYER-CONTAINER")
    protected DIAGLAYERCONTAINER diaglayercontainer;

    @Element(name = "ECU-CONFIG")
    protected ECUCONFIG ecuconfig;
    protected String fileName;

    @Element(name = "FLASH")
    protected FLASH flash;

    @Element(name = "FUNCTION-DICTIONARY")
    protected FUNCTIONDICTIONARY functiondictionary;

    @Attribute(name = "MODEL-VERSION", required = true)
    protected String modelversion;

    @Element(name = "MULTIPLE-ECU-JOB-SPEC")
    protected MULTIPLEECUJOBSPEC multipleecujobspec;

    @Element(name = "VEHICLE-INFO-SPEC")
    protected VEHICLEINFOSPEC vehicleinfospec;

    public COMPARAMSPEC getCOMPARAMSPEC() {
        return this.comparamspec;
    }

    public COMPARAMSUBSET getCOMPARAMSUBSET() {
        return this.comparamsubset;
    }

    public DIAGLAYERCONTAINER getDIAGLAYERCONTAINER() {
        return this.diaglayercontainer;
    }

    public ECUCONFIG getECUCONFIG() {
        return this.ecuconfig;
    }

    public FLASH getFLASH() {
        return this.flash;
    }

    public FUNCTIONDICTIONARY getFUNCTIONDICTIONARY() {
        return this.functiondictionary;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getMODELVERSION() {
        String str = this.modelversion;
        return str == null ? "2.2.0" : str;
    }

    public MULTIPLEECUJOBSPEC getMULTIPLEECUJOBSPEC() {
        return this.multipleecujobspec;
    }

    public VEHICLEINFOSPEC getVEHICLEINFOSPEC() {
        return this.vehicleinfospec;
    }

    public void setCOMPARAMSPEC(COMPARAMSPEC comparamspec) {
        this.comparamspec = comparamspec;
    }

    public void setCOMPARAMSUBSET(COMPARAMSUBSET comparamsubset) {
        this.comparamsubset = comparamsubset;
    }

    public void setDIAGLAYERCONTAINER(DIAGLAYERCONTAINER diaglayercontainer) {
        this.diaglayercontainer = diaglayercontainer;
    }

    public void setECUCONFIG(ECUCONFIG ecuconfig) {
        this.ecuconfig = ecuconfig;
    }

    public void setFLASH(FLASH flash) {
        this.flash = flash;
    }

    public void setFUNCTIONDICTIONARY(FUNCTIONDICTIONARY functiondictionary) {
        this.functiondictionary = functiondictionary;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setMODELVERSION(String str) {
        this.modelversion = str;
    }

    public void setMULTIPLEECUJOBSPEC(MULTIPLEECUJOBSPEC multipleecujobspec) {
        this.multipleecujobspec = multipleecujobspec;
    }

    public void setVEHICLEINFOSPEC(VEHICLEINFOSPEC vehicleinfospec) {
        this.vehicleinfospec = vehicleinfospec;
    }
}
