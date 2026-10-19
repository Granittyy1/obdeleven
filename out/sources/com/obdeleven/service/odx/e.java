package com.obdeleven.service.odx;

import C4.v;
import androidx.compose.foundation.C0936h;
import com.obdeleven.service.odx.model.BASEVARIANT;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.DATAOBJECTPROPS;
import com.obdeleven.service.odx.model.DATATYPE;
import com.obdeleven.service.odx.model.DIAGCOMMS;
import com.obdeleven.service.odx.model.DIAGDATADICTIONARYSPEC;
import com.obdeleven.service.odx.model.DIAGLAYER;
import com.obdeleven.service.odx.model.DIAGSERVICE;
import com.obdeleven.service.odx.model.DOPBASE;
import com.obdeleven.service.odx.model.DYNAMICLENGTHFIELD;
import com.obdeleven.service.odx.model.DYNAMICLENGTHFIELDS;
import com.obdeleven.service.odx.model.ECUVARIANT;
import com.obdeleven.service.odx.model.ECUVARIANTPATTERN;
import com.obdeleven.service.odx.model.ENDOFPDUFIELD;
import com.obdeleven.service.odx.model.ENDOFPDUFIELDS;
import com.obdeleven.service.odx.model.FUNCTIONALGROUP;
import com.obdeleven.service.odx.model.IMPORTREFS;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.MATCHINGPARAMETER;
import com.obdeleven.service.odx.model.MUX;
import com.obdeleven.service.odx.model.MUXS;
import com.obdeleven.service.odx.model.NOTINHERITEDDOP;
import com.obdeleven.service.odx.model.NOTINHERITEDDOPS;
import com.obdeleven.service.odx.model.NOTINHERITEDTABLE;
import com.obdeleven.service.odx.model.NOTINHERITEDTABLES;
import com.obdeleven.service.odx.model.ODX;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.OdxParamType;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.PARENTREF;
import com.obdeleven.service.odx.model.PARENTREFS;
import com.obdeleven.service.odx.model.POSRESPONSE;
import com.obdeleven.service.odx.model.PROTOCOL;
import com.obdeleven.service.odx.model.RADIX;
import com.obdeleven.service.odx.model.REQUEST;
import com.obdeleven.service.odx.model.REQUESTS;
import com.obdeleven.service.odx.model.SNREF;
import com.obdeleven.service.odx.model.STATICFIELD;
import com.obdeleven.service.odx.model.STATICFIELDS;
import com.obdeleven.service.odx.model.STRUCTURE;
import com.obdeleven.service.odx.model.STRUCTURES;
import com.obdeleven.service.odx.model.TABLE;
import com.obdeleven.service.odx.model.TABLEROW;
import com.obdeleven.service.odx.model.TABLES;
import com.obdeleven.service.odx.model.UNIT;
import com.obdeleven.service.odx.model.VT;
import com.voltasit.parse.Parse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p134k8.B1;

