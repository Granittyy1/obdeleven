package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
import p131k5.C2553q;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f26542f = new b((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f26545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap<zziq.zza, zzip> f26547e;

    public b(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<zziq.zza, zzip> enumMap = new EnumMap<>(zziq.zza.class);
        this.f26547e = enumMap;
        enumMap.put(zziq.zza.AD_USER_DATA, bool == null ? zzip.f26641b : bool.booleanValue() ? zzip.f26644e : zzip.f26643d);
        this.f26543a = i10;
        this.f26544b = e();
        this.f26545c = bool2;
        this.f26546d = str;
    }

    public static b a(int i10, Bundle bundle) {
        if (bundle == null) {
            return new b((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        for (zziq.zza zzaVar : zzir.DMA.b()) {
            enumMap.put(zzaVar, zziq.c(bundle.getString(zzaVar.zze)));
        }
        return new b((EnumMap<zziq.zza, zzip>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static b b(String str) {
        if (str == null || str.length() <= 0) {
            return f26542f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        zziq.zza[] zzaVarArrB = zzir.DMA.b();
        int length = zzaVarArrB.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(zzaVarArrB[i12], zziq.b(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new b((EnumMap<zziq.zza, zzip>) enumMap, i10, (Boolean) null, (String) null);
    }

    public static Boolean c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i10 = C2553q.f42407a[zziq.c(bundle.getString("ad_personalization")).ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final zzip d() {
        zzip zzipVar = this.f26547e.get(zziq.zza.AD_USER_DATA);
        return zzipVar == null ? zzip.f26641b : zzipVar;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26543a);
        for (zziq.zza zzaVar : zzir.DMA.b()) {
            sb2.append(":");
            sb2.append(zziq.a(this.f26547e.get(zzaVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26544b.equalsIgnoreCase(bVar.f26544b) && Objects.equals(this.f26545c, bVar.f26545c)) {
            return Objects.equals(this.f26546d, bVar.f26546d);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f26545c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f26546d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i10 * 29) + this.f26544b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zziq.g(this.f26543a));
        for (zziq.zza zzaVar : zzir.DMA.b()) {
            sb2.append(",");
            sb2.append(zzaVar.zze);
            sb2.append("=");
            zzip zzipVar = this.f26547e.get(zzaVar);
            if (zzipVar == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = C2553q.f42407a[zzipVar.ordinal()];
                if (i10 == 1) {
                    sb2.append("uninitialized");
                } else if (i10 == 2) {
                    sb2.append("default");
                } else if (i10 == 3) {
                    sb2.append("denied");
                } else if (i10 == 4) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f26545c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f26546d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public b(EnumMap<zziq.zza, zzip> enumMap, int i10, Boolean bool, String str) {
        EnumMap<zziq.zza, zzip> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.f26547e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26543a = i10;
        this.f26544b = e();
        this.f26545c = bool;
        this.f26546d = str;
    }
}
