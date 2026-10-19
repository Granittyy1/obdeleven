package p302y6;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f48403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Thread f48404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f48405e;

    public x(a aVar, long j, Throwable th, Thread thread) {
        this.f48405e = aVar;
        this.f48402b = j;
        this.f48403c = th;
        this.f48404d = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f48405e;
        H h8 = aVar.f28094n;
        if (h8 == null || !h8.f48324e.get()) {
            long j = this.f48402b / 1000;
            String strE = aVar.e();
            if (strE == null) {
                return;
            }
            O o10 = aVar.f28093m;
            o10.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            o10.e(this.f48403c, this.f48404d, strE, "error", j, false);
        }
    }
}
