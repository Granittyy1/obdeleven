package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1946z1 extends N2<C1946z1, a> implements InterfaceC1908t3 {
    private static final C1946z1 zzc;
    private static volatile InterfaceC1942y3<C1946z1> zzd;
    private int zze;
    private int zzf;
    private S2 zzg = C1811f3.f25704e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1946z1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1946z1.zzc);
        }
    }

    static {
        C1946z1 c1946z1 = new C1946z1();
        zzc = c1946z1;
        N2.p(C1946z1.class, c1946z1);
    }

    public static a A() {
        return zzc.q();
    }

    public static void x(C1946z1 c1946z1, int i10) {
        c1946z1.zze |= 1;
        c1946z1.zzf = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(C1946z1 c1946z1, List list) {
        S2 s10 = c1946z1.zzg;
        if (!((AbstractC1914u2) s10).f25868b) {
            c1946z1.zzg = N2.m(s10);
        }
        AbstractC1887q2.g(list, c1946z1.zzg);
    }

    public final List<Long> C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1946z1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1946z1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1946z1.class) {
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
        return this.zzg.size();
    }

    public final long w(int i10) {
        C1811f3 c1811f3 = (C1811f3) this.zzg;
        c1811f3.g(i10);
        return c1811f3.f25705c[i10];
    }

    public final int z() {
        return this.zzf;
    }
}
