package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class E1 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E1 f25436a = new E1();

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean c(int i10) {
        zzft$zzk.zzb zzbVar;
        if (i10 != 1) {
            zzbVar = i10 != 2 ? null : zzft$zzk.zzb.PROVISIONING;
        } else {
            zzbVar = zzft$zzk.zzb.RADS;
        }
        return zzbVar != null;
    }
}
