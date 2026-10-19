package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1 f25408a = new C1();

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean c(int i10) {
        zzft$zzi.zza zzaVar;
        if (i10 != 0) {
            zzaVar = i10 != 1 ? null : zzft$zzi.zza.SGTM;
        } else {
            zzaVar = zzft$zzi.zza.SDK;
        }
        return zzaVar != null;
    }
}
