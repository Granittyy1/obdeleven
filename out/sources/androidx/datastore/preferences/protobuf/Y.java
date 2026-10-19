package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f17193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0<?, ?> f17194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0<?, ?> f17195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f17196d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f17193a = cls;
        f17194b = A(false);
        f17195c = A(true);
        f17196d = new e0();
    }

    public static c0<?, ?> A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
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

    public static void B(AbstractC1324n abstractC1324n, GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        C1327q c1327qC = abstractC1324n.c(generatedMessageLite2);
        if (c1327qC.f17272a.isEmpty()) {
            return;
        }
        C1327q c1327qD = abstractC1324n.d(generatedMessageLite);
        c1327qD.getClass();
        Z z10 = c1327qC.f17272a;
        if (z10.f17199c.size() > 0) {
            c1327qD.j(z10.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = z10.e().iterator();
        if (it.hasNext()) {
            c1327qD.j(it.next());
            throw null;
        }
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB D(int i10, int i11, UB ub2, c0<UT, UB> c0Var) {
        if (ub2 == null) {
            ub2 = (UB) c0Var.m();
        }
        c0Var.e(i10, i11, ub2);
        return ub2;
    }

    public static void E(int i10, List<Boolean> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        C1320j c1320j = (C1320j) h0Var;
        c1320j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1320j.f17260a.D(i10, list.get(i11));
        }
    }

    public static void G(int i10, List<Double> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        C1320j c1320j = (C1320j) h0Var;
        c1320j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1320j.h(i10, list.get(i11), x10);
        }
    }

    public static void M(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        C1320j c1320j = (C1320j) h0Var;
        c1320j.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1320j.k(i10, list.get(i11), x10);
        }
    }

    public static void P(int i10, List<Integer> list, h0 h0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
            Logger logger = CodedOutputStream.f17101b;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        C1320j c1320j = (C1320j) h0Var;
        c1320j.getClass();
        boolean z10 = list instanceof InterfaceC1334y;
        CodedOutputStream codedOutputStream = c1320j.f17260a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.P(i10, list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC1334y interfaceC1334y = (InterfaceC1334y) list;
        while (i11 < list.size()) {
            Object objM = interfaceC1334y.m(i11);
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        CodedOutputStream codedOutputStream = ((C1320j) h0Var).f17260a;
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
        if (list instanceof C1329t) {
            C1329t c1329t = (C1329t) list;
            iL = 0;
            while (i10 < size) {
                c1329t.g(i10);
                iL += CodedOutputStream.l(c1329t.f17278c[i10]);
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

    public static int j(int i10, List<I> list, X x10) {
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
        if (list instanceof C1329t) {
            C1329t c1329t = (C1329t) list;
            iL = 0;
            while (i10 < size) {
                c1329t.g(i10);
                iL += CodedOutputStream.l(c1329t.f17278c[i10]);
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
        if (list instanceof A) {
            A a10 = (A) list;
            iY = 0;
            while (i10 < size) {
                a10.g(i10);
                iY += CodedOutputStream.y(a10.f17090c[i10]);
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
        if (obj instanceof C1332w) {
            return CodedOutputStream.n((C1332w) obj) + CodedOutputStream.u(i10);
        }
        int iU = CodedOutputStream.u(i10);
        int iH = ((AbstractC1311a) ((I) obj)).h(x10);
        return CodedOutputStream.w(iH) + iH + iU;
    }

    public static int p(int i10, List<?> list, X x10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.u(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C1332w) {
                iU = CodedOutputStream.n((C1332w) obj) + iU;
            } else {
                int iH = ((AbstractC1311a) ((I) obj)).h(x10);
                iU = CodedOutputStream.w(iH) + iH + iU;
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
        if (list instanceof C1329t) {
            C1329t c1329t = (C1329t) list;
            iW = 0;
            while (i10 < size) {
                c1329t.g(i10);
                int i11 = c1329t.f17278c[i10];
                iW += CodedOutputStream.w((i11 >> 31) ^ (i11 << 1));
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
        if (list instanceof A) {
            A a10 = (A) list;
            iY = 0;
            while (i10 < size) {
                a10.g(i10);
                long j = a10.f17090c[i10];
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
        if (list instanceof InterfaceC1334y) {
            InterfaceC1334y interfaceC1334y = (InterfaceC1334y) list;
            while (i11 < size) {
                Object objM = interfaceC1334y.m(i11);
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
        if (list instanceof C1329t) {
            C1329t c1329t = (C1329t) list;
            iW = 0;
            while (i10 < size) {
                c1329t.g(i10);
                iW += CodedOutputStream.w(c1329t.f17278c[i10]);
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
        if (list instanceof A) {
            A a10 = (A) list;
            iY = 0;
            while (i10 < size) {
                a10.g(i10);
                iY += CodedOutputStream.y(a10.f17090c[i10]);
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

    public static <UT, UB> UB z(int i10, List<Integer> list, C1330u.b bVar, UB ub2, c0<UT, UB> c0Var) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (bVar.a()) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) D(i10, iIntValue, ub2, c0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!bVar.a()) {
                    ub2 = (UB) D(i10, iIntValue2, ub2, c0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
