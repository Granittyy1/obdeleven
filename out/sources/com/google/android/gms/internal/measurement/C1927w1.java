package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1927w1 extends N2<C1927w1, a> implements InterfaceC1908t3 {
    private static final C1927w1 zzc;
    private static volatile InterfaceC1942y3<C1927w1> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C1879p1 zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1927w1, a> implements InterfaceC1908t3 {
    }

    static {
        C1927w1 c1927w1 = new C1927w1();
        zzc = c1927w1;
        N2.p(C1927w1.class, c1927w1);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1927w1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1927w1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1927w1.class) {
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
