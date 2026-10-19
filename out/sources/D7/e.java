package D7;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p191p5.B;
import p191p5.InterfaceC2756b;

/* JADX INFO: compiled from: ConfigCacheClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f2832d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p188p2.b f2833e = new p188p2.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B f2836c = null;

    /* JADX INFO: compiled from: ConfigCacheClient.java */
    public static class a<TResult> implements p191p5.e<TResult>, p191p5.d, InterfaceC2756b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f2837b = new CountDownLatch(1);

        @Override // p191p5.InterfaceC2756b
        public final void b() {
            this.f2837b.countDown();
        }

        @Override // p191p5.d
        public final void d(Exception exc) {
            this.f2837b.countDown();
        }

        @Override // p191p5.e
        public final void onSuccess(TResult tresult) {
            this.f2837b.countDown();
        }
    }

    public e(Executor executor, o oVar) {
        this.f2834a = executor;
        this.f2835b = oVar;
    }

    public static Object a(p191p5.g gVar, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        a aVar = new a();
        Executor executor = f2833e;
        gVar.f(executor, aVar);
        gVar.d(executor, aVar);
        gVar.a(executor, aVar);
        if (!aVar.f2837b.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (gVar.o()) {
            return gVar.k();
        }
        throw new ExecutionException(gVar.j());
    }

    public final synchronized p191p5.g<com.google.firebase.remoteconfig.internal.b> b() {
        try {
            B b10 = this.f2836c;
            if (b10 == null || (b10.n() && !this.f2836c.o())) {
                this.f2836c = p191p5.j.c(new b(0, this.f2835b), this.f2834a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2836c;
    }

    public final com.google.firebase.remoteconfig.internal.b c() {
        synchronized (this) {
            try {
                B b10 = this.f2836c;
                if (b10 == null || !b10.o()) {
                    try {
                        return (com.google.firebase.remoteconfig.internal.b) a(b(), TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        return null;
                    }
                }
                return (com.google.firebase.remoteconfig.internal.b) this.f2836c.k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p191p5.g<com.google.firebase.remoteconfig.internal.b> d(com.google.firebase.remoteconfig.internal.b bVar) {
        c cVar = new c(this, 0, bVar);
        Executor executor = this.f2834a;
        return p191p5.j.c(cVar, executor).p(executor, new d(this, bVar));
    }
}
