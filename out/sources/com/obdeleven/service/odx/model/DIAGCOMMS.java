package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DIAG-COMMS")
public class DIAGCOMMS {

    @ElementListUnion({@ElementList(entry = "SINGLE-ECU-JOB", inline = true, type = SINGLEECUJOB.class), @ElementList(entry = "DIAG-COMM-REF", inline = true, type = ODXLINK.class)})
    protected List<Object> diagcommproxy;

    @ElementList(entry = "DIAG-SERVICE", inline = true, type = DIAGSERVICE.class)
    protected List<DIAGSERVICE> diagservices;

    public List<Object> getDIAGCOMMPROXY() {
        if (this.diagcommproxy == null) {
            this.diagcommproxy = new ArrayList();
        }
        return this.diagcommproxy;
    }

    public List<DIAGSERVICE> getDIAGSERVICES() {
        if (this.diagservices == null) {
            this.diagservices = new ArrayList();
        }
        return this.diagservices;
    }
}
