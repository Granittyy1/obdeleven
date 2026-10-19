package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1781b1 extends N2<C1781b1, a> implements InterfaceC1908t3 {
    private static final C1781b1 zzc;
    private static volatile InterfaceC1942y3<C1781b1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1774a1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1781b1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1781b1.zzc);
        }
    }

    static {
        C1781b1 c1781b1 = new C1781b1();
        zzc = c1781b1;
        N2.p(C1781b1.class, c1781b1);
    }

    public static void w(C1781b1 c1781b1, String str) {
        c1781b1.getClass();
        c1781b1.zze |= 2;
        c1781b1.zzg = str;
    }

    public static a y() {
        return zzc.q();
    }

    public final String A() {
        return this.zzg;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    public final boolean F() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new C1781b1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1781b1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1781b1.class) {
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
        return this.zzf;
    }

    public final C1774a1 x() {
        C1774a1 c1774a1 = this.zzh;
        return c1774a1 == null ? C1774a1.x() : c1774a1;
    }
}
