package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X f26163b;

    @Override // java.lang.Runnable
    public final void run() {
        U u10;
        zzcj$zzc zzcj_zzc;
        X x10 = this.f26163b;
        if (x10 == null || (u10 = x10.f26167i) == null) {
            return;
        }
        this.f26163b = null;
        if (u10.isDone()) {
            Object obj = x10.f26139b;
            if (obj == null) {
                if (u10.isDone()) {
                    if (I.f26138h.f(x10, null, C.i(u10))) {
                        C.l(x10);
                        return;
                    }
                    return;
                }
                RunnableC2024z runnableC2024z = new RunnableC2024z(x10, u10);
                if (I.f26138h.f(x10, null, runnableC2024z)) {
                    try {
                        u10.b(runnableC2024z, zzcp.f26343b);
                        return;
                    } catch (Throwable th) {
                        try {
                            zzcj_zzc = new zzcj$zzc(th);
                        } catch (Error | Exception unused) {
                            zzcj_zzc = zzcj$zzc.f26340b;
                        }
                        I.f26138h.f(x10, runnableC2024z, zzcj_zzc);
                        return;
                    }
                }
                obj = x10.f26139b;
            }
            if (obj instanceof C2021y) {
                u10.cancel(((C2021y) obj).f26307a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = x10.j;
            x10.j = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (I.f26138h.f(x10, null, new zzcj$zzc(new zzdc(str)))) {
                        C.l(x10);
                    }
                    throw th2;
                }
            }
            if (I.f26138h.f(x10, null, new zzcj$zzc(new zzdc(str + ": " + u10.toString())))) {
                C.l(x10);
            }
            u10.cancel(true);
        } catch (Throwable th3) {
            u10.cancel(true);
            throw th3;
        }
    }
}
