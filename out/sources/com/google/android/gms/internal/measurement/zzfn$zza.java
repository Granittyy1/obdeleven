package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfn$zza extends N2<zzfn$zza, a> implements InterfaceC1908t3 {
    private static final zzfn$zza zzc;
    private static volatile InterfaceC1942y3<zzfn$zza> zzd;
    private int zze;
    private V2<b> zzf;
    private V2<c> zzg;
    private V2<d> zzh;
    private boolean zzi;
    private V2<b> zzj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzfn$zza, a> implements InterfaceC1908t3 {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class b extends N2<b, a> implements InterfaceC1908t3 {
        private static final b zzc;
        private static volatile InterfaceC1942y3<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
        public static final class a extends N2.a<b, a> implements InterfaceC1908t3 {
        }

        static {
            b bVar = new b();
            zzc = bVar;
            N2.p(b.class, bVar);
        }

        @Override // com.google.android.gms.internal.measurement.N2
        public final Object n(int i10) {
            switch (C1802e1.f25684a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(zzc);
                case 3:
                    return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", C1865n1.f25801a, "zzg", C1858m1.f25797a});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1942y3<b> cVar = zzd;
                    if (cVar == null) {
                        synchronized (b.class) {
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

        public final zzd v() {
            zzd zzdVar;
            int i10 = this.zzg;
            zzd zzdVar2 = zzd.CONSENT_STATUS_UNSPECIFIED;
            if (i10 == 0) {
                zzdVar = zzdVar2;
            } else if (i10 != 1) {
                zzdVar = i10 != 2 ? null : zzd.DENIED;
            } else {
                zzdVar = zzd.GRANTED;
            }
            return zzdVar == null ? zzdVar2 : zzdVar;
        }

        public final zze w() {
            zze zzeVarA = zze.a(this.zzf);
            return zzeVarA == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarA;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class c extends N2<c, a> implements InterfaceC1908t3 {
        private static final c zzc;
        private static volatile InterfaceC1942y3<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
        public static final class a extends N2.a<c, a> implements InterfaceC1908t3 {
        }

        static {
            c cVar = new c();
            zzc = cVar;
            N2.p(c.class, cVar);
        }

        @Override // com.google.android.gms.internal.measurement.N2
        public final Object n(int i10) {
            switch (C1802e1.f25684a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(zzc);
                case 3:
                    C1865n1 c1865n1 = C1865n1.f25801a;
                    return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", c1865n1, "zzg", c1865n1});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1942y3<c> cVar = zzd;
                    if (cVar == null) {
                        synchronized (c.class) {
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

        public final zze v() {
            zze zzeVarA = zze.a(this.zzg);
            return zzeVarA == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarA;
        }

        public final zze w() {
            zze zzeVarA = zze.a(this.zzf);
            return zzeVarA == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarA;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class d extends N2<d, a> implements InterfaceC1908t3 {
        private static final d zzc;
        private static volatile InterfaceC1942y3<d> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
        public static final class a extends N2.a<d, a> implements InterfaceC1908t3 {
        }

        static {
            d dVar = new d();
            zzc = dVar;
            N2.p(d.class, dVar);
        }

        @Override // com.google.android.gms.internal.measurement.N2
        public final Object n(int i10) {
            switch (C1802e1.f25684a[i10 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(zzc);
                case 3:
                    return new D3(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1942y3<d> cVar = zzd;
                    if (cVar == null) {
                        synchronized (d.class) {
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
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zzd implements P2 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);

        private final int zzf;

        zzd(int i10) {
            this.zzf = i10;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zze implements P2 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);

        private final int zzh;

        zze(int i10) {
            this.zzh = i10;
        }

        public static zze a(int i10) {
            if (i10 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_STORAGE;
            }
            if (i10 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i10 == 3) {
                return AD_USER_DATA;
            }
            if (i10 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }
    }

    static {
        zzfn$zza zzfn_zza = new zzfn$zza();
        zzc = zzfn_zza;
        N2.p(zzfn$zza.class, zzfn_zza);
    }

    public zzfn$zza() {
        B3<Object> b10 = B3.f25402e;
        this.zzf = b10;
        this.zzg = b10;
        this.zzh = b10;
        this.zzj = b10;
    }

    public static zzfn$zza v() {
        return zzc;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1802e1.f25684a[i10 - 1]) {
            case 1:
                return new zzfn$zza();
            case 2:
                return new a(zzc);
            case 3:
                return new D3(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", d.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzfn$zza> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzfn$zza.class) {
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

    public final V2 w() {
        return this.zzh;
    }

    public final List<b> x() {
        return this.zzf;
    }

    public final List<c> y() {
        return this.zzg;
    }

    public final List<b> z() {
        return this.zzj;
    }
}
