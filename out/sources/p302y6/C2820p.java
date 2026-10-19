package p302y6;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: y6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2820p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f48385a;

    public C2820p(a aVar) {
        this.f48385a = aVar;
    }

    public final void a(com.google.firebase.crashlytics.internal.settings.a aVar, Thread thread, Throwable th) {
        a aVar2 = this.f48385a;
        synchronized (aVar2) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                Q.a(aVar2.f28086e.b(new r(aVar2, System.currentTimeMillis(), th, thread, aVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
