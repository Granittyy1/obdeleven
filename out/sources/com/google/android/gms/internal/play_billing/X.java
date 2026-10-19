package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class X extends N {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U f26167i;
    public ScheduledFuture j;

    @Override // com.google.android.gms.internal.play_billing.C
    public final String f() {
        U u10 = this.f26167i;
        ScheduledFuture scheduledFuture = this.j;
        if (u10 == null) {
            return null;
        }
        String strB = androidx.compose.foundation.gestures.d.b("inputFuture=[", u10.toString(), "]");
        if (scheduledFuture == null) {
            return strB;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strB;
        }
        return strB + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final void g() {
        U u10 = this.f26167i;
        if ((this.f26139b instanceof C2021y) & (u10 != null)) {
            Object obj = this.f26139b;
            u10.cancel((obj instanceof C2021y) && ((C2021y) obj).f26307a);
        }
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f26167i = null;
        this.j = null;
    }
}
