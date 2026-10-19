package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgb$zzd extends N2<zzgb$zzd, a> implements InterfaceC1908t3 {
    private static final zzgb$zzd zzc;
    private static volatile InterfaceC1942y3<zzgb$zzd> zzd;
    private int zze;
    private int zzf;
    private V2<zzgb$zzd> zzg = B3.f25402e;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzgb$zzd, a> implements InterfaceC1908t3 {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zza implements P2 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);

        private final int zzh;

        zza(int i10) {
            this.zzh = i10;
        }

        public static zza a(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return STRING;
            }
            if (i10 == 2) {
                return NUMBER;
            }
            if (i10 == 3) {
                return BOOLEAN;
            }
            if (i10 != 4) {
                return null;
            }
            return STATEMENT;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }
    }

    static {
        zzgb$zzd zzgb_zzd = new zzgb$zzd();
        zzc = zzgb_zzd;
        N2.p(zzgb$zzd.class, zzgb_zzd);
    }

    public final boolean A() {
        return this.zzj;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 16) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (I1.f25474a[i10 - 1]) {
            case 1:
                return new zzgb$zzd();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", J1.f25485a, "zzg", zzgb$zzd.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzgb$zzd> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzgb$zzd.class) {
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

    public final double v() {
        return this.zzk;
    }

    public final zza w() {
        zza zzaVarA = zza.a(this.zzf);
        return zzaVarA == null ? zza.UNKNOWN : zzaVarA;
    }

    public final String x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzi;
    }

    public final List<zzgb$zzd> z() {
        return this.zzg;
    }
}
