package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"FILTER-END"})
@Root(name = "ADDRDEF-FILTER")
public class ADDRDEFFILTER extends FILTER {

    @Element(name = "FILTER-END", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] filterend;

    public byte[] getFILTEREND() {
        return this.filterend;
    }

    public void setFILTEREND(byte[] bArr) {
        this.filterend = bArr;
    }
}
