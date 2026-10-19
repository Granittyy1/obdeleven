package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class K1 extends I0 implements InterfaceC1970g1 {
    private static final K1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        K1 k10 = new K1();
        zzb = k10;
        I0.n(K1.class, k10);
    }

    public static /* synthetic */ void r(K1 k10, zzil zzilVar) {
        k10.zzh = zzilVar.a();
        k10.zzd |= 2;
    }

    public static /* synthetic */ void s(K1 k10, g2 g2Var) {
        k10.zzf = g2Var;
        k10.zze = 4;
    }

    public static /* synthetic */ void t(K1 k10, r2 r2Var) {
        k10.zzf = r2Var;
        k10.zze = 3;
    }

    public static /* synthetic */ void u(K1 k10, int i10) {
        k10.zzg = i10 - 1;
        k10.zzd |= 1;
    }

    public static J1 v() {
        return (J1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", I1.f26142a, a2.class, r2.class, g2.class, "zzh", Q1.f26152a});
        }
        if (i11 == 3) {
            return new K1();
        }
        if (i11 == 4) {
            return new J1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final g2 q() {
        return this.zze == 4 ? (g2) this.zzf : g2.r();
    }
}
