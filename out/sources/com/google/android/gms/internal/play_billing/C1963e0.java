package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1963e0 extends I0 implements InterfaceC1970g1 {
    private static final C1963e0 zzb;
    private int zzd;
    private String zze = "";

    static {
        C1963e0 c1963e0 = new C1963e0();
        zzb = c1963e0;
        I0.n(C1963e0.class, c1963e0);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C1963e0();
        }
        if (i11 == 4) {
            return new C1960d0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
