package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"UNCOMPRESSED-SIZE", "SOURCE-START-ADDRESS", "READ-DIAG-COMMCONNECTOR", "WRITE-DIAG-COMMCONNECTOR"})
@Root(name = "DIAG-COMM-DATA-CONNECTOR")
public class DIAGCOMMDATACONNECTOR {

    @Element(name = "READ-DIAG-COMMCONNECTOR")
    protected READDIAGCOMMCONNECTOR readdiagcommconnector;

    @Element(name = "SOURCE-START-ADDRESS", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] sourcestartaddress;

    @Element(name = "UNCOMPRESSED-SIZE")
    protected long uncompressedsize;

    @Element(name = "WRITE-DIAG-COMMCONNECTOR")
    protected WRITEDIAGCOMMCONNECTOR writediagcommconnector;

    public READDIAGCOMMCONNECTOR getREADDIAGCOMMCONNECTOR() {
        return this.readdiagcommconnector;
    }

    public byte[] getSOURCESTARTADDRESS() {
        return this.sourcestartaddress;
    }

    public long getUNCOMPRESSEDSIZE() {
        return this.uncompressedsize;
    }

    public WRITEDIAGCOMMCONNECTOR getWRITEDIAGCOMMCONNECTOR() {
        return this.writediagcommconnector;
    }

    public void setREADDIAGCOMMCONNECTOR(READDIAGCOMMCONNECTOR readdiagcommconnector) {
        this.readdiagcommconnector = readdiagcommconnector;
    }

    public void setSOURCESTARTADDRESS(byte[] bArr) {
        this.sourcestartaddress = bArr;
    }

    public void setUNCOMPRESSEDSIZE(long j) {
        this.uncompressedsize = j;
    }

    public void setWRITEDIAGCOMMCONNECTOR(WRITEDIAGCOMMCONNECTOR writediagcommconnector) {
        this.writediagcommconnector = writediagcommconnector;
    }
}
