package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 extends I0 implements InterfaceC1970g1 {
    private static final T1 zzb;
    private int zzd;
    private int zzf;
    private N1 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private M0 zzg = J0.f26144f;
    private N0 zzh = C1988m1.f26220f;

    static {
        T1 t8 = new T1();
        zzb = t8;
        I0.n(T1.class, t8);
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", S1.f26157a, "zzg", Q1.f26152a, "zzh", k2.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new T1();
        }
        if (i11 == 4) {
            return new R1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
