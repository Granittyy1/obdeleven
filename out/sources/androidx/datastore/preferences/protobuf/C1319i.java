package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1319i implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1318h f17256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17259d = 0;

    public C1319i(AbstractC1318h abstractC1318h) {
        C1330u.a(abstractC1318h, MetricTracker.Object.INPUT);
        this.f17256a = abstractC1318h;
        abstractC1318h.f17242d = this;
    }

    public static void U(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void V(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void A(List<String> list) throws IOException {
        R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final ByteString B() throws IOException {
        T(2);
        return this.f17256a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void C(List<Float> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof r;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 2) {
                int iW = abstractC1318h.w();
                U(iW);
                int iC = abstractC1318h.c() + iW;
                do {
                    list.add(Float.valueOf(abstractC1318h.m()));
                } while (abstractC1318h.c() < iC);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Float.valueOf(abstractC1318h.m()));
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV = abstractC1318h.v();
                }
            } while (iV == this.f17257b);
            this.f17259d = iV;
            return;
        }
        r rVar = (r) list;
        int i11 = this.f17257b & 7;
        if (i11 == 2) {
            int iW2 = abstractC1318h.w();
            U(iW2);
            int iC2 = abstractC1318h.c() + iW2;
            do {
                rVar.e(abstractC1318h.m());
            } while (abstractC1318h.c() < iC2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            rVar.e(abstractC1318h.m());
            if (abstractC1318h.d()) {
                return;
            } else {
                iV2 = abstractC1318h.v();
            }
        } while (iV2 == this.f17257b);
        this.f17259d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int D() throws IOException {
        T(0);
        return this.f17256a.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.W
    public final <T> void E(List<T> list, X<T> x10, C1323m c1323m) throws IOException {
        int iV;
        int i10 = this.f17257b;
        if ((i10 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(P(x10, c1323m));
            AbstractC1318h abstractC1318h = this.f17256a;
            if (abstractC1318h.d() || this.f17259d != 0) {
                return;
            } else {
                iV = abstractC1318h.v();
            }
        } while (iV == i10);
        this.f17259d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean F() throws IOException {
        int i10;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (abstractC1318h.d() || (i10 = this.f17257b) == this.f17258c) {
            return false;
        }
        return abstractC1318h.y(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int G() throws IOException {
        T(5);
        return this.f17256a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void H(List<ByteString> list) throws IOException {
        int iV;
        if ((this.f17257b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(B());
            AbstractC1318h abstractC1318h = this.f17256a;
            if (abstractC1318h.d()) {
                return;
            } else {
                iV = abstractC1318h.v();
            }
        } while (iV == this.f17257b);
        this.f17259d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void I(List<Double> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1321k;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(abstractC1318h.i()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = abstractC1318h.w();
            V(iW);
            int iC = abstractC1318h.c() + iW;
            do {
                list.add(Double.valueOf(abstractC1318h.i()));
            } while (abstractC1318h.c() < iC);
            return;
        }
        C1321k c1321k = (C1321k) list;
        int i11 = this.f17257b & 7;
        if (i11 == 1) {
            do {
                c1321k.e(abstractC1318h.i());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = abstractC1318h.w();
        V(iW2);
        int iC2 = abstractC1318h.c() + iW2;
        do {
            c1321k.e(abstractC1318h.i());
        } while (abstractC1318h.c() < iC2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.W
    public final <T> void J(List<T> list, X<T> x10, C1323m c1323m) throws IOException {
        int iV;
        int i10 = this.f17257b;
        if ((i10 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Q(x10, c1323m));
            AbstractC1318h abstractC1318h = this.f17256a;
            if (abstractC1318h.d() || this.f17259d != 0) {
                return;
            } else {
                iV = abstractC1318h.v();
            }
        } while (iV == i10);
        this.f17259d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final long K() throws IOException {
        T(0);
        return this.f17256a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final String L() throws IOException {
        T(2);
        return this.f17256a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void M(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof A;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1318h.l()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = abstractC1318h.w();
            V(iW);
            int iC = abstractC1318h.c() + iW;
            do {
                list.add(Long.valueOf(abstractC1318h.l()));
            } while (abstractC1318h.c() < iC);
            return;
        }
        A a10 = (A) list;
        int i11 = this.f17257b & 7;
        if (i11 == 1) {
            do {
                a10.e(abstractC1318h.l());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = abstractC1318h.w();
        V(iW2);
        int iC2 = abstractC1318h.c() + iW2;
        do {
            a10.e(abstractC1318h.l());
        } while (abstractC1318h.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final <T> T N(X<T> x10, C1323m c1323m) throws IOException {
        T(3);
        return (T) P(x10, c1323m);
    }

    public final Object O(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C1323m c1323m) throws IOException {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(K());
            case 3:
                return Long.valueOf(d());
            case 4:
                return Integer.valueOf(D());
            case 5:
                return Long.valueOf(e());
            case 6:
                return Integer.valueOf(i());
            case 7:
                return Boolean.valueOf(j());
            case 8:
                return L();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return Q(T.f17169c.a(cls), c1323m);
            case 11:
                return B();
            case 12:
                return Integer.valueOf(m());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Integer.valueOf(G());
            case 15:
                return Long.valueOf(k());
            case 16:
                return Integer.valueOf(u());
            case 17:
                return Long.valueOf(v());
        }
    }

    public final <T> T P(X<T> x10, C1323m c1323m) throws IOException {
        int i10 = this.f17258c;
        this.f17258c = ((this.f17257b >>> 3) << 3) | 4;
        try {
            T tD = x10.d();
            x10.e(tD, this, c1323m);
            x10.b(tD);
            if (this.f17257b != this.f17258c) {
                throw InvalidProtocolBufferException.e();
            }
            this.f17258c = i10;
            return tD;
        } catch (Throwable th) {
            this.f17258c = i10;
            throw th;
        }
    }

    public final <T> T Q(X<T> x10, C1323m c1323m) throws IOException {
        AbstractC1318h abstractC1318h = this.f17256a;
        int iW = abstractC1318h.w();
        if (abstractC1318h.f17239a >= abstractC1318h.f17240b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iF = abstractC1318h.f(iW);
        T tD = x10.d();
        abstractC1318h.f17239a++;
        x10.e(tD, this, c1323m);
        x10.b(tD);
        abstractC1318h.a(0);
        abstractC1318h.f17239a--;
        abstractC1318h.e(iF);
        return tD;
    }

    public final void R(List<String> list, boolean z10) throws IOException {
        int iV;
        int iV2;
        if ((this.f17257b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z11 = list instanceof InterfaceC1334y;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? L() : x());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV = abstractC1318h.v();
                }
            } while (iV == this.f17257b);
            this.f17259d = iV;
            return;
        }
        InterfaceC1334y interfaceC1334y = (InterfaceC1334y) list;
        do {
            interfaceC1334y.D(B());
            if (abstractC1318h.d()) {
                return;
            } else {
                iV2 = abstractC1318h.v();
            }
        } while (iV2 == this.f17257b);
        this.f17259d = iV2;
    }

    public final void S(int i10) throws IOException {
        if (this.f17256a.c() != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void T(int i10) throws IOException {
        if ((this.f17257b & 7) != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int a() {
        return this.f17257b;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final <T> T b(X<T> x10, C1323m c1323m) throws IOException {
        T(2);
        return (T) Q(x10, c1323m);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1318h.r()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Integer.valueOf(abstractC1318h.r()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                c1329t.e(abstractC1318h.r());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            c1329t.e(abstractC1318h.r());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final long d() throws IOException {
        T(0);
        return this.f17256a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final long e() throws IOException {
        T(1);
        return this.f17256a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void f(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 2) {
                int iW = abstractC1318h.w();
                U(iW);
                int iC = abstractC1318h.c() + iW;
                do {
                    list.add(Integer.valueOf(abstractC1318h.p()));
                } while (abstractC1318h.c() < iC);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(abstractC1318h.p()));
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV = abstractC1318h.v();
                }
            } while (iV == this.f17257b);
            this.f17259d = iV;
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 2) {
            int iW2 = abstractC1318h.w();
            U(iW2);
            int iC2 = abstractC1318h.c() + iW2;
            do {
                c1329t.e(abstractC1318h.p());
            } while (abstractC1318h.c() < iC2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c1329t.e(abstractC1318h.p());
            if (abstractC1318h.d()) {
                return;
            } else {
                iV2 = abstractC1318h.v();
            }
        } while (iV2 == this.f17257b);
        this.f17259d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof A;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1318h.s()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Long.valueOf(abstractC1318h.s()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        A a10 = (A) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                a10.e(abstractC1318h.s());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            a10.e(abstractC1318h.s());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1318h.w()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Integer.valueOf(abstractC1318h.w()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                c1329t.e(abstractC1318h.w());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            c1329t.e(abstractC1318h.w());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int i() throws IOException {
        T(5);
        return this.f17256a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean j() throws IOException {
        T(0);
        return this.f17256a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final long k() throws IOException {
        T(1);
        return this.f17256a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void l(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof A;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1318h.x()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Long.valueOf(abstractC1318h.x()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        A a10 = (A) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                a10.e(abstractC1318h.x());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            a10.e(abstractC1318h.x());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int m() throws IOException {
        T(0);
        return this.f17256a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void n(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof A;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1318h.o()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Long.valueOf(abstractC1318h.o()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        A a10 = (A) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                a10.e(abstractC1318h.o());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            a10.e(abstractC1318h.o());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void o(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof A;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC1318h.q()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iW = abstractC1318h.w();
            V(iW);
            int iC = abstractC1318h.c() + iW;
            do {
                list.add(Long.valueOf(abstractC1318h.q()));
            } while (abstractC1318h.c() < iC);
            return;
        }
        A a10 = (A) list;
        int i11 = this.f17257b & 7;
        if (i11 == 1) {
            do {
                a10.e(abstractC1318h.q());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iW2 = abstractC1318h.w();
        V(iW2);
        int iC2 = abstractC1318h.c() + iW2;
        do {
            a10.e(abstractC1318h.q());
        } while (abstractC1318h.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void p(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1318h.n()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Integer.valueOf(abstractC1318h.n()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                c1329t.e(abstractC1318h.n());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            c1329t.e(abstractC1318h.n());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void q(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1318h.j()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Integer.valueOf(abstractC1318h.j()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                c1329t.e(abstractC1318h.j());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            c1329t.e(abstractC1318h.j());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.W
    public final <K, V> void r(Map<K, V> map, C.a<K, V> aVar, C1323m c1323m) throws IOException {
        T(2);
        AbstractC1318h abstractC1318h = this.f17256a;
        int iF = abstractC1318h.f(abstractC1318h.w());
        aVar.getClass();
        Object objO = "";
        PreferencesProto$Value preferencesProto$Value = aVar.f17100c;
        Object objO2 = preferencesProto$Value;
        while (true) {
            try {
                int iY = y();
                if (iY == Integer.MAX_VALUE || abstractC1318h.d()) {
                    break;
                }
                if (iY == 1) {
                    objO = O(aVar.f17098a, null, null);
                } else if (iY != 2) {
                    try {
                        if (!F()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!F()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objO2 = O(aVar.f17099b, preferencesProto$Value.getClass(), c1323m);
                }
            } catch (Throwable th) {
                abstractC1318h.e(iF);
                throw th;
            }
        }
        map.put(objO, objO2);
        abstractC1318h.e(iF);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final double readDouble() throws IOException {
        T(1);
        return this.f17256a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final float readFloat() throws IOException {
        T(5);
        return this.f17256a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int s() throws IOException {
        T(0);
        return this.f17256a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void t(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1329t;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 2) {
                int iW = abstractC1318h.w();
                U(iW);
                int iC = abstractC1318h.c() + iW;
                do {
                    list.add(Integer.valueOf(abstractC1318h.k()));
                } while (abstractC1318h.c() < iC);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(abstractC1318h.k()));
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV = abstractC1318h.v();
                }
            } while (iV == this.f17257b);
            this.f17259d = iV;
            return;
        }
        C1329t c1329t = (C1329t) list;
        int i11 = this.f17257b & 7;
        if (i11 == 2) {
            int iW2 = abstractC1318h.w();
            U(iW2);
            int iC2 = abstractC1318h.c() + iW2;
            do {
                c1329t.e(abstractC1318h.k());
            } while (abstractC1318h.c() < iC2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            c1329t.e(abstractC1318h.k());
            if (abstractC1318h.d()) {
                return;
            } else {
                iV2 = abstractC1318h.v();
            }
        } while (iV2 == this.f17257b);
        this.f17259d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int u() throws IOException {
        T(0);
        return this.f17256a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final long v() throws IOException {
        T(0);
        return this.f17256a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void w(List<Boolean> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1315e;
        AbstractC1318h abstractC1318h = this.f17256a;
        if (!z10) {
            int i10 = this.f17257b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC1318h.g()));
                    if (abstractC1318h.d()) {
                        return;
                    } else {
                        iV = abstractC1318h.v();
                    }
                } while (iV == this.f17257b);
                this.f17259d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iC = abstractC1318h.c() + abstractC1318h.w();
            do {
                list.add(Boolean.valueOf(abstractC1318h.g()));
            } while (abstractC1318h.c() < iC);
            S(iC);
            return;
        }
        C1315e c1315e = (C1315e) list;
        int i11 = this.f17257b & 7;
        if (i11 == 0) {
            do {
                c1315e.e(abstractC1318h.g());
                if (abstractC1318h.d()) {
                    return;
                } else {
                    iV2 = abstractC1318h.v();
                }
            } while (iV2 == this.f17257b);
            this.f17259d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iC2 = abstractC1318h.c() + abstractC1318h.w();
        do {
            c1315e.e(abstractC1318h.g());
        } while (abstractC1318h.c() < iC2);
        S(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final String x() throws IOException {
        T(2);
        return this.f17256a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int y() throws IOException {
        int i10 = this.f17259d;
        if (i10 != 0) {
            this.f17257b = i10;
            this.f17259d = 0;
        } else {
            this.f17257b = this.f17256a.v();
        }
        int i11 = this.f17257b;
        return (i11 == 0 || i11 == this.f17258c) ? BrazeLogger.SUPPRESS : i11 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void z(List<String> list) throws IOException {
        R(list, false);
    }
}
