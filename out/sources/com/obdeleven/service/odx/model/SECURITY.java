package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SECURITY-METHOD", "FW-SIGNATURE", "FW-CHECKSUM", "VALIDITY-FOR"})
@Root(name = "SECURITY")
public class SECURITY {

    @Element(name = "FW-CHECKSUM")
    protected FWCHECKSUM fwchecksum;

    @Element(name = "FW-SIGNATURE")
    protected FWSIGNATURE fwsignature;

    @Element(name = "SECURITY-METHOD")
    protected SECURITYMETHOD securitymethod;

    @Element(name = "VALIDITY-FOR")
    protected VALIDITYFOR validityfor;

    public FWCHECKSUM getFWCHECKSUM() {
        return this.fwchecksum;
    }

    public FWSIGNATURE getFWSIGNATURE() {
        return this.fwsignature;
    }

    public SECURITYMETHOD getSECURITYMETHOD() {
        return this.securitymethod;
    }

    public VALIDITYFOR getVALIDITYFOR() {
        return this.validityfor;
    }

    public void setFWCHECKSUM(FWCHECKSUM fwchecksum) {
        this.fwchecksum = fwchecksum;
    }

    public void setFWSIGNATURE(FWSIGNATURE fwsignature) {
        this.fwsignature = fwsignature;
    }

    public void setSECURITYMETHOD(SECURITYMETHOD securitymethod) {
        this.securitymethod = securitymethod;
    }

    public void setVALIDITYFOR(VALIDITYFOR validityfor) {
        this.validityfor = validityfor;
    }
}
