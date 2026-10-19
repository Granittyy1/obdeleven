package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A1 extends N2<A1, a> implements InterfaceC1908t3 {
    private static final A1 zzc;
    private static volatile InterfaceC1942y3<A1> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<A1, a> implements InterfaceC1908t3 {
        public a() {
            super(A1.zzc);
        }
    }

    static {
        A1 a10 = new A1();
        zzc = a10;
        N2.p(A1.class, a10);
    }

    public static void B(A1 a10) {
        a10.zze &= -9;
        a10.zzi = 0L;
    }

    public static void C(A1 a10, long j) {
        a10.zze |= 8;
        a10.zzi = j;
    }

    public static void D(A1 a10, String str) {
        a10.getClass();
        str.getClass();
        a10.zze |= 4;
        a10.zzh = str;
    }

    public static void F(A1 a10) {
        a10.zze &= -33;
        a10.zzk = 0.0d;
    }

    public static a H() {
        return zzc.q();
    }

    public static void w(A1 a10, double d10) {
        a10.zze |= 32;
        a10.zzk = d10;
    }

    public static void x(A1 a10, long j) {
        a10.zze |= 1;
        a10.zzf = j;
    }

    public static void y(A1 a10, String str) {
        a10.getClass();
        str.getClass();
        a10.zze |= 2;
        a10.zzg = str;
    }

    public static void z(A1 a10) {
        a10.zze &= -5;
        a10.zzh = zzc.zzh;
    }

    public final float A() {
        return this.zzj;
    }

    public final long E() {
        return this.zzi;
    }

    public final long G() {
        return this.zzf;
    }

    public final String J() {
        return this.zzg;
    }

    public final String K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zze & 32) != 0;
    }

    public final boolean M() {
        return (this.zze & 16) != 0;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new A1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<A1> cVar = zzd;
                if (cVar == null) {
                    synchronized (A1.class) {
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

    public final double v() {
        return this.zzk;
    }
}
