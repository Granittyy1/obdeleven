package com.google.android.gms.internal.play_billing;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<H, Thread> f26118a = AtomicReferenceFieldUpdater.newUpdater(H.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<H, H> f26119b = AtomicReferenceFieldUpdater.newUpdater(H.class, H.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super I<?>, H> f26120c = AtomicReferenceFieldUpdater.newUpdater(I.class, H.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super I<?>, A> f26121d = AtomicReferenceFieldUpdater.newUpdater(I.class, A.class, "c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super I<?>, Object> f26122e = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "b");

    @Override // com.google.android.gms.internal.play_billing.D
    public final A a(C c10, A a10) {
        return f26121d.getAndSet(c10, a10);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final H b(C c10) {
        return f26120c.getAndSet(c10, H.f26132c);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void c(H h8, H h10) {
        f26119b.lazySet(h8, h10);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void d(H h8, Thread thread) {
        f26118a.lazySet(h8, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean e(C c10, A a10, A a11) {
        return J.a(f26121d, c10, a10, a11);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean f(I i10, Object obj, Object obj2) {
        return J.a(f26122e, i10, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean g(I i10, H h8, H h10) {
        return J.a(f26120c, i10, h8, h10);
    }
}
