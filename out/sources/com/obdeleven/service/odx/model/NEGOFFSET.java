package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "NEG-OFFSET")
public class NEGOFFSET extends TARGETADDROFFSET {

    @Element(name = "NEGATIVE-OFFSET", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] negativeoffset;

    public byte[] getNEGATIVEOFFSET() {
        return this.negativeoffset;
    }

    public void setNEGATIVEOFFSET(byte[] bArr) {
        this.negativeoffset = bArr;
    }
}
