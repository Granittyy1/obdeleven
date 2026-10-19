package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "EXTERN-FLASHDATA")
public class EXTERNFLASHDATA extends FLASHDATA {

    @Element(name = "DATAFILE", required = true)
    protected DATAFILE datafile;

    public DATAFILE getDATAFILE() {
        return this.datafile;
    }

    public void setDATAFILE(DATAFILE datafile) {
        this.datafile = datafile;
    }
}
