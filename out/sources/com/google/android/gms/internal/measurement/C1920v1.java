package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1920v1 extends N2<C1920v1, a> implements InterfaceC1908t3 {
    private static final C1920v1 zzc;
    private static volatile InterfaceC1942y3<C1920v1> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private V2<C1920v1> zzk = B3.f25402e;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1920v1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1920v1.zzc);
        }

        public final void j(long j) {
            h();
            C1920v1.x((C1920v1) this.f25531c, j);
        }

        public final void l(String str) {
            h();
            C1920v1.z((C1920v1) this.f25531c, str);
        }

        public final void m(String str) {
            h();
            C1920v1.E((C1920v1) this.f25531c, str);
        }
    }

    static {
        C1920v1 c1920v1 = new C1920v1();
        zzc = c1920v1;
        N2.p(C1920v1.class, c1920v1);
    }

    public static void A(C1920v1 c1920v1, ArrayList arrayList) {
        V2<C1920v1> v10 = c1920v1.zzk;
        if (!v10.y()) {
            c1920v1.zzk = N2.l(v10);
        }
        AbstractC1887q2.g(arrayList, c1920v1.zzk);
    }

    public static void B(C1920v1 c1920v1) {
        c1920v1.zze &= -3;
        c1920v1.zzg = zzc.zzg;
    }

    public static void D(C1920v1 c1920v1) {
        c1920v1.zze &= -5;
        c1920v1.zzh = 0L;
    }

    public static void E(C1920v1 c1920v1, String str) {
        c1920v1.getClass();
        str.getClass();
        c1920v1.zze |= 2;
        c1920v1.zzg = str;
    }

    public static void G(C1920v1 c1920v1) {
        c1920v1.zze &= -17;
        c1920v1.zzj = 0.0d;
    }

    public static void I(C1920v1 c1920v1) {
        c1920v1.getClass();
        c1920v1.zzk = B3.f25402e;
    }

    public static a J() {
        return zzc.q();
    }

    public static void w(C1920v1 c1920v1, double d10) {
        c1920v1.zze |= 16;
        c1920v1.zzj = d10;
    }

    public static void x(C1920v1 c1920v1, long j) {
        c1920v1.zze |= 4;
        c1920v1.zzh = j;
    }

    public static void y(C1920v1 c1920v1, C1920v1 c1920v2) {
        c1920v1.getClass();
        V2<C1920v1> v10 = c1920v1.zzk;
        if (!v10.y()) {
            c1920v1.zzk = N2.l(v10);
        }
        c1920v1.zzk.add(c1920v2);
    }

    public static void z(C1920v1 c1920v1, String str) {
        c1920v1.getClass();
        str.getClass();
        c1920v1.zze |= 1;
        c1920v1.zzf = str;
    }

    public final float C() {
        return this.zzi;
    }

    public final int F() {
        return this.zzk.size();
    }

    public final long H() {
        return this.zzh;
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzg;
    }

    public final List<C1920v1> N() {
        return this.zzk;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1920v1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1920v1.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1920v1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1920v1.class) {
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
        return this.zzj;
    }
}
