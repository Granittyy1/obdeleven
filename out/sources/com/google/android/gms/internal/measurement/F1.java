package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends N2<F1, a> implements InterfaceC1908t3 {
    private static final F1 zzc;
    private static volatile InterfaceC1942y3<F1> zzd;
    private V2<G1> zze = B3.f25402e;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<F1, a> implements InterfaceC1908t3 {
    }

    static {
        F1 f10 = new F1();
        zzc = f10;
        N2.p(F1.class, f10);
    }

    public static F1 w() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (I1.f25474a[i10 - 1]) {
            case 1:
                return new F1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", G1.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<F1> cVar = zzd;
                if (cVar == null) {
                    synchronized (F1.class) {
                        try {
                            cVar = zzd;
                            if (cVar == null) {
                                cVar = new N2.c<>();
                                zzd = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int v() {
        return this.zze.size();
    }

    public final List<G1> x() {
        return this.zze;
    }
}
