package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.HexBinaryConverter;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BIT-MASK", "CODED-CONST-SNREF", "CODED-CONST-SNPATHREF", "VALUE-SNREF", "VALUE-SNPATHREF", "PHYS-CONST-SNREF", "PHYS-CONST-SNPATHREF", "TABLE-KEY-SNREF", "TABLE-KEY-SNPATHREF"})
@Root(name = "POS-RESPONSE-SUPPRESSABLE")
public class POSRESPONSESUPPRESSABLE {

    @Element(name = "BIT-MASK", required = true, type = String.class)
    @Convert(HexBinaryConverter.class)
    protected byte[] bitmask;

    @Element(name = "CODED-CONST-SNPATHREF")
    protected SNPATHREF codedconstsnpathref;

    @Element(name = "CODED-CONST-SNREF")
    protected SNREF codedconstsnref;

    @Element(name = "PHYS-CONST-SNPATHREF")
    protected SNPATHREF physconstsnpathref;

    @Element(name = "PHYS-CONST-SNREF")
    protected SNREF physconstsnref;

    @Element(name = "TABLE-KEY-SNPATHREF")
    protected SNPATHREF tablekeysnpathref;

    @Element(name = "TABLE-KEY-SNREF")
    protected SNREF tablekeysnref;

    @Element(name = "VALUE-SNPATHREF")
    protected SNPATHREF valuesnpathref;

    @Element(name = "VALUE-SNREF")
    protected SNREF valuesnref;

    public byte[] getBITMASK() {
        return this.bitmask;
    }

    public SNPATHREF getCODEDCONSTSNPATHREF() {
        return this.codedconstsnpathref;
    }

    public SNREF getCODEDCONSTSNREF() {
        return this.codedconstsnref;
    }

    public SNPATHREF getPHYSCONSTSNPATHREF() {
        return this.physconstsnpathref;
    }

    public SNREF getPHYSCONSTSNREF() {
        return this.physconstsnref;
    }

    public SNPATHREF getTABLEKEYSNPATHREF() {
        return this.tablekeysnpathref;
    }

    public SNREF getTABLEKEYSNREF() {
        return this.tablekeysnref;
    }

    public SNPATHREF getVALUESNPATHREF() {
        return this.valuesnpathref;
    }

    public SNREF getVALUESNREF() {
        return this.valuesnref;
    }

    public void setBITMASK(byte[] bArr) {
        this.bitmask = bArr;
    }

    public void setCODEDCONSTSNPATHREF(SNPATHREF snpathref) {
        this.codedconstsnpathref = snpathref;
    }

    public void setCODEDCONSTSNREF(SNREF snref) {
        this.codedconstsnref = snref;
    }

    public void setPHYSCONSTSNPATHREF(SNPATHREF snpathref) {
        this.physconstsnpathref = snpathref;
    }

    public void setPHYSCONSTSNREF(SNREF snref) {
        this.physconstsnref = snref;
    }

    public void setTABLEKEYSNPATHREF(SNPATHREF snpathref) {
        this.tablekeysnpathref = snpathref;
    }

    public void setTABLEKEYSNREF(SNREF snref) {
        this.tablekeysnref = snref;
    }

    public void setVALUESNPATHREF(SNPATHREF snpathref) {
        this.valuesnpathref = snpathref;
    }

    public void setVALUESNREF(SNREF snref) {
        this.valuesnref = snref;
    }
}
