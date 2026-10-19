package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q1 implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q1 f26152a = new Q1();

    @Override // com.google.android.gms.internal.play_billing.L0
    public final boolean c(int i10) {
        zzil zzilVar;
        if (i10 == 0) {
            zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            zzilVar = i10 != 3 ? null : zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzilVar != null;
    }
}
