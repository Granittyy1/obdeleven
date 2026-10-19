package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class X1 extends I0 implements InterfaceC1970g1 {
    private static final X1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        X1 x10 = new X1();
        zzb = x10;
        I0.n(X1.class, x10);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new X1();
        }
        if (i11 == 4) {
            return new W1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
