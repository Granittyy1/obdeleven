package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1951a0 extends I0 implements InterfaceC1970g1 {
    private static final C1951a0 zzb;
    private int zzd;
    private C1963e0 zze;
    private C1963e0 zzf;
    private int zzg;

    static {
        C1951a0 c1951a0 = new C1951a0();
        zzb = c1951a0;
        I0.n(C1951a0.class, c1951a0);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C1966f0.f26183a});
        }
        if (i11 == 3) {
            return new C1951a0();
        }
        if (i11 == 4) {
            return new Z(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
