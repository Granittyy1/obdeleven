package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2024z<V> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C<V> f26312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U<? extends V> f26313c;

    public RunnableC2024z(C c10, U u10) {
        this.f26312b = c10;
        this.f26313c = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26312b.f26139b != this) {
            return;
        }
        U<? extends V> u10 = this.f26313c;
        if (I.f26138h.f(this.f26312b, this, C.i(u10))) {
            C.l(this.f26312b);
        }
    }
}
