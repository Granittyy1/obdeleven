package com.obdeleven.service.odx.model;

import J4.i;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"CATEGORY", "COMPU-INTERNAL-TO-PHYS", "COMPU-PHYS-TO-INTERNAL"})
@Root(name = "COMPU-METHOD")
public class COMPUMETHOD {

    @Element(name = "CATEGORY", required = true)
    @Convert(COMPUCATEGORY.Converter.class)
    protected COMPUCATEGORY category;

    @Element(name = "COMPU-INTERNAL-TO-PHYS")
    protected COMPUINTERNALTOPHYS compuinternaltophys;

    @Element(name = "COMPU-PHYS-TO-INTERNAL")
    protected COMPUPHYSTOINTERNAL compuphystointernal;

    /* JADX INFO: renamed from: com.obdeleven.service.odx.model.COMPUMETHOD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY;
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE;
        static final /* synthetic */ int[] $SwitchMap$com$obdeleven$service$odx$model$RADIX;

        static {
            int[] iArr = new int[RADIX.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$RADIX = iArr;
            try {
                iArr[RADIX.BIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$RADIX[RADIX.OCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$RADIX[RADIX.HEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[COMPUCATEGORY.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY = iArr2;
            try {
                iArr2[COMPUCATEGORY.IDENTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.SCALE_LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.SCALE_RAT_FUNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.RAT_FUNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.TEXTTABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[COMPUCATEGORY.TAB_INTP.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[PHYSICALDATATYPE.values().length];
            $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE = iArr3;
            try {
                iArr3[PHYSICALDATATYPE.A_FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_FLOAT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[PHYSICALDATATYPE.A_UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:113:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b A[LOOP:3: B:50:0x0105->B:52:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0131 A[LOOP:4: B:54:0x012b->B:56:0x0131, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    public String[] calculate(int i10, PHYSICALTYPE physicaltype) {
        COMPUSCALE next;
        List<V> v10;
        int i11;
        double dPow;
        String[] strArr;
        List<V> v11;
        int i12;
        double dPow2;
        int i13;
        int precision;
        LIMIT lowerlimit;
        LIMIT upperlimit;
        VT vt;
        String[] strArr2 = new String[2];
        switch (AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.category.ordinal()]) {
            case 1:
                strArr2[0] = Integer.toString(i10);
                return strArr2;
            case 2:
            case 3:
                Iterator<COMPUSCALE> it = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                        LIMIT lowerlimit2 = next.getLOWERLIMIT();
                        LIMIT upperlimit2 = next.getUPPERLIMIT();
                        if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || i10 >= Integer.parseInt(lowerlimit2.getValue())) {
                            if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || i10 > Integer.parseInt(lowerlimit2.getValue())) {
                                if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || i10 <= Integer.parseInt(upperlimit2.getValue())) {
                                    if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || i10 < Integer.parseInt(upperlimit2.getValue())) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator.getV();
                i11 = 0;
                dPow = 0.0d;
                while (i11 < v10.size()) {
                    dPow += Math.pow(i10, i11) * v10.get(i11).getValue();
                    i11++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                v11 = compudenominator.getV();
                dPow2 = 0.0d;
                for (i12 = 0; i12 < v11.size(); i12++) {
                    dPow2 += Math.pow(i10, i12) * v11.get(i12).getValue();
                }
                double d10 = dPow / dPow2;
                i13 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i13 == 1 && i13 != 2) {
                    if (i13 == 3 || i13 == 4) {
                        precision = 0;
                    }
                    for (COMPUSCALE compuscale : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                        lowerlimit = compuscale.getLOWERLIMIT();
                        upperlimit = compuscale.getUPPERLIMIT();
                        if (upperlimit != null) {
                            if (i10 != Integer.parseInt(lowerlimit.getValue())) {
                                vt = compuscale.getCOMPUCONST().getVT();
                                strArr[0] = vt.getValue();
                                if (vt.getTI() != null) {
                                    return strArr;
                                }
                                strArr[1] = vt.getTI();
                                return strArr;
                            }
                        } else if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || i10 >= Integer.parseInt(lowerlimit.getValue())) {
                            if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || i10 > Integer.parseInt(lowerlimit.getValue())) {
                                if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED || i10 <= Integer.parseInt(upperlimit.getValue())) {
                                    if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN || i10 < Integer.parseInt(upperlimit.getValue())) {
                                        vt = compuscale.getCOMPUCONST().getVT();
                                        strArr[0] = vt.getValue();
                                        if (vt.getTI() != null) {
                                            return strArr;
                                        }
                                        strArr[1] = vt.getTI();
                                        return strArr;
                                    }
                                }
                            }
                        }
                    }
                    return strArr;
                }
                precision = (int) physicaltype.getPRECISION();
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d10));
                return strArr;
            case 4:
            case 5:
                next = null;
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator2 = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator2 = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator2.getV();
                i11 = 0;
                dPow = 0.0d;
                while (i11 < v10.size()) {
                    dPow += Math.pow(i10, i11) * v10.get(i11).getValue();
                    i11++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                v11 = compudenominator2.getV();
                dPow2 = 0.0d;
                while (i12 < v11.size()) {
                    dPow2 += Math.pow(i10, i12) * v11.get(i12).getValue();
                }
                double d11 = dPow / dPow2;
                i13 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i13 == 1) {
                    precision = (int) physicaltype.getPRECISION();
                } else {
                    precision = (int) physicaltype.getPRECISION();
                }
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d11));
                return strArr;
            case 6:
                strArr = strArr2;
                while (r1.hasNext()) {
                    lowerlimit = compuscale.getLOWERLIMIT();
                    upperlimit = compuscale.getUPPERLIMIT();
                    if (upperlimit != null) {
                        if (lowerlimit != null) {
                        }
                        if (lowerlimit != null) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN) {
                        }
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                    if (i10 != Integer.parseInt(lowerlimit.getValue())) {
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                }
                return strArr;
            case 7:
                for (COMPUSCALE compuscale2 : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                    LIMIT lowerlimit3 = compuscale2.getLOWERLIMIT();
                    if (lowerlimit3 == null || i10 == Integer.parseInt(lowerlimit3.getValue())) {
                        if (lowerlimit3 != null) {
                            strArr2[0] = Integer.toString((int) compuscale2.getCOMPUCONST().getV().getValue());
                            return strArr2;
                        }
                    }
                }
            default:
                return strArr2;
        }
    }

    public COMPUCATEGORY getCATEGORY() {
        return this.category;
    }

    public COMPUINTERNALTOPHYS getCOMPUINTERNALTOPHYS() {
        return this.compuinternaltophys;
    }

    public COMPUPHYSTOINTERNAL getCOMPUPHYSTOINTERNAL() {
        return this.compuphystointernal;
    }

    public void setCATEGORY(COMPUCATEGORY compucategory) {
        this.category = compucategory;
    }

    public void setCOMPUINTERNALTOPHYS(COMPUINTERNALTOPHYS compuinternaltophys) {
        this.compuinternaltophys = compuinternaltophys;
    }

    public void setCOMPUPHYSTOINTERNAL(COMPUPHYSTOINTERNAL compuphystointernal) {
        this.compuphystointernal = compuphystointernal;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024d  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[LOOP:3: B:61:0x0136->B:63:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[LOOP:4: B:67:0x0165->B:69:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c3  */
    public String[] calculate(long j, PHYSICALTYPE physicaltype) {
        int i10;
        COMPUSCALE next;
        COMPUDENOMINATOR compudenominator;
        List<V> v10;
        int i11;
        double dPow;
        String[] strArr;
        double d10;
        double dPow2;
        double d11;
        int i12;
        List<V> v11;
        int i13;
        LIMIT lowerlimit;
        LIMIT upperlimit;
        VT vt;
        String[] strArr2 = {"", ""};
        RADIX displayradix = physicaltype.getDISPLAYRADIX();
        if (displayradix == null) {
            i10 = 10;
        } else {
            int i14 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$RADIX[displayradix.ordinal()];
            if (i14 == 1) {
                i10 = 2;
            } else if (i14 == 2) {
                i10 = 8;
            } else if (i14 != 3) {
                i10 = 10;
            } else {
                i10 = 16;
            }
        }
        switch (AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.category.ordinal()]) {
            case 1:
                strArr2[0] = Long.toString(j, i10);
                return strArr2;
            case 2:
            case 3:
                Iterator<COMPUSCALE> it = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                        LIMIT lowerlimit2 = next.getLOWERLIMIT();
                        LIMIT upperlimit2 = next.getUPPERLIMIT();
                        if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || j >= Long.parseLong(lowerlimit2.getValue())) {
                            if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || j > Long.parseLong(lowerlimit2.getValue())) {
                                if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || j <= Long.parseLong(upperlimit2.getValue())) {
                                    if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || j < Long.parseLong(upperlimit2.getValue())) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                compudenominator = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator.getV();
                i11 = 0;
                dPow = 0.0d;
                while (i11 < v10.size()) {
                    dPow += Math.pow(j, i11) * v10.get(i11).getValue();
                    i11++;
                    v10 = v10;
                    i10 = i10;
                }
                int i15 = i10;
                if (compudenominator != null) {
                    v11 = compudenominator.getV();
                    dPow2 = 0.0d;
                    i13 = 0;
                    while (i13 < v11.size()) {
                        dPow2 += Math.pow(j, i13) * v11.get(i13).getValue();
                        i13++;
                        strArr2 = strArr2;
                        dPow = dPow;
                    }
                    strArr = strArr2;
                    d10 = dPow;
                } else {
                    strArr = strArr2;
                    d10 = dPow;
                    dPow2 = 0.0d;
                }
                d11 = dPow2 != 0.0d ? d10 / dPow2 : 0.0d;
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        strArr[0] = Long.toString((long) d11, i15);
                        return strArr;
                    }
                    for (COMPUSCALE compuscale : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                        lowerlimit = compuscale.getLOWERLIMIT();
                        upperlimit = compuscale.getUPPERLIMIT();
                        if (upperlimit != null) {
                            if (j != Long.parseLong(lowerlimit.getValue())) {
                                vt = compuscale.getCOMPUCONST().getVT();
                                strArr[0] = vt.getValue();
                                if (vt.getTI() != null) {
                                    return strArr;
                                }
                                strArr[1] = vt.getTI();
                                return strArr;
                            }
                        } else if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || j >= Long.parseLong(lowerlimit.getValue())) {
                            if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || j > Long.parseLong(lowerlimit.getValue())) {
                                if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED || j <= Long.parseLong(upperlimit.getValue())) {
                                    if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN || j < Long.parseLong(upperlimit.getValue())) {
                                        vt = compuscale.getCOMPUCONST().getVT();
                                        strArr[0] = vt.getValue();
                                        if (vt.getTI() != null) {
                                            return strArr;
                                        }
                                        strArr[1] = vt.getTI();
                                        return strArr;
                                    }
                                }
                            }
                        }
                    }
                    return strArr;
                }
                strArr[0] = String.format(Locale.US, i.c((int) physicaltype.getPRECISION(), "%.", "f"), Double.valueOf(d11));
                return strArr;
            case 4:
            case 5:
                next = null;
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator2 = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                compudenominator = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator2.getV();
                i11 = 0;
                dPow = 0.0d;
                while (i11 < v10.size()) {
                    dPow += Math.pow(j, i11) * v10.get(i11).getValue();
                    i11++;
                    v10 = v10;
                    i10 = i10;
                }
                int i16 = i10;
                if (compudenominator != null) {
                    v11 = compudenominator.getV();
                    dPow2 = 0.0d;
                    i13 = 0;
                    while (i13 < v11.size()) {
                        dPow2 += Math.pow(j, i13) * v11.get(i13).getValue();
                        i13++;
                        strArr2 = strArr2;
                        dPow = dPow;
                    }
                    strArr = strArr2;
                    d10 = dPow;
                } else {
                    strArr = strArr2;
                    d10 = dPow;
                    dPow2 = 0.0d;
                }
                if (dPow2 != 0.0d) {
                }
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1) {
                    break;
                }
                strArr[0] = String.format(Locale.US, i.c((int) physicaltype.getPRECISION(), "%.", "f"), Double.valueOf(d11));
                return strArr;
            case 6:
                strArr = strArr2;
                while (r2.hasNext()) {
                    lowerlimit = compuscale.getLOWERLIMIT();
                    upperlimit = compuscale.getUPPERLIMIT();
                    if (upperlimit != null) {
                        if (lowerlimit != null) {
                        }
                        if (lowerlimit != null) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN) {
                        }
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                    if (j != Long.parseLong(lowerlimit.getValue())) {
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                }
                return strArr;
            case 7:
                for (COMPUSCALE compuscale2 : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                    LIMIT lowerlimit3 = compuscale2.getLOWERLIMIT();
                    if (lowerlimit3 == null || j == Long.parseLong(lowerlimit3.getValue())) {
                        if (lowerlimit3 != null) {
                            strArr2[0] = Long.toString((long) compuscale2.getCOMPUCONST().getV().getValue());
                            return strArr2;
                        }
                    }
                }
            default:
                return strArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0214  */
    /* JADX WARN: Code duplicated, block: B:113:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115 A[LOOP:3: B:50:0x010f->B:52:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x013b A[LOOP:4: B:54:0x0135->B:56:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    public String[] calculate(float f10, PHYSICALTYPE physicaltype) {
        COMPUSCALE next;
        List<V> v10;
        int i10;
        double dPow;
        String[] strArr;
        List<V> v11;
        int i11;
        double dPow2;
        int i12;
        int precision;
        LIMIT lowerlimit;
        LIMIT upperlimit;
        VT vt;
        String[] strArr2 = new String[2];
        switch (AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.category.ordinal()]) {
            case 1:
                strArr2[0] = Float.toString(f10);
                return strArr2;
            case 2:
            case 3:
                Iterator<COMPUSCALE> it = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                        LIMIT lowerlimit2 = next.getLOWERLIMIT();
                        LIMIT upperlimit2 = next.getUPPERLIMIT();
                        if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || f10 >= Float.parseFloat(lowerlimit2.getValue())) {
                            if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || f10 > Float.parseFloat(lowerlimit2.getValue())) {
                                if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || f10 <= Float.parseFloat(upperlimit2.getValue())) {
                                    if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || f10 < Float.parseFloat(upperlimit2.getValue())) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator.getV();
                i10 = 0;
                dPow = 0.0d;
                while (i10 < v10.size()) {
                    dPow += Math.pow(f10, i10) * v10.get(i10).getValue();
                    i10++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                v11 = compudenominator.getV();
                dPow2 = 0.0d;
                for (i11 = 0; i11 < v11.size(); i11++) {
                    dPow2 += Math.pow(f10, i11) * v11.get(i11).getValue();
                }
                double d10 = dPow / dPow2;
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        precision = 0;
                    }
                    for (COMPUSCALE compuscale : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                        lowerlimit = compuscale.getLOWERLIMIT();
                        upperlimit = compuscale.getUPPERLIMIT();
                        if (upperlimit != null) {
                            if (f10 != Float.parseFloat(lowerlimit.getValue())) {
                                vt = compuscale.getCOMPUCONST().getVT();
                                strArr[0] = vt.getValue();
                                if (vt.getTI() != null) {
                                    return strArr;
                                }
                                strArr[1] = vt.getTI();
                                return strArr;
                            }
                        } else if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || f10 >= Float.parseFloat(lowerlimit.getValue())) {
                            if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || f10 > Float.parseFloat(lowerlimit.getValue())) {
                                if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED || f10 <= Float.parseFloat(upperlimit.getValue())) {
                                    if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN || f10 < Float.parseFloat(upperlimit.getValue())) {
                                        vt = compuscale.getCOMPUCONST().getVT();
                                        strArr[0] = vt.getValue();
                                        if (vt.getTI() != null) {
                                            return strArr;
                                        }
                                        strArr[1] = vt.getTI();
                                        return strArr;
                                    }
                                }
                            }
                        }
                    }
                    return strArr;
                }
                precision = (int) physicaltype.getPRECISION();
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d10));
                return strArr;
            case 4:
            case 5:
                next = null;
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator2 = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator2 = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator2.getV();
                i10 = 0;
                dPow = 0.0d;
                while (i10 < v10.size()) {
                    dPow += Math.pow(f10, i10) * v10.get(i10).getValue();
                    i10++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                v11 = compudenominator2.getV();
                dPow2 = 0.0d;
                while (i11 < v11.size()) {
                    dPow2 += Math.pow(f10, i11) * v11.get(i11).getValue();
                }
                double d11 = dPow / dPow2;
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1) {
                    precision = (int) physicaltype.getPRECISION();
                } else {
                    precision = (int) physicaltype.getPRECISION();
                }
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d11));
                return strArr;
            case 6:
                strArr = strArr2;
                while (r1.hasNext()) {
                    lowerlimit = compuscale.getLOWERLIMIT();
                    upperlimit = compuscale.getUPPERLIMIT();
                    if (upperlimit != null) {
                        if (lowerlimit != null) {
                        }
                        if (lowerlimit != null) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN) {
                        }
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                    if (f10 != Float.parseFloat(lowerlimit.getValue())) {
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                }
                return strArr;
            case 7:
                for (COMPUSCALE compuscale2 : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                    LIMIT lowerlimit3 = compuscale2.getLOWERLIMIT();
                    if (lowerlimit3 == null || f10 == Float.parseFloat(lowerlimit3.getValue())) {
                        if (lowerlimit3 != null) {
                            strArr2[0] = Float.toString((float) compuscale2.getCOMPUCONST().getV().getValue());
                            return strArr2;
                        }
                    }
                }
            default:
                return strArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114 A[LOOP:3: B:50:0x010e->B:52:0x0114, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[LOOP:4: B:54:0x012f->B:56:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    public String[] calculate(double d10, PHYSICALTYPE physicaltype) {
        COMPUSCALE next;
        List<V> v10;
        int i10;
        double dPow;
        List<V> v11;
        int i11;
        double dPow2;
        String[] strArr;
        int i12;
        int precision;
        LIMIT lowerlimit;
        LIMIT upperlimit;
        VT vt;
        String[] strArr2 = new String[2];
        switch (AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.category.ordinal()]) {
            case 1:
                strArr2[0] = Double.toString(d10);
                return strArr2;
            case 2:
            case 3:
                Iterator<COMPUSCALE> it = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                        LIMIT lowerlimit2 = next.getLOWERLIMIT();
                        LIMIT upperlimit2 = next.getUPPERLIMIT();
                        if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || d10 >= Double.parseDouble(lowerlimit2.getValue())) {
                            if (lowerlimit2 == null || lowerlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || d10 > Double.parseDouble(lowerlimit2.getValue())) {
                                if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.CLOSED || d10 <= Double.parseDouble(upperlimit2.getValue())) {
                                    if (upperlimit2 == null || upperlimit2.getINTERVALTYPE() != INTERVALTYPE.OPEN || d10 < Double.parseDouble(upperlimit2.getValue())) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator.getV();
                dPow = 0.0d;
                for (i10 = 0; i10 < v10.size(); i10++) {
                    dPow += Math.pow(d10, i10) * v10.get(i10).getValue();
                }
                v11 = compudenominator.getV();
                i11 = 0;
                dPow2 = 0.0d;
                while (i11 < v11.size()) {
                    dPow2 += Math.pow(d10, i11) * v11.get(i11).getValue();
                    i11++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                double d11 = dPow / dPow2;
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1 && i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        precision = 0;
                    }
                    for (COMPUSCALE compuscale : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                        lowerlimit = compuscale.getLOWERLIMIT();
                        upperlimit = compuscale.getUPPERLIMIT();
                        if (upperlimit != null) {
                            if (d10 != Double.parseDouble(lowerlimit.getValue())) {
                                vt = compuscale.getCOMPUCONST().getVT();
                                strArr[0] = vt.getValue();
                                if (vt.getTI() != null) {
                                    return strArr;
                                }
                                strArr[1] = vt.getTI();
                                return strArr;
                            }
                        } else if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || d10 >= Double.parseDouble(lowerlimit.getValue())) {
                            if (lowerlimit != null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || d10 > Double.parseDouble(lowerlimit.getValue())) {
                                if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED || d10 <= Double.parseDouble(upperlimit.getValue())) {
                                    if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN || d10 < Double.parseDouble(upperlimit.getValue())) {
                                        vt = compuscale.getCOMPUCONST().getVT();
                                        strArr[0] = vt.getValue();
                                        if (vt.getTI() != null) {
                                            return strArr;
                                        }
                                        strArr[1] = vt.getTI();
                                        return strArr;
                                    }
                                }
                            }
                        }
                    }
                    return strArr;
                }
                precision = (int) physicaltype.getPRECISION();
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d11));
                return strArr;
            case 4:
            case 5:
                next = null;
                if (next == null) {
                    next = getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().get(0);
                }
                COMPUNUMERATOR compunumerator2 = next.getCOMPURATIONALCOEFFS().getCOMPUNUMERATOR();
                COMPUDENOMINATOR compudenominator2 = next.getCOMPURATIONALCOEFFS().getCOMPUDENOMINATOR();
                v10 = compunumerator2.getV();
                dPow = 0.0d;
                while (i10 < v10.size()) {
                    dPow += Math.pow(d10, i10) * v10.get(i10).getValue();
                }
                v11 = compudenominator2.getV();
                i11 = 0;
                dPow2 = 0.0d;
                while (i11 < v11.size()) {
                    dPow2 += Math.pow(d10, i11) * v11.get(i11).getValue();
                    i11++;
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                double d12 = dPow / dPow2;
                i12 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$PHYSICALDATATYPE[physicaltype.getBASEDATATYPE().ordinal()];
                if (i12 == 1) {
                    precision = (int) physicaltype.getPRECISION();
                } else {
                    precision = (int) physicaltype.getPRECISION();
                }
                strArr[0] = String.format(Locale.US, i.c(precision, "%.", "f"), Double.valueOf(d12));
                return strArr;
            case 6:
                strArr = strArr2;
                while (r2.hasNext()) {
                    lowerlimit = compuscale.getLOWERLIMIT();
                    upperlimit = compuscale.getUPPERLIMIT();
                    if (upperlimit != null) {
                        if (lowerlimit != null) {
                        }
                        if (lowerlimit != null) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.CLOSED) {
                        }
                        if (upperlimit.getINTERVALTYPE() == INTERVALTYPE.OPEN) {
                        }
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                    if (d10 != Double.parseDouble(lowerlimit.getValue())) {
                        vt = compuscale.getCOMPUCONST().getVT();
                        strArr[0] = vt.getValue();
                        if (vt.getTI() != null) {
                            return strArr;
                        }
                        strArr[1] = vt.getTI();
                        return strArr;
                    }
                }
                return strArr;
            case 7:
                for (COMPUSCALE compuscale2 : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                    LIMIT lowerlimit3 = compuscale2.getLOWERLIMIT();
                    if (lowerlimit3 == null || d10 == Double.parseDouble(lowerlimit3.getValue())) {
                        if (lowerlimit3 != null) {
                            strArr2[0] = Double.toString(compuscale2.getCOMPUCONST().getV().getValue());
                            return strArr2;
                        }
                    }
                }
            default:
                return strArr2;
        }
    }

    public String[] calculate(String str) {
        String[] strArr = new String[2];
        int i10 = AnonymousClass1.$SwitchMap$com$obdeleven$service$odx$model$COMPUCATEGORY[this.category.ordinal()];
        if (i10 != 1) {
            if (i10 == 6) {
                for (COMPUSCALE compuscale : getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                    LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                    if (lowerlimit == null || lowerlimit.getValue().equalsIgnoreCase(str)) {
                        if (lowerlimit != null) {
                            VT vt = compuscale.getCOMPUCONST().getVT();
                            strArr[0] = vt.getValue();
                            if (vt.getTI() != null) {
                                strArr[1] = vt.getTI();
                            }
                            return strArr;
                        }
                    }
                }
            }
            strArr[0] = "N/A";
            return strArr;
        }
        strArr[0] = str;
        return strArr;
    }
}
