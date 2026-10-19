package p302y6;

import D6.f;
import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p191p5.g;
import p191p5.j;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Callable<g<Void>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f48389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Thread f48390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f48391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.a f48392f;

    public r(com.google.firebase.crashlytics.internal.common.a aVar, long j, Throwable th, Thread thread, a aVar2) {
        this.f48392f = aVar;
        this.f48388b = j;
        this.f48389c = th;
        this.f48390d = thread;
        this.f48391e = aVar2;
    }

    @Override // java.util.concurrent.Callable
    public final g<Void> call() throws Exception {
        long j = this.f48388b;
        long j10 = j / 1000;
        com.google.firebase.crashlytics.internal.common.a aVar = this.f48392f;
        String strE = aVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return j.e(null);
        }
        aVar.f28084c.d();
        O o10 = aVar.f28093m;
        o10.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        o10.e(this.f48389c, this.f48390d, strE, "crash", j10, true);
        try {
            f fVar = aVar.f28088g;
            String str = ".ae" + j;
            fVar.getClass();
            if (!new File(fVar.f2815b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException unused) {
        }
        a aVar2 = this.f48391e;
        aVar.c(false, aVar2);
        new C2810f(aVar.f28087f);
        com.google.firebase.crashlytics.internal.common.a.a(aVar, C2810f.f48370b, Boolean.FALSE);
        if (!aVar.f28083b.a()) {
            return j.e(null);
        }
        ExecutorService executorService = aVar.f28086e.f48381a;
        return aVar2.f28110i.get().f45811a.p(executorService, new C2821q(this, executorService, strE));
    }
}
