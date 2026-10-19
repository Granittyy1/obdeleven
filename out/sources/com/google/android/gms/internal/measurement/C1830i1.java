package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1830i1 extends N2<C1830i1, a> implements InterfaceC1908t3 {
    private static final C1830i1 zzc;
    private static volatile InterfaceC1942y3<C1830i1> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1830i1, a> implements InterfaceC1908t3 {
    }

    static {
        C1830i1 c1830i1 = new C1830i1();
        zzc = c1830i1;
        N2.p(C1830i1.class, c1830i1);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1802e1.f25684a[i10 - 1]) {
            case 1:
                return new C1830i1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1830i1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1830i1.class) {
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
}
