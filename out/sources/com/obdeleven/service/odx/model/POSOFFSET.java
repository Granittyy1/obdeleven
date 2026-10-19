package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "POS-OFFSET")
public class POSOFFSET extends TARGETADDROFFSET {

    @Element(name = "POSITIVE-OFFSET", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] positiveoffset;

    public byte[] getPOSITIVEOFFSET() {
        return this.positiveoffset;
    }

    public void setPOSITIVEOFFSET(byte[] bArr) {
        this.positiveoffset = bArr;
    }
}
