package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f29112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0<?, ?> f29113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0<?, ?> f29114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f29115d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f29112a = cls;
        f29113b = A(false);
        f29114c = A(true);
        f29115d = new e0();
    }

    public static c0<?, ?> A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (c0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends C2075q.a<FT>> void B(AbstractC2072n<FT> abstractC2072n, T t8, T t10) {
        C2075q<T> c2075qC = abstractC2072n.c(t10);
        if (c2075qC.f29191a.isEmpty()) {
            return;
        }
        C2075q<T> c2075qD = abstractC2072n.d(t8);
        c2075qD.getClass();
        Z z10 = c2075qC.f29191a;
        if (z10.f29118c.size() > 0) {
            c2075qD.k(z10.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
        if (it.hasNext()) {
            c2075qD.k(it.next());
            throw null;
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(Object obj, int i10, int i11, UB ub2, c0<UT, UB> c0Var) {
        if (ub2 == null) {
            ub2 = (UB) c0Var.f(obj);
        }
        c0Var.e(i10, i11, ub2);
        return ub2;
    }

    public static void E(int i10, List<Boolean> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.B(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12++;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.A(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void F(int i10, List<ByteString> list, h0 h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2068j c2068j = (C2068j) h0Var;
        c2068j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c2068j.f29179a.D(i10, list.get(i11));
        }
    }

    public static void G(int i10, List<Double> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = list.get(i11).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.H(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 8;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.I(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public static void H(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.J(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        codedOutputStream.T(iL);
        while (i11 < list.size()) {
            codedOutputStream.K(list.get(i11).intValue());
            i11++;
        }
    }

    public static void I(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.F(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 4;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.G(list.get(i11).intValue());
            i11++;
        }
    }

    public static void J(int i10, List<Long> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.H(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 8;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.I(list.get(i11).longValue());
            i11++;
        }
    }

    public static void K(int i10, List<Float> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = list.get(i11).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.F(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 4;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.G(Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public static void L(int i10, List<?> list, h0 h0Var, X x10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2068j c2068j = (C2068j) h0Var;
        c2068j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c2068j.h(i10, list.get(i11), x10);
        }
    }

    public static void M(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.J(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        codedOutputStream.T(iL);
        while (i11 < list.size()) {
            codedOutputStream.K(list.get(i11).intValue());
            i11++;
        }
    }

    public static void N(int i10, List<Long> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.U(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        codedOutputStream.T(iY);
        while (i11 < list.size()) {
            codedOutputStream.V(list.get(i11).longValue());
            i11++;
        }
    }

    public static void O(int i10, List<?> list, h0 h0Var, X x10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2068j c2068j = (C2068j) h0Var;
        c2068j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c2068j.k(i10, list.get(i11), x10);
        }
    }

    public static void P(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.F(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 4;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.G(list.get(i11).intValue());
            i11++;
        }
    }

    public static void Q(int i10, List<Long> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.H(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            list.get(i13).getClass();
            Logger logger = CodedOutputStream.f29012b;
            i12 += 8;
        }
        codedOutputStream.T(i12);
        while (i11 < list.size()) {
            codedOutputStream.I(list.get(i11).longValue());
            i11++;
        }
    }

    public static void R(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = list.get(i11).intValue();
                codedOutputStream.S(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = list.get(i12).intValue();
            iW += CodedOutputStream.w((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        codedOutputStream.T(iW);
        while (i11 < list.size()) {
            int iIntValue3 = list.get(i11).intValue();
            codedOutputStream.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void S(int i10, List<Long> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = list.get(i11).longValue();
                codedOutputStream.U(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = list.get(i12).longValue();
            iY += CodedOutputStream.y((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        codedOutputStream.T(iY);
        while (i11 < list.size()) {
            long jLongValue3 = list.get(i11).longValue();
            codedOutputStream.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void T(int i10, List<String> list, h0 h0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C2068j c2068j = (C2068j) h0Var;
        c2068j.getClass();
        boolean z10 = list instanceof InterfaceC2083z;
        CodedOutputStream codedOutputStream = c2068j.f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.P(i10, list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2083z interfaceC2083z = (InterfaceC2083z) list;
        while (i11 < list.size()) {
            Object objM = interfaceC2083z.m(i11);
            if (objM instanceof String) {
                codedOutputStream.P(i10, (String) objM);
            } else {
                codedOutputStream.D(i10, (ByteString) objM);
            }
            i11++;
        }
    }

    public static void U(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.S(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        codedOutputStream.T(iW);
        while (i11 < list.size()) {
            codedOutputStream.T(list.get(i11).intValue());
            i11++;
        }
    }

    public static void V(int i10, List<Long> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C2068j) h0Var).f29179a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.U(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.R(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        codedOutputStream.T(iY);
        while (i11 < list.size()) {
            codedOutputStream.V(list.get(i11).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.b(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.u(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += CodedOutputStream.d(list.get(i11));
        }
        return iU;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int iL;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2077t) {
            C2077t c2077t = (C2077t) list;
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(c2077t.k(i10));
                i10++;
            }
        } else {
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(list.get(i10).intValue());
                i10++;
            }
        }
        return iL;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.g(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.h(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<J> list, X x10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iJ += CodedOutputStream.j(i10, list.get(i11), x10);
        }
        return iJ;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int iL;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2077t) {
            C2077t c2077t = (C2077t) list;
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(c2077t.k(i10));
                i10++;
            }
        } else {
            iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(list.get(i10).intValue());
                i10++;
            }
        }
        return iL;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            iY = 0;
            while (i10 < size) {
                b10.g(i10);
                iY += CodedOutputStream.y(b10.f29005c[i10]);
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    public static int o(int i10, Object obj, X x10) {
        if (obj instanceof C2081x) {
            return CodedOutputStream.n((C2081x) obj) + CodedOutputStream.u(i10);
        }
        int iU = CodedOutputStream.u(i10);
        int iQ = ((AbstractC2059a) ((J) obj)).q(x10);
        return CodedOutputStream.w(iQ) + iQ + iU;
    }

    public static int p(int i10, List<?> list, X x10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.u(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C2081x) {
                iU = CodedOutputStream.n((C2081x) obj) + iU;
            } else {
                int iQ = ((AbstractC2059a) ((J) obj)).q(x10);
                iU = CodedOutputStream.w(iQ) + iQ + iU;
            }
        }
        return iU;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2077t) {
            C2077t c2077t = (C2077t) list;
            iW = 0;
            while (i10 < size) {
                int iK = c2077t.k(i10);
                iW += CodedOutputStream.w((iK >> 31) ^ (iK << 1));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                int iIntValue = list.get(i10).intValue();
                iW += CodedOutputStream.w((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
        }
        return iW;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            iY = 0;
            while (i10 < size) {
                b10.g(i10);
                long j = b10.f29005c[i10];
                iY += CodedOutputStream.y((j >> 63) ^ (j << 1));
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                long jLongValue = list.get(i10).longValue();
                iY += CodedOutputStream.y((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
        }
        return iY;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.u(i10) * size;
        if (list instanceof InterfaceC2083z) {
            InterfaceC2083z interfaceC2083z = (InterfaceC2083z) list;
            while (i11 < size) {
                Object objM = interfaceC2083z.m(i11);
                iU = (objM instanceof ByteString ? CodedOutputStream.d((ByteString) objM) : CodedOutputStream.t((String) objM)) + iU;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iU = (obj instanceof ByteString ? CodedOutputStream.d((ByteString) obj) : CodedOutputStream.t((String) obj)) + iU;
                i11++;
            }
        }
        return iU;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2077t) {
            C2077t c2077t = (C2077t) list;
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(c2077t.k(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(list.get(i10).intValue());
                i10++;
            }
        }
        return iW;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.u(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int iY;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            iY = 0;
            while (i10 < size) {
                b10.g(i10);
                iY += CodedOutputStream.y(b10.f29005c[i10]);
                i10++;
            }
        } else {
            iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(list.get(i10).longValue());
                i10++;
            }
        }
        return iY;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, C2078u.b bVar, UB ub2, c0<UT, UB> c0Var) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (bVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) D(obj, i10, iIntValue, ub2, c0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!bVar.a(iIntValue2)) {
                    ub2 = (UB) D(obj, i10, iIntValue2, ub2, c0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
