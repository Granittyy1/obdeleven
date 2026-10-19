package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1952a1 {
    public static final zzgf a(Object obj, Object obj2) {
        zzgf zzgfVarB = (zzgf) obj;
        zzgf zzgfVar = (zzgf) obj2;
        if (!zzgfVar.isEmpty()) {
            if (!zzgfVarB.e()) {
                zzgfVarB = zzgfVarB.b();
            }
            zzgfVarB.h();
            if (!zzgfVar.isEmpty()) {
                zzgfVarB.putAll(zzgfVar);
            }
        }
        return zzgfVarB;
    }
}
