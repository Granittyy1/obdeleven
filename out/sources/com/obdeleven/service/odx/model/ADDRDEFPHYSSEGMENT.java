package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"END-ADDRESS"})
@Root(name = "ADDRDEF-PHYS-SEGMENT")
public class ADDRDEFPHYSSEGMENT extends PHYSSEGMENT {

    @Element(name = "END-ADDRESS", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] endaddress;

    public byte[] getENDADDRESS() {
        return this.endaddress;
    }

    public void setENDADDRESS(byte[] bArr) {
        this.endaddress = bArr;
    }
}
