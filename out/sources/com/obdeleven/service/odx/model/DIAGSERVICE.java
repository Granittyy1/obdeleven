package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPARAM-REFS", "REQUEST-REF", "POS-RESPONSE-REFS", "NEG-RESPONSE-REFS", "POS-RESPONSESUPPRESSABLE"})
@Root(name = "DIAG-SERVICE", strict = false)
public class DIAGSERVICE extends DIAGCOMM {

    @Attribute(name = "ADDRESSING")
    protected ADDRESSING addressing;

    @Element(name = "COMPARAM-REFS")
    protected COMPARAMREFS comparamrefs;

    @Attribute(name = "IS-CYCLIC")
    protected Boolean iscyclic;

    @Attribute(name = "IS-MULTIPLE")
    protected Boolean ismultiple;

    @Element(name = "NEG-RESPONSE-REFS")
    protected NEGRESPONSEREFS negresponserefs;

    @Element(name = "POS-RESPONSE-REFS")
    protected POSRESPONSEREFS posresponserefs;

    @Element(name = "POS-RESPONSESUPPRESSABLE")
    protected POSRESPONSESUPPRESSABLE posresponsesuppressable;

    @Element(name = "REQUEST-REF")
    protected ODXLINK requestref;

    @Attribute(name = "TRANSMISSIONMODE")
    @Convert(TRANSMODE.Converter.class)
    protected TRANSMODE transmissionmode;

    public ADDRESSING getADDRESSING() {
        ADDRESSING addressing = this.addressing;
        return addressing == null ? ADDRESSING.PHYSICAL : addressing;
    }

    public COMPARAMREFS getCOMPARAMREFS() {
        return this.comparamrefs;
    }

    public NEGRESPONSEREFS getNEGRESPONSEREFS() {
        return this.negresponserefs;
    }

    public POSRESPONSEREFS getPOSRESPONSEREFS() {
        return this.posresponserefs;
    }

    public POSRESPONSESUPPRESSABLE getPOSRESPONSESUPPRESSABLE() {
        return this.posresponsesuppressable;
    }

    public ODXLINK getREQUESTREF() {
        return this.requestref;
    }

    public TRANSMODE getTRANSMISSIONMODE() {
        TRANSMODE transmode = this.transmissionmode;
        return transmode == null ? TRANSMODE.SEND_AND_RECEIVE : transmode;
    }

    public boolean isISCYCLIC() {
        Boolean bool = this.iscyclic;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isISMULTIPLE() {
        Boolean bool = this.ismultiple;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setADDRESSING(ADDRESSING addressing) {
        this.addressing = addressing;
    }

    public void setCOMPARAMREFS(COMPARAMREFS comparamrefs) {
        this.comparamrefs = comparamrefs;
    }

    public void setISCYCLIC(Boolean bool) {
        this.iscyclic = bool;
    }

    public void setISMULTIPLE(Boolean bool) {
        this.ismultiple = bool;
    }

    public void setNEGRESPONSEREFS(NEGRESPONSEREFS negresponserefs) {
        this.negresponserefs = negresponserefs;
    }

    public void setPOSRESPONSEREFS(POSRESPONSEREFS posresponserefs) {
        this.posresponserefs = posresponserefs;
    }

    public void setPOSRESPONSESUPPRESSABLE(POSRESPONSESUPPRESSABLE posresponsesuppressable) {
        this.posresponsesuppressable = posresponsesuppressable;
    }

    public void setREQUESTREF(ODXLINK odxlink) {
        this.requestref = odxlink;
    }

    public void setTRANSMISSIONMODE(TRANSMODE transmode) {
        this.transmissionmode = transmode;
    }
}
