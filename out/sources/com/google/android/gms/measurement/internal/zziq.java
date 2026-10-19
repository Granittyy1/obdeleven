package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zziq f26646c = new zziq(100, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap<zza, zzip> f26647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26648b;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public zziq(EnumMap<zza, zzip> enumMap, int i10) {
        EnumMap<zza, zzip> enumMap2 = new EnumMap<>(zza.class);
        this.f26647a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26648b = i10;
    }

    public static char a(zzip zzipVar) {
        if (zzipVar == null) {
            return '-';
        }
        int iOrdinal = zzipVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static zzip b(char c10) {
        if (c10 == '+') {
            return zzip.f26642c;
        }
        if (c10 != '0') {
            return c10 != '1' ? zzip.f26641b : zzip.f26644e;
        }
        return zzip.f26643d;
    }

    public static zzip c(String str) {
        zzip zzipVar = zzip.f26641b;
        if (str == null) {
            return zzipVar;
        }
        if (str.equals("granted")) {
            return zzip.f26644e;
        }
        return str.equals("denied") ? zzip.f26643d : zzipVar;
    }

    public static zziq d(int i10, Bundle bundle) {
        if (bundle == null) {
            return new zziq(i10, null, null);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzir.STORAGE.zzd) {
            enumMap.put(zzaVar, c(bundle.getString(zzaVar.zze)));
        }
        return new zziq(enumMap, i10);
    }

    public static zziq e(int i10, String str) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrB = zzir.STORAGE.b();
        for (int i11 = 0; i11 < zzaVarArrB.length; i11++) {
            zza zzaVar = zzaVarArrB[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put(zzaVar, b(str.charAt(i12)));
            } else {
                enumMap.put(zzaVar, zzip.f26641b);
            }
        }
        return new zziq(enumMap, i10);
    }

    public static String g(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static boolean h(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        for (zza zzaVar : zzir.STORAGE.zzd) {
            if (this.f26647a.get(zzaVar) != zziqVar.f26647a.get(zzaVar)) {
                return false;
            }
        }
        return this.f26648b == zziqVar.f26648b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public final zziq f(zziq zziqVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzir.STORAGE.zzd) {
            zzip zzipVar = this.f26647a.get(zzaVar);
            zzip zzipVar2 = zziqVar.f26647a.get(zzaVar);
            if (zzipVar == null) {
                zzipVar = zzipVar2;
            } else if (zzipVar2 != null) {
                zzip zzipVar3 = zzip.f26641b;
                if (zzipVar == zzipVar3) {
                    zzipVar = zzipVar2;
                } else if (zzipVar2 != zzipVar3) {
                    zzip zzipVar4 = zzip.f26642c;
                    if (zzipVar == zzipVar4) {
                        zzipVar = zzipVar2;
                    } else if (zzipVar2 != zzipVar4) {
                        zzip zzipVar5 = zzip.f26643d;
                        zzipVar = (zzipVar == zzipVar5 || zzipVar2 == zzipVar5) ? zzipVar5 : zzip.f26644e;
                    }
                }
            }
            if (zzipVar != null) {
                enumMap.put(zzaVar, zzipVar);
            }
        }
        return new zziq(enumMap, 100);
    }

    public final int hashCode() {
        int iHashCode = this.f26648b * 17;
        Iterator<zzip> it = this.f26647a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final boolean i(zza zzaVar) {
        return this.f26647a.get(zzaVar) != zzip.f26643d;
    }

    public final zziq j(zziq zziqVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzir.STORAGE.zzd) {
            zzip zzipVar = this.f26647a.get(zzaVar);
            if (zzipVar == zzip.f26641b) {
                zzipVar = zziqVar.f26647a.get(zzaVar);
            }
            if (zzipVar != null) {
                enumMap.put(zzaVar, zzipVar);
            }
        }
        return new zziq(enumMap, this.f26648b);
    }

    public final boolean k(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzip zzipVar = this.f26647a.get(zzaVar);
            zzip zzipVar2 = zziqVar.f26647a.get(zzaVar);
            zzip zzipVar3 = zzip.f26643d;
            if (zzipVar == zzipVar3 && zzipVar2 != zzipVar3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean l() {
        zzip zzipVar = this.f26647a.get(zza.AD_STORAGE);
        if (zzipVar == null) {
            return null;
        }
        int iOrdinal = zzipVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean m() {
        zzip zzipVar = this.f26647a.get(zza.ANALYTICS_STORAGE);
        if (zzipVar == null) {
            return null;
        }
        int iOrdinal = zzipVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String n() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (zza zzaVar : zzir.STORAGE.b()) {
            zzip zzipVar = this.f26647a.get(zzaVar);
            char c10 = '-';
            if (zzipVar != null && (iOrdinal = zzipVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String o() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (zza zzaVar : zzir.STORAGE.b()) {
            sb2.append(a(this.f26647a.get(zzaVar)));
        }
        return sb2.toString();
    }

    public final boolean p() {
        return i(zza.ANALYTICS_STORAGE);
    }

    public final boolean q() {
        Iterator<zzip> it = this.f26647a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzip.f26641b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(g(this.f26648b));
        for (zza zzaVar : zzir.STORAGE.zzd) {
            sb2.append(",");
            sb2.append(zzaVar.zze);
            sb2.append("=");
            zzip zzipVar = this.f26647a.get(zzaVar);
            if (zzipVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = zzipVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("default");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        return sb2.toString();
    }

    public zziq(int i10, Boolean bool, Boolean bool2) {
        zzip zzipVar;
        EnumMap<zza, zzip> enumMap = new EnumMap<>(zza.class);
        this.f26647a = enumMap;
        zza zzaVar = zza.AD_STORAGE;
        zzip zzipVar2 = zzip.f26643d;
        zzip zzipVar3 = zzip.f26644e;
        zzip zzipVar4 = zzip.f26641b;
        if (bool == null) {
            zzipVar = zzipVar4;
        } else {
            zzipVar = bool.booleanValue() ? zzipVar3 : zzipVar2;
        }
        enumMap.put(zzaVar, zzipVar);
        zza zzaVar2 = zza.ANALYTICS_STORAGE;
        if (bool2 == null) {
            zzipVar2 = zzipVar4;
        } else if (bool2.booleanValue()) {
            zzipVar2 = zzipVar3;
        }
        enumMap.put(zzaVar2, zzipVar2);
        this.f26648b = i10;
    }
}
