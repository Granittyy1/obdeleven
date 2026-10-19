package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "FILTER")
public class FILTER {

    @Element(name = "FILTER-START", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] filterstart;

    public byte[] getFILTERSTART() {
        return this.filterstart;
    }

    public void setFILTERSTART(byte[] bArr) {
        this.filterstart = bArr;
    }
}
