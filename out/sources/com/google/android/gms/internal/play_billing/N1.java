package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class N1 extends I0 implements InterfaceC1970g1 {
    private static final N1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        N1 n10 = new N1();
        zzb = n10;
        I0.n(N1.class, n10);
    }

    public static /* synthetic */ void q(N1 n10, String str) {
        n10.zzd |= 8;
        n10.zzh = str;
    }

    public static /* synthetic */ void r(N1 n10, String str) {
        str.getClass();
        n10.zzd |= 2;
        n10.zzf = str;
    }

    public static /* synthetic */ void s(N1 n10, int i10) {
        n10.zzd |= 16;
        n10.zzi = i10;
    }

    public static /* synthetic */ void t(N1 n10, zzie zzieVar) {
        n10.zzg = zzieVar.a();
        n10.zzd |= 4;
    }

    public static /* synthetic */ void u(N1 n10, int i10) {
        n10.zzd |= 1;
        n10.zze = i10;
    }

    public static L1 v() {
        return (L1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", M1.f26147a, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new N1();
        }
        if (i11 == 4) {
            return new L1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
