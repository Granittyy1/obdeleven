package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 extends I0 implements InterfaceC1970g1 {
    private static final m2 zzb;
    private int zzd;
    private N1 zze;
    private long zzf;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        I0.n(m2.class, m2Var);
    }

    public static /* synthetic */ void q(m2 m2Var, N1 n10) {
        m2Var.zze = n10;
        m2Var.zzd |= 1;
    }

    public static /* synthetic */ void r(m2 m2Var, long j) {
        m2Var.zzd |= 2;
        m2Var.zzf = j;
    }

    public static l2 s() {
        return (l2) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new m2();
        }
        if (i11 == 4) {
            return new l2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
