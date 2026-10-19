package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "VALID-BASE-VARIANTS", "CONFIG-RECORDS", "SDGS"})
@Root(name = "CONFIG-DATA")
public class CONFIGDATA {

    @Element(name = "CONFIG-RECORDS")
    protected CONFIGRECORDS configrecords;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "VALID-BASE-VARIANTS", required = true)
    protected VALIDBASEVARIANTS validbasevariants;

    public CONFIGRECORDS getCONFIGRECORDS() {
        return this.configrecords;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public VALIDBASEVARIANTS getVALIDBASEVARIANTS() {
        return this.validbasevariants;
    }

    public void setCONFIGRECORDS(CONFIGRECORDS configrecords) {
        this.configrecords = configrecords;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setVALIDBASEVARIANTS(VALIDBASEVARIANTS validbasevariants) {
        this.validbasevariants = validbasevariants;
    }
}
