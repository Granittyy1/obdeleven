package p302y6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p191p5.g;
import p191p5.j;

/* JADX INFO: renamed from: y6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2818n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f48381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g<Void> f48382b = j.e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f48383c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Boolean> f48384d = new ThreadLocal<>();

    public C2818n(ExecutorService executorService) {
        this.f48381a = executorService;
        executorService.execute(new RunnableC2814j(this));
    }

    public final <T> g<T> a(Callable<T> callable) {
        g<T> gVar;
        synchronized (this.f48383c) {
            gVar = (g<T>) this.f48382b.g(this.f48381a, new C2816l(callable));
            this.f48382b = gVar.g(this.f48381a, new C2817m());
        }
        return gVar;
    }

    public final <T> g<T> b(Callable<g<T>> callable) {
        g<T> gVar;
        synchronized (this.f48383c) {
            gVar = (g<T>) this.f48382b.i(this.f48381a, new C2816l(callable));
            this.f48382b = gVar.g(this.f48381a, new C2817m());
        }
        return gVar;
    }
}
