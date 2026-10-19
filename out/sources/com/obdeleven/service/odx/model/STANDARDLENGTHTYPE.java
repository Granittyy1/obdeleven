package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BIT-LENGTH", "BIT-MASK"})
@Root(name = "STANDARD-LENGTH-TYPE")
public class STANDARDLENGTHTYPE extends DIAGCODEDTYPE {

    @Element(name = "BIT-LENGTH")
    protected long bitlength;

    @Element(name = "BIT-MASK", type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] bitmask;

    @Attribute(name = "CONDENSED")
    protected Boolean condensed;

    public long getBITLENGTH() {
        return this.bitlength;
    }

    public byte[] getBITMASK() {
        return this.bitmask;
    }

    public boolean isCONDENSED() {
        Boolean bool = this.condensed;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setBITLENGTH(long j) {
        this.bitlength = j;
    }

    public void setBITMASK(byte[] bArr) {
        this.bitmask = bArr;
    }

    public void setCONDENSED(Boolean bool) {
        this.condensed = bool;
    }
}
