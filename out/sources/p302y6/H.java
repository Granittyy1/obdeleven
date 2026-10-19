package p302y6;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.a;
import java.util.concurrent.atomic.AtomicBoolean;
import p264v6.c;

/* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2820p f48320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f48321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f48322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f48323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f48324e = new AtomicBoolean(false);

    public H(C2820p c2820p, a aVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c cVar) {
        this.f48320a = c2820p;
        this.f48321b = aVar;
        this.f48322c = uncaughtExceptionHandler;
        this.f48323d = cVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f48323d.b()) {
            return true;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f48322c;
        AtomicBoolean atomicBoolean = this.f48324e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f48320a.a(this.f48321b, thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            Log.isLoggable("FirebaseCrashlytics", 3);
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}
