package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26178e;

    public b2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f26174a = atomicReferenceFieldUpdater;
        this.f26175b = atomicReferenceFieldUpdater2;
        this.f26176c = atomicReferenceFieldUpdater3;
        this.f26177d = atomicReferenceFieldUpdater4;
        this.f26178e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final void a(u2 u2Var, u2 u2Var2) {
        this.f26175b.lazySet(u2Var, u2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final void b(u2 u2Var, Thread thread) {
        this.f26174a.lazySet(u2Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean c(v2 v2Var, C2005s1 c2005s1, C2005s1 c2005s2) {
        return I.b.q(this.f26177d, v2Var, c2005s1, c2005s2);
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean d(v2 v2Var, Object obj, Object obj2) {
        return I.b.q(this.f26178e, v2Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean e(v2 v2Var, u2 u2Var, u2 u2Var2) {
        return I.b.q(this.f26176c, v2Var, u2Var, u2Var2);
    }
}
