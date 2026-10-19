package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1851l1 extends N2<C1851l1, a> implements InterfaceC1908t3 {
    private static final C1851l1 zzc;
    private static volatile InterfaceC1942y3<C1851l1> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1851l1, a> implements InterfaceC1908t3 {
    }

    static {
        C1851l1 c1851l1 = new C1851l1();
        zzc = c1851l1;
        N2.p(C1851l1.class, c1851l1);
    }

    public static C1851l1 w() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1802e1.f25684a[i10 - 1]) {
            case 1:
                return new C1851l1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1851l1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1851l1.class) {
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
        return this.zzi;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzf;
    }
}
