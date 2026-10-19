package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class V1 extends I0 implements InterfaceC1970g1 {
    private static final V1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        V1 v10 = new V1();
        zzb = v10;
        I0.n(V1.class, v10);
    }

    public static U1 C() {
        return (U1) zzb.h();
    }

    public static /* synthetic */ void q(V1 v10, int i10) {
        v10.zzd |= 128;
        v10.zzl = i10;
    }

    public static /* synthetic */ void r(V1 v10, int i10) {
        v10.zzd |= 256;
        v10.zzm = i10;
    }

    public static /* synthetic */ void s(V1 v10, int i10) {
        v10.zzd |= 8;
        v10.zzh = i10;
    }

    public static /* synthetic */ void t(V1 v10, long j) {
        v10.zzd |= 16;
        v10.zzi = j;
    }

    public static /* synthetic */ void u(V1 v10, long j) {
        v10.zzd |= 32;
        v10.zzj = j;
    }

    public static /* synthetic */ void v(V1 v10) {
        v10.zzd |= 512;
        v10.zzn = 772604006L;
    }

    public static /* synthetic */ void w(V1 v10, String str) {
        str.getClass();
        v10.zzd |= 4;
        v10.zzg = str;
    }

    public static /* synthetic */ void x(V1 v10) {
        v10.zzd |= 64;
        v10.zzk = false;
    }

    public static /* synthetic */ void y(V1 v10) {
        v10.zzd |= 1;
        v10.zze = "8.0.0";
    }

    public static /* synthetic */ void z(V1 v10, String str) {
        v10.zzd |= 2;
        v10.zzf = str;
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new V1();
        }
        if (i11 == 4) {
            return new U1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
