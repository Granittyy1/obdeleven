package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f25466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q3<?, ?> f25467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R3 f25468c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Q3<?, ?> q10 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f25466a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                q10 = (Q3) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f25467b = q10;
        f25468c = new R3();
    }

    public static void A(int i10, List<Long> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.J0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 8;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.K0(list.get(i11).longValue());
            i11++;
        }
    }

    public static int B(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzja.A0(i10) * list.size()) + C(list);
    }

    public static int C(List<Long> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1811f3) {
            C1811f3 c1811f3 = (C1811f3) list;
            iZ0 = 0;
            while (i10 < size) {
                c1811f3.g(i10);
                iZ0 += zzja.z0(c1811f3.f25705c[i10]);
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += zzja.z0(list.get(i10).longValue());
                i10++;
            }
        }
        return iZ0;
    }

    public static void D(int i10, List<Float> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = list.get(i11).floatValue();
                aVar.getClass();
                aVar.L0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 4;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.M0(Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public static int E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + F(list);
    }

    public static int F(List<Integer> list) {
        int iC0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o10 = (O2) list;
            iC0 = 0;
            while (i10 < size) {
                o10.g(i10);
                int i11 = o10.f25544c[i10];
                iC0 += zzja.C0((i11 >> 31) ^ (i11 << 1));
                i10++;
            }
        } else {
            iC0 = 0;
            while (i10 < size) {
                int iIntValue = list.get(i10).intValue();
                iC0 += zzja.C0((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
        }
        return iC0;
    }

    public static void G(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.N0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += zzja.z0(list.get(i12).intValue());
        }
        aVar.S0(iZ0);
        while (i11 < list.size()) {
            aVar.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    public static int H(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + I(list);
    }

    public static int I(List<Long> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1811f3) {
            C1811f3 c1811f3 = (C1811f3) list;
            iZ0 = 0;
            while (i10 < size) {
                c1811f3.g(i10);
                long j = c1811f3.f25705c[i10];
                iZ0 += zzja.z0((j >> 63) ^ (j << 1));
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                long jLongValue = list.get(i10).longValue();
                iZ0 += zzja.z0((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
        }
        return iZ0;
    }

    public static void J(int i10, List<Long> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += zzja.z0(list.get(i12).longValue());
        }
        aVar.S0(iZ0);
        while (i11 < list.size()) {
            aVar.P0(list.get(i11).longValue());
            i11++;
        }
    }

    public static int K(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + L(list);
    }

    public static int L(List<Integer> list) {
        int iC0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o10 = (O2) list;
            iC0 = 0;
            while (i10 < size) {
                o10.g(i10);
                iC0 += zzja.C0(o10.f25544c[i10]);
                i10++;
            }
        } else {
            iC0 = 0;
            while (i10 < size) {
                iC0 += zzja.C0(list.get(i10).intValue());
                i10++;
            }
        }
        return iC0;
    }

    public static void M(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 4;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.M0(list.get(i11).intValue());
            i11++;
        }
    }

    public static int N(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + O(list);
    }

    public static int O(List<Long> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1811f3) {
            C1811f3 c1811f3 = (C1811f3) list;
            iZ0 = 0;
            while (i10 < size) {
                c1811f3.g(i10);
                iZ0 += zzja.z0(c1811f3.f25705c[i10]);
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += zzja.z0(list.get(i10).longValue());
                i10++;
            }
        }
        return iZ0;
    }

    public static void P(int i10, List<Long> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.J0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 8;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.K0(list.get(i11).longValue());
            i11++;
        }
    }

    public static void Q(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = list.get(i11).intValue();
                aVar.T0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iC0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = list.get(i12).intValue();
            iC0 += zzja.C0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        aVar.S0(iC0);
        while (i11 < list.size()) {
            int iIntValue3 = list.get(i11).intValue();
            aVar.S0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void R(int i10, List<Long> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = list.get(i11).longValue();
                aVar.O0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = list.get(i12).longValue();
            iZ0 += zzja.z0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        aVar.S0(iZ0);
        while (i11 < list.size()) {
            long jLongValue3 = list.get(i11).longValue();
            aVar.P0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void S(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.T0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iC0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC0 += zzja.C0(list.get(i12).intValue());
        }
        aVar.S0(iC0);
        while (i11 < list.size()) {
            aVar.S0(list.get(i11).intValue());
            i11++;
        }
    }

    public static void T(int i10, List<Long> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += zzja.z0(list.get(i12).longValue());
        }
        aVar.S0(iZ0);
        while (i11 < list.size()) {
            aVar.P0(list.get(i11).longValue());
            i11++;
        }
    }

    public static int a(int i10, Object obj, E3 e10) {
        if (obj instanceof C1776a3) {
            int iC0 = zzja.C0(i10 << 3);
            int iA = ((C1776a3) obj).a();
            return zzja.C0(iA) + iA + iC0;
        }
        int iC1 = zzja.C0(i10 << 3);
        int iF = ((AbstractC1887q2) ((InterfaceC1894r3) obj)).f(e10);
        return zzja.C0(iF) + iF + iC1;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzja.i0(i10) * size;
    }

    public static int c(int i10, List<InterfaceC1894r3> list, E3 e10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iL0 += zzja.l0(i10, list.get(i11), e10);
        }
        return iL0;
    }

    public static int d(List<?> list) {
        return list.size();
    }

    public static void e(int i10, List<zzij> list, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        B2 b10 = (B2) interfaceC1791c4;
        b10.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b10.f25401a.H0(i10, list.get(i11));
        }
    }

    public static void f(int i10, List<?> list, InterfaceC1791c4 interfaceC1791c4, E3 e10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        B2 b10 = (B2) interfaceC1791c4;
        b10.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b10.f(i10, list.get(i11), e10);
        }
    }

    public static void g(int i10, List<Boolean> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.G0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12++;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.E0(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static <T, FT extends I2<FT>> void h(F2<FT> f10, T t8, T t10) {
        G2<T> g2B = f10.b(t10);
        if (g2B.f25457a.isEmpty()) {
            return;
        }
        G2<T> g2F = f10.f(t8);
        g2F.getClass();
        I3 i10 = g2B.f25457a;
        if (i10.f25444c.size() > 0) {
            g2F.c(i10.f(0));
            throw null;
        }
        Iterator<T> it = i10.e().iterator();
        if (it.hasNext()) {
            g2F.c((Map.Entry) it.next());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Object obj, int i10, V2 v10, R2 r10, Q3 q10) {
        if (r10 == null) {
            return;
        }
        S3 s3G = null;
        if (v10 == null) {
            Iterator<E> it = v10.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!r10.c(iIntValue)) {
                    if (s3G == null) {
                        s3G = q10.g(obj);
                    }
                    q10.e(i10, iIntValue, s3G);
                    it.remove();
                }
            }
            return;
        }
        int size = v10.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) v10.get(i12);
            int iIntValue2 = num.intValue();
            if (r10.c(iIntValue2)) {
                if (i12 != i11) {
                    v10.set(i11, num);
                }
                i11++;
            } else {
                if (s3G == null) {
                    s3G = q10.g(obj);
                }
                q10.e(i10, iIntValue2, s3G);
            }
        }
        if (i11 != size) {
            v10.subList(i11, size).clear();
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int k(int i10, List<zzij> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = zzja.A0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iB = list.get(i11).B();
            iA0 += zzja.C0(iB) + iB;
        }
        return iA0;
    }

    public static int l(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + n(list);
    }

    public static int m(int i10, List<?> list, E3 e10) {
        int iF;
        int iC0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = zzja.A0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C1776a3) {
                iF = ((C1776a3) obj).a();
                iC0 = zzja.C0(iF);
            } else {
                iF = ((AbstractC1887q2) ((InterfaceC1894r3) obj)).f(e10);
                iC0 = zzja.C0(iF);
            }
            iA0 = iC0 + iF + iA0;
        }
        return iA0;
    }

    public static int n(List<Integer> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o10 = (O2) list;
            iZ0 = 0;
            while (i10 < size) {
                o10.g(i10);
                iZ0 += zzja.z0(o10.f25544c[i10]);
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += zzja.z0(list.get(i10).intValue());
                i10++;
            }
        }
        return iZ0;
    }

    public static void o(int i10, List<String> list, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        B2 b10 = (B2) interfaceC1791c4;
        b10.getClass();
        boolean z10 = list instanceof InterfaceC1790c3;
        int i11 = 0;
        zzja.a aVar = b10.f25401a;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.F0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC1790c3 interfaceC1790c3 = (InterfaceC1790c3) list;
        while (i11 < list.size()) {
            Object objW = interfaceC1790c3.w(i11);
            if (objW instanceof String) {
                aVar.F0(i10, (String) objW);
            } else {
                aVar.H0(i10, (zzij) objW);
            }
            i11++;
        }
    }

    public static void p(int i10, List<?> list, InterfaceC1791c4 interfaceC1791c4, E3 e10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        B2 b10 = (B2) interfaceC1791c4;
        b10.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b10.j(i10, list.get(i11), e10);
        }
    }

    public static void q(int i10, List<Double> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = list.get(i11).doubleValue();
                aVar.getClass();
                aVar.J0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 8;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.K0(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static int r(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iA0 = zzja.A0(i10) * size;
        if (list instanceof InterfaceC1790c3) {
            InterfaceC1790c3 interfaceC1790c3 = (InterfaceC1790c3) list;
            while (i11 < size) {
                Object objW = interfaceC1790c3.w(i11);
                if (objW instanceof zzij) {
                    int iB = ((zzij) objW).B();
                    iA0 = zzja.C0(iB) + iB + iA0;
                } else {
                    iA0 = zzja.n0((String) objW) + iA0;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzij) {
                    int iB2 = ((zzij) obj).B();
                    iA0 = zzja.C0(iB2) + iB2 + iA0;
                } else {
                    iA0 = zzja.n0((String) obj) + iA0;
                }
                i11++;
            }
        }
        return iA0;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzja.r0(i10) * size;
    }

    public static int t(List<?> list) {
        return list.size() << 2;
    }

    public static void u(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.N0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += zzja.z0(list.get(i12).intValue());
        }
        aVar.S0(iZ0);
        while (i11 < list.size()) {
            aVar.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzja.p0(i10) * size;
    }

    public static int w(List<?> list) {
        return list.size() << 3;
    }

    public static void x(int i10, List<Integer> list, InterfaceC1791c4 interfaceC1791c4, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                aVar.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        aVar.R0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = zzja.f26051d;
            i12 += 4;
        }
        aVar.S0(i12);
        while (i11 < list.size()) {
            aVar.M0(list.get(i11).intValue());
            i11++;
        }
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzja.A0(i10) * size) + z(list);
    }

    public static int z(List<Integer> list) {
        int iZ0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof O2) {
            O2 o10 = (O2) list;
            iZ0 = 0;
            while (i10 < size) {
                o10.g(i10);
                iZ0 += zzja.z0(o10.f25544c[i10]);
                i10++;
            }
        } else {
            iZ0 = 0;
            while (i10 < size) {
                iZ0 += zzja.z0(list.get(i10).intValue());
                i10++;
            }
        }
        return iZ0;
    }
}
