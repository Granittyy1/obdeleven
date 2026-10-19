package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G1 extends N2<G1, a> implements InterfaceC1908t3 {
    private static final G1 zzc;
    private static volatile InterfaceC1942y3<G1> zzd;
    private int zze;
    private String zzf = "";
    private V2<zzgb$zzd> zzg = B3.f25402e;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<G1, a> implements InterfaceC1908t3 {
    }

    static {
        G1 g10 = new G1();
        zzc = g10;
        N2.p(G1.class, g10);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (I1.f25474a[i10 - 1]) {
            case 1:
                return new G1();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgb$zzd.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<G1> cVar = zzd;
                if (cVar == null) {
                    synchronized (G1.class) {
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

    public final String v() {
        return this.zzf;
    }

    public final V2 w() {
        return this.zzg;
    }
}
