package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1983l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2003s f26209a;

    static {
        AbstractC2003s c1980k;
        try {
            SystemClock.elapsedRealtimeNanos();
            c1980k = new C1977j();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c1980k = new C1980k();
        }
        f26209a = c1980k;
    }
}
