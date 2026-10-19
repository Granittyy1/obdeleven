package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.a;
import com.obdeleven.service.odx.e;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPU-METHOD", "DIAG-CODED-TYPE", "PHYSICAL-TYPE", "INTERNAL-CONSTR", "UNIT-REF", "PHYS-CONSTR"})
@Root(name = "DATA-OBJECT-PROP")
public class DATAOBJECTPROP extends DOPBASE {

    @Element(name = "COMPU-METHOD", required = true)
    protected COMPUMETHOD compumethod;

    @Element(name = "DIAG-CODED-TYPE", required = true)
    protected DIAGCODEDTYPE diagcodedtype;

    @Element(name = "INTERNAL-CONSTR")
    protected INTERNALCONSTR internalconstr;
    private e.h mUintResult;

    @Element(name = "PHYS-CONSTR")
    protected INTERNALCONSTR physconstr;

    @Element(name = "PHYSICAL-TYPE", required = true)
    protected PHYSICALTYPE physicaltype;

    @Element(name = "UNIT-REF")
    protected ODXLINK unitref;

    /* JADX INFO: renamed from: com.obdeleven.service.odx.model.DATAOBJECTPROP$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY;
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$DATATYPE;
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE;
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$RADIX;

        static {
            int[] iArr = new int[COMPUCATEGORY.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY = iArr;
            try {
                iArr[COMPUCATEGORY.SCALE_LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.IDENTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.TAB_INTP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DATATYPE.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$DATATYPE = iArr2;
            try {
                iArr2[DATATYPE.A_FLOAT64.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$DATATYPE[DATATYPE.A_UINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$DATATYPE[DATATYPE.A_INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$DATATYPE[DATATYPE.A_FLOAT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$DATATYPE[DATATYPE.A_BYTEFIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[RADIX.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$RADIX = iArr3;
            try {
                iArr3[RADIX.HEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$RADIX[RADIX.OCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$RADIX[RADIX.BIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[PHYSICALDATATYPE.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE = iArr4;
            try {
                iArr4[PHYSICALDATATYPE.A_INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_UINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_FLOAT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_FLOAT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_BYTEFIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_UNICODE2STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private byte[] getInternalBitstream(Number number) throws Exception {
        byte[] bArr;
        byte[] bArr2;
        if (!isInternalValueValid(number)) {
            throw new Exception("Internal value not valid");
        }
        int i10 = 0;
        byte[] bArr3 = new byte[0];
        int i11 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$DATATYPE[this.diagcodedtype.getBASEDATATYPE().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    int iIntValue = number.intValue();
                    String basetypeencoding = this.diagcodedtype.getBASETYPEENCODING();
                    if (basetypeencoding != null) {
                        if (basetypeencoding.equals("SM") && iIntValue < 0) {
                            iIntValue = (iIntValue * (-1)) & Integer.MIN_VALUE;
                        } else if (basetypeencoding.equals("1C") && iIntValue < 0) {
                            iIntValue++;
                        }
                    }
                    bArr2 = new byte[32];
                    while (i10 < 32) {
                        bArr2[i10] = (byte) (iIntValue & 1);
                        iIntValue >>= 1;
                        i10++;
                    }
                } else {
                    if (i11 != 4) {
                        return bArr3;
                    }
                    int iFloatToIntBits = Float.floatToIntBits(number.floatValue());
                    bArr2 = new byte[32];
                    while (i10 < 32) {
                        bArr2[i10] = (byte) (iFloatToIntBits & 1);
                        iFloatToIntBits >>= 1;
                        i10++;
                    }
                }
                return bArr2;
            }
            long jLongValue = number.longValue();
            String basetypeencoding2 = this.diagcodedtype.getBASETYPEENCODING();
            if (basetypeencoding2 != null) {
                long jPow = 0;
                if (basetypeencoding2.equals("BCD-P")) {
                    for (int i12 = 0; i12 < 8; i12++) {
                        jPow |= ((jLongValue / ((long) Math.pow(10.0d, i12))) % 10) << (i12 * 4);
                    }
                } else if (basetypeencoding2.equals("BCD-UP")) {
                    int i13 = 0;
                    for (int i14 = 4; i13 < i14; i14 = 4) {
                        jPow |= ((jLongValue / ((long) Math.pow(10.0d, i13))) % 10) << (i13 * 8);
                        i13++;
                    }
                }
                jLongValue = jPow;
            }
            bArr = new byte[32];
            while (i10 < 32) {
                bArr[i10] = (byte) (jLongValue & 1);
                jLongValue >>= 1;
                i10++;
            }
        } else {
            long jDoubleToLongBits = Double.doubleToLongBits(number.doubleValue());
            bArr = new byte[64];
            while (i10 < 32) {
                bArr[i10] = (byte) (jDoubleToLongBits & 1);
                jDoubleToLongBits >>= 1;
                i10++;
            }
        }
        return bArr;
    }

    private byte[] getPhysicalToInternalTextBitstream(String str) throws Exception {
        Number numberValueOf;
        byte[] bArr = new byte[0];
        if (getCOMPUMETHOD().getCATEGORY() != COMPUCATEGORY.TEXTTABLE) {
            if (this.diagcodedtype.getBASEDATATYPE() == DATATYPE.A_ASCIISTRING || this.diagcodedtype.getBASEDATATYPE() == DATATYPE.A_UTF8STRING) {
                byte[] bytes = str.getBytes();
                byte[] bArr2 = new byte[bytes.length * 8];
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    byte b10 = bytes[i10];
                    for (int i11 = 0; i11 < 8; i11++) {
                        bArr2[(i10 * 8) + i11] = (byte) (b10 & 1);
                        b10 = (byte) (b10 >> 1);
                    }
                }
                return bArr2;
            }
            char[] charArray = str.toCharArray();
            byte[] bArr3 = new byte[charArray.length * 16];
            for (int i12 = 0; i12 < charArray.length; i12++) {
                char c10 = charArray[i12];
                for (int i13 = 0; i13 < 16; i13++) {
                    bArr3[(i12 * 16) + i13] = (byte) (c10 & 1);
                    c10 = (char) (c10 >> 1);
                }
            }
            return bArr3;
        }
        for (COMPUSCALE compuscale : this.compumethod.getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
            if (compuscale.getCOMPUCONST().getVT().getValue().equals(str)) {
                LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                if (lowerlimit == null) {
                    lowerlimit = compuscale.getUPPERLIMIT();
                }
                int i14 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$DATATYPE[this.diagcodedtype.getBASEDATATYPE().ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                    if (compuscale.getCOMPUINVERSEVALUE() != null) {
                        numberValueOf = Double.valueOf(compuscale.getCOMPUINVERSEVALUE().getV().getValue());
                    } else {
                        final String value = lowerlimit.getValue();
                        numberValueOf = new Number() { // from class: com.obdeleven.service.odx.model.DATAOBJECTPROP.1
                            @Override // java.lang.Number
                            public double doubleValue() {
                                return Double.parseDouble(value);
                            }

                            @Override // java.lang.Number
                            public float floatValue() {
                                return Float.parseFloat(value);
                            }

                            @Override // java.lang.Number
                            public int intValue() {
                                return Integer.parseInt(value);
                            }

                            @Override // java.lang.Number
                            public long longValue() {
                                return Long.parseLong(value);
                            }
                        };
                    }
                    return getInternalBitstream(numberValueOf);
                }
                if (i14 != 5) {
                    return bArr;
                }
                String value2 = lowerlimit.getValue();
                int length = value2.length() / 2;
                byte[] bArr4 = new byte[length];
                for (int i15 = 0; i15 < length; i15++) {
                    int i16 = i15 * 2;
                    bArr4[i15] = (byte) Integer.parseInt(value2.substring(i16, i16 + 2), 16);
                }
                byte[] bArr5 = new byte[length * 8];
                for (int i17 = 0; i17 < length; i17++) {
                    byte b11 = bArr4[i17];
                    for (int i18 = 0; i18 < 8; i18++) {
                        bArr5[(i17 * 8) + i18] = (byte) (b11 & 1);
                        b11 = (byte) (b11 >> 1);
                    }
                }
                return bArr5;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    private byte[] getPhysiclaToInternalNumberBitstream(Number number) throws Exception {
        DATATYPE datatype;
        int i10;
        boolean z10;
        Number numberValueOf;
        boolean z11 = false;
        byte[] internalBitstream = new byte[0];
        if (this.physicaltype.getBASEDATATYPE() == PHYSICALDATATYPE.A_FLOAT32 || this.physicaltype.getBASEDATATYPE() == PHYSICALDATATYPE.A_FLOAT64 || this.diagcodedtype.getBASEDATATYPE() == DATATYPE.A_FLOAT32 || this.diagcodedtype.getBASEDATATYPE() == DATATYPE.A_FLOAT64) {
            datatype = DATATYPE.A_FLOAT64;
        } else if (this.physicaltype.getBASEDATATYPE() == PHYSICALDATATYPE.A_UINT32) {
            DATATYPE basedatatype = this.diagcodedtype.getBASEDATATYPE();
            datatype = DATATYPE.A_UINT32;
            if (basedatatype != datatype) {
                datatype = DATATYPE.A_INT32;
            }
        } else {
            datatype = DATATYPE.A_INT32;
        }
        int i11 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.compumethod.getCATEGORY().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = 0;
            } else {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return internalBitstream;
                    }
                    List<COMPUSCALE> compuscale = getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
                    int i12 = 0;
                    while (i12 < compuscale.size() - 1) {
                        COMPUSCALE compuscale2 = compuscale.get(i12);
                        i12++;
                        COMPUSCALE compuscale3 = compuscale.get(i12);
                        double d10 = Double.parseDouble(compuscale2.getLOWERLIMIT().getValue());
                        Double dValueOf = Double.valueOf(d10);
                        double d11 = Double.parseDouble(compuscale3.getUPPERLIMIT().getValue());
                        Double dValueOf2 = Double.valueOf(d11);
                        if (datatype == DATATYPE.A_INT32 && dValueOf.intValue() <= number.intValue() && dValueOf2.intValue() >= number.intValue()) {
                            internalBitstream = getInternalBitstream(dValueOf);
                        } else if (datatype == DATATYPE.A_UINT32 && dValueOf.longValue() <= number.longValue() && dValueOf2.longValue() >= number.longValue()) {
                            internalBitstream = getInternalBitstream(dValueOf);
                        } else if (datatype == DATATYPE.A_FLOAT64 && d10 <= number.doubleValue() && d11 >= number.doubleValue()) {
                            internalBitstream = getInternalBitstream(dValueOf);
                        }
                        z11 = true;
                    }
                    if (z11) {
                        return internalBitstream;
                    }
                    throw new Exception("TAB-INTP: COMPU-SCALE Not found");
                }
                numberValueOf = number;
            }
            return getInternalBitstream(numberValueOf);
        }
        List<COMPUSCALE> compuscale4 = this.compumethod.getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
        i10 = 0;
        while (true) {
            if (i10 >= compuscale4.size()) {
                z10 = false;
                i10 = 0;
                break;
            }
            COMPUSCALE compuscale5 = compuscale4.get(i10);
            LIMIT lowerlimit = compuscale5.getLOWERLIMIT();
            LIMIT upperlimit = compuscale5.getUPPERLIMIT();
            double value = compuscale5.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR().getV().get(0).getValue();
            double value2 = compuscale5.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR().getV().get(1).getValue();
            long value3 = (long) compuscale5.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR().getV().get(0).getValue();
            Double dValueOf3 = lowerlimit != null ? Double.valueOf(((Double.parseDouble(lowerlimit.getValue()) * value2) + value) / value3) : null;
            Double dValueOf4 = upperlimit != null ? Double.valueOf(((Double.parseDouble(upperlimit.getValue()) * value2) + value) / value3) : null;
            if (dValueOf3 != null && dValueOf4 == null) {
                if ((datatype == DATATYPE.A_INT32 && dValueOf3.intValue() == number.intValue()) || ((datatype == DATATYPE.A_UINT32 && dValueOf3.longValue() == number.longValue()) || (datatype == DATATYPE.A_FLOAT64 && dValueOf3.doubleValue() == number.doubleValue()))) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                if (dValueOf3 != null && ((datatype == DATATYPE.A_INT32 && dValueOf3.intValue() <= number.intValue() && dValueOf4.intValue() >= number.intValue()) || ((datatype == DATATYPE.A_UINT32 && dValueOf3.longValue() <= number.longValue() && dValueOf4.longValue() >= number.longValue()) || (datatype == DATATYPE.A_FLOAT64 && dValueOf3.doubleValue() <= number.doubleValue() && dValueOf4.doubleValue() >= number.doubleValue())))) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        if (!z10) {
            throw new Exception("SCALE-LINEAR: COMPU-SCALE Not found");
        }
        COMPUSCALE compuscale6 = this.compumethod.getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(i10);
        double value4 = compuscale6.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR().getV().get(0).getValue();
        double value5 = compuscale6.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR().getV().get(1).getValue();
        long value6 = (long) compuscale6.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR().getV().get(0).getValue();
        if (value5 != 0.0d) {
            int i13 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$DATATYPE[datatype.ordinal()];
            if (i13 != 1) {
                numberValueOf = i13 != 2 ? Double.valueOf(((((long) number.intValue()) * value6) - value4) / value5) : Double.valueOf(((number.longValue() * value6) - value4) / value5);
            } else {
                numberValueOf = Double.valueOf(Double.parseDouble(String.format(Locale.US, "%." + this.physicaltype.getPRECISION() + "f", Double.valueOf(((number.doubleValue() * value6) - value4) / value5))));
            }
        } else {
            numberValueOf = Double.valueOf(compuscale6.getCOMPUINVERSEVALUE().getV().getValue());
        }
        return getInternalBitstream(numberValueOf);
    }

    public COMPUMETHOD getCOMPUMETHOD() {
        return this.compumethod;
    }

    public DIAGCODEDTYPE getDIAGCODEDTYPE() {
        return this.diagcodedtype;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    public String getHint() {
        StringBuilder sb2;
        StringBuilder sb3;
        int i10 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[this.physicaltype.getBASEDATATYPE().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            INTERNALCONSTR internalconstr = this.internalconstr;
            if (internalconstr != null) {
                LIMIT lowerlimit = internalconstr.getLOWERLIMIT();
                LIMIT upperlimit = this.internalconstr.getUPPERLIMIT();
                if (lowerlimit == null && upperlimit == null) {
                    sb2 = null;
                } else {
                    sb2 = lowerlimit != null ? new StringBuilder(lowerlimit.getValue()) : new StringBuilder(DecimalFormatSymbols.getInstance().getInfinity());
                    sb2.append(" - ");
                    if (upperlimit != null) {
                        sb2.append(upperlimit.getValue());
                    } else {
                        sb2.append(DecimalFormatSymbols.getInstance().getInfinity());
                    }
                }
                SCALECONSTRS scaleconstrs = this.internalconstr.getSCALECONSTRS();
                if (scaleconstrs != null) {
                    sb2 = new StringBuilder();
                    for (SCALECONSTR scaleconstr : scaleconstrs.getSCALECONSTR()) {
                        if (scaleconstr.getVALIDITY() == VALIDTYPE.VALID) {
                            if (sb2.length() > 0) {
                                sb2.append("; ");
                            }
                            LIMIT lowerlimit2 = scaleconstr.getLOWERLIMIT();
                            LIMIT upperlimit2 = scaleconstr.getUPPERLIMIT();
                            if (lowerlimit != null || upperlimit != null) {
                                if (lowerlimit2 != null) {
                                    sb2.append(lowerlimit2.getValue());
                                } else {
                                    sb2.append(DecimalFormatSymbols.getInstance().getInfinity());
                                }
                                sb2.append(" - ");
                                if (upperlimit2 != null) {
                                    sb2.append(upperlimit2.getValue());
                                } else {
                                    sb2.append(DecimalFormatSymbols.getInstance().getInfinity());
                                }
                            }
                        }
                    }
                }
                sb3 = sb2;
            } else {
                sb3 = null;
            }
        } else if (i10 != 5) {
            sb3 = null;
        } else {
            sb3 = new StringBuilder("00 - FF");
        }
        if (sb3 == null) {
            return null;
        }
        return sb3.toString();
    }

    public INTERNALCONSTR getINTERNALCONSTR() {
        return this.internalconstr;
    }

    public INTERNALCONSTR getPHYSCONSTR() {
        return this.physconstr;
    }

    public PHYSICALTYPE getPHYSICALTYPE() {
        return this.physicaltype;
    }

    public ODXLINK getUNITREF() {
        return this.unitref;
    }

    public e.h getUnitResult() {
        return this.mUintResult;
    }

    public boolean isInternalValueValid(Number number) {
        INTERNALCONSTR internalconstr = this.internalconstr;
        if (internalconstr == null) {
            return true;
        }
        SCALECONSTRS scaleconstrs = internalconstr.getSCALECONSTRS();
        if (scaleconstrs == null) {
            return isInternalValueValid(number, this.internalconstr.getLOWERLIMIT(), this.internalconstr.getUPPERLIMIT());
        }
        for (SCALECONSTR scaleconstr : scaleconstrs.getSCALECONSTR()) {
            if (scaleconstr.getVALIDITY() != VALIDTYPE.VALID && isInternalValueValid(number, scaleconstr.getLOWERLIMIT(), scaleconstr.upperlimit)) {
                return false;
            }
        }
        return true;
    }

    public a physicalToInternal(String str) throws Exception {
        return physicalToInternal(str, true);
    }

    public void setCOMPUMETHOD(COMPUMETHOD compumethod) {
        this.compumethod = compumethod;
    }

    public void setDIAGCODEDTYPE(DIAGCODEDTYPE diagcodedtype) {
        this.diagcodedtype = diagcodedtype;
    }

    public void setINTERNALCONSTR(INTERNALCONSTR internalconstr) {
        this.internalconstr = internalconstr;
    }

    public void setPHYSCONSTR(INTERNALCONSTR internalconstr) {
        this.physconstr = internalconstr;
    }

    public void setPHYSICALTYPE(PHYSICALTYPE physicaltype) {
        this.physicaltype = physicaltype;
    }

    public void setUNITREF(ODXLINK odxlink) {
        this.unitref = odxlink;
    }

    public void setUnitResult(e.h hVar) {
        this.mUintResult = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public a physicalToInternal(String str, boolean z10) throws Exception {
        byte[] physiclaToInternalNumberBitstream = new byte[0];
        int i10 = 2;
        switch (AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[this.physicaltype.getBASEDATATYPE().ordinal()]) {
            case 1:
                try {
                    physiclaToInternalNumberBitstream = getPhysiclaToInternalNumberBitstream(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                    throw new Exception("Wrong value");
                }
                break;
            case 2:
                RADIX displayradix = this.physicaltype.getDISPLAYRADIX();
                if (displayradix == null || !z10) {
                    i10 = 10;
                } else {
                    int i11 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$RADIX[displayradix.ordinal()];
                    if (i11 == 1) {
                        i10 = 16;
                    } else if (i11 == 2) {
                        i10 = 8;
                    } else if (i11 != 3) {
                        i10 = 10;
                    }
                }
                try {
                    physiclaToInternalNumberBitstream = getPhysiclaToInternalNumberBitstream(Long.valueOf(Long.parseLong(str, i10)));
                } catch (NumberFormatException unused2) {
                    throw new Exception("Wrong value");
                }
                break;
            case 3:
                try {
                    physiclaToInternalNumberBitstream = getPhysiclaToInternalNumberBitstream(Float.valueOf(Float.parseFloat(str)));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                    throw new Exception("Wrong value");
                }
                break;
            case 4:
                try {
                    physiclaToInternalNumberBitstream = getPhysiclaToInternalNumberBitstream(Double.valueOf(Double.parseDouble(str)));
                } catch (NumberFormatException unused3) {
                    throw new Exception("Wrong value");
                }
                break;
            case 5:
                if (!str.matches("^([0-9a-fA-F]{2})+")) {
                    throw new Exception("Wrong value");
                }
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i12 = 0; i12 < length; i12++) {
                    int i13 = i12 * 2;
                    bArr[i12] = (byte) Integer.parseInt(str.substring(i13, i13 + 2), 16);
                }
                byte[] bArr2 = new byte[length * 8];
                for (int i14 = 0; i14 < length; i14++) {
                    byte b10 = bArr[i14];
                    for (int i15 = 0; i15 < 8; i15++) {
                        bArr2[(i14 * 8) + i15] = (byte) (b10 & 1);
                        b10 = (byte) (b10 >> 1);
                    }
                }
                physiclaToInternalNumberBitstream = bArr2;
                break;
                break;
            case 6:
                physiclaToInternalNumberBitstream = getPhysicalToInternalTextBitstream(str);
                break;
        }
        String type = this.diagcodedtype.getType();
        type.getClass();
        if (type.equals("STANDARD-LENGTH-TYPE")) {
            boolean zIsCondensed = this.diagcodedtype.isCondensed();
            byte[] bitmask = this.diagcodedtype.getBitmask();
            if (zIsCondensed) {
                int i16 = 0;
                for (byte b11 : bitmask) {
                    i16 += b11;
                }
                byte[] bArr3 = new byte[i16];
                System.arraycopy(physiclaToInternalNumberBitstream, 0, bArr3, 0, i16);
                physiclaToInternalNumberBitstream = Arrays.copyOf(bitmask, bitmask.length);
                int i17 = 0;
                for (int i18 = 0; i18 < physiclaToInternalNumberBitstream.length; i18++) {
                    if (physiclaToInternalNumberBitstream[i18] == 1) {
                        physiclaToInternalNumberBitstream[i18] = bArr3[i17];
                        i17++;
                    }
                }
            } else {
                int bitlength = this.diagcodedtype.getBitlength();
                byte[] bArr4 = new byte[bitlength];
                System.arraycopy(physiclaToInternalNumberBitstream, 0, bArr4, 0, bitlength);
                if (bitmask != null) {
                    for (int i19 = 0; i19 < bitlength; i19++) {
                        bArr4[i19] = (byte) (bArr4[i19] & bitmask[i19]);
                    }
                }
                physiclaToInternalNumberBitstream = bArr4;
            }
        } else if (type.equals("MIN-MAX-LENGTH-TYPE")) {
            int minlength = (int) this.diagcodedtype.getMinlength();
            int maxlength = (int) this.diagcodedtype.getMaxlength();
            TERMINATION termination = this.diagcodedtype.getTermination();
            int length2 = physiclaToInternalNumberBitstream.length / 8;
            if (length2 < minlength) {
                throw new Exception("MIN-MAX-LENGTH-TYPE: Value to short");
            }
            if (length2 < maxlength && (termination == TERMINATION.ZERO || termination == TERMINATION.HEX_FF)) {
                int length3 = physiclaToInternalNumberBitstream.length + (this.diagcodedtype.getBASEDATATYPE() != DATATYPE.A_UNICODE2STRING ? 8 : 16);
                byte[] bArr5 = new byte[length3];
                System.arraycopy(physiclaToInternalNumberBitstream, 0, bArr5, 0, physiclaToInternalNumberBitstream.length);
                for (int length4 = physiclaToInternalNumberBitstream.length; length4 < length3; length4++) {
                    if (termination == TERMINATION.HEX_FF) {
                        bArr5[length4] = 1;
                    } else {
                        bArr5[length4] = 0;
                    }
                }
                physiclaToInternalNumberBitstream = bArr5;
            }
        }
        byte[] bArr6 = new byte[(int) Math.ceil(((double) physiclaToInternalNumberBitstream.length) / 8.0d)];
        for (int i20 = 0; i20 < physiclaToInternalNumberBitstream.length; i20++) {
            int i21 = i20 / 8;
            bArr6[i21] = (byte) (bArr6[i21] | (physiclaToInternalNumberBitstream[i20] << (i20 % 8)));
        }
        return new a(physiclaToInternalNumberBitstream.length, bArr6);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    public boolean isInternalValueValid(Number number, LIMIT limit, LIMIT limit2) {
        boolean z10;
        if (limit == null && limit2 == null) {
            return true;
        }
        if (limit != null) {
            INTERVALTYPE intervaltype = limit.getINTERVALTYPE();
            int i10 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$DATATYPE[this.diagcodedtype.getBASEDATATYPE().ordinal()];
            if (i10 == 1) {
                double d10 = Double.parseDouble(limit.getValue());
                if ((intervaltype != INTERVALTYPE.CLOSED || number.doubleValue() >= d10) && (intervaltype != INTERVALTYPE.OPEN || number.doubleValue() > d10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 == 2) {
                long j = Long.parseLong(limit.getValue());
                if ((intervaltype != INTERVALTYPE.CLOSED || number.longValue() >= j) && (intervaltype != INTERVALTYPE.OPEN || number.longValue() > j)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 != 3) {
                if (i10 == 4) {
                    float f10 = Float.parseFloat(limit.getValue());
                    if ((intervaltype == INTERVALTYPE.CLOSED && number.floatValue() < f10) || (intervaltype == INTERVALTYPE.OPEN && number.floatValue() <= f10)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                int i11 = Integer.parseInt(limit.getValue());
                if ((intervaltype != INTERVALTYPE.CLOSED || number.intValue() >= i11) && (intervaltype != INTERVALTYPE.OPEN || number.intValue() > i11)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (limit2 != null) {
            INTERVALTYPE intervaltype2 = limit2.getINTERVALTYPE();
            int i12 = AnonymousClass2.$SwitchMap$com$obdeleven$service$odx$model$DATATYPE[this.diagcodedtype.getBASEDATATYPE().ordinal()];
            if (i12 == 1) {
                double d11 = Double.parseDouble(limit2.getValue());
                if (intervaltype2 == INTERVALTYPE.CLOSED && number.doubleValue() > d11) {
                    return false;
                }
                if (intervaltype2 == INTERVALTYPE.OPEN && number.doubleValue() >= d11) {
                    return false;
                }
            } else if (i12 == 2) {
                long j10 = Long.parseLong(limit2.getValue());
                if (intervaltype2 == INTERVALTYPE.CLOSED && number.longValue() > j10) {
                    return false;
                }
                if (intervaltype2 == INTERVALTYPE.OPEN && number.longValue() >= j10) {
                    return false;
                }
            } else if (i12 == 3) {
                int i13 = Integer.parseInt(limit2.getValue());
                if (intervaltype2 == INTERVALTYPE.CLOSED && number.intValue() > i13) {
                    return false;
                }
                if (intervaltype2 == INTERVALTYPE.OPEN && number.intValue() >= i13) {
                    return false;
                }
            } else if (i12 == 4) {
                float f11 = Float.parseFloat(limit2.getValue());
                if (intervaltype2 == INTERVALTYPE.CLOSED && number.floatValue() > f11) {
                    return false;
                }
                if (intervaltype2 == INTERVALTYPE.OPEN && number.floatValue() >= f11) {
                    return false;
                }
            }
        }
        return z10;
    }
}
