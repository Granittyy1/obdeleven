package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends I0 implements InterfaceC1970g1 {
    private static final i2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private V1 zzg;
    private X1 zzh;

    static {
        i2 i2Var = new i2();
        zzb = i2Var;
        I0.n(i2.class, i2Var);
    }

    public static /* synthetic */ void q(i2 i2Var, H1 h8) {
        i2Var.zzf = h8;
        i2Var.zze = 2;
    }

    public static /* synthetic */ void r(i2 i2Var, K1 k10) {
        i2Var.zzf = k10;
        i2Var.zze = 3;
    }

    public static /* synthetic */ void s(i2 i2Var, P1 p10) {
        p10.getClass();
        i2Var.zzf = p10;
        i2Var.zze = 7;
    }

    public static /* synthetic */ void t(i2 i2Var, V1 v10) {
        v10.getClass();
        i2Var.zzg = v10;
        i2Var.zzd |= 1;
    }

    public static /* synthetic */ void u(i2 i2Var, m2 m2Var) {
        i2Var.zzf = m2Var;
        i2Var.zze = 8;
    }

    public static /* synthetic */ void v(i2 i2Var, p2 p2Var) {
        i2Var.zzf = p2Var;
        i2Var.zze = 4;
    }

    public static h2 w() {
        return (h2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", H1.class, K1.class, p2.class, T1.class, "zzh", P1.class, m2.class});
        }
        if (i11 == 3) {
            return new i2();
        }
        if (i11 == 4) {
            return new h2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
