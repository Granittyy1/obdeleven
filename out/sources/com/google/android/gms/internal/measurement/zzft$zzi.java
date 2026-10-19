package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzft$zzi extends N2<zzft$zzi, a> implements InterfaceC1908t3 {
    private static final zzft$zzi zzc;
    private static volatile InterfaceC1942y3<zzft$zzi> zzd;
    private int zze;
    private V2<C1934x1> zzf = B3.f25402e;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public static final class a extends N2.a<zzft$zzi, a> implements InterfaceC1908t3 {
        public a() {
            super(zzft$zzi.zzc);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
    public enum zza implements P2 {
        SDK(0),
        SGTM(1);

        private final int zze;

        zza(int i10) {
            this.zze = i10;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }
    }

    static {
        zzft$zzi zzft_zzi = new zzft$zzi();
        zzc = zzft_zzi;
        N2.p(zzft$zzi.class, zzft_zzi);
    }

    public static void x(zzft$zzi zzft_zzi, C1934x1 c1934x1) {
        zzft_zzi.getClass();
        V2<C1934x1> v10 = zzft_zzi.zzf;
        if (!v10.y()) {
            zzft_zzi.zzf = N2.l(v10);
        }
        zzft_zzi.zzf.add(c1934x1);
    }

    public static void y(zzft$zzi zzft_zzi, String str) {
        zzft_zzi.getClass();
        str.getClass();
        zzft_zzi.zze |= 2;
        zzft_zzi.zzh = str;
    }

    public static a z() {
        return zzc.q();
    }

    public final List<C1934x1> B() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.N2
    public final Object n(int i10) {
        switch (C1872o1.f25806a[i10 - 1]) {
            case 1:
                return new zzft$zzi();
            case 2:
                return new a();
            case 3:
                return new D3(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C1934x1.class, "zzg", "zzh", "zzi", C1.f25408a});
            case 4:
                return zzc;
            case 5:
                InterfaceC1942y3<zzft$zzi> cVar = zzd;
                if (cVar == null) {
                    synchronized (zzft$zzi.class) {
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
        return this.zzf.size();
    }

    public final C1934x1 w() {
        return this.zzf.get(0);
    }
}
