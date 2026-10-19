package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1816g1 extends N2<C1816g1, a> implements InterfaceC1908t3 {
    private static final C1816g1 zzc;
    private static volatile InterfaceC1942y3<C1816g1> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1816g1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1816g1.zzc);
        }

        public final String j() {
            return ((C1816g1) this.f25531c).y();
        }
    }

    static {
        C1816g1 c1816g1 = new C1816g1();
        zzc = c1816g1;
        N2.p(C1816g1.class, c1816g1);
    }

    public static void w(C1816g1 c1816g1, String str) {
        c1816g1.getClass();
        str.getClass();
        c1816g1.zze |= 1;
        c1816g1.zzf = str;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zze & 2) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1802e1.f25684a[i10 - 1]) {
            case 1:
                return new C1816g1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1816g1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1816g1.class) {
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

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzg;
    }
}
