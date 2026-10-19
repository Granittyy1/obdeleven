package L2;

import K2.C0710c;
import K2.J;
import K2.x;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TimeLimiter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0710c f4460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f4461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4464e;

    public e(C0710c runnableScheduler, J j) {
        i.e(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f4460a = runnableScheduler;
        this.f4461b = j;
        this.f4462c = millis;
        this.f4463d = new Object();
        this.f4464e = new LinkedHashMap();
    }

    public final void a(x token) {
        Runnable runnable;
        i.e(token, "token");
        synchronized (this.f4463d) {
            runnable = (Runnable) this.f4464e.remove(token);
        }
        if (runnable != null) {
            this.f4460a.a(runnable);
        }
    }

    public final void b(x xVar) {
        d dVar = new d(this, 0, xVar);
        synchronized (this.f4463d) {
        }
        this.f4460a.c(dVar, this.f4462c);
    }
}
