package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1892r1 extends N2<C1892r1, a> implements InterfaceC1908t3 {
    private static final C1892r1 zzc;
    private static volatile InterfaceC1942y3<C1892r1> zzd;
    private int zze;
    private int zzf;
    private C1940y1 zzg;
    private C1940y1 zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1892r1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1892r1.zzc);
        }
    }

    static {
        C1892r1 c1892r1 = new C1892r1();
        zzc = c1892r1;
        N2.p(C1892r1.class, c1892r1);
    }

    public static void A(C1892r1 c1892r1, C1940y1 c1940y1) {
        c1892r1.getClass();
        c1940y1.getClass();
        c1892r1.zzh = c1940y1;
        c1892r1.zze |= 4;
    }

    public static void w(C1892r1 c1892r1, int i10) {
        c1892r1.zze |= 1;
        c1892r1.zzf = i10;
    }

    public static void x(C1892r1 c1892r1, C1940y1 c1940y1) {
        c1892r1.getClass();
        c1892r1.zzg = c1940y1;
        c1892r1.zze |= 2;
    }

    public static void y(C1892r1 c1892r1, boolean z10) {
        c1892r1.zze |= 8;
        c1892r1.zzi = z10;
    }

    public static a z() {
        return zzc.q();
    }

    public final C1940y1 C() {
        C1940y1 c1940y1 = this.zzg;
        return c1940y1 == null ? C1940y1.J() : c1940y1;
    }

    public final C1940y1 D() {
        C1940y1 c1940y1 = this.zzh;
        return c1940y1 == null ? C1940y1.J() : c1940y1;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final boolean G() {
        return (this.zze & 8) != 0;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1892r1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1892r1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1892r1.class) {
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
}
