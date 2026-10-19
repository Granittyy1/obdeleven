package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends I0 implements InterfaceC1970g1 {
    private static final k2 zzb;
    private int zzd;
    private int zzf;
    private N0 zze = C1988m1.f26220f;
    private String zzg = "";

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        I0.n(k2.class, k2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new k2();
        }
        if (i11 == 4) {
            return new j2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
