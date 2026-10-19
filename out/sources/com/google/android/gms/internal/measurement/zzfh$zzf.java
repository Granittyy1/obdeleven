package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfh$zzf extends N2<zzfh$zzf, a> implements InterfaceC1908t3 {
    private static final zzfh$zzf zzc;
    private static volatile InterfaceC1942y3<zzfh$zzf> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private V2<String> zzi = B3.f25402e;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzfh$zzf, a> implements InterfaceC1908t3 {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zza implements P2 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private final int zzj;

        zza(int i10) {
            this.zzj = i10;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
        }
    }

    static {
        zzfh$zzf zzfh_zzf = new zzfh$zzf();
        zzc = zzfh_zzf;
        N2.p(zzfh$zzf.class, zzfh_zzf);
    }

    public static zzfh$zzf x() {
        return zzc;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zze & 4) != 0;
    }

    public final boolean C() {
        return (this.zze & 2) != 0;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (X0.f25632a[i10 - 1]) {
            case 1:
                return new zzfh$zzf();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C1795d1.f25675a, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzfh$zzf> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzfh$zzf.class) {
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

    public final int v() {
        return this.zzi.size();
    }

    public final zza w() {
        zza zzaVar;
        int i10 = this.zzf;
        zza zzaVar2 = zza.UNKNOWN_MATCH_TYPE;
        switch (i10) {
            case 0:
                zzaVar = zzaVar2;
                break;
            case 1:
                zzaVar = zza.REGEXP;
                break;
            case 2:
                zzaVar = zza.BEGINS_WITH;
                break;
            case 3:
                zzaVar = zza.ENDS_WITH;
                break;
            case 4:
                zzaVar = zza.PARTIAL;
                break;
            case 5:
                zzaVar = zza.EXACT;
                break;
            case 6:
                zzaVar = zza.IN_LIST;
                break;
            default:
                zzaVar = null;
                break;
        }
        return zzaVar == null ? zzaVar2 : zzaVar;
    }

    public final String y() {
        return this.zzg;
    }

    public final List<String> z() {
        return this.zzi;
    }
}
