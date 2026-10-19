package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"PROG-CODES", "INPUT-PARAMS", "OUTPUT-PARAMS", "NEG-OUTPUT-PARAMS"})
@Root(name = "SINGLE-ECU-JOB")
public class SINGLEECUJOB extends DIAGCOMM {

    @Element(name = "INPUT-PARAMS")
    protected INPUTPARAMS inputparams;

    @Element(name = "NEG-OUTPUT-PARAMS")
    protected NEGOUTPUTPARAMS negoutputparams;

    @Element(name = "OUTPUT-PARAMS")
    protected OUTPUTPARAMS outputparams;

    @Element(name = "PROG-CODES", required = true)
    protected PROGCODES progcodes;

    public INPUTPARAMS getINPUTPARAMS() {
        return this.inputparams;
    }

    public NEGOUTPUTPARAMS getNEGOUTPUTPARAMS() {
        return this.negoutputparams;
    }

    public OUTPUTPARAMS getOUTPUTPARAMS() {
        return this.outputparams;
    }

    public PROGCODES getPROGCODES() {
        return this.progcodes;
    }

    public void setINPUTPARAMS(INPUTPARAMS inputparams) {
        this.inputparams = inputparams;
    }

    public void setNEGOUTPUTPARAMS(NEGOUTPUTPARAMS negoutputparams) {
        this.negoutputparams = negoutputparams;
    }

    public void setOUTPUTPARAMS(OUTPUTPARAMS outputparams) {
        this.outputparams = outputparams;
    }

    public void setPROGCODES(PROGCODES progcodes) {
        this.progcodes = progcodes;
    }
}
