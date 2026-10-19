package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends I0 implements InterfaceC1970g1 {
    private static final P1 zzb;

    static {
        P1 p10 = new P1();
        zzb = p10;
        I0.n(P1.class, p10);
    }

    public static P1 q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new P1();
        }
        if (i11 == 4) {
            return new O1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
