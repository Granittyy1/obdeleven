package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1922v3<T> implements E3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1894r3 f25894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q3<?, ?> f25895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F2<?> f25897d;

    public C1922v3(Q3<?, ?> q10, F2<?> f10, InterfaceC1894r3 interfaceC1894r3) {
        this.f25895b = q10;
        this.f25896c = f10.e(interfaceC1894r3);
        this.f25897d = f10;
        this.f25894a = interfaceC1894r3;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final void a(T t8, T t10) {
        Class<?> cls = H3.f25466a;
        Q3<?, ?> q10 = this.f25895b;
        q10.h(t8, q10.b(q10.i(t8), q10.i(t10)));
        if (this.f25896c) {
            H3.h(this.f25897d, t8, t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[EDGE_INSN: B:55:0x00a0->B:36:0x00a0 BREAK  A[LOOP:1: B:18:0x0060->B:28:0x007f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.E3
    public final void b(T t8, byte[] bArr, int i10, int i11, C1921v2 c1921v2) throws IOException {
        N2 n10 = (N2) t8;
        S3 s10 = n10.zzb;
        if (s10 == S3.f25587f) {
            s10 = new S3();
            n10.zzb = s10;
        }
        S3 s11 = s10;
        ((N2.b) t8).v();
        int iD = i10;
        N2.d dVarC = null;
        while (iD < i11) {
            int iO = C1928w2.o(bArr, iD, c1921v2);
            int i12 = c1921v2.f25890a;
            InterfaceC1894r3 interfaceC1894r3 = this.f25894a;
            F2<?> f10 = this.f25897d;
            int i13 = 2;
            D2 d10 = c1921v2.f25893d;
            if (i12 == 11) {
                int i14 = 0;
                zzij zzijVar = null;
                while (iO < i11) {
                    iO = C1928w2.o(bArr, iO, c1921v2);
                    int i15 = c1921v2.f25890a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 == i13) {
                        if (i17 != 0) {
                            if (i15 == 12) {
                                break;
                                break;
                            }
                            iO = C1928w2.b(i15, bArr, iO, i11, c1921v2);
                        } else {
                            iO = C1928w2.o(bArr, iO, c1921v2);
                            i14 = c1921v2.f25890a;
                            dVarC = f10.c(d10, interfaceC1894r3, i14);
                        }
                    } else if (i16 != 3) {
                        if (i15 == 12) {
                            break;
                            break;
                        }
                        iO = C1928w2.b(i15, bArr, iO, i11, c1921v2);
                    } else {
                        if (dVarC != null) {
                            C3 c10 = C3.f25411c;
                            throw new NoSuchMethodError();
                        }
                        if (i17 != 2) {
                            if (i15 == 12) {
                                break;
                            } else {
                                iO = C1928w2.b(i15, bArr, iO, i11, c1921v2);
                            }
                        } else {
                            iO = C1928w2.j(bArr, iO, c1921v2);
                            zzijVar = (zzij) c1921v2.f25892c;
                        }
                    }
                    i13 = 2;
                }
                if (zzijVar != null) {
                    s11.c((i14 << 3) | 2, zzijVar);
                }
                iD = iO;
            } else if ((i12 & 7) == 2) {
                N2.d dVarC2 = f10.c(d10, interfaceC1894r3, i12 >>> 3);
                if (dVarC2 != null) {
                    C3 c11 = C3.f25411c;
                    throw new NoSuchMethodError();
                }
                iD = C1928w2.d(i12, bArr, iO, i11, s11, c1921v2);
                dVarC = dVarC2;
            } else {
                iD = C1928w2.b(i12, bArr, iO, i11, c1921v2);
            }
        }
        if (iD != i11) {
            throw zzkb.c();
        }
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final boolean c(T t8) {
        this.f25897d.b(t8).g();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final void d(T t8) {
        this.f25895b.j(t8);
        this.f25897d.g(t8);
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final void e(T t8, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        Iterator itE = this.f25897d.b(t8).e();
        if (itE.hasNext()) {
            ((I2) ((Map.Entry) itE.next()).getKey()).y();
            throw null;
        }
        Q3<?, ?> q10 = this.f25895b;
        q10.c(q10.i(t8), interfaceC1791c4);
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final boolean f(N2 n10, Object obj) {
        Q3<?, ?> q10 = this.f25895b;
        if (!q10.i(n10).equals(q10.i(obj))) {
            return false;
        }
        if (!this.f25896c) {
            return true;
        }
        F2<?> f10 = this.f25897d;
        return f10.b(n10).equals(f10.b(obj));
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final int g(N2 n10) {
        int iHashCode = this.f25895b.i(n10).hashCode();
        return this.f25896c ? (iHashCode * 53) + this.f25897d.b(n10).f25457a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final T h() {
        InterfaceC1894r3 interfaceC1894r3 = this.f25894a;
        return interfaceC1894r3 instanceof N2 ? (T) ((N2) ((N2) interfaceC1894r3).n(4)) : (T) interfaceC1894r3.b().g();
    }

    @Override // com.google.android.gms.internal.measurement.E3
    public final int i(AbstractC1887q2 abstractC1887q2) {
        Q3<?, ?> q10 = this.f25895b;
        int iD = q10.d(q10.i(abstractC1887q2));
        if (this.f25896c) {
            I3 i10 = this.f25897d.b(abstractC1887q2).f25457a;
            if (i10.f25444c.size() > 0) {
                G2.b(i10.f(0));
                throw null;
            }
            Iterator<T> it = i10.e().iterator();
            if (it.hasNext()) {
                G2.b((Map.Entry) it.next());
                throw null;
            }
        }
        return iD;
    }
}
