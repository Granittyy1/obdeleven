package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1858m1 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1858m1 f25797a = new C1858m1();

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean c(int i10) {
        zzfn$zza.zzd zzdVar;
        if (i10 == 0) {
            zzdVar = zzfn$zza.zzd.CONSENT_STATUS_UNSPECIFIED;
        } else if (i10 != 1) {
            zzdVar = i10 != 2 ? null : zzfn$zza.zzd.DENIED;
        } else {
            zzdVar = zzfn$zza.zzd.GRANTED;
        }
        return zzdVar != null;
    }
}
