package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends N2<Z0, a> implements InterfaceC1908t3 {
    private static final Z0 zzc;
    private static volatile InterfaceC1942y3<Z0> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private V2<C1774a1> zzh = B3.f25402e;
    private boolean zzi;
    private zzfh$zzd zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<Z0, a> implements InterfaceC1908t3 {
        public a() {
            super(Z0.zzc);
        }
    }

    static {
        Z0 z10 = new Z0();
        zzc = z10;
        N2.p(Z0.class, z10);
    }

    public static a A() {
        return zzc.q();
    }

    public static void x(Z0 z10, int i10, C1774a1 c1774a1) {
        z10.getClass();
        V2<C1774a1> v10 = z10.zzh;
        if (!v10.y()) {
            z10.zzh = N2.l(v10);
        }
        z10.zzh.set(i10, c1774a1);
    }

    public static void y(Z0 z10, String str) {
        z10.getClass();
        z10.zze |= 2;
        z10.zzg = str;
    }

    public final zzfh$zzd C() {
        zzfh$zzd zzfh_zzd = this.zzj;
        return zzfh_zzd == null ? zzfh$zzd.w() : zzfh_zzd;
    }

    public final String D() {
        return this.zzg;
    }

    public final V2 E() {
        return this.zzh;
    }

    public final boolean F() {
        return this.zzk;
    }

    public final boolean G() {
        return this.zzl;
    }

    public final boolean H() {
        return this.zzm;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new Z0();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1774a1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<Z0> cVar = zzd;
                if (cVar == null) {
                    synchronized (Z0.class) {
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
        return this.zzh.size();
    }

    public final C1774a1 w(int i10) {
        return this.zzh.get(i10);
    }

    public final int z() {
        return this.zzf;
    }
}
