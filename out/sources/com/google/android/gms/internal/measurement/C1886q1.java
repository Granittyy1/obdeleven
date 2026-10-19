package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1886q1 extends N2<C1886q1, a> implements InterfaceC1908t3 {
    private static final C1886q1 zzc;
    private static volatile InterfaceC1942y3<C1886q1> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1886q1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1886q1.zzc);
        }

        public final void j(boolean z10) {
            h();
            C1886q1.F((C1886q1) this.f25531c, z10);
        }

        public final void l(boolean z10) {
            h();
            C1886q1.D((C1886q1) this.f25531c, z10);
        }

        public final void m(boolean z10) {
            h();
            C1886q1.w((C1886q1) this.f25531c, z10);
        }

        public final void n(boolean z10) {
            h();
            C1886q1.H((C1886q1) this.f25531c, z10);
        }

        public final void o(boolean z10) {
            h();
            C1886q1.y((C1886q1) this.f25531c, z10);
        }

        public final void p(boolean z10) {
            h();
            C1886q1.A((C1886q1) this.f25531c, z10);
        }

        public final void q(boolean z10) {
            h();
            C1886q1.B((C1886q1) this.f25531c, z10);
        }
    }

    static {
        C1886q1 c1886q1 = new C1886q1();
        zzc = c1886q1;
        N2.p(C1886q1.class, c1886q1);
    }

    public static void A(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 4;
        c1886q1.zzh = z10;
    }

    public static void B(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 8;
        c1886q1.zzi = z10;
    }

    public static void D(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 16;
        c1886q1.zzj = z10;
    }

    public static void F(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 32;
        c1886q1.zzk = z10;
    }

    public static void H(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 64;
        c1886q1.zzl = z10;
    }

    public static a v() {
        return zzc.q();
    }

    public static void w(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 1;
        c1886q1.zzf = z10;
    }

    public static void y(C1886q1 c1886q1, boolean z10) {
        c1886q1.zze |= 2;
        c1886q1.zzg = z10;
    }

    public static C1886q1 z() {
        return zzc;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean E() {
        return this.zzj;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean I() {
        return this.zzl;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1886q1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1886q1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1886q1.class) {
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
