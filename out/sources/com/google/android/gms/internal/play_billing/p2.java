package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends I0 implements InterfaceC1970g1 {
    private static final p2 zzb;
    private int zzd;
    private int zze;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        I0.n(p2.class, p2Var);
    }

    public static p2 q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", o2.f26234a});
        }
        if (i11 == 3) {
            return new p2();
        }
        if (i11 == 4) {
            return new n2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
