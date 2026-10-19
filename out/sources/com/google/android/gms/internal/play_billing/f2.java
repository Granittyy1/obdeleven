package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends I0 implements InterfaceC1970g1 {
    private static final f2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        f2 f2Var = new f2();
        zzb = f2Var;
        I0.n(f2.class, f2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", e2.f26181a, "zzf"});
        }
        if (i11 == 3) {
            return new f2();
        }
        if (i11 == 4) {
            return new d2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
