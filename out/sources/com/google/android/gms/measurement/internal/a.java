package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap<zziq.zza, zzai> f26541a;

    public a() {
        this.f26541a = new EnumMap<>(zziq.zza.class);
    }

    public static a a(String str) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        if (str.length() >= zziq.zza.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                zziq.zza[] zzaVarArrValues = zziq.zza.values();
                int length = zzaVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(zzaVarArrValues[i10], zzai.b(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new a(enumMap);
            }
        }
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(zziq.zza zzaVar, int i10) {
        zzai zzaiVar = zzai.UNSET;
        if (i10 == -30) {
            zzaiVar = zzai.TCF;
        } else if (i10 == -20) {
            zzaiVar = zzai.API;
        } else if (i10 == -10) {
            zzaiVar = zzai.MANIFEST;
        } else if (i10 == 0) {
            zzaiVar = zzai.API;
        } else if (i10 == 30) {
            zzaiVar = zzai.INITIALIZATION;
        }
        this.f26541a.put(zzaVar, zzaiVar);
    }

    public final void c(zziq.zza zzaVar, zzai zzaiVar) {
        this.f26541a.put(zzaVar, zzaiVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zziq.zza zzaVar : zziq.zza.values()) {
            zzai zzaiVar = this.f26541a.get(zzaVar);
            if (zzaiVar == null) {
                zzaiVar = zzai.UNSET;
            }
            sb2.append(zzaiVar.zzl);
        }
        return sb2.toString();
    }

    public a(EnumMap<zziq.zza, zzai> enumMap) {
        EnumMap<zziq.zza, zzai> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.f26541a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
