package p276w6;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: BlockingAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a4.c f47761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f47762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47763d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f47764e;

    public c(p005a4.c cVar, TimeUnit timeUnit) {
        this.f47761b = cVar;
        this.f47762c = timeUnit;
    }

    @Override // p276w6.b
    public final void a(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f47764e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p276w6.a
    public final void c(Bundle bundle) {
        synchronized (this.f47763d) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f47764e = new CountDownLatch(1);
            this.f47761b.c(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (this.f47764e.await(500, this.f47762c)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f47764e = null;
        }
    }
}
