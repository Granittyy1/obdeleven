package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfh$zzd extends N2<zzfh$zzd, a> implements InterfaceC1908t3 {
    private static final zzfh$zzd zzc;
    private static volatile InterfaceC1942y3<zzfh$zzd> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzfh$zzd, a> implements InterfaceC1908t3 {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zzb implements P2 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private final int zzh;

        zzb(int i10) {
            this.zzh = i10;
        }

        public static zzb a(int i10) {
            if (i10 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i10 == 1) {
                return LESS_THAN;
            }
            if (i10 == 2) {
                return GREATER_THAN;
            }
            if (i10 == 3) {
                return EQUAL;
            }
            if (i10 != 4) {
                return null;
            }
            return BETWEEN;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }
    }

    static {
        zzfh$zzd zzfh_zzd = new zzfh$zzd();
        zzc = zzfh_zzd;
        N2.p(zzfh$zzd.class, zzfh_zzd);
    }

    public static zzfh$zzd w() {
        return zzc;
    }

    public final boolean A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 16) != 0;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new zzfh$zzd();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C1788c1.f25668a, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzfh$zzd> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzfh$zzd.class) {
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

    public final zzb v() {
        zzb zzbVarA = zzb.a(this.zzf);
        return zzbVarA == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzbVarA;
    }

    public final String x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzj;
    }

    public final String z() {
        return this.zzi;
    }
}
