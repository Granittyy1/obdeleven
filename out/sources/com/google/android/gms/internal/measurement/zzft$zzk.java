package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzft$zzk extends N2<zzft$zzk, a> implements InterfaceC1908t3 {
    private static final zzft$zzk zzc;
    private static volatile InterfaceC1942y3<zzft$zzk> zzd;
    private int zze;
    private int zzf = 1;
    private V2<C1913u1> zzg = B3.f25402e;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzft$zzk, a> implements InterfaceC1908t3 {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zzb implements P2 {
        RADS(1),
        PROVISIONING(2);

        private final int zze;

        zzb(int i10) {
            this.zze = i10;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }
    }

    static {
        zzft$zzk zzft_zzk = new zzft$zzk();
        zzc = zzft_zzk;
        N2.p(zzft$zzk.class, zzft_zzk);
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new zzft$zzk();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", E1.f25436a, "zzg", C1913u1.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzft$zzk> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzft$zzk.class) {
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
}
