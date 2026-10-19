package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1774a1 extends N2<C1774a1, a> implements InterfaceC1908t3 {
    private static final C1774a1 zzc;
    private static volatile InterfaceC1942y3<C1774a1> zzd;
    private int zze;
    private zzfh$zzf zzf;
    private zzfh$zzd zzg;
    private boolean zzh;
    private String zzi = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1774a1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1774a1.zzc);
        }
    }

    static {
        C1774a1 c1774a1 = new C1774a1();
        zzc = c1774a1;
        N2.p(C1774a1.class, c1774a1);
    }

    public static void w(C1774a1 c1774a1, String str) {
        c1774a1.getClass();
        c1774a1.zze |= 8;
        c1774a1.zzi = str;
    }

    public static C1774a1 x() {
        return zzc;
    }

    public final String A() {
        return this.zzi;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new C1774a1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1774a1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1774a1.class) {
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

    public final zzfh$zzd y() {
        zzfh$zzd zzfh_zzd = this.zzg;
        return zzfh_zzd == null ? zzfh$zzd.w() : zzfh_zzd;
    }

    public final zzfh$zzf z() {
        zzfh$zzf zzfh_zzf = this.zzf;
        return zzfh_zzf == null ? zzfh$zzf.x() : zzfh_zzf;
    }
}
