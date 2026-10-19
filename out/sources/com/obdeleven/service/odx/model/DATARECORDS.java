package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DATA-RECORDS")
public class DATARECORDS {

    @ElementList(inline = true, name = "DATA-RECORD", required = true, type = DATARECORD.class)
    protected List<DATARECORD> datarecord;

    public List<DATARECORD> getDATARECORD() {
        if (this.datarecord == null) {
            this.datarecord = new ArrayList();
        }
        return this.datarecord;
    }
}
