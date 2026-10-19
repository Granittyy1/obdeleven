package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1899s1 extends N2<C1899s1, a> implements InterfaceC1908t3 {
    private static final C1899s1 zzc;
    private static volatile InterfaceC1942y3<C1899s1> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1899s1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1899s1.zzc);
        }
    }

    static {
        C1899s1 c1899s1 = new C1899s1();
        zzc = c1899s1;
        N2.p(C1899s1.class, c1899s1);
    }

    public static void w(C1899s1 c1899s1, int i10) {
        c1899s1.zze |= 1;
        c1899s1.zzf = i10;
    }

    public static void x(C1899s1 c1899s1, long j) {
        c1899s1.zze |= 2;
        c1899s1.zzg = j;
    }

    public static a z() {
        return zzc.q();
    }

    public final boolean B() {
        return (this.zze & 2) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1899s1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1899s1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1899s1.class) {
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

    public final long y() {
        return this.zzg;
    }
}
