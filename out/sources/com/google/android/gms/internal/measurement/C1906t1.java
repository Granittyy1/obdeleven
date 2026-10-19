package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1906t1 extends N2<C1906t1, a> implements InterfaceC1908t3 {
    private static final C1906t1 zzc;
    private static volatile InterfaceC1942y3<C1906t1> zzd;
    private int zze;
    private V2<C1920v1> zzf = B3.f25402e;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1906t1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1906t1.zzc);
        }

        public final void j(C1920v1.a aVar) {
            h();
            C1906t1.B((C1906t1) this.f25531c, (C1920v1) aVar.f());
        }

        public final void l(C1920v1 c1920v1) {
            h();
            C1906t1.B((C1906t1) this.f25531c, c1920v1);
        }

        public final long m() {
            return ((C1906t1) this.f25531c).G();
        }

        public final C1920v1 n(int i10) {
            return ((C1906t1) this.f25531c).w(i10);
        }

        public final void o(long j) {
            h();
            C1906t1.y(j, (C1906t1) this.f25531c);
        }

        public final long p() {
            return ((C1906t1) this.f25531c).H();
        }

        public final String q() {
            return ((C1906t1) this.f25531c).K();
        }

        public final List<C1920v1> r() {
            return Collections.unmodifiableList(((C1906t1) this.f25531c).L());
        }
    }

    static {
        C1906t1 c1906t1 = new C1906t1();
        zzc = c1906t1;
        N2.p(C1906t1.class, c1906t1);
    }

    public static void A(C1906t1 c1906t1, int i10, C1920v1 c1920v1) {
        c1906t1.getClass();
        c1906t1.P();
        c1906t1.zzf.set(i10, c1920v1);
    }

    public static void B(C1906t1 c1906t1, C1920v1 c1920v1) {
        c1906t1.getClass();
        c1920v1.getClass();
        c1906t1.P();
        c1906t1.zzf.add(c1920v1);
    }

    public static void C(C1906t1 c1906t1, Iterable iterable) {
        c1906t1.P();
        AbstractC1887q2.g(iterable, c1906t1.zzf);
    }

    public static void D(C1906t1 c1906t1, String str) {
        c1906t1.getClass();
        str.getClass();
        c1906t1.zze |= 1;
        c1906t1.zzg = str;
    }

    public static void F(long j, C1906t1 c1906t1) {
        c1906t1.zze |= 4;
        c1906t1.zzi = j;
    }

    public static a I() {
        return zzc.q();
    }

    public static void x(int i10, C1906t1 c1906t1) {
        c1906t1.P();
        c1906t1.zzf.remove(i10);
    }

    public static void y(long j, C1906t1 c1906t1) {
        c1906t1.zze |= 2;
        c1906t1.zzh = j;
    }

    public static void z(C1906t1 c1906t1) {
        c1906t1.getClass();
        c1906t1.zzf = B3.f25402e;
    }

    public final int E() {
        return this.zzf.size();
    }

    public final long G() {
        return this.zzi;
    }

    public final long H() {
        return this.zzh;
    }

    public final String K() {
        return this.zzg;
    }

    public final V2 L() {
        return this.zzf;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final void P() {
        V2<C1920v1> v10 = this.zzf;
        if (v10.y()) {
            return;
        }
        this.zzf = N2.l(v10);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new C1906t1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1920v1.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1906t1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1906t1.class) {
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
        return this.zzj;
    }

    public final C1920v1 w(int i10) {
        return this.zzf.get(i10);
    }
}
