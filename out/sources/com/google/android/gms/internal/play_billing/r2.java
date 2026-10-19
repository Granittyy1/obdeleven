package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends I0 implements InterfaceC1970g1 {
    private static final r2 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        r2 r2Var = new r2();
        zzb = r2Var;
        I0.n(r2.class, r2Var);
    }

    public static /* synthetic */ void q(r2 r2Var, boolean z10) {
        r2Var.zzd |= 8;
        r2Var.zzh = z10;
    }

    public static /* synthetic */ void r(r2 r2Var, int i10) {
        r2Var.zzd |= 16;
        r2Var.zzi = i10;
    }

    public static /* synthetic */ void s(r2 r2Var, long j) {
        r2Var.zzd |= 4;
        r2Var.zzg = j;
    }

    public static /* synthetic */ void t(r2 r2Var) {
        r2Var.zzd |= 2;
        r2Var.zzf = true;
    }

    public static q2 u() {
        return (q2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new r2();
        }
        if (i11 == 4) {
            return new q2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
