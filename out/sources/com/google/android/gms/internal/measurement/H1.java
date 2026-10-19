package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class H1 extends N2<H1, a> implements InterfaceC1908t3 {
    private static final H1 zzc;
    private static volatile InterfaceC1942y3<H1> zzd;
    private int zze;
    private V2<zzgb$zzd> zzf = B3.f25402e;
    private F1 zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<H1, a> implements InterfaceC1908t3 {
    }

    static {
        H1 h8 = new H1();
        zzc = h8;
        N2.p(H1.class, h8);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (I1.f25474a[i10 - 1]) {
            case 1:
                return new H1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgb$zzd.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<H1> cVar = zzd;
                if (cVar == null) {
                    synchronized (H1.class) {
                        try {
                            cVar = zzd;
                            if (cVar == null) {
                                cVar = new N2.c<>();
                                zzd = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final F1 v() {
        F1 f10 = this.zzg;
        return f10 == null ? F1.w() : f10;
    }

    public final V2 w() {
        return this.zzf;
    }
}
