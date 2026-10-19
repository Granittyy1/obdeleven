package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1823h1 extends N2<C1823h1, a> implements InterfaceC1908t3 {
    private static final C1823h1 zzc;
    private static volatile InterfaceC1942y3<C1823h1> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private V2<C1844k1> zzi;
    private V2<C1816g1> zzj;
    private V2<Y0> zzk;
    private String zzl;
    private boolean zzm;
    private V2<H1> zzn;
    private V2<C1809f1> zzo;
    private String zzp;
    private String zzq;
    private zzfn$zza zzr;
    private C1830i1 zzs;
    private C1851l1 zzt;
    private C1837j1 zzu;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<C1823h1, a> implements InterfaceC1908t3 {
        public a() {
            super(C1823h1.zzc);
        }
    }

    static {
        C1823h1 c1823h1 = new C1823h1();
        zzc = c1823h1;
        N2.p(C1823h1.class, c1823h1);
    }

    public C1823h1() {
        B3<Object> b10 = B3.f25402e;
        this.zzi = b10;
        this.zzj = b10;
        this.zzk = b10;
        this.zzl = "";
        this.zzn = b10;
        this.zzo = b10;
        this.zzp = "";
        this.zzq = "";
    }

    public static a C() {
        return zzc.q();
    }

    public static C1823h1 E() {
        return zzc;
    }

    public static void x(C1823h1 c1823h1) {
        c1823h1.getClass();
        c1823h1.zzk = B3.f25402e;
    }

    public static void y(C1823h1 c1823h1, int i10, C1816g1 c1816g1) {
        c1823h1.getClass();
        V2<C1816g1> v10 = c1823h1.zzj;
        if (!v10.y()) {
            c1823h1.zzj = N2.l(v10);
        }
        c1823h1.zzj.set(i10, c1816g1);
    }

    public final long A() {
        return this.zzf;
    }

    public final zzfn$zza B() {
        zzfn$zza zzfn_zza = this.zzr;
        return zzfn_zza == null ? zzfn$zza.v() : zzfn_zza;
    }

    public final C1851l1 F() {
        C1851l1 c1851l1 = this.zzt;
        return c1851l1 == null ? C1851l1.w() : c1851l1;
    }

    public final String G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzp;
    }

    public final List<Y0> I() {
        return this.zzk;
    }

    public final V2 J() {
        return this.zzo;
    }

    public final V2 K() {
        return this.zzn;
    }

    public final V2 L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzm;
    }

    public final boolean N() {
        return (this.zze & 128) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 512) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1802e1.f25684a[i10 - 1]) {
            case 1:
                return new C1823h1();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1844k1.class, "zzj", C1816g1.class, "zzk", Y0.class, "zzl", "zzm", "zzn", H1.class, "zzo", C1809f1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<C1823h1> cVar = zzd;
                if (cVar == null) {
                    synchronized (C1823h1.class) {
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
        return this.zzn.size();
    }

    public final C1816g1 w(int i10) {
        return this.zzj.get(i10);
    }

    public final int z() {
        return this.zzj.size();
    }
}
