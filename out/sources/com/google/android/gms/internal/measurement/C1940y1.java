package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1940y1 extends N2<C1940y1, a> implements InterfaceC1908t3 {
    private static final C1940y1 zzc;
    private static volatile InterfaceC1942y3<C1940y1> zzd;
    private S2 zze;
    private S2 zzf;
    private V2<C1899s1> zzg;
    private V2<C1946z1> zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1940y1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1940y1.zzc);
        }
    }

    static {
        C1940y1 c1940y1 = new C1940y1();
        zzc = c1940y1;
        N2.p(C1940y1.class, c1940y1);
    }

    public C1940y1() {
        C1811f3 c1811f3 = C1811f3.f25704e;
        this.zze = c1811f3;
        this.zzf = c1811f3;
        B3<Object> b10 = B3.f25402e;
        this.zzg = b10;
        this.zzh = b10;
    }

    public static void A(C1940y1 c1940y1) {
        c1940y1.getClass();
        c1940y1.zzf = C1811f3.f25704e;
    }

    public static void C(C1940y1 c1940y1) {
        c1940y1.getClass();
        c1940y1.zzg = B3.f25402e;
    }

    public static void D(C1940y1 c1940y1, ArrayList arrayList) {
        V2<C1899s1> v10 = c1940y1.zzg;
        if (!v10.y()) {
            c1940y1.zzg = N2.l(v10);
        }
        AbstractC1887q2.g(arrayList, c1940y1.zzg);
    }

    public static void F(C1940y1 c1940y1) {
        c1940y1.getClass();
        c1940y1.zzh = B3.f25402e;
    }

    public static void G(C1940y1 c1940y1, List list) {
        V2<C1946z1> v10 = c1940y1.zzh;
        if (!v10.y()) {
            c1940y1.zzh = N2.l(v10);
        }
        AbstractC1887q2.g(list, c1940y1.zzh);
    }

    public static a H() {
        return zzc.q();
    }

    public static C1940y1 J() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(C1940y1 c1940y1, List list) {
        S2 s10 = c1940y1.zze;
        if (!((AbstractC1914u2) s10).f25868b) {
            c1940y1.zze = N2.m(s10);
        }
        AbstractC1887q2.g(list, c1940y1.zze);
    }

    public static void x(C1940y1 c1940y1) {
        c1940y1.getClass();
        c1940y1.zze = C1811f3.f25704e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(C1940y1 c1940y1, List list) {
        S2 s10 = c1940y1.zzf;
        if (!((AbstractC1914u2) s10).f25868b) {
            c1940y1.zzf = N2.m(s10);
        }
        AbstractC1887q2.g(list, c1940y1.zzf);
    }

    public final int B() {
        return this.zzh.size();
    }

    public final int E() {
        return this.zze.size();
    }

    public final V2 K() {
        return this.zzg;
    }

    public final List<Long> L() {
        return this.zzf;
    }

    public final V2 M() {
        return this.zzh;
    }

    public final List<Long> N() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1940y1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C1899s1.class, "zzh", C1946z1.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1940y1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1940y1.class) {
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

    public final int y() {
        return this.zzf.size();
    }
}
