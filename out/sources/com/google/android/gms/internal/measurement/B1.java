package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B1 f25400a = new B1();

    @Override // com.google.android.gms.internal.measurement.R2
    public final boolean c(int i10) {
        zzfv zzfvVar;
        if (i10 == 0) {
            zzfvVar = zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        } else if (i10 == 1) {
            zzfvVar = zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        } else if (i10 == 2) {
            zzfvVar = zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        } else if (i10 == 3) {
            zzfvVar = zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        } else if (i10 != 4) {
            zzfvVar = i10 != 5 ? null : zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
        } else {
            zzfvVar = zzfv.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        return zzfvVar != null;
    }
}
