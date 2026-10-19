package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "DIAG-CODED-TYPE")
public class DIAGCODEDTYPE {

    @Attribute(name = "BASE-DATA-TYPE", required = true)
    protected DATATYPE basedatatype;

    @Attribute(name = "BASE-TYPE-ENCODING")
    protected String basetypeencoding;

    @Element(name = "BIT-LENGTH")
    protected int bitlength;

    @Element(name = "BIT-MASK")
    protected String bitmask;

    @Attribute(name = "CONDENSED")
    protected boolean condensed;

    @Attribute(name = "IS-HIGHLOW-BYTE-ORDER")
    protected Boolean ishighlowbyteorder;

    @Element(name = "LENGTH-KEY-REF")
    protected ODXLINK lengthkeyref;

    @Element(name = "MAX-LENGTH")
    protected Long maxlength;

    @Element(name = "MIN-LENGTH")
    protected Long minlength;

    @Attribute(name = "TERMINATION")
    protected TERMINATION termination;

    @Namespace(prefix = "xsi")
    @Attribute(name = "type", required = true)
    protected String type;

    public DATATYPE getBASEDATATYPE() {
        return this.basedatatype;
    }

    public String getBASETYPEENCODING() {
        return this.basetypeencoding;
    }

    public int getBitlength() {
        return this.bitlength;
    }

    public byte[] getBitmask() {
        String str = this.bitmask;
        if (str == null || str.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[this.bitmask.length() * 4];
        for (int i10 = 0; i10 < this.bitmask.length() / 2; i10++) {
            try {
                int i11 = i10 * 2;
                byte b10 = (byte) Integer.parseInt(this.bitmask.substring(i11, i11 + 2), 16);
                for (int i12 = 0; i12 < 8; i12++) {
                    bArr[(i10 * 8) + i12] = (byte) ((b10 >> i12) & 1);
                }
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return bArr;
    }

    public ODXLINK getLengthkeyref() {
        return this.lengthkeyref;
    }

    public long getMaxlength() {
        Long l10 = this.maxlength;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public boolean getMinMaxLengthsExist() {
        return (this.maxlength == null || this.minlength == null) ? false : true;
    }

    public long getMinlength() {
        return this.minlength.longValue();
    }

    public TERMINATION getTermination() {
        return this.termination;
    }

    public String getType() {
        return this.type;
    }

    public boolean isCondensed() {
        return this.condensed;
    }

    public boolean isISHIGHLOWBYTEORDER() {
        Boolean bool = this.ishighlowbyteorder;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setBASEDATATYPE(DATATYPE datatype) {
        this.basedatatype = datatype;
    }

    public void setBASETYPEENCODING(String str) {
        this.basetypeencoding = str;
    }

    public void setISHIGHLOWBYTEORDER(Boolean bool) {
        this.ishighlowbyteorder = bool;
    }
}
