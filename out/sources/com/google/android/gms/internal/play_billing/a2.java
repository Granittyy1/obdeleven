package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends I0 implements InterfaceC1970g1 {
    private static final a2 zzb;
    private int zzd;
    private int zze;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        I0.n(a2.class, a2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", Z1.f26171a});
        }
        if (i11 == 3) {
            return new a2();
        }
        if (i11 == 4) {
            return new Y1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