/* JADX INFO: compiled from: OdxWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECUVARIANT f29488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.obdeleven.service.odx.b f29490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.obdeleven.service.odx.c f29491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p242t9.a f29492e;

    /* JADX INFO: compiled from: OdxWorker.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f29495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f29496d;

        static {
            int[] iArr = new int[DopBaseType.values().length];
            f29496d = iArr;
            try {
                DopBaseType.a aVar = DopBaseType.f29451b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f29496d;
                DopBaseType.a aVar2 = DopBaseType.f29451b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f29496d;
                DopBaseType.a aVar3 = DopBaseType.f29451b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f29496d;
                DopBaseType.a aVar4 = DopBaseType.f29451b;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f29496d;
                DopBaseType.a aVar5 = DopBaseType.f29451b;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f29496d;
                DopBaseType.a aVar6 = DopBaseType.f29451b;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr7 = new int[RADIX.values().length];
            f29495c = iArr7;
            try {
                iArr7[RADIX.BIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29495c[RADIX.OCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29495c[RADIX.HEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr8 = new int[DATATYPE.values().length];
            f29494b = iArr8;
            try {
                iArr8[DATATYPE.A_ASCIISTRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29494b[DATATYPE.A_UTF8STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29494b[DATATYPE.A_UNICODE2STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29494b[DATATYPE.A_BYTEFIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29494b[DATATYPE.A_INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29494b[DATATYPE.A_UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29494b[DATATYPE.A_FLOAT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29494b[DATATYPE.A_FLOAT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr9 = new int[OdxParamType.values().length];
            f29493a = iArr9;
            try {
                iArr9[OdxParamType.Value.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f29493a[OdxParamType.CodedConst.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f29493a[OdxParamType.Reserved.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29493a[OdxParamType.PhysConst.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DIAGSERVICE f29497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DIAGLAYER f29498b;

        public b(DIAGSERVICE diagservice, DIAGLAYER diaglayer) {
            this.f29497a = diagservice;
            this.f29498b = diaglayer;
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DOPBASE f29499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DIAGLAYER f29500b;

        public c(DOPBASE dopbase, DIAGLAYER diaglayer) {
            this.f29499a = dopbase;
            this.f29500b = diaglayer;
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f29501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<PARENTREF> f29502b;

        public d(c cVar, List list) {
            this.f29501a = cVar;
            this.f29502b = list;
        }
    }

    /* JADX INFO: renamed from: com.obdeleven.service.odx.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OdxWorker.java */
    public class C0294e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final POSRESPONSE f29503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DIAGLAYER f29504b;

        public C0294e(POSRESPONSE posresponse, DIAGLAYER diaglayer) {
            this.f29503a = posresponse;
            this.f29504b = diaglayer;
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final REQUEST f29505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DIAGLAYER f29506b;

        public f(REQUEST request, DIAGLAYER diaglayer) {
            this.f29505a = request;
            this.f29506b = diaglayer;
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TABLE f29507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DIAGLAYER f29508b;

        public g(TABLE table, DIAGLAYER diaglayer) {
            this.f29507a = table;
            this.f29508b = diaglayer;
        }
    }

    /* JADX INFO: compiled from: OdxWorker.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UNIT f29509a;

        public h(UNIT unit) {
            this.f29509a = unit;
        }
    }

    public e(ECUVARIANT ecuvariant, String str, com.obdeleven.service.odx.b bVar, com.obdeleven.service.odx.c cVar, p242t9.a aVar) {
        this.f29488a = ecuvariant;
        this.f29489b = str;
        this.f29490c = bVar;
        this.f29491d = cVar;
        this.f29492e = aVar;
    }

    public static STATICFIELD A(String str, DIAGLAYER diaglayer) {
        STATICFIELDS staticfields;
        O.e.j("OdxWorker", C0936h.d("getEndofpdufieldSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (staticfields = diagdatadictionaryspec.getSTATICFIELDS()) == null) {
            return null;
        }
        for (STATICFIELD staticfield : staticfields.getSTATICFIELD()) {
            if (staticfield.getSHORTNAME().equals(str)) {
                return staticfield;
            }
        }
        return null;
    }

    public static STRUCTURE C(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getStructureRef(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null) {
            return null;
        }
        for (STRUCTURE structure : diagdatadictionaryspec.getSTRUCTURES().getSTRUCTURE()) {
            if (structure.getID().equals(str)) {
                return structure;
            }
        }
        return null;
    }

    public static STRUCTURE D(String str, DIAGLAYER diaglayer) {
        STRUCTURES structures;
        O.e.j("OdxWorker", C0936h.d("getStructureSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (structures = diagdatadictionaryspec.getSTRUCTURES()) == null) {
            return null;
        }
        for (STRUCTURE structure : structures.getSTRUCTURE()) {
            if (structure.getSHORTNAME().equals(str)) {
                return structure;
            }
        }
        return null;
    }

    public static TABLE F(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getTableRef(", diaglayer.getID(), ", ", str, ")"));
        if (diaglayer.getDIAGDATADICTIONARYSPEC() == null) {
            return null;
        }
        for (TABLE table : diaglayer.getDIAGDATADICTIONARYSPEC().getTABLES().getTABLE()) {
            if (table.getID().equals(str)) {
                return table;
            }
        }
        return null;
    }

    public static TABLE K(String str, DIAGLAYER diaglayer) {
        TABLES tables;
        O.e.j("OdxWorker", C0936h.d("getTableSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (tables = diagdatadictionaryspec.getTABLES()) == null) {
            return null;
        }
        for (TABLE table : tables.getTABLE()) {
            if (table.getSHORTNAME().equals(str)) {
                return table;
            }
        }
        return null;
    }

    public static e a(com.obdeleven.service.odx.c cVar) throws OdxFactory$Exception {
        boolean z10;
        boolean zEquals;
        com.obdeleven.service.odx.b bVar = com.obdeleven.service.odx.g.f29511a;
        if (bVar == null) {
            i.m("odxFactory");
            throw null;
        }
        p242t9.a aVar = Parse.f34395b;
        Locale locale = Locale.US;
        StringBuilder sbA = C7.g.a("create(", cVar.f29482b, ", ");
        String str = cVar.f29483c;
        sbA.append(str);
        sbA.append(", ");
        sbA.append(cVar.f29484d);
        sbA.append(")");
        O.e.s("OdxWorker", sbA.toString());
        B1 b1B = bVar.b(cVar);
        if (b1B != null) {
            String strSubstring = str.substring(0, 3);
            ODX odx = b1B.f42572a;
            Iterator<ECUVARIANT> it = odx.getDIAGLAYERCONTAINER().getECUVARIANTS().getECUVARIANT().iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                String str2 = cVar.f29482b;
                if (!zHasNext) {
                    O.e.D("OdxWorker", "No match for odxname: " + str2 + ", version: " + str);
                    break;
                }
                ECUVARIANT next = it.next();
                Iterator<ECUVARIANTPATTERN> it2 = next.getECUVARIANTPATTERNS().getECUVARIANTPATTERN().iterator();
                while (it2.hasNext()) {
                    String expectedvalue = "";
                    String expectedvalue2 = "";
                    for (MATCHINGPARAMETER matchingparameter : it2.next().getMATCHINGPARAMETERS().getMATCHINGPARAMETER()) {
                        Iterator<ECUVARIANT> it3 = it;
                        if (matchingparameter.getDIAGCOMMSNREF().getSHORTNAME().equals("DiagnServi_ReadDataByIdentASAMODXFileIdent")) {
                            expectedvalue = matchingparameter.getEXPECTEDVALUE();
                        }
                        if (matchingparameter.getDIAGCOMMSNREF().getSHORTNAME().equals("DiagnServi_ReadDataByIdentASAMODXFileVersi")) {
                            expectedvalue2 = matchingparameter.getEXPECTEDVALUE();
                        }
                        it = it3;
                    }
                    Iterator<ECUVARIANT> it4 = it;
                    if (expectedvalue.equals(str2)) {
                        zEquals = expectedvalue2.equals(strSubstring);
                        z10 = false;
                    } else if (str2.length() > 14) {
                        z10 = false;
                        zEquals = expectedvalue.equals(str2.substring(0, 14));
                    } else {
                        z10 = false;
                        zEquals = false;
                    }
                    if (zEquals) {
                        O.e.s("OdxWorker", "Found for ".concat(expectedvalue));
                        com.obdeleven.service.odx.d dVarG = Parse.f34395b.g(odx.getFileName());
                        if (dVarG == null) {
                            break loop0;
                        }
                        return new e(next, b1B.f42573b, bVar, aVar.c(cVar.f29481a, dVarG.f29486a, dVarG.f29487b, cVar.f29484d, false), aVar);
                    }
                    it = it4;
                }
            }
        }
        return null;
    }

    public static DATAOBJECTPROP d(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getDataobjectpropRef(", diaglayer.getID(), ", ", str, ")"));
        if (diaglayer.getDIAGDATADICTIONARYSPEC() == null) {
            O.e.D("OdxWorker", "DIAG-DATA-DICTIONARY-SPEC not found");
            return null;
        }
        for (DATAOBJECTPROP dataobjectprop : diaglayer.getDIAGDATADICTIONARYSPEC().getDATAOBJECTPROPS().getDATAOBJECTPROP()) {
            if (dataobjectprop.getID().equals(str)) {
                return dataobjectprop;
            }
        }
        return null;
    }

    public static DATAOBJECTPROP e(String str, DIAGLAYER diaglayer) {
        DATAOBJECTPROPS dataobjectprops;
        O.e.j("OdxWorker", C0936h.d("getDataobjectpropSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (dataobjectprops = diagdatadictionaryspec.getDATAOBJECTPROPS()) == null) {
            return null;
        }
        for (DATAOBJECTPROP dataobjectprop : dataobjectprops.getDATAOBJECTPROP()) {
            if (dataobjectprop.getSHORTNAME().equals(str)) {
                return dataobjectprop;
            }
        }
        return null;
    }

    public static DIAGSERVICE h(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getDiagserviceSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGCOMMS diagcomms = diaglayer.getDIAGCOMMS();
        if (diagcomms == null) {
            return null;
        }
        for (DIAGSERVICE diagservice : diagcomms.getDIAGSERVICES()) {
            if (diagservice.getSHORTNAME().equals(str)) {
                return diagservice;
            }
        }
        return null;
    }

    public static DOPBASE j(String str, DIAGLAYER diaglayer) {
        DopBaseType.f29451b.getClass();
        DopBaseType dopBaseTypeA = DopBaseType.a.a(str);
        if (dopBaseTypeA == null) {
            O.e.l("OdxWorker", "Unknown dopBase type: ".concat(str));
            return null;
        }
        int iOrdinal = dopBaseTypeA.ordinal();
        if (iOrdinal == 0) {
            return d(str, diaglayer);
        }
        if (iOrdinal == 1) {
            return C(str, diaglayer);
        }
        if (iOrdinal == 2) {
            return s(str, diaglayer);
        }
        if (iOrdinal == 3) {
            return q(str, diaglayer);
        }
        if (iOrdinal == 4) {
            return o(str, diaglayer);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return z(str, diaglayer);
    }

    public static DYNAMICLENGTHFIELD o(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getDynamiclengthfieldRef(", diaglayer.getID(), ", ", str, ")"));
        for (DYNAMICLENGTHFIELD dynamiclengthfield : diaglayer.getDIAGDATADICTIONARYSPEC().getDYNAMICLENGTHFIELDS().getDYNAMICLENGTHFIELD()) {
            if (dynamiclengthfield.getID().equals(str)) {
                return dynamiclengthfield;
            }
        }
        return null;
    }

    public static DYNAMICLENGTHFIELD p(String str, DIAGLAYER diaglayer) {
        DYNAMICLENGTHFIELDS dynamiclengthfields;
        O.e.j("OdxWorker", C0936h.d("getDynamiclengthfieldSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (dynamiclengthfields = diagdatadictionaryspec.getDYNAMICLENGTHFIELDS()) == null) {
            return null;
        }
        for (DYNAMICLENGTHFIELD dynamiclengthfield : dynamiclengthfields.getDYNAMICLENGTHFIELD()) {
            if (dynamiclengthfield.getSHORTNAME().equals(str)) {
                return dynamiclengthfield;
            }
        }
        return null;
    }

    public static ENDOFPDUFIELD q(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getEndofpdufieldRef(", diaglayer.getID(), ", ", str, ")"));
        for (ENDOFPDUFIELD endofpdufield : diaglayer.getDIAGDATADICTIONARYSPEC().getENDOFPDUFIELDS().getENDOFPDUFIELD()) {
            if (endofpdufield.getID().equals(str)) {
                return endofpdufield;
            }
        }
        return null;
    }

    public static ENDOFPDUFIELD r(String str, DIAGLAYER diaglayer) {
        ENDOFPDUFIELDS endofpdufields;
        O.e.j("OdxWorker", C0936h.d("getEndofpdufieldSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (endofpdufields = diagdatadictionaryspec.getENDOFPDUFIELDS()) == null) {
            return null;
        }
        for (ENDOFPDUFIELD endofpdufield : endofpdufields.getENDOFPDUFIELD()) {
            if (endofpdufield.getSHORTNAME().equals(str)) {
                return endofpdufield;
            }
        }
        return null;
    }

    public static MUX s(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getMuxRef(", diaglayer.getID(), ", ", str, ")"));
        for (MUX mux : diaglayer.getDIAGDATADICTIONARYSPEC().getMUXS().getMUX()) {
            if (mux.getID().equals(str)) {
                return mux;
            }
        }
        return null;
    }

    public static MUX t(String str, DIAGLAYER diaglayer) {
        MUXS muxs;
        O.e.j("OdxWorker", C0936h.d("getMuxSnref(", diaglayer.getID(), ", ", str, ")"));
        DIAGDATADICTIONARYSPEC diagdatadictionaryspec = diaglayer.getDIAGDATADICTIONARYSPEC();
        if (diagdatadictionaryspec == null || (muxs = diagdatadictionaryspec.getMUXS()) == null) {
            return null;
        }
        for (MUX mux : muxs.getMUX()) {
            if (mux.getSHORTNAME().equals(str)) {
                return mux;
            }
        }
        return null;
    }

    public static ODXLINK u(ODXLINK odxlink) {
        ODXLINK odxlink2 = new ODXLINK();
        odxlink2.setDOCREF(odxlink.getDOCREF());
        odxlink2.setIDREF(odxlink.getIDREF());
        odxlink2.setDOCTYPE(odxlink.getDOCTYPE());
        odxlink2.setREVISION(odxlink.getREVISION());
        return odxlink2;
    }

    public static List w(DIAGLAYER diaglayer) {
        if (diaglayer instanceof BASEVARIANT) {
            return ((BASEVARIANT) diaglayer).getPARENTREFS().getPARENTREF();
        }
        if (diaglayer instanceof FUNCTIONALGROUP) {
            return ((FUNCTIONALGROUP) diaglayer).getPARENTREFS().getPARENTREF();
        }
        if (diaglayer instanceof PROTOCOL) {
            return ((PROTOCOL) diaglayer).getPARENTREFS().getPARENTREF();
        }
        if (diaglayer instanceof ECUVARIANT) {
            return ((ECUVARIANT) diaglayer).getPARENTREFS().getPARENTREF();
        }
        return null;
    }

    public static STATICFIELD z(String str, DIAGLAYER diaglayer) {
        O.e.j("OdxWorker", C0936h.d("getStatcifieldRef(", diaglayer.getID(), ", ", str, ")"));
        for (STATICFIELD staticfield : diaglayer.getDIAGDATADICTIONARYSPEC().getSTATICFIELDS().getSTATICFIELD()) {
            if (staticfield.getID().equals(str)) {
                return staticfield;
            }
        }
        return null;
    }

    public final c B(DIAGLAYER diaglayer, TABLE table, int i10) throws OdxFactory$Exception {
        DATAOBJECTPROP dataobjectpropD;
        VT vt;
        HashMap map;
        List list;
        O.e.j("OdxWorker", C0936h.d("getStructureFromTable(", diaglayer.getSHORTNAME(), ", ", table.getID(), ")"));
        ODXLINK keydopref = table.getKEYDOPREF();
        DIAGLAYER diaglayerI = i(keydopref, diaglayer);
        if (diaglayerI == null || (dataobjectpropD = d(keydopref.getIDREF(), diaglayerI)) == null) {
            return null;
        }
        Iterator<COMPUSCALE> it = dataobjectpropD.getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
        while (true) {
            if (!it.hasNext()) {
                vt = null;
                break;
            }
            COMPUSCALE next = it.next();
            LIMIT lowerlimit = next.getLOWERLIMIT();
            if (lowerlimit == null) {
                lowerlimit = next.getUPPERLIMIT();
            }
            if (Integer.parseInt(lowerlimit.getValue()) == i10) {
                vt = next.getCOMPUCONST().getVT();
                break;
            }
        }
        if (vt == null) {
            return null;
        }
        for (TABLEROW tablerow : table.getTABLEROWS()) {
            if (tablerow.getKEY().equals(vt.getValue())) {
                c dopBaseResult = tablerow.getDopBaseResult();
                if (dopBaseResult == null) {
                    ODXLINK structureref = tablerow.getSTRUCTUREREF();
                    dopBaseResult = structureref != null ? l(structureref, diaglayer) : m(tablerow.getSTRUCTURESNREF());
                    tablerow.setDopBaseResult(dopBaseResult);
                }
                return dopBaseResult;
            }
        }
        HashMap map2 = new HashMap();
        for (ODXLINK odxlink : table.getTABLEROWREFS()) {
            String docref = odxlink.getDOCREF();
            if (docref == null) {
                docref = "";
            }
            if (map2.containsKey(docref)) {
                map = (HashMap) map2.get(docref);
            } else {
                HashMap map3 = new HashMap();
                map2.put(docref, map3);
                map = map3;
            }
            String idref = odxlink.getIDREF();
            int iIndexOf = idref.indexOf(".");
            if (iIndexOf != -1) {
                idref = idref.substring(0, iIndexOf);
            }
            if (map.containsKey(idref)) {
                list = (List) map.get(idref);
            } else {
                ArrayList arrayList = new ArrayList();
                map.put(idref, arrayList);
                list = arrayList;
            }
            list.add(odxlink.getIDREF());
        }
        for (String str : map2.keySet()) {
            ODXLINK odxlink2 = new ODXLINK();
            odxlink2.setDOCREF(str);
            DIAGLAYER diaglayerI2 = i(odxlink2, diaglayer);
            if (diaglayerI2 != null) {
                HashMap map4 = (HashMap) map2.get(str);
                for (String str2 : map4.keySet()) {
                    TABLE tableF = F(str2, diaglayerI2);
                    if (tableF != null) {
                        List list2 = (List) map4.get(str2);
                        for (TABLEROW tablerow2 : tableF.getTABLEROWS()) {
                            if (list2.contains(tablerow2.getID()) && tablerow2.getKEY().equals(vt.getValue())) {
                                c dopBaseResult2 = tablerow2.getDopBaseResult();
                                if (dopBaseResult2 == null) {
                                    ODXLINK structureref2 = tablerow2.getSTRUCTUREREF();
                                    dopBaseResult2 = structureref2 != null ? l(structureref2, diaglayerI2) : m(tablerow2.getSTRUCTURESNREF());
                                }
                                tablerow2.setDopBaseResult(dopBaseResult2);
                                return dopBaseResult2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final g E(ODXLINK odxlink, DIAGLAYER diaglayer) throws OdxFactory$Exception {
        DIAGLAYER diaglayerI = i(odxlink, diaglayer);
        String idref = odxlink.getIDREF();
        O.e.j("OdxWorker", C0936h.d("getTableRef(", diaglayerI.getID(), ", ", idref, ")"));
        TABLE tableF = F(idref, diaglayerI);
        if (tableF != null) {
            return new g(tableF, diaglayerI);
        }
        return null;
    }

    public final g G() {
        C0294e c0294eX;
        ODXLINK tableref;
        SNREF tablesnref;
        try {
            SNREF snref = new SNREF();
            snref.setSHORTNAME("DiagnServi_ReadDataByIdentVariaCodin");
            b bVarF = f(snref);
            if (bVarF == null || (c0294eX = x(bVarF.f29497a.getPOSRESPONSEREFS().getPOSRESPONSEREF().get(0), bVarF.f29498b)) == null) {
                return null;
            }
            Iterator<PARAM> it = c0294eX.f29503a.getPARAMS().getPARAM().iterator();
            while (true) {
                if (!it.hasNext()) {
                    tableref = null;
                    tablesnref = null;
                    break;
                }
                PARAM next = it.next();
                if (next.getType().equals("TABLE-KEY")) {
                    tableref = next.getTableref();
                    tablesnref = next.getTablesnref();
                    break;
                }
            }
            if (tableref != null) {
                return E(tableref, c0294eX.f29504b);
            }
            if (tablesnref != null) {
                return H(tablesnref);
            }
            return null;
        } catch (OdxFactory$Exception e10) {
            O.e.m(e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00f3 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012f A[SYNTHETIC] */
    public final g H(SNREF snref) throws OdxFactory$Exception {
        TABLE tableK;
        g gVar;
        ArrayList<PARENTREF> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        g gVarJ;
        g gVarJ2;
        g gVarJ3;
        g gVarJ4;
        String type;
        String type2;
        String type3;
        String shortname = snref.getSHORTNAME();
        O.e.j("OdxWorker", "getTableSnref(" + shortname + ")");
        ECUVARIANT ecuvariant = this.f29488a;
        TABLE tableK2 = K(shortname, ecuvariant);
        if (tableK2 != null) {
            return new g(tableK2, ecuvariant);
        }
        O.e.s("OdxWorker", "getTableImportRef(" + shortname + ")");
        IMPORTREFS importrefs = ecuvariant.getIMPORTREFS();
        if (importrefs != null) {
            Iterator<ODXLINK> it = importrefs.getIMPORTREF().iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        DIAGLAYER diaglayerI = i(it.next(), null);
                        if (diaglayerI != null && (tableK = K(shortname, diaglayerI)) != null) {
                            gVar = new g(tableK, diaglayerI);
                            break;
                        }
                    } catch (OdxFactory$Exception e10) {
                        O.e.D("OdxWorker", "Could not get ODX");
                        O.e.m(e10);
                    }
                }
            }
            if (gVar != null) {
                return gVar;
            }
            arrayList = new ArrayList(ecuvariant.getPARENTREFS().getPARENTREF());
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            arrayList4 = new ArrayList();
            arrayList5 = new ArrayList();
            for (PARENTREF parentref : arrayList) {
                type3 = parentref.getType();
                type3.getClass();
                if (!type3.equals("ECU-SHARED-DATA-REF")) {
                    arrayList3.add(parentref);
                } else if (!type3.equals("BASE-VARIANT-REF")) {
                    arrayList2.add(parentref);
                }
            }
            arrayList.clear();
            gVarJ = J(shortname, arrayList3, new ArrayList());
            if (gVarJ != null) {
                return gVarJ;
            }
            arrayList3.clear();
            gVarJ2 = J(shortname, arrayList2, arrayList);
            if (gVarJ2 == null) {
                for (PARENTREF parentref2 : arrayList) {
                    type2 = parentref2.getType();
                    type2.getClass();
                    switch (type2) {
                        case "PROTOCOL-REF":
                            arrayList5.add(parentref2);
                            break;
                        case "ECU-SHARED-DATA-REF":
                            arrayList3.add(parentref2);
                            break;
                        case "FUNCTIONAL-GROUP-REF":
                            arrayList4.add(parentref2);
                            break;
                    }
                }
                arrayList.clear();
                gVarJ2 = J(shortname, arrayList3, new ArrayList());
                if (gVarJ2 == null) {
                    arrayList3.clear();
                    gVarJ2 = J(shortname, arrayList4, arrayList);
                    if (gVarJ2 == null) {
                        for (PARENTREF parentref3 : arrayList) {
                            type = parentref3.getType();
                            type.getClass();
                            if (!type.equals("PROTOCOL-REF")) {
                                arrayList5.add(parentref3);
                            } else if (!type.equals("ECU-SHARED-DATA-REF")) {
                                arrayList3.add(parentref3);
                            }
                        }
                        arrayList.clear();
                        gVarJ3 = J(shortname, arrayList3, new ArrayList());
                        if (gVarJ3 != null || (gVarJ3 = J(shortname, arrayList5, arrayList)) != null) {
                            return gVarJ3;
                        }
                        gVarJ4 = J(shortname, arrayList, new ArrayList());
                        if (gVarJ4 != null) {
                            return gVarJ4;
                        }
                        return null;
                    }
                }
            }
            return gVarJ2;
        }
        O.e.D("OdxWorker", "importRef does not exist");
        gVar = null;
        if (gVar != null) {
            return gVar;
        }
        arrayList = new ArrayList(ecuvariant.getPARENTREFS().getPARENTREF());
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        while (r8.hasNext()) {
            type3 = parentref.getType();
            type3.getClass();
            if (!type3.equals("ECU-SHARED-DATA-REF")) {
                arrayList3.add(parentref);
            } else if (!type3.equals("BASE-VARIANT-REF")) {
                arrayList2.add(parentref);
            }
        }
        arrayList.clear();
        gVarJ = J(shortname, arrayList3, new ArrayList());
        if (gVarJ != null) {
            return gVarJ;
        }
        arrayList3.clear();
        gVarJ2 = J(shortname, arrayList2, arrayList);
        if (gVarJ2 == null) {
            while (r2.hasNext()) {
                type2 = parentref2.getType();
                type2.getClass();
                switch (type2) {
                    case -1816845378:
                        if (type2.equals("PROTOCOL-REF")) {
                        }
                        break;
                    case -1387760158:
                        if (type2.equals("ECU-SHARED-DATA-REF")) {
                        }
                        break;
                    case 169851067:
                        if (type2.equals("FUNCTIONAL-GROUP-REF")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 444
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.obdeleven.service.odx.e.H(com.obdeleven.service.odx.model.SNREF):com.obdeleven.service.odx.e$g");
            }

            public final g I(String str) {
                SNREF snref = new SNREF();
                snref.setSHORTNAME(str);
                try {
                    return H(snref);
                } catch (OdxFactory$Exception e10) {
                    O.e.m(e10);
                    return null;
                }
            }

            public final g J(String str, ArrayList arrayList, ArrayList arrayList2) throws OdxFactory$Exception {
                O.e.j("OdxWorker", "_getTableSnref(" + str + ")");
                Iterator it = arrayList.iterator();
                while (true) {
                    PARENTREFS parentrefs = null;
                    if (!it.hasNext()) {
                        return null;
                    }
                    PARENTREF parentref = (PARENTREF) it.next();
                    NOTINHERITEDTABLES notinheritedtables = parentref.getNOTINHERITEDTABLES();
                    if (notinheritedtables != null) {
                        Iterator<NOTINHERITEDTABLE> it2 = notinheritedtables.getNOTINHERITEDTABLE().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().getTABLESNREF().getSHORTNAME().equals(str)) {
                                }
                            }
                        }
                    }
                    DIAGLAYER diaglayerV = v(parentref);
                    if (diaglayerV == null) {
                        continue;
                    } else {
                        TABLE tableK = K(str, diaglayerV);
                        if (tableK != null) {
                            return new g(tableK, diaglayerV);
                        }
                        if (diaglayerV instanceof BASEVARIANT) {
                            parentrefs = ((BASEVARIANT) diaglayerV).getPARENTREFS();
                        } else if (diaglayerV instanceof FUNCTIONALGROUP) {
                            parentrefs = ((FUNCTIONALGROUP) diaglayerV).getPARENTREFS();
                        } else if (diaglayerV instanceof PROTOCOL) {
                            parentrefs = ((PROTOCOL) diaglayerV).getPARENTREFS();
                        }
                        if (parentrefs != null) {
                            arrayList2.addAll(parentrefs.getPARENTREF());
                        }
                    }
                }
            }

            public final Param L(DIAGLAYER diaglayer, List<PARAM> params, byte[] pdu, boolean z10) throws OdxFactory$Exception {
                O.e.s("OdxWorker", "structure(" + diaglayer.getID() + ")");
                new com.obdeleven.service.odx.f();
                ArrayList arrayList = new ArrayList();
                Param param = new Param(pdu, arrayList);
                i.e(params, "params");
                i.e(pdu, "pdu");
                if (params.isEmpty()) {
                    O.e.D("OdxWorker", "Params are empty");
                } else {
                    if (((PARAM) v.e(1, params)).getBYTEPOSITION() < pdu.length || z10) {
                        for (PARAM param2 : params) {
                            O.e.s("OdxWorker", "Param type: " + param2.getType());
                            OdxParamType odxParamTypeFromString = OdxParamType.Companion.fromString(param2.getType());
                            if (odxParamTypeFromString == null) {
                                arrayList.add(com.obdeleven.service.odx.f.f(param2, pdu));
                            } else {
                                int i10 = a.f29493a[odxParamTypeFromString.ordinal()];
                                if (i10 == 1) {
                                    Param paramG = com.obdeleven.service.odx.f.g(param2, z10, pdu, this, diaglayer);
                                    if (paramG != null) {
                                        arrayList.add(paramG);
                                    }
                                } else if (i10 == 2) {
                                    Param paramA = com.obdeleven.service.odx.f.a(param2, z10, pdu);
                                    if (paramA != null) {
                                        arrayList.add(paramA);
                                    }
                                } else if (i10 == 3) {
                                    Param paramD = com.obdeleven.service.odx.f.d(param2, z10, pdu);
                                    if (paramD != null) {
                                        arrayList.add(paramD);
                                    }
                                } else if (i10 != 4) {
                                    arrayList.add(com.obdeleven.service.odx.f.f(param2, pdu));
                                } else {
                                    Param paramB = com.obdeleven.service.odx.f.b(param2, z10, this, diaglayer);
                                    if (paramB != null) {
                                        arrayList.add(paramB);
                                    }
                                }
                            }
                        }
                        return param;
                    }
                    O.e.D("OdxWorker", "Parameter contains offset bigger than provided PDU byte array");
                }
                O.e.D("OdxWorker", "Invalid params");
                return param;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:125:0x0236  */
            /* JADX WARN: Code duplicated, block: B:189:0x03af  */
            /* JADX WARN: Code duplicated, block: B:275:0x05b1  */
            /* JADX WARN: Code duplicated, block: B:276:0x05b7  */
            /* JADX WARN: Code duplicated, block: B:285:0x05dd  */
            /* JADX WARN: Code duplicated, block: B:286:0x05e9  */
            /* JADX WARN: Code duplicated, block: B:6:0x003d  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v10 com.obdeleven.service.odx.model.UNIT, still in use, count: 2, list:
                  (r4v10 com.obdeleven.service.odx.model.UNIT) from 0x05a3: INVOKE (r4v10 com.obdeleven.service.odx.model.UNIT) VIRTUAL call: com.obdeleven.service.odx.model.UNIT.getID():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:1444)
                  (r4v10 com.obdeleven.service.odx.model.UNIT) from 0x05af: PHI (r4 I:??) = (r4v7 com.obdeleven.service.odx.model.UNIT), (r4v10 com.obdeleven.service.odx.model.UNIT) binds: [B:273:0x05ae, B:300:0x05af] A[DONT_GENERATE, DONT_INLINE]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            public final com.obdeleven.service.odx.Param b(com.obdeleven.service.odx.model.DIAGLAYER r27, com.obdeleven.service.odx.model.DATAOBJECTPROP r28, byte[] r29, int r30, boolean r31) throws com.obdeleven.service.odx.OdxFactory$Exception {
                /*
                    Method dump skipped, instruction units count: 1594
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.obdeleven.service.odx.e.b(com.obdeleven.service.odx.model.DIAGLAYER, com.obdeleven.service.odx.model.DATAOBJECTPROP, byte[], int, boolean):com.obdeleven.service.odx.Param");
            }

            public final Param c(DIAGLAYER diaglayer, ENDOFPDUFIELD endofpdufield, byte[] bArr) throws OdxFactory$Exception {
                O.e.j("OdxWorker", C0936h.d("endofpdufield(", diaglayer.getID(), ", ", endofpdufield.getID(), ")"));
                ODXLINK basicstructureref = endofpdufield.getBASICSTRUCTUREREF();
                SNREF basicstructuresnref = endofpdufield.getBASICSTRUCTURESNREF();
                c cVarM = basicstructuresnref != null ? m(basicstructuresnref) : l(basicstructureref, diaglayer);
                if (cVarM == null) {
                    O.e.D("OdxWorker", "structureResult is null");
                    return new Param(bArr);
                }
                STRUCTURE structure = (STRUCTURE) cVarM.f29499a;
                int bytesize = structure.getBYTESIZE();
                ArrayList arrayList = new ArrayList();
                Param param = new Param(bArr, arrayList);
                int length = 0;
                while (length < bArr.length) {
                    O.e.j("OdxWorker", String.format(Locale.getDefault(), "endofpdufield.bytesUsed %d, %d", Integer.valueOf(length), Integer.valueOf(bArr.length)));
                    Param paramL = L(cVarM.f29500b, structure.getPARAMS().getPARAM(), Arrays.copyOfRange(bArr, length, bArr.length), false);
                    O.e.j("OdxWorker", "endofpdufield.param.length: " + (paramL.b() / 8));
                    paramL.f29463l = length;
                    paramL.f29464m = 0;
                    arrayList.add(paramL);
                    int iB = paramL.b();
                    if (bytesize > 0) {
                        length += bytesize;
                    } else if (iB == 0) {
                        length = bArr.length;
                    } else {
                        length = (int) (Math.ceil(iB / 8.0f) + ((double) length));
                    }
                }
                O.e.j("OdxWorker", "endofpdufield.paramList.size: " + arrayList.size());
                return param;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0147 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:101:0x014b A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:103:0x0107 A[DONT_GENERATE, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:108:0x0190 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:109:0x018c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x0185 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x016c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:22:0x0082 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:23:0x0083  */
            /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:39:0x0103  */
            /* JADX WARN: Code duplicated, block: B:42:0x010d  */
            /* JADX WARN: Code duplicated, block: B:45:0x0123  */
            /* JADX WARN: Code duplicated, block: B:48:0x012c  */
            /* JADX WARN: Code duplicated, block: B:49:0x012e  */
            /* JADX WARN: Code duplicated, block: B:52:0x0135  */
            /* JADX WARN: Code duplicated, block: B:53:0x0137  */
            /* JADX WARN: Code duplicated, block: B:56:0x013e  */
            /* JADX WARN: Code duplicated, block: B:65:0x015e  */
            /* JADX WARN: Code duplicated, block: B:68:0x0168  */
            /* JADX WARN: Code duplicated, block: B:71:0x0172  */
            /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:91:0x00e2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:92:0x00de A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:93:0x00d5 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:96:0x00bc A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:99:0x0143 A[SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:23:0x0083, please report this as an issue */
            public final b f(SNREF snref) throws OdxFactory$Exception {
                DIAGSERVICE diagserviceH;
                b bVar;
                ArrayList<PARENTREF> arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                b bVarG;
                b bVarG2;
                b bVarG3;
                b bVarG4;
                String type;
                String type2;
                String type3;
                String shortname = snref.getSHORTNAME();
                O.e.j("OdxWorker", "getDiagserviceSnref(" + shortname + ")");
                ECUVARIANT ecuvariant = this.f29488a;
                DIAGSERVICE diagserviceH2 = h(shortname, ecuvariant);
                if (diagserviceH2 != null) {
                    return new b(diagserviceH2, ecuvariant);
                }
                O.e.s("OdxWorker", "getDiagserviceImportref(" + shortname + ")");
                IMPORTREFS importrefs = ecuvariant.getIMPORTREFS();
                if (importrefs != null) {
                    Iterator<ODXLINK> it = importrefs.getIMPORTREF().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            try {
                                DIAGLAYER diaglayerI = i(it.next(), null);
                                if (diaglayerI != null && (diagserviceH = h(shortname, diaglayerI)) != null) {
                                    bVar = new b(diagserviceH, diaglayerI);
                                    break;
                                }
                            } catch (OdxFactory$Exception e10) {
                                O.e.D("OdxWorker", "Could not get ODX");
                                O.e.m(e10);
                            }
                        }
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    O.e.s("OdxWorker", "getDiagserviceParentref(" + shortname + ")");
                    arrayList = new ArrayList(ecuvariant.getPARENTREFS().getPARENTREF());
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    for (PARENTREF parentref : arrayList) {
                        type3 = parentref.getType();
                        type3.getClass();
                        if (!type3.equals("ECU-SHARED-DATA-REF")) {
                            arrayList3.add(parentref);
                        } else if (!type3.equals("BASE-VARIANT-REF")) {
                            arrayList2.add(parentref);
                        }
                    }
                    arrayList.clear();
                    bVarG = g(shortname, arrayList3, new ArrayList());
                    if (bVarG != null) {
                        return bVarG;
                    }
                    arrayList3.clear();
                    bVarG2 = g(shortname, arrayList2, arrayList);
                    if (bVarG2 == null) {
                        for (PARENTREF parentref2 : arrayList) {
                            type2 = parentref2.getType();
                            type2.getClass();
                            switch (type2) {
                                case "PROTOCOL-REF":
                                    arrayList5.add(parentref2);
                                    break;
                                case "ECU-SHARED-DATA-REF":
                                    arrayList3.add(parentref2);
                                    break;
                                case "FUNCTIONAL-GROUP-REF":
                                    arrayList4.add(parentref2);
                                    break;
                            }
                        }
                        arrayList.clear();
                        bVarG2 = g(shortname, arrayList3, new ArrayList());
                        if (bVarG2 == null) {
                            arrayList3.clear();
                            bVarG2 = g(shortname, arrayList4, arrayList);
                            if (bVarG2 == null) {
                                for (PARENTREF parentref3 : arrayList) {
                                    type = parentref3.getType();
                                    type.getClass();
                                    if (!type.equals("PROTOCOL-REF")) {
                                        arrayList5.add(parentref3);
                                    } else if (!type.equals("ECU-SHARED-DATA-REF")) {
                                        arrayList3.add(parentref3);
                                    }
                                }
                                arrayList.clear();
                                bVarG3 = g(shortname, arrayList3, new ArrayList());
                                if (bVarG3 != null || (bVarG3 = g(shortname, arrayList5, arrayList)) != null) {
                                    return bVarG3;
                                }
                                bVarG4 = g(shortname, arrayList, new ArrayList());
                                if (bVarG4 != null) {
                                    return bVarG4;
                                }
                                return null;
                            }
                        }
                    }
                    return bVarG2;
                }
                O.e.D("OdxWorker", "importRef does not exist");
                bVar = null;
                if (bVar != null) {
                    return bVar;
                }
                O.e.s("OdxWorker", "getDiagserviceParentref(" + shortname + ")");
                arrayList = new ArrayList(ecuvariant.getPARENTREFS().getPARENTREF());
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                arrayList4 = new ArrayList();
                arrayList5 = new ArrayList();
                while (r8.hasNext()) {
                    type3 = parentref.getType();
                    type3.getClass();
                    if (!type3.equals("ECU-SHARED-DATA-REF")) {
                        arrayList3.add(parentref);
                    } else if (!type3.equals("BASE-VARIANT-REF")) {
                        arrayList2.add(parentref);
                    }
                }
                arrayList.clear();
                bVarG = g(shortname, arrayList3, new ArrayList());
                if (bVarG != null) {
                    return bVarG;
                }
                arrayList3.clear();
                bVarG2 = g(shortname, arrayList2, arrayList);
                if (bVarG2 == null) {
                    while (r2.hasNext()) {
                        type2 = parentref2.getType();
                        type2.getClass();
                        switch (type2) {
                            case -1816845378:
                                if (type2.equals("PROTOCOL-REF")) {
                                }
                                break;
                            case -1387760158:
                                if (type2.equals("ECU-SHARED-DATA-REF")) {
                                }
                                break;
                            case 169851067:
                                if (type2.equals("FUNCTIONAL-GROUP-REF")) {
                                }
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            */
                        /*
                            Method dump skipped, instruction units count: 464
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.obdeleven.service.odx.e.f(com.obdeleven.service.odx.model.SNREF):com.obdeleven.service.odx.e$b");
                    }

                    public final b g(String str, ArrayList arrayList, ArrayList arrayList2) throws OdxFactory$Exception {
                        O.e.j("OdxWorker", "getDiagserviceSnref(" + str + ")");
                        Iterator it = arrayList.iterator();
                        while (true) {
                            PARENTREFS parentrefs = null;
                            if (!it.hasNext()) {
                                return null;
                            }
                            PARENTREF parentref = (PARENTREF) it.next();
                            NOTINHERITEDTABLES notinheritedtables = parentref.getNOTINHERITEDTABLES();
                            if (notinheritedtables != null) {
                                Iterator<NOTINHERITEDTABLE> it2 = notinheritedtables.getNOTINHERITEDTABLE().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (it2.next().getTABLESNREF().getSHORTNAME().equals(str)) {
                                        }
                                    }
                                }
                            }
                            DIAGLAYER diaglayerV = v(parentref);
                            if (diaglayerV == null) {
                                continue;
                            } else {
                                DIAGSERVICE diagserviceH = h(str, diaglayerV);
                                if (diagserviceH != null) {
                                    return new b(diagserviceH, diaglayerV);
                                }
                                if (diaglayerV instanceof BASEVARIANT) {
                                    parentrefs = ((BASEVARIANT) diaglayerV).getPARENTREFS();
                                } else if (diaglayerV instanceof FUNCTIONALGROUP) {
                                    parentrefs = ((FUNCTIONALGROUP) diaglayerV).getPARENTREFS();
                                } else if (diaglayerV instanceof PROTOCOL) {
                                    parentrefs = ((PROTOCOL) diaglayerV).getPARENTREFS();
                                }
                                if (parentrefs != null) {
                                    arrayList2.addAll(parentrefs.getPARENTREF());
                                }
                            }
                        }
                    }

                    public final DIAGLAYER i(ODXLINK odxlink, DIAGLAYER diaglayer) throws OdxFactory$Exception {
                        String docref = odxlink.getDOCREF();
                        if (docref == null || docref.isEmpty()) {
                            return diaglayer;
                        }
                        O.e.j("OdxWorker", "getDocRef(" + odxlink.getDOCREF() + ")");
                        for (DIAGLAYER diaglayer2 : this.f29490c.b(this.f29492e.c((short) 0, docref, "", this.f29489b, false)).f42572a.getDIAGLAYERCONTAINER().getDIAGLAYERS()) {
                            if (diaglayer2.getSHORTNAME().equals(docref)) {
                                return diaglayer2;
                            }
                        }
                        return null;
                    }

                    public final d k(String str, PARENTREF parentref) {
                        NOTINHERITEDDOPS notinheriteddops = parentref.getNOTINHERITEDDOPS();
                        if (notinheriteddops != null) {
                            Iterator<NOTINHERITEDDOP> it = notinheriteddops.getNOTINHERITEDDOP().iterator();
                            while (it.hasNext()) {
                                if (it.next().getDOPBASESNREF().getSHORTNAME().equals(str)) {
                                    return null;
                                }
                            }
                        }
                        try {
                            DIAGLAYER diaglayerV = v(parentref);
                            if (diaglayerV == null) {
                                return null;
                            }
                            DOPBASE dopbaseJ = j(str, diaglayerV);
                            return dopbaseJ != null ? new d(new c(dopbaseJ, diaglayerV), null) : new d(null, w(diaglayerV));
                        } catch (OdxFactory$Exception e10) {
                            O.e.m(e10);
                            return null;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:45:0x0100 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:61:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
                    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0140 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:80:0x0144 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:82:0x012a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:85:0x016a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:86:0x016e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:88:0x0154 A[SYNTHETIC] */
                    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0101, please report this as an issue */
                    public final c l(ODXLINK odxlink, DIAGLAYER diaglayer) throws OdxFactory$Exception {
                        DOPBASE dopbaseD;
                        c cVar;
                        List listW;
                        ArrayList arrayList;
                        Iterator it;
                        ArrayList arrayList2;
                        Iterator it2;
                        Iterator it3;
                        d dVarK;
                        d dVarK2;
                        List<PARENTREF> list;
                        d dVarK3;
                        List<PARENTREF> list2;
                        DIAGLAYER diaglayerI = i(odxlink, diaglayer);
                        String idref = odxlink.getIDREF();
                        O.e.j("OdxWorker", C0936h.d("getDopbaseRef(", diaglayerI.getID(), ", ", idref, ")"));
                        DOPBASE dopbaseJ = j(idref, diaglayerI);
                        if (dopbaseJ != null) {
                            return new c(dopbaseJ, diaglayerI);
                        }
                        O.e.s("OdxWorker", "getDopbaseImportRef(" + odxlink.getIDREF() + ")");
                        IMPORTREFS importrefs = this.f29488a.getIMPORTREFS();
                        if (importrefs != null) {
                            Iterator<ODXLINK> it4 = importrefs.getIMPORTREF().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    try {
                                        DIAGLAYER diaglayerI2 = i(it4.next(), null);
                                        if (diaglayerI2 != null) {
                                            O.e.j("OdxWorker", "getDopbaseImportRef(" + diaglayerI2.getID() + ")");
                                            String idref2 = odxlink.getIDREF();
                                            DopBaseType.f29451b.getClass();
                                            DopBaseType dopBaseTypeA = DopBaseType.a.a(idref2);
                                            if (dopBaseTypeA == null) {
                                                O.e.l("OdxWorker", "Unknown dopBase type: " + idref2);
                                            } else {
                                                int iOrdinal = dopBaseTypeA.ordinal();
                                                if (iOrdinal == 0) {
                                                    dopbaseD = d(idref2, diaglayerI2);
                                                } else if (iOrdinal == 1) {
                                                    dopbaseD = C(idref2, diaglayerI2);
                                                } else if (iOrdinal == 2) {
                                                    dopbaseD = s(idref2, diaglayerI2);
                                                } else if (iOrdinal == 3) {
                                                    dopbaseD = q(idref2, diaglayerI2);
                                                } else if (iOrdinal == 4) {
                                                    dopbaseD = o(idref2, diaglayerI2);
                                                } else if (iOrdinal != 5) {
                                                    O.e.l("OdxWorker", "Unhandeled dopBase type: " + idref2);
                                                    dopbaseD = null;
                                                } else {
                                                    dopbaseD = z(idref2, diaglayerI2);
                                                }
                                                if (dopbaseD != null) {
                                                    cVar = new c(dopbaseD, diaglayerI2);
                                                    break;
                                                }
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (Exception e10) {
                                        O.e.m(e10);
                                    }
                                }
                            }
                            if (cVar != null) {
                                return cVar;
                            }
                            O.e.s("OdxWorker", "getDopbaseParentRef(" + odxlink.getIDREF() + ")");
                            listW = w(diaglayerI);
                            if (listW == null) {
                                return null;
                            }
                            arrayList = new ArrayList();
                            it = listW.iterator();
                            while (it.hasNext()) {
                                dVarK3 = k(odxlink.getIDREF(), (PARENTREF) it.next());
                                if (dVarK3 == null) {
                                    list2 = dVarK3.f29502b;
                                    if (list2 == null) {
                                        return dVarK3.f29501a;
                                    }
                                    arrayList.addAll(list2);
                                }
                            }
                            arrayList2 = new ArrayList();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                dVarK2 = k(odxlink.getIDREF(), (PARENTREF) it2.next());
                                if (dVarK2 == null) {
                                    list = dVarK2.f29502b;
                                    if (list == null) {
                                        return dVarK2.f29501a;
                                    }
                                    arrayList2.addAll(list);
                                }
                            }
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                dVarK = k(odxlink.getIDREF(), (PARENTREF) it3.next());
                                if (dVarK == null && dVarK.f29502b == null) {
                                    return dVarK.f29501a;
                                }
                            }
                            return null;
                        }
                        O.e.D("OdxWorker", "importRef does not exist");
                        cVar = null;
                        if (cVar != null) {
                            return cVar;
                        }
                        O.e.s("OdxWorker", "getDopbaseParentRef(" + odxlink.getIDREF() + ")");
                        listW = w(diaglayerI);
                        if (listW == null) {
                            return null;
                        }
                        arrayList = new ArrayList();
                        it = listW.iterator();
                        while (it.hasNext()) {
                            dVarK3 = k(odxlink.getIDREF(), (PARENTREF) it.next());
                            if (dVarK3 == null) {
                                list2 = dVarK3.f29502b;
                                if (list2 == null) {
                                    return dVarK3.f29501a;
                                }
                                arrayList.addAll(list2);
                            }
                        }
                        arrayList2 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            dVarK2 = k(odxlink.getIDREF(), (PARENTREF) it2.next());
                            if (dVarK2 == null) {
                                list = dVarK2.f29502b;
                                if (list == null) {
                                    return dVarK2.f29501a;
                                }
                                arrayList2.addAll(list);
                            }
                        }
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            dVarK = k(odxlink.getIDREF(), (PARENTREF) it3.next());
                            if (dVarK == null) {
                            }
                        }
                        return null;
                    }

                    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    public final c m(SNREF snref) {
                        DOPBASE dopbaseE;
                        Iterator<ODXLINK> it;
                        byte b10;
                        DOPBASE dopbaseE2;
                        String shortname = snref.getSHORTNAME();
                        O.e.j("OdxWorker", "getDopbaseSnref(" + shortname + ")");
                        String strSubstring = shortname.substring(0, shortname.indexOf("_"));
                        strSubstring.getClass();
                        ECUVARIANT ecuvariant = this.f29488a;
                        DIAGLAYER diaglayer = null;
                        c cVar = null;
                        switch (strSubstring) {
                            case "DOP":
                                dopbaseE = e(shortname, ecuvariant);
                                break;
                            case "MUX":
                                dopbaseE = t(shortname, ecuvariant);
                                break;
                            case "DYNLF":
                                dopbaseE = p(shortname, ecuvariant);
                                break;
                            case "STATF":
                                dopbaseE = A(shortname, ecuvariant);
                                break;
                            case "STRUC":
                                dopbaseE = D(shortname, ecuvariant);
                                break;
                            case "EOPDUF":
                                dopbaseE = r(shortname, ecuvariant);
                                break;
                            default:
                                O.e.l("OdxWorker", "Unknown dopBaseType: ".concat(strSubstring));
                                dopbaseE = null;
                                break;
                        }
                        if (dopbaseE != null) {
                            return new c(dopbaseE, ecuvariant);
                        }
                        O.e.s("OdxWorker", "getDopbaseImportSnref(" + shortname + ")");
                        IMPORTREFS importrefs = ecuvariant.getIMPORTREFS();
                        if (importrefs == null) {
                            O.e.D("OdxWorker", "importRef does not exist");
                        } else {
                            Iterator<ODXLINK> it2 = importrefs.getIMPORTREF().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    try {
                                        DIAGLAYER diaglayerI = i(it2.next(), diaglayer);
                                        if (diaglayerI != null) {
                                            it = it2;
                                            try {
                                                String strSubstring2 = shortname.substring(0, shortname.indexOf(95));
                                                switch (strSubstring2.hashCode()) {
                                                    case 67877:
                                                        if (strSubstring2.equals("DOP")) {
                                                            b10 = 0;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    case 76720:
                                                        if (strSubstring2.equals("MUX")) {
                                                            b10 = 2;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    case 65528211:
                                                        if (strSubstring2.equals("DYNLF")) {
                                                            b10 = 4;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    case 79219826:
                                                        if (strSubstring2.equals("STATF")) {
                                                            b10 = 5;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    case 79236191:
                                                        if (strSubstring2.equals("STRUC")) {
                                                            b10 = 1;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    case 2050820911:
                                                        if (strSubstring2.equals("EOPDUF")) {
                                                            b10 = 3;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b10 = -1;
                                                        break;
                                                }
                                                if (b10 == 0) {
                                                    dopbaseE2 = e(shortname, diaglayerI);
                                                } else if (b10 == 1) {
                                                    dopbaseE2 = D(shortname, diaglayerI);
                                                } else if (b10 == 2) {
                                                    dopbaseE2 = t(shortname, diaglayerI);
                                                } else if (b10 == 3) {
                                                    dopbaseE2 = r(shortname, diaglayerI);
                                                } else if (b10 != 4) {
                                                    dopbaseE2 = b10 != 5 ? null : A(shortname, ecuvariant);
                                                } else {
                                                    dopbaseE2 = p(shortname, diaglayerI);
                                                }
                                                if (dopbaseE2 != null) {
                                                    cVar = new c(dopbaseE2, diaglayerI);
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                O.e.m(e);
                                            }
                                        } else {
                                            it = it2;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        it = it2;
                                    }
                                    it2 = it;
                                    diaglayer = null;
                                } else {
                                    cVar = null;
                                }
                            }
                        }
                        if (cVar != null) {
                            return cVar;
                        }
                        O.e.s("OdxWorker", "getDopbaseParentSnref(" + shortname + ")");
                        ArrayList<PARENTREF> arrayList = new ArrayList(ecuvariant.getPARENTREFS().getPARENTREF());
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (PARENTREF parentref : arrayList) {
                            String type = parentref.getType();
                            type.getClass();
                            if (type.equals("ECU-SHARED-DATA-REF")) {
                                arrayList3.add(parentref);
                            } else if (type.equals("BASE-VARIANT-REF")) {
                                arrayList2.add(parentref);
                            }
                        }
                        arrayList.clear();
                        c cVarN = n(shortname, arrayList3, new ArrayList());
                        if (cVarN != null) {
                            return cVarN;
                        }
                        arrayList3.clear();
                        c cVarN2 = n(shortname, arrayList2, arrayList);
                        if (cVarN2 != null) {
                            return cVarN2;
                        }
                        for (PARENTREF parentref2 : arrayList) {
                            String type2 = parentref2.getType();
                            type2.getClass();
                            switch (type2) {
                                case "PROTOCOL-REF":
                                    arrayList5.add(parentref2);
                                    break;
                                case "ECU-SHARED-DATA-REF":
                                    arrayList3.add(parentref2);
                                    break;
                                case "FUNCTIONAL-GROUP-REF":
                                    arrayList4.add(parentref2);
                                    break;
                            }
                        }
                        arrayList.clear();
                        c cVarN3 = n(shortname, arrayList3, new ArrayList());
                        if (cVarN3 != null) {
                            return cVarN3;
                        }
                        arrayList3.clear();
                        c cVarN4 = n(shortname, arrayList4, arrayList);
                        if (cVarN4 != null) {
                            return cVarN4;
                        }
                        for (PARENTREF parentref3 : arrayList) {
                            String type3 = parentref3.getType();
                            type3.getClass();
                            if (type3.equals("PROTOCOL-REF")) {
                                arrayList5.add(parentref3);
                            } else if (type3.equals("ECU-SHARED-DATA-REF")) {
                                arrayList3.add(parentref3);
                            }
                        }
                        arrayList.clear();
                        c cVarN5 = n(shortname, arrayList3, new ArrayList());
                        if (cVarN5 != null) {
                            return cVarN5;
                        }
                        c cVarN6 = n(shortname, arrayList5, arrayList);
                        return cVarN6 != null ? cVarN6 : n(shortname, arrayList, new ArrayList());
                    }

                    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    public final c n(String str, ArrayList arrayList, ArrayList arrayList2) {
                        DOPBASE dopbaseE;
                        PARENTREFS parentrefs;
                        O.e.j("OdxWorker", "_getDopbaseSnref(" + str + ")");
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                PARENTREF parentref = (PARENTREF) it.next();
                                NOTINHERITEDDOPS notinheriteddops = parentref.getNOTINHERITEDDOPS();
                                if (notinheriteddops != null) {
                                    Iterator<NOTINHERITEDDOP> it2 = notinheriteddops.getNOTINHERITEDDOP().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (it2.next().getDOPBASESNREF().getSHORTNAME().equals(str)) {
                                            }
                                        }
                                    }
                                }
                                DIAGLAYER diaglayerV = v(parentref);
                                if (diaglayerV != null) {
                                    byte b10 = 0;
                                    String strSubstring = str.substring(0, str.indexOf("_"));
                                    switch (strSubstring.hashCode()) {
                                        case 67877:
                                            if (!strSubstring.equals("DOP")) {
                                                b10 = -1;
                                            }
                                            break;
                                        case 76720:
                                            if (!strSubstring.equals("MUX")) {
                                                b10 = -1;
                                            } else {
                                                b10 = 2;
                                            }
                                            break;
                                        case 65528211:
                                            if (!strSubstring.equals("DYNLF")) {
                                                b10 = -1;
                                            } else {
                                                b10 = 4;
                                            }
                                            break;
                                        case 79219826:
                                            if (!strSubstring.equals("STATF")) {
                                                b10 = -1;
                                            } else {
                                                b10 = 5;
                                            }
                                            break;
                                        case 79236191:
                                            if (!strSubstring.equals("STRUC")) {
                                                b10 = -1;
                                            } else {
                                                b10 = 1;
                                            }
                                            break;
                                        case 2050820911:
                                            if (!strSubstring.equals("EOPDUF")) {
                                                b10 = -1;
                                            } else {
                                                b10 = 3;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    if (b10 == 0) {
                                        dopbaseE = e(str, diaglayerV);
                                    } else if (b10 == 1) {
                                        dopbaseE = D(str, diaglayerV);
                                    } else if (b10 == 2) {
                                        dopbaseE = t(str, diaglayerV);
                                    } else if (b10 == 3) {
                                        dopbaseE = r(str, diaglayerV);
                                    } else if (b10 != 4) {
                                        dopbaseE = b10 != 5 ? null : A(str, this.f29488a);
                                    } else {
                                        dopbaseE = p(str, diaglayerV);
                                    }
                                    if (dopbaseE != null) {
                                        return new c(dopbaseE, diaglayerV);
                                    }
                                    if (diaglayerV instanceof BASEVARIANT) {
                                        parentrefs = ((BASEVARIANT) diaglayerV).getPARENTREFS();
                                    } else if (diaglayerV instanceof FUNCTIONALGROUP) {
                                        parentrefs = ((FUNCTIONALGROUP) diaglayerV).getPARENTREFS();
                                    } else {
                                        parentrefs = diaglayerV instanceof PROTOCOL ? ((PROTOCOL) diaglayerV).getPARENTREFS() : null;
                                    }
                                    if (parentrefs != null) {
                                        arrayList2.addAll(parentrefs.getPARENTREF());
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (Exception e10) {
                            O.e.m(e10);
                        }
                        return null;
                    }

                    public final DIAGLAYER v(PARENTREF parentref) throws OdxFactory$Exception {
                        O.e.j("OdxWorker", "getParentRef(" + parentref.getDOCREF() + ")");
                        String docref = parentref.getDOCREF();
                        for (DIAGLAYER diaglayer : this.f29490c.b(this.f29492e.c((short) 0, docref, "", this.f29489b, false)).f42572a.getDIAGLAYERCONTAINER().getDIAGLAYERS()) {
                            if (diaglayer.getSHORTNAME().equals(docref)) {
                                return diaglayer;
                            }
                        }
                        return null;
                    }

                    public final C0294e x(ODXLINK odxlink, DIAGLAYER diaglayer) throws OdxFactory$Exception {
                        POSRESPONSE next;
                        DIAGLAYER diaglayerI = i(odxlink, diaglayer);
                        String idref = odxlink.getIDREF();
                        O.e.j("OdxWorker", C0936h.d("getPosresponseRef(", diaglayerI.getID(), ", ", idref, ")"));
                        O.e.j("OdxWorker", C0936h.d("getPosresponseRef(", diaglayerI.getID(), ", ", idref, ")"));
                        if (diaglayerI.getPOSRESPONSES() != null) {
                            Iterator<POSRESPONSE> it = diaglayerI.getPOSRESPONSES().getPOSRESPONSE().iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                if (next.getID().equals(idref)) {
                                }
                            }
                            next = null;
                        } else {
                            next = null;
                        }
                        if (next != null) {
                            return new C0294e(next, diaglayerI);
                        }
                        return null;
                    }

                    public final f y(ODXLINK odxlink, DIAGLAYER diaglayer) throws OdxFactory$Exception {
                        REQUEST next;
                        DIAGLAYER diaglayerI = i(odxlink, diaglayer);
                        String idref = odxlink.getIDREF();
                        O.e.j("OdxWorker", C0936h.d("getRequestRef(", diaglayerI.getID(), ", ", idref, ")"));
                        O.e.j("OdxWorker", C0936h.d("getRequestRef(", diaglayerI.getID(), ", ", idref, ")"));
                        REQUESTS requests = diaglayerI.getREQUESTS();
                        if (requests == null) {
                            next = null;
                            break;
                        }
                        Iterator<REQUEST> it = requests.getREQUEST().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!next.getID().equals(idref));
                        if (next != null) {
                            return new f(next, diaglayerI);
                        }
                        IMPORTREFS importrefs = diaglayerI.getIMPORTREFS();
                        f fVar = null;
                        if (importrefs != null) {
                            Iterator<ODXLINK> it2 = importrefs.getIMPORTREF().iterator();
                            while (it2.hasNext()) {
                                DIAGLAYER diaglayerI2 = i(it2.next(), null);
                                if (diaglayerI2 != null) {
                                    ODXLINK odxlinkU = u(odxlink);
                                    odxlinkU.setDOCREF(diaglayerI2.getSHORTNAME());
                                    f fVarY = y(odxlinkU, diaglayerI2);
                                    if (fVarY != null) {
                                        fVar = fVarY;
                                        break;
                                    }
                                }
                            }
                        }
                        if (fVar != null) {
                            return fVar;
                        }
                        List listW = w(diaglayerI);
                        if (listW == null) {
                            return null;
                        }
                        Iterator it3 = listW.iterator();
                        while (it3.hasNext()) {
                            DIAGLAYER diaglayerV = v((PARENTREF) it3.next());
                            if (diaglayerV != null) {
                                ODXLINK odxlinkU2 = u(odxlink);
                                odxlinkU2.setDOCREF(diaglayerV.getSHORTNAME());
                                f fVarY2 = y(odxlinkU2, diaglayerV);
                                if (fVarY2 != null) {
                                    return fVarY2;
                                }
                            }
                        }
                        return null;
                    }
                }
