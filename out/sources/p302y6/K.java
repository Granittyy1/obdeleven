package p302y6;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractRunnableC2808d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f48333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f48334c;

    public K(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f48333b = executorService;
        this.f48334c = timeUnit;
    }

    @Override // p302y6.AbstractRunnableC2808d
    public final void a() {
        ExecutorService executorService = this.f48333b;
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f48334c)) {
                return;
            }
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            Log.isLoggable("FirebaseCrashlytics", 3);
            executorService.shutdownNow();
        }
    }
}
