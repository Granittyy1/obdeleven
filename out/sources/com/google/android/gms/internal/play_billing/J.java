package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, I i10, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(i10) != obj && atomicReferenceFieldUpdater.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
