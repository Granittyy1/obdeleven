package com.obdeleven.service.odx;

import O.h;
import androidx.compose.foundation.C0936h;
import com.obdeleven.service.odx.model.CASE;
import com.obdeleven.service.odx.model.COMPUCONST;
import com.obdeleven.service.odx.model.COMPUINTERNALTOPHYS;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.COMPUSCALES;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.DATATYPE;
import com.obdeleven.service.odx.model.DEFAULTCASE;
import com.obdeleven.service.odx.model.DETERMINENUMBEROFITEMS;
import com.obdeleven.service.odx.model.DIAGLAYER;
import com.obdeleven.service.odx.model.DOPBASE;
import com.obdeleven.service.odx.model.DYNAMICLENGTHFIELD;
import com.obdeleven.service.odx.model.ENDOFPDUFIELD;
import com.obdeleven.service.odx.model.INTERVALTYPE;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.LONGNAME;
import com.obdeleven.service.odx.model.MUX;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.RADIX;
import com.obdeleven.service.odx.model.SNREF;
import com.obdeleven.service.odx.model.STATICFIELD;
import com.obdeleven.service.odx.model.STRUCTURE;
import com.obdeleven.service.odx.model.SWITCHKEY;
import com.obdeleven.service.odx.model.VT;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ParamFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: compiled from: ParamFactory.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29510a;

        static {
            int[] iArr = new int[DATATYPE.values().length];
            try {
                iArr[DATATYPE.A_INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DATATYPE.A_UINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DATATYPE.A_FLOAT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DATATYPE.A_FLOAT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DATATYPE.A_BYTEFIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DATATYPE.A_ASCIISTRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DATATYPE.A_UTF8STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DATATYPE.A_UNICODE2STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f29510a = iArr;
        }
    }

    public static Param a(PARAM param, boolean z10, byte[] pdu) {
        byte[] bArrC;
        i.e(pdu, "pdu");
        int bitlength = param.getDIAGCODEDTYPE().getBitlength();
        if (z10) {
            int iCeil = (int) Math.ceil(((double) bitlength) / 8.0d);
            bArrC = new byte[iCeil];
            String codedvalue = param.getCODEDVALUE();
            i.d(codedvalue, "getCODEDVALUE(...)");
            for (int i10 = 0; i10 < iCeil; i10++) {
                DATATYPE basedatatype = param.getDIAGCODEDTYPE().getBASEDATATYPE();
                int i11 = basedatatype == null ? -1 : a.f29510a[basedatatype.ordinal()];
                if (i11 == 1) {
                    bArrC[i10] = (byte) (Integer.parseInt(codedvalue) >> (i10 * 8));
                } else if (i11 == 2) {
                    bArrC[i10] = (byte) (Long.parseLong(codedvalue) >> (i10 * 8));
                } else if (i11 == 3) {
                    bArrC[i10] = (byte) (Float.floatToIntBits(Float.parseFloat(codedvalue)) >> (i10 * 8));
                } else if (i11 == 4) {
                    bArrC[i10] = (byte) (Double.doubleToLongBits(Double.parseDouble(codedvalue)) >> (i10 * 8));
                } else if (i11 == 5) {
                    int i12 = i10 * 2;
                    String strSubstring = codedvalue.substring(i12, i12 + 2);
                    i.d(strSubstring, "substring(...)");
                    h.c(16);
                    bArrC[i10] = (byte) Integer.parseInt(strSubstring, 16);
                }
            }
        } else {
            bArrC = c(param.getBYTEPOSITION(), param.getBITPOSITION(), bitlength, pdu);
            if (bArrC == null) {
                return null;
            }
        }
        Param param2 = new Param(bArrC, Param.Type.f29471f);
        param2.f29455c = param.getSHORTNAME();
        LONGNAME longname = param.getLONGNAME();
        param2.f29457e = longname != null ? longname.getValue() : null;
        LONGNAME longname2 = param.getLONGNAME();
        param2.f29458f = longname2 != null ? longname2.getTI() : null;
        param2.f29463l = param.getBYTEPOSITION();
        param2.f29464m = param.getBITPOSITION();
        param2.f29465n = bitlength;
        return param2;
    }

    public static Param b(PARAM param, boolean z10, e odxWorker, DIAGLAYER diaglayer) {
        i.e(odxWorker, "odxWorker");
        SNREF dopsnref = param.getDOPSNREF();
        e.c cVarM = dopsnref != null ? odxWorker.m(dopsnref) : odxWorker.l(param.getDOPREF(), diaglayer);
        if (cVarM == null) {
            return null;
        }
        DATAOBJECTPROP dataobjectprop = (DATAOBJECTPROP) cVarM.f29499a;
        String physconstantvalue = param.getPHYSCONSTANTVALUE();
        i.d(physconstantvalue, "getPHYSCONSTANTVALUE(...)");
        try {
            com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop.physicalToInternal(physconstantvalue, false);
            Param paramB = odxWorker.b(cVarM.f29500b, dataobjectprop, aVarPhysicalToInternal.f29475a, param.getBITPOSITION(), z10);
            paramB.f29465n = aVarPhysicalToInternal.f29476b;
            paramB.f29466o = false;
            paramB.f29455c = param.getSHORTNAME();
            LONGNAME longname = param.getLONGNAME();
            paramB.f29457e = longname != null ? longname.getValue() : null;
            LONGNAME longname2 = param.getLONGNAME();
            paramB.f29458f = longname2 != null ? longname2.getTI() : null;
            paramB.f29463l = param.getBYTEPOSITION();
            paramB.f29464m = param.getBITPOSITION();
            return paramB;
        } catch (Exception e10) {
            O.e.m(e10);
            return new Param(new byte[0]);
        }
    }

    public static byte[] c(int i10, int i11, int i12, byte[] bArr) {
        int iCeil = ((int) Math.ceil(((double) i12) / 8.0d)) + i10;
        if (iCeil > bArr.length) {
            iCeil = bArr.length;
        }
        try {
            byte[] bArrT = Q3.d.t(bArr, i10, iCeil);
            bArrT[0] = (byte) ((bArrT[0] & 255) >>> i11);
            while (i12 > 8) {
                i12 -= 8;
            }
            bArrT[0] = (byte) ((~((-1) << i12)) & bArrT[0]);
            return bArrT;
        } catch (Exception e10) {
            O.e.m(e10);
            return null;
        }
    }

    public static Param d(PARAM param, boolean z10, byte[] pdu) {
        byte[] bArrC;
        i.e(pdu, "pdu");
        int bitlength = (int) param.getBITLENGTH();
        if (z10) {
            bArrC = new byte[(int) Math.ceil(((double) bitlength) / 8.0d)];
        } else {
            bArrC = c(param.getBYTEPOSITION(), param.getBITPOSITION(), bitlength, pdu);
            if (bArrC == null) {
                return null;
            }
        }
        Param param2 = new Param(bArrC, Param.Type.f29470e);
        param2.f29455c = param.getSHORTNAME();
        LONGNAME longname = param.getLONGNAME();
        param2.f29457e = longname != null ? longname.getValue() : null;
        LONGNAME longname2 = param.getLONGNAME();
        param2.f29458f = longname2 != null ? longname2.getTI() : null;
        param2.f29463l = param.getBYTEPOSITION();
        param2.f29464m = param.getBITPOSITION();
        param2.f29465n = bitlength;
        return param2;
    }

    public static Param f(PARAM param, byte[] pdu) {
        i.e(pdu, "pdu");
        byte[] bArrT = Q3.d.t(pdu, param.getBYTEPOSITION(), pdu.length);
        Param param2 = new Param(bArrT, Param.Type.f29470e);
        param2.f29465n = (bArrT.length * 8) - param.getBITPOSITION();
        param2.f29463l = param.getBYTEPOSITION();
        param2.f29464m = param.getBITPOSITION();
        return param2;
    }

    public static Param g(PARAM param, boolean z10, byte[] pdu, final e odxWorker, DIAGLAYER diaglayer) {
        Param param2;
        Param param3;
        CASE next;
        e.c cVarL;
        byte[] bArr;
        com.obdeleven.service.odx.a aVar;
        com.obdeleven.service.odx.a aVarPhysicalToInternal;
        byte[] bArr2;
        COMPUSCALES compuscales;
        List<COMPUSCALE> compuscale;
        COMPUSCALE compuscale2;
        COMPUCONST compuconst;
        VT vt;
        i.e(pdu, "pdu");
        i.e(odxWorker, "odxWorker");
        byte[] bArrT = !z10 ? Q3.d.t(pdu, param.getBYTEPOSITION(), pdu.length) : new byte[0];
        SNREF dopsnref = param.getDOPSNREF();
        e.c cVarM = dopsnref != null ? odxWorker.m(dopsnref) : odxWorker.l(param.getDOPREF(), diaglayer);
        if (cVarM == null) {
            return null;
        }
        DOPBASE dopbase = cVarM.f29499a;
        boolean z11 = dopbase instanceof DATAOBJECTPROP;
        DIAGLAYER diaglayer2 = cVarM.f29500b;
        if (z11) {
            String physicaldefaultvalue = param.getPHYSICALDEFAULTVALUE();
            if (physicaldefaultvalue == null) {
                COMPUINTERNALTOPHYS compuinternaltophys = ((DATAOBJECTPROP) dopbase).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS();
                physicaldefaultvalue = (compuinternaltophys == null || (compuscales = compuinternaltophys.getCOMPUSCALES()) == null || (compuscale = compuscales.getCOMPUSCALE()) == null || (compuscale2 = compuscale.get(0)) == null || (compuconst = compuscale2.getCOMPUCONST()) == null || (vt = compuconst.getVT()) == null) ? null : vt.getValue();
            }
            if (!z10 || physicaldefaultvalue == null) {
                bArr = bArrT;
                aVar = null;
            } else {
                try {
                    aVarPhysicalToInternal = ((DATAOBJECTPROP) dopbase).physicalToInternal(physicaldefaultvalue);
                    try {
                        bArr2 = aVarPhysicalToInternal.f29475a;
                    } catch (Exception e10) {
                        e = e10;
                        O.e.m(e);
                        bArr2 = new byte[0];
                    }
                } catch (Exception e11) {
                    e = e11;
                    aVarPhysicalToInternal = null;
                }
                bArr = bArr2;
                aVar = aVarPhysicalToInternal;
            }
            param2 = odxWorker.b(diaglayer2, (DATAOBJECTPROP) dopbase, bArr, param.getBITPOSITION(), z10);
            if (aVar != null) {
                param2.f29465n = aVar.f29476b;
            }
        } else if (dopbase instanceof STRUCTURE) {
            param2 = odxWorker.L(diaglayer2, ((STRUCTURE) dopbase).getPARAMS().getPARAM(), bArrT, z10);
        } else {
            if (dopbase instanceof MUX) {
                MUX mux = (MUX) dopbase;
                O.e.j("OdxWorker", C0936h.d("mux(", diaglayer2.getID(), ", ", mux.getID(), ")"));
                SWITCHKEY switchkey = mux.getSWITCHKEY();
                int byteposition = (int) switchkey.getBYTEPOSITION();
                int bitposition = (int) switchkey.getBITPOSITION();
                e.c cVarL2 = odxWorker.l(switchkey.getDATAOBJECTPROPREF(), diaglayer2);
                if (cVarL2 == null) {
                    param3 = new Param(bArrT);
                } else {
                    final Param paramB = odxWorker.b(cVarL2.f29500b, (DATAOBJECTPROP) cVarL2.f29499a, Arrays.copyOfRange(bArrT, byteposition, bArrT.length), bitposition, false);
                    paramB.f29453a = Param.Type.f29467b;
                    Number number = new Number() { // from class: com.obdeleven.service.odx.OdxWorker$1
                        @Override // java.lang.Number
                        public final double doubleValue() {
                            return Double.parseDouble(paramB.f29459g);
                        }

                        @Override // java.lang.Number
                        public final float floatValue() {
                            return Float.parseFloat(paramB.f29459g);
                        }

                        /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                        @Override // java.lang.Number
                        public final int intValue() {
                            int i10;
                            RADIX displayradix = paramB.f29462k.getPHYSICALTYPE().getDISPLAYRADIX();
                            if (displayradix != null) {
                                int i11 = e.a.f29495c[displayradix.ordinal()];
                                i10 = 2;
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        i10 = 8;
                                    } else if (i11 != 3) {
                                        i10 = 10;
                                    } else {
                                        i10 = 16;
                                    }
                                }
                            } else {
                                i10 = 10;
                            }
                            return Integer.parseInt(paramB.f29459g, i10);
                        }

                        /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                        @Override // java.lang.Number
                        public final long longValue() {
                            int i10;
                            RADIX displayradix = paramB.f29462k.getPHYSICALTYPE().getDISPLAYRADIX();
                            if (displayradix != null) {
                                int i11 = e.a.f29495c[displayradix.ordinal()];
                                i10 = 2;
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        i10 = 8;
                                    } else if (i11 != 3) {
                                        i10 = 10;
                                    } else {
                                        i10 = 16;
                                    }
                                }
                            } else {
                                i10 = 10;
                            }
                            return Long.parseLong(paramB.f29459g, i10);
                        }
                    };
                    Iterator<CASE> it = mux.getCASES().getCASE().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        LIMIT lowerlimit = next.getLOWERLIMIT();
                        LIMIT upperlimit = next.getUPPERLIMIT();
                        if (upperlimit == null) {
                            if (number.intValue() == Integer.parseInt(lowerlimit.getValue())) {
                                break;
                            }
                        } else if (lowerlimit == null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || number.intValue() >= Integer.parseInt(lowerlimit.getValue())) {
                            if (lowerlimit == null || lowerlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || number.intValue() > Integer.parseInt(lowerlimit.getValue())) {
                                if (upperlimit.getINTERVALTYPE() != INTERVALTYPE.CLOSED || number.intValue() <= Integer.parseInt(upperlimit.getValue())) {
                                    if (upperlimit.getINTERVALTYPE() != INTERVALTYPE.OPEN || number.intValue() < Integer.parseInt(upperlimit.getValue())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (next != null) {
                        ODXLINK structureref = next.getSTRUCTUREREF();
                        cVarL = structureref != null ? odxWorker.l(structureref, diaglayer2) : odxWorker.m(next.getSTRUCTURESNREF());
                    } else {
                        DEFAULTCASE defaultcase = mux.getDEFAULTCASE();
                        if (defaultcase == null) {
                            O.e.D("OdxWorker", "Could not get defaultcase");
                            param3 = new Param(bArrT);
                        } else {
                            ODXLINK structureref2 = defaultcase.getSTRUCTUREREF();
                            cVarL = structureref2 != null ? odxWorker.l(structureref2, diaglayer2) : odxWorker.m(defaultcase.getSTRUCTURESNREF());
                        }
                    }
                    if (cVarL == null) {
                        param3 = new Param(bArrT);
                    } else {
                        STRUCTURE structure = (STRUCTURE) cVarL.f29499a;
                        int byteposition2 = (int) mux.getBYTEPOSITION();
                        Param paramL = odxWorker.L(cVarL.f29500b, structure.getPARAMS().getPARAM(), Arrays.copyOfRange(bArrT, byteposition2, bArrT.length), false);
                        O.e.j("OdxWorker", "mux.structure.length: " + paramL.b());
                        for (Param param4 : paramL.f29456d) {
                            O.e.j("OdxWorker", "mux.structure.param.type: " + param4.f29453a.name() + " " + param4.b());
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(paramB);
                        arrayList.add(paramL);
                        param3 = new Param(bArrT, arrayList);
                        param3.f29463l = byteposition2;
                        param3.f29464m = 0;
                        O.e.j("OdxWorker", "mux.mux.length: " + (param3.b() / 8));
                    }
                }
            } else if (dopbase instanceof ENDOFPDUFIELD) {
                param2 = odxWorker.c(diaglayer2, (ENDOFPDUFIELD) dopbase, bArrT);
            } else if (dopbase instanceof DYNAMICLENGTHFIELD) {
                DYNAMICLENGTHFIELD dynamiclengthfield = (DYNAMICLENGTHFIELD) dopbase;
                O.e.j("OdxWorker", C0936h.d("dynamiclengthfield(", diaglayer2.getID(), ", ", dynamiclengthfield.getID(), ")"));
                e.c cVarL3 = odxWorker.l(dynamiclengthfield.getBASICSTRUCTUREREF(), diaglayer2);
                if (cVarL3 == null) {
                    O.e.D("OdxWorker", "dopbaseresult is null");
                    param3 = new Param(bArrT);
                } else {
                    STRUCTURE structure2 = (STRUCTURE) cVarL3.f29499a;
                    int offset = (int) dynamiclengthfield.getOFFSET();
                    DETERMINENUMBEROFITEMS determinenumberofitems = dynamiclengthfield.getDETERMINENUMBEROFITEMS();
                    int byteposition3 = determinenumberofitems.getBYTEPOSITION();
                    int bitposition2 = determinenumberofitems.getBITPOSITION();
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrT, byteposition3, bArrT.length);
                    bArrCopyOfRange[0] = (byte) ((bArrCopyOfRange[0] & 255) >>> bitposition2);
                    e.c cVarL4 = odxWorker.l(determinenumberofitems.getDATAOBJECTPROPREF(), diaglayer2);
                    if (cVarL4 == null) {
                        O.e.D("OdxWorker", "Could not get dopbaseRef");
                        param3 = new Param(bArrT);
                    } else {
                        final Param paramB2 = odxWorker.b(cVarL4.f29500b, (DATAOBJECTPROP) cVarL4.f29499a, bArrCopyOfRange, bitposition2, false);
                        Number number2 = new Number() { // from class: com.obdeleven.service.odx.OdxWorker$2
                            @Override // java.lang.Number
                            public final double doubleValue() {
                                return Double.parseDouble(paramB2.f29459g);
                            }

                            @Override // java.lang.Number
                            public final float floatValue() {
                                return Float.parseFloat(paramB2.f29459g);
                            }

                            /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                            @Override // java.lang.Number
                            public final int intValue() {
                                int i10;
                                RADIX displayradix = paramB2.f29462k.getPHYSICALTYPE().getDISPLAYRADIX();
                                if (displayradix != null) {
                                    int i11 = e.a.f29495c[displayradix.ordinal()];
                                    i10 = 2;
                                    if (i11 != 1) {
                                        if (i11 == 2) {
                                            i10 = 8;
                                        } else if (i11 != 3) {
                                            i10 = 10;
                                        } else {
                                            i10 = 16;
                                        }
                                    }
                                } else {
                                    i10 = 10;
                                }
                                return Integer.parseInt(paramB2.f29459g, i10);
                            }

                            /* JADX WARN: Code duplicated, block: B:12:0x0026  */
                            @Override // java.lang.Number
                            public final long longValue() {
                                int i10;
                                RADIX displayradix = paramB2.f29462k.getPHYSICALTYPE().getDISPLAYRADIX();
                                if (displayradix != null) {
                                    int i11 = e.a.f29495c[displayradix.ordinal()];
                                    i10 = 2;
                                    if (i11 != 1) {
                                        if (i11 == 2) {
                                            i10 = 8;
                                        } else if (i11 != 3) {
                                            i10 = 10;
                                        } else {
                                            i10 = 16;
                                        }
                                    }
                                } else {
                                    i10 = 10;
                                }
                                return Long.parseLong(paramB2.f29459g, i10);
                            }
                        };
                        if (number2.intValue() == 0) {
                            O.e.D("OdxWorker", "number of items is empty");
                            param3 = new Param(bArrT);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Param param5 = new Param(bArrT, arrayList2);
                            int i10 = 0;
                            while (i10 < number2.intValue()) {
                                int bytesize = structure2.getBYTESIZE();
                                Param paramL2 = odxWorker.L(cVarL3.f29500b, structure2.getPARAMS().getPARAM(), Arrays.copyOfRange(bArrT, bytesize == 0 ? i10 != 0 ? ((int) Math.ceil(param5.b() / 8.0f)) + offset : offset : (i10 * bytesize) + offset, bArrT.length), false);
                                paramL2.f29463l = (bytesize * i10) + offset;
                                paramL2.f29464m = 0;
                                arrayList2.add(paramL2);
                                i10++;
                            }
                            param2 = param5;
                        }
                    }
                }
            } else if (dopbase instanceof STATICFIELD) {
                STATICFIELD staticfield = (STATICFIELD) dopbase;
                O.e.j("OdxWorker", C0936h.d("staticfield(", diaglayer.getID(), ", ", staticfield.getID(), ")"));
                ODXLINK basicstructureref = staticfield.getBASICSTRUCTUREREF();
                SNREF basicstructuresnref = staticfield.getBASICSTRUCTURESNREF();
                e.c cVarM2 = basicstructuresnref != null ? odxWorker.m(basicstructuresnref) : odxWorker.l(basicstructureref, diaglayer);
                if (cVarM2 == null) {
                    O.e.D("OdxWorker", "structureResult is null");
                    param3 = new Param(bArrT);
                } else {
                    STRUCTURE structure3 = (STRUCTURE) cVarM2.f29499a;
                    ArrayList arrayList3 = new ArrayList();
                    Param param6 = new Param(bArrT, arrayList3);
                    int i11 = 1;
                    int itembytesize = 0;
                    while (true) {
                        long j = i11;
                        if (j > staticfield.getFIXEDNUMBEROFITEMS()) {
                            break;
                        }
                        O.e.j("OdxWorker", String.format(Locale.getDefault(), "staticfield.bytesUsed %d, %d", Integer.valueOf(itembytesize), Integer.valueOf(bArrT.length)));
                        Param paramL3 = odxWorker.L(cVarM2.f29500b, structure3.getPARAMS().getPARAM(), Arrays.copyOfRange(bArrT, itembytesize, bArrT.length), false);
                        O.e.j("OdxWorker", "staticfield.param.length: " + (paramL3.b() / 8));
                        paramL3.f29463l = itembytesize;
                        paramL3.f29464m = 0;
                        arrayList3.add(paramL3);
                        itembytesize = (int) (staticfield.getITEMBYTESIZE() * j);
                        i11++;
                    }
                    O.e.j("OdxWorker", "staticfield.paramList.size: " + arrayList3.size());
                    param2 = param6;
                }
            } else {
                O.e.D("ParamManager", "Unknown dopBase type ".concat(dopbase.getClass().getName()));
                param2 = new Param(bArrT);
            }
            param2 = param3;
        }
        param2.f29455c = param.getSHORTNAME();
        LONGNAME longname = param.getLONGNAME();
        param2.f29457e = longname != null ? longname.getValue() : null;
        LONGNAME longname2 = param.getLONGNAME();
        param2.f29458f = longname2 != null ? longname2.getTI() : null;
        param2.f29463l = param.getBYTEPOSITION();
        param2.f29464m = param.getBITPOSITION();
        return param2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(PARAM param, e eVar, DIAGLAYER diaglayer, int i10, ContinuationImpl continuationImpl) throws Throwable {
        ParamFactory$getTableKeyParam$1 paramFactory$getTableKeyParam$1;
        e.g gVarE;
        e.c cVarL;
        if (continuationImpl instanceof ParamFactory$getTableKeyParam$1) {
            paramFactory$getTableKeyParam$1 = (ParamFactory$getTableKeyParam$1) continuationImpl;
            int i11 = paramFactory$getTableKeyParam$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                paramFactory$getTableKeyParam$1.label = i11 - Integer.MIN_VALUE;
            } else {
                paramFactory$getTableKeyParam$1 = new ParamFactory$getTableKeyParam$1(this, continuationImpl);
            }
        } else {
            paramFactory$getTableKeyParam$1 = new ParamFactory$getTableKeyParam$1(this, continuationImpl);
        }
        Object objF = paramFactory$getTableKeyParam$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = paramFactory$getTableKeyParam$1.label;
        if (i12 == 0) {
            kotlin.b.b(objF);
            ODXLINK tableref = param.getTableref();
            SNREF tablesnref = param.getTablesnref();
            if (tableref != null) {
                gVarE = eVar.E(tableref, diaglayer);
            } else if (tablesnref != null) {
                Sa.a aVar = N.f43200c;
                ParamFactory$getTableKeyParam$tableResult$1 paramFactory$getTableKeyParam$tableResult$1 = new ParamFactory$getTableKeyParam$tableResult$1(eVar, tablesnref, null);
                paramFactory$getTableKeyParam$1.L$0 = param;
                paramFactory$getTableKeyParam$1.L$1 = eVar;
                paramFactory$getTableKeyParam$1.I$0 = i10;
                paramFactory$getTableKeyParam$1.label = 1;
                objF = C2680e.f(aVar, paramFactory$getTableKeyParam$tableResult$1, paramFactory$getTableKeyParam$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                gVarE = null;
            }
            if (gVarE != null || (cVarL = eVar.l(gVarE.f29507a.getKEYDOPREF(), gVarE.f29508b)) == null) {
                return null;
            }
            int bitlength = ((DATAOBJECTPROP) cVarL.f29499a).getDIAGCODEDTYPE().getBitlength();
            byte[] bArrL = A0.f.l(i10);
            byte[] bArrT = Q3.d.t(bArrL, bArrL.length - ((int) Math.ceil(((double) bitlength) / 8.0d)), bArrL.length);
            Param param2 = new Param(bArrT, Param.Type.f29470e);
            param2.f29465n = (bArrT.length * 8) - param.getBITPOSITION();
            param2.f29463l = param.getBYTEPOSITION();
            param2.f29464m = param.getBITPOSITION();
            return param2;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i10 = paramFactory$getTableKeyParam$1.I$0;
        eVar = (e) paramFactory$getTableKeyParam$1.L$1;
        param = (PARAM) paramFactory$getTableKeyParam$1.L$0;
        kotlin.b.b(objF);
        gVarE = (e.g) objF;
        if (gVarE != null) {
            return null;
        }
        int bitlength2 = ((DATAOBJECTPROP) cVarL.f29499a).getDIAGCODEDTYPE().getBitlength();
        byte[] bArrL2 = A0.f.l(i10);
        byte[] bArrT2 = Q3.d.t(bArrL2, bArrL2.length - ((int) Math.ceil(((double) bitlength2) / 8.0d)), bArrL2.length);
        Param param3 = new Param(bArrT2, Param.Type.f29470e);
        param3.f29465n = (bArrT2.length * 8) - param.getBITPOSITION();
        param3.f29463l = param.getBYTEPOSITION();
        param3.f29464m = param.getBITPOSITION();
        return param3;
    }
}
