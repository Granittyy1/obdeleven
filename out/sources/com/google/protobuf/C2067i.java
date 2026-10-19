package com.google.protobuf;

import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2067i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2066h f29175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29178d = 0;

    public C2067i(AbstractC2066h abstractC2066h) {
        C2078u.a(abstractC2066h, MetricTracker.Object.INPUT);
        this.f29175a = abstractC2066h;
        abstractC2066h.f29161d = this;
    }

    public static void y(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void z(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public final int a() throws IOException {
        int i10 = this.f29178d;
        if (i10 != 0) {
            this.f29176b = i10;
            this.f29178d = 0;
        } else {
            this.f29176b = this.f29175a.v();
        }
        int i11 = this.f29176b;
        return (i11 == 0 || i11 == this.f29177c) ? BrazeLogger.SUPPRESS : i11 >>> 3;
    }

    public final <T> void b(T t8, X<T> x10, C2071m c2071m) throws IOException {
        int i10 = this.f29177c;
        this.f29177c = ((this.f29176b >>> 3) << 3) | 4;
        try {
            x10.e(t8, this, c2071m);
            if (this.f29176b != this.f29177c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f29177c = i10;
        } catch (Throwable th) {
            this.f29177c = i10;
            throw th;
        }
    }

    public final <T> void c(T t8, X<T> x10, C2071m c2071m) throws IOException {
        AbstractC2066h abstractC2066h = this.f29175a;
        int iW = abstractC2066h.w();
        if (abstractC2066h.f29158a >= abstractC2066h.f29159b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iF = abstractC2066h.f(iW);
        abstractC2066h.f29158a++;
        x10.e(t8, this, c2071m);
        abstractC2066h.a(0);
        abstractC2066h.f29158a--;
        abstractC2066h.e(iF);
    }

    public final void d(List<Boolean> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2063e;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC2066h.g()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Boolean.valueOf(abstractC2066h.g()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        C2063e c2063e = (C2063e) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                c2063e.e(abstractC2066h.g());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            c2063e.e(abstractC2066h.g());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final ByteString e() throws IOException {
        w(2);
        return this.f29175a.h();
    }

    public final void f(List<ByteString> list) throws IOException {
        int iV;
        if ((this.f29176b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(e());
            AbstractC2066h abstractC2066h = this.f29175a;
            if (abstractC2066h.c()) {
                return;
            } else {
                iV = abstractC2066h.v();
            }
        } while (iV == this.f29176b);
        this.f29178d = iV;
    }

    public final void g(List<Double> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2069k;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(abstractC2066h.i()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iW = abstractC2066h.w();
            z(iW);
            int iB = abstractC2066h.b() + iW;
            do {
                list.add(Double.valueOf(abstractC2066h.i()));
            } while (abstractC2066h.b() < iB);
            return;
        }
        C2069k c2069k = (C2069k) list;
        int i11 = this.f29176b & 7;
        if (i11 == 1) {
            do {
                c2069k.e(abstractC2066h.i());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iW2 = abstractC2066h.w();
        z(iW2);
        int iB2 = abstractC2066h.b() + iW2;
        do {
            c2069k.e(abstractC2066h.i());
        } while (abstractC2066h.b() < iB2);
    }

    public final void h(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2066h.j()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Integer.valueOf(abstractC2066h.j()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                c2077t.e(abstractC2066h.j());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            c2077t.e(abstractC2066h.j());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final Object i(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C2071m c2071m) throws IOException {
        int iOrdinal = wireFormat$FieldType.ordinal();
        AbstractC2066h abstractC2066h = this.f29175a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC2066h.i());
            case 1:
                w(5);
                return Float.valueOf(abstractC2066h.m());
            case 2:
                w(0);
                return Long.valueOf(abstractC2066h.o());
            case 3:
                w(0);
                return Long.valueOf(abstractC2066h.x());
            case 4:
                w(0);
                return Integer.valueOf(abstractC2066h.n());
            case 5:
                w(1);
                return Long.valueOf(abstractC2066h.l());
            case 6:
                w(5);
                return Integer.valueOf(abstractC2066h.k());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC2066h.g());
            case 8:
                w(2);
                return abstractC2066h.u();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                X xA = U.f29087c.a(cls);
                Object objD = xA.d();
                c(objD, xA, c2071m);
                xA.b(objD);
                return objD;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC2066h.w());
            case 13:
                w(0);
                return Integer.valueOf(abstractC2066h.j());
            case 14:
                w(5);
                return Integer.valueOf(abstractC2066h.p());
            case 15:
                w(1);
                return Long.valueOf(abstractC2066h.q());
            case 16:
                w(0);
                return Integer.valueOf(abstractC2066h.r());
            case 17:
                w(0);
                return Long.valueOf(abstractC2066h.s());
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 2) {
                int iW = abstractC2066h.w();
                y(iW);
                int iB = abstractC2066h.b() + iW;
                do {
                    list.add(Integer.valueOf(abstractC2066h.k()));
                } while (abstractC2066h.b() < iB);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(abstractC2066h.k()));
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV = abstractC2066h.v();
                }
            } while (iV == this.f29176b);
            this.f29178d = iV;
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 2) {
            int iW2 = abstractC2066h.w();
            y(iW2);
            int iB2 = abstractC2066h.b() + iW2;
            do {
                c2077t.e(abstractC2066h.k());
            } while (abstractC2066h.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            c2077t.e(abstractC2066h.k());
            if (abstractC2066h.c()) {
                return;
            } else {
                iV2 = abstractC2066h.v();
            }
        } while (iV2 == this.f29176b);
        this.f29178d = iV2;
    }

    public final void k(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof B;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC2066h.l()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iW = abstractC2066h.w();
            z(iW);
            int iB = abstractC2066h.b() + iW;
            do {
                list.add(Long.valueOf(abstractC2066h.l()));
            } while (abstractC2066h.b() < iB);
            return;
        }
        B b10 = (B) list;
        int i11 = this.f29176b & 7;
        if (i11 == 1) {
            do {
                b10.e(abstractC2066h.l());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iW2 = abstractC2066h.w();
        z(iW2);
        int iB2 = abstractC2066h.b() + iW2;
        do {
            b10.e(abstractC2066h.l());
        } while (abstractC2066h.b() < iB2);
    }

    public final void l(List<Float> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof r;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 2) {
                int iW = abstractC2066h.w();
                y(iW);
                int iB = abstractC2066h.b() + iW;
                do {
                    list.add(Float.valueOf(abstractC2066h.m()));
                } while (abstractC2066h.b() < iB);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(abstractC2066h.m()));
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV = abstractC2066h.v();
                }
            } while (iV == this.f29176b);
            this.f29178d = iV;
            return;
        }
        r rVar = (r) list;
        int i11 = this.f29176b & 7;
        if (i11 == 2) {
            int iW2 = abstractC2066h.w();
            y(iW2);
            int iB2 = abstractC2066h.b() + iW2;
            do {
                rVar.e(abstractC2066h.m());
            } while (abstractC2066h.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            rVar.e(abstractC2066h.m());
            if (abstractC2066h.c()) {
                return;
            } else {
                iV2 = abstractC2066h.v();
            }
        } while (iV2 == this.f29176b);
        this.f29178d = iV2;
    }

    public final void m(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2066h.n()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Integer.valueOf(abstractC2066h.n()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                c2077t.e(abstractC2066h.n());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            c2077t.e(abstractC2066h.n());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void n(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof B;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC2066h.o()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Long.valueOf(abstractC2066h.o()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        B b10 = (B) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                b10.e(abstractC2066h.o());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            b10.e(abstractC2066h.o());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void o(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 2) {
                int iW = abstractC2066h.w();
                y(iW);
                int iB = abstractC2066h.b() + iW;
                do {
                    list.add(Integer.valueOf(abstractC2066h.p()));
                } while (abstractC2066h.b() < iB);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(abstractC2066h.p()));
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV = abstractC2066h.v();
                }
            } while (iV == this.f29176b);
            this.f29178d = iV;
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 2) {
            int iW2 = abstractC2066h.w();
            y(iW2);
            int iB2 = abstractC2066h.b() + iW2;
            do {
                c2077t.e(abstractC2066h.p());
            } while (abstractC2066h.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            c2077t.e(abstractC2066h.p());
            if (abstractC2066h.c()) {
                return;
            } else {
                iV2 = abstractC2066h.v();
            }
        } while (iV2 == this.f29176b);
        this.f29178d = iV2;
    }

    public final void p(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof B;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC2066h.q()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iW = abstractC2066h.w();
            z(iW);
            int iB = abstractC2066h.b() + iW;
            do {
                list.add(Long.valueOf(abstractC2066h.q()));
            } while (abstractC2066h.b() < iB);
            return;
        }
        B b10 = (B) list;
        int i11 = this.f29176b & 7;
        if (i11 == 1) {
            do {
                b10.e(abstractC2066h.q());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iW2 = abstractC2066h.w();
        z(iW2);
        int iB2 = abstractC2066h.b() + iW2;
        do {
            b10.e(abstractC2066h.q());
        } while (abstractC2066h.b() < iB2);
    }

    public final void q(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2066h.r()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Integer.valueOf(abstractC2066h.r()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                c2077t.e(abstractC2066h.r());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            c2077t.e(abstractC2066h.r());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void r(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof B;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC2066h.s()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Long.valueOf(abstractC2066h.s()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        B b10 = (B) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                b10.e(abstractC2066h.s());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            b10.e(abstractC2066h.s());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void s(List<String> list, boolean z10) throws IOException {
        String strT;
        int iV;
        int iV2;
        if ((this.f29176b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z11 = list instanceof InterfaceC2083z;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (z11 && !z10) {
            InterfaceC2083z interfaceC2083z = (InterfaceC2083z) list;
            do {
                interfaceC2083z.u(e());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        do {
            if (z10) {
                w(2);
                strT = abstractC2066h.u();
            } else {
                w(2);
                strT = abstractC2066h.t();
            }
            list.add(strT);
            if (abstractC2066h.c()) {
                return;
            } else {
                iV = abstractC2066h.v();
            }
        } while (iV == this.f29176b);
        this.f29178d = iV;
    }

    public final void t(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C2077t;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2066h.w()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Integer.valueOf(abstractC2066h.w()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        C2077t c2077t = (C2077t) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                c2077t.e(abstractC2066h.w());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            c2077t.e(abstractC2066h.w());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void u(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof B;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (!z10) {
            int i10 = this.f29176b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC2066h.x()));
                    if (abstractC2066h.c()) {
                        return;
                    } else {
                        iV = abstractC2066h.v();
                    }
                } while (iV == this.f29176b);
                this.f29178d = iV;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iB = abstractC2066h.b() + abstractC2066h.w();
            do {
                list.add(Long.valueOf(abstractC2066h.x()));
            } while (abstractC2066h.b() < iB);
            v(iB);
            return;
        }
        B b10 = (B) list;
        int i11 = this.f29176b & 7;
        if (i11 == 0) {
            do {
                b10.e(abstractC2066h.x());
                if (abstractC2066h.c()) {
                    return;
                } else {
                    iV2 = abstractC2066h.v();
                }
            } while (iV2 == this.f29176b);
            this.f29178d = iV2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iB2 = abstractC2066h.b() + abstractC2066h.w();
        do {
            b10.e(abstractC2066h.x());
        } while (abstractC2066h.b() < iB2);
        v(iB2);
    }

    public final void v(int i10) throws IOException {
        if (this.f29175a.b() != i10) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void w(int i10) throws IOException {
        if ((this.f29176b & 7) != i10) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public final boolean x() throws IOException {
        int i10;
        AbstractC2066h abstractC2066h = this.f29175a;
        if (abstractC2066h.c() || (i10 = this.f29176b) == this.f29177c) {
            return false;
        }
        return abstractC2066h.y(i10);
    }
}
