package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends Q {
    public static U a(U u10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (u10.isDone()) {
            return u10;
        }
        X x10 = new X();
        x10.f26167i = u10;
        W w3 = new W();
        w3.f26163b = x10;
        x10.j = scheduledExecutorService.schedule(w3, 28500L, timeUnit);
        u10.b(w3, zzcp.f26343b);
        return x10;
    }
}
