package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2021y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2021y f26305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2021y f26306d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RuntimeException f26308b;

    static {
        if (I.f26137g) {
            f26306d = null;
            f26305c = null;
        } else {
            f26306d = new C2021y(false, null);
            f26305c = new C2021y(true, null);
        }
    }

    public C2021y(boolean z10, RuntimeException runtimeException) {
        this.f26307a = z10;
        this.f26308b = runtimeException;
    }
}
