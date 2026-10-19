package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1997p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2023y1 f26239a;

    static {
        C1985l1 c1985l1 = C1985l1.f26210c;
        f26239a = new C2023y1();
    }

    public static void A(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof W0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.J(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += AbstractC2001r0.s(((Long) list.get(i12)).longValue());
            }
            c1999q0.I(iS);
            while (i11 < list.size()) {
                c1999q0.K(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        W0 w3 = (W0) list;
        if (!z10) {
            while (i11 < w3.f26166d) {
                c1999q0.J(i10, w3.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < w3.f26166d; i13++) {
            iS2 += AbstractC2001r0.s(w3.e(i13));
        }
        c1999q0.I(iS2);
        while (i11 < w3.f26166d) {
            c1999q0.K(w3.e(i11));
            i11++;
        }
    }

    public static void B(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.z(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                c1999q0.z(i10, j10.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j10.f26146d; i15++) {
            j10.e(i15);
            i14 += 4;
        }
        c1999q0.I(i14);
        while (i11 < j10.f26146d) {
            c1999q0.A(j10.e(i11));
            i11++;
        }
    }

    public static void C(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof W0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.B(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        W0 w3 = (W0) list;
        if (!z10) {
            while (i11 < w3.f26166d) {
                c1999q0.B(i10, w3.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < w3.f26166d; i15++) {
            w3.e(i15);
            i14 += 8;
        }
        c1999q0.I(i14);
        while (i11 < w3.f26166d) {
            c1999q0.C(w3.e(i11));
            i11++;
        }
    }

    public static void a(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    c1999q0.H(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iR = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iR += AbstractC2001r0.r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c1999q0.I(iR);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                c1999q0.I((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                int iE = j10.e(i11);
                c1999q0.H(i10, (iE >> 31) ^ (iE + iE));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iR2 = 0;
        for (int i13 = 0; i13 < j10.f26146d; i13++) {
            int iE2 = j10.e(i13);
            iR2 += AbstractC2001r0.r((iE2 >> 31) ^ (iE2 + iE2));
        }
        c1999q0.I(iR2);
        while (i11 < j10.f26146d) {
            int iE3 = j10.e(i11);
            c1999q0.I((iE3 >> 31) ^ (iE3 + iE3));
            i11++;
        }
    }

    public static void b(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof W0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    c1999q0.J(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iS += AbstractC2001r0.s((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            c1999q0.I(iS);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                c1999q0.K((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        W0 w3 = (W0) list;
        if (!z10) {
            while (i11 < w3.f26166d) {
                long jE = w3.e(i11);
                c1999q0.J(i10, (jE >> 63) ^ (jE + jE));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < w3.f26166d; i13++) {
            long jE2 = w3.e(i13);
            iS2 += AbstractC2001r0.s((jE2 >> 63) ^ (jE2 + jE2));
        }
        c1999q0.I(iS2);
        while (i11 < w3.f26166d) {
            long jE3 = w3.e(i11);
            c1999q0.K((jE3 >> 63) ^ (jE3 + jE3));
            i11++;
        }
    }

    public static void c(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.H(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iR = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iR += AbstractC2001r0.r(((Integer) list.get(i12)).intValue());
            }
            c1999q0.I(iR);
            while (i11 < list.size()) {
                c1999q0.I(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                c1999q0.H(i10, j10.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iR2 = 0;
        for (int i13 = 0; i13 < j10.f26146d; i13++) {
            iR2 += AbstractC2001r0.r(j10.e(i13));
        }
        c1999q0.I(iR2);
        while (i11 < j10.f26146d) {
            c1999q0.I(j10.e(i11));
            i11++;
        }
    }

    public static void d(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof W0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.J(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += AbstractC2001r0.s(((Long) list.get(i12)).longValue());
            }
            c1999q0.I(iS);
            while (i11 < list.size()) {
                c1999q0.K(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        W0 w3 = (W0) list;
        if (!z10) {
            while (i11 < w3.f26166d) {
                c1999q0.J(i10, w3.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < w3.f26166d; i13++) {
            iS2 += AbstractC2001r0.s(w3.e(i13));
        }
        c1999q0.I(iS2);
        while (i11 < w3.f26166d) {
            c1999q0.K(w3.e(i11));
            i11++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof J0) {
            J0 j10 = (J0) list;
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(j10.e(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iS;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2001r0.r(i10 << 3) + 4) * size;
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2001r0.r(i10 << 3) + 8) * size;
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof J0) {
            J0 j10 = (J0) list;
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(j10.e(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iS;
    }

    public static int l(List list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof W0) {
            W0 w3 = (W0) list;
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(w3.e(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iS;
    }

    public static int m(int i10, Object obj, InterfaceC1994o1 interfaceC1994o1) {
        int i11 = i10 << 3;
        if (!(obj instanceof S0)) {
            return AbstractC2001r0.p((InterfaceC1967f1) obj, interfaceC1994o1) + AbstractC2001r0.r(i11);
        }
        int iR = AbstractC2001r0.r(i11);
        int iA = ((S0) obj).a();
        return B1.a.a(iA, iA, iR);
    }

    public static int n(List list) {
        int iR;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof J0) {
            J0 j10 = (J0) list;
            iR = 0;
            while (i10 < size) {
                int iE = j10.e(i10);
                iR += AbstractC2001r0.r((iE >> 31) ^ (iE + iE));
                i10++;
            }
        } else {
            iR = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iR += AbstractC2001r0.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iR;
    }

    public static int o(List list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof W0) {
            W0 w3 = (W0) list;
            iS = 0;
            while (i10 < size) {
                long jE = w3.e(i10);
                iS += AbstractC2001r0.s((jE >> 63) ^ (jE + jE));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iS += AbstractC2001r0.s((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iS;
    }

    public static int p(List list) {
        int iR;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof J0) {
            J0 j10 = (J0) list;
            iR = 0;
            while (i10 < size) {
                iR += AbstractC2001r0.r(j10.e(i10));
                i10++;
            }
        } else {
            iR = 0;
            while (i10 < size) {
                iR += AbstractC2001r0.r(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iR;
    }

    public static int q(List list) {
        int iS;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof W0) {
            W0 w3 = (W0) list;
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(w3.e(i10));
                i10++;
            }
        } else {
            iS = 0;
            while (i10 < size) {
                iS += AbstractC2001r0.s(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iS;
    }

    public static Object r(Object obj, int i10, int i11, Object obj2, C2023y1 c2023y1) {
        C2020x1 c2020x1;
        Object obj3 = obj2;
        if (obj2 == null) {
            c2023y1.getClass();
            I0 i12 = (I0) obj;
            c2020x1 = i12.zzc;
            if (c2020x1 == C2020x1.f26298f) {
                obj3 = c2020x1;
                C2020x1 c2020x1B = C2020x1.b();
                i12.zzc = c2020x1B;
                obj3 = c2020x1B;
            }
        }
        obj3 = c2020x1;
        ((C2020x1) obj3).c(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void s(Object obj, Object obj2) {
        I0 i10 = (I0) obj;
        C2020x1 c2020x1 = i10.zzc;
        C2020x1 c2020x2 = ((I0) obj2).zzc;
        C2020x1 c2020x3 = C2020x1.f26298f;
        if (!c2020x3.equals(c2020x2)) {
            if (c2020x3.equals(c2020x1)) {
                int i11 = c2020x1.f26299a + c2020x2.f26299a;
                int[] iArrCopyOf = Arrays.copyOf(c2020x1.f26300b, i11);
                System.arraycopy(c2020x2.f26300b, 0, iArrCopyOf, c2020x1.f26299a, c2020x2.f26299a);
                Object[] objArrCopyOf = Arrays.copyOf(c2020x1.f26301c, i11);
                System.arraycopy(c2020x2.f26301c, 0, objArrCopyOf, c2020x1.f26299a, c2020x2.f26299a);
                c2020x1 = new C2020x1(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                c2020x1.getClass();
                if (!c2020x2.equals(c2020x3)) {
                    if (!c2020x1.f26303e) {
                        throw new UnsupportedOperationException();
                    }
                    int i12 = c2020x1.f26299a + c2020x2.f26299a;
                    c2020x1.e(i12);
                    System.arraycopy(c2020x2.f26300b, 0, c2020x1.f26300b, c2020x1.f26299a, c2020x2.f26299a);
                    System.arraycopy(c2020x2.f26301c, 0, c2020x1.f26301c, c2020x1.f26299a, c2020x2.f26299a);
                    c2020x1.f26299a = i12;
                }
            }
        }
        i10.zzc = c2020x1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void t(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof C1987m0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.x(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.v(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        C1987m0 c1987m0 = (C1987m0) list;
        if (!z10) {
            while (i11 < c1987m0.f26218d) {
                c1987m0.g(i11);
                c1999q0.x(i10, c1987m0.f26217c[i11]);
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c1987m0.f26218d; i15++) {
            c1987m0.g(i15);
            boolean z12 = c1987m0.f26217c[i15];
            i14++;
        }
        c1999q0.I(i14);
        while (i11 < c1987m0.f26218d) {
            c1987m0.g(i11);
            c1999q0.v(c1987m0.f26217c[i11] ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void u(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof C2007t0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.B(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        C2007t0 c2007t0 = (C2007t0) list;
        if (!z10) {
            while (i11 < c2007t0.f26259d) {
                c2007t0.k(i11);
                c1999q0.B(i10, Double.doubleToRawLongBits(c2007t0.f26258c[i11]));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2007t0.f26259d; i15++) {
            c2007t0.k(i15);
            double d10 = c2007t0.f26258c[i15];
            i14 += 8;
        }
        c1999q0.I(i14);
        while (i11 < c2007t0.f26259d) {
            c2007t0.k(i11);
            c1999q0.C(Double.doubleToRawLongBits(c2007t0.f26258c[i11]));
            i11++;
        }
    }

    public static void v(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.D(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += AbstractC2001r0.s(((Integer) list.get(i12)).intValue());
            }
            c1999q0.I(iS);
            while (i11 < list.size()) {
                c1999q0.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                c1999q0.D(i10, j10.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < j10.f26146d; i13++) {
            iS2 += AbstractC2001r0.s(j10.e(i13));
        }
        c1999q0.I(iS2);
        while (i11 < j10.f26146d) {
            c1999q0.E(j10.e(i11));
            i11++;
        }
    }

    public static void w(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.z(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                c1999q0.z(i10, j10.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < j10.f26146d; i15++) {
            j10.e(i15);
            i14 += 4;
        }
        c1999q0.I(i14);
        while (i11 < j10.f26146d) {
            c1999q0.A(j10.e(i11));
            i11++;
        }
    }

    public static void x(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof W0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.B(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        W0 w3 = (W0) list;
        if (!z10) {
            while (i11 < w3.f26166d) {
                c1999q0.B(i10, w3.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < w3.f26166d; i15++) {
            w3.e(i15);
            i14 += 8;
        }
        c1999q0.I(i14);
        while (i11 < w3.f26166d) {
            c1999q0.C(w3.e(i11));
            i11++;
        }
    }

    public static void y(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof B0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.z(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            c1999q0.I(i12);
            while (i11 < list.size()) {
                c1999q0.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        B0 b10 = (B0) list;
        if (!z10) {
            while (i11 < b10.f26108d) {
                b10.k(i11);
                c1999q0.z(i10, Float.floatToRawIntBits(b10.f26107c[i11]));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < b10.f26108d; i15++) {
            b10.k(i15);
            float f11 = b10.f26107c[i15];
            i14 += 4;
        }
        c1999q0.I(i14);
        while (i11 < b10.f26108d) {
            b10.k(i11);
            c1999q0.A(Float.floatToRawIntBits(b10.f26107c[i11]));
            i11++;
        }
    }

    public static void z(int i10, List list, F1 f10, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2004s0 c2004s0 = (C2004s0) f10;
        c2004s0.getClass();
        boolean z11 = list instanceof J0;
        C1999q0 c1999q0 = c2004s0.f26249a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    c1999q0.D(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c1999q0.G(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += AbstractC2001r0.s(((Integer) list.get(i12)).intValue());
            }
            c1999q0.I(iS);
            while (i11 < list.size()) {
                c1999q0.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        J0 j10 = (J0) list;
        if (!z10) {
            while (i11 < j10.f26146d) {
                c1999q0.D(i10, j10.e(i11));
                i11++;
            }
            return;
        }
        c1999q0.G(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < j10.f26146d; i13++) {
            iS2 += AbstractC2001r0.s(j10.e(i13));
        }
        c1999q0.I(iS2);
        while (i11 < j10.f26146d) {
            c1999q0.E(j10.e(i11));
            i11++;
        }
    }
}
