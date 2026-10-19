package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1990n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1990n0 f26223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1990n0 f26224c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f26225a;

    static {
        if (v2.f26286e) {
            f26224c = null;
            f26223b = null;
        } else {
            f26224c = new C1990n0(null);
            f26223b = new C1990n0(null);
        }
    }

    public C1990n0(CancellationException cancellationException) {
        this.f26225a = cancellationException;
    }
}
