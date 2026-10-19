package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y0 extends N2<Y0, a> implements InterfaceC1908t3 {
    private static final Y0 zzc;
    private static volatile InterfaceC1942y3<Y0> zzd;
    private int zze;
    private int zzf;
    private V2<C1781b1> zzg;
    private V2<Z0> zzh;
    private boolean zzi;
    private boolean zzj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<Y0, a> implements InterfaceC1908t3 {
        public a() {
            super(Y0.zzc);
        }
    }

    static {
        Y0 y10 = new Y0();
        zzc = y10;
        N2.p(Y0.class, y10);
    }

    public Y0() {
        B3<Object> b10 = B3.f25402e;
        this.zzg = b10;
        this.zzh = b10;
    }

    public static void x(Y0 y10, int i10, Z0 z10) {
        y10.getClass();
        V2<Z0> v10 = y10.zzh;
        if (!v10.y()) {
            y10.zzh = N2.l(v10);
        }
        y10.zzh.set(i10, z10);
    }

    public static void y(Y0 y10, int i10, C1781b1 c1781b1) {
        y10.getClass();
        V2<C1781b1> v10 = y10.zzg;
        if (!v10.y()) {
            y10.zzg = N2.l(v10);
        }
        y10.zzg.set(i10, c1781b1);
    }

    public final C1781b1 A(int i10) {
        return this.zzg.get(i10);
    }

    public final int B() {
        return this.zzg.size();
    }

    public final List<Z0> D() {
        return this.zzh;
    }

    public final List<C1781b1> E() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new Y0();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1781b1.class, "zzh", Z0.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<Y0> cVar = zzd;
                if (cVar == null) {
                    synchronized (Y0.class) {
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

    public final Z0 w(int i10) {
        return this.zzh.get(i10);
    }

    public final int z() {
        return this.zzh.size();
    }
}
