package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1795d1 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1795d1 f25675a = new C1795d1();

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean c(int i10) {
        zzfh$zzf.zza zzaVar;
        switch (i10) {
            case 0:
                zzaVar = zzfh$zzf.zza.UNKNOWN_MATCH_TYPE;
                break;
            case 1:
                zzaVar = zzfh$zzf.zza.REGEXP;
                break;
            case 2:
                zzaVar = zzfh$zzf.zza.BEGINS_WITH;
                break;
            case 3:
                zzaVar = zzfh$zzf.zza.ENDS_WITH;
                break;
            case 4:
                zzaVar = zzfh$zzf.zza.PARTIAL;
                break;
            case 5:
                zzaVar = zzfh$zzf.zza.EXACT;
                break;
            case 6:
                zzaVar = zzfh$zzf.zza.IN_LIST;
                break;
            default:
                zzaVar = null;
                break;
        }
        return zzaVar != null;
    }
}
