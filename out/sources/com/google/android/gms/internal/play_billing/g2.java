package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends I0 implements InterfaceC1970g1 {
    private static final g2 zzb;
    private int zzd;
    private N0 zze = C1988m1.f26220f;
    private String zzf = "";
    private boolean zzg;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        I0.n(g2.class, g2Var);
    }

    public static /* synthetic */ void q(g2 g2Var, boolean z10) {
        g2Var.zzd |= 2;
        g2Var.zzg = z10;
    }

    public static g2 r() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", f2.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new g2();
        }
        if (i11 == 4) {
            return new c2(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
