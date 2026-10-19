package okhttp3;

import com.braze.support.BrazeLogger;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f45547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f45548c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45546a = 64;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<okhttp3.internal.connection.e.a> f45549d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<okhttp3.internal.connection.e.a> f45550e = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<okhttp3.internal.connection.e> f45551f = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f45548c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = p172nb.b.f45032g + " Dispatcher";
                kotlin.jvm.internal.i.e(name, "name");
                this.f45548c = new ThreadPoolExecutor(0, BrazeLogger.SUPPRESS, 60L, timeUnit, synchronousQueue, new p172nb.a(name, false));
            }
            threadPoolExecutor = this.f45548c;
            kotlin.jvm.internal.i.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f45547b;
            p293xa.r rVar = p293xa.r.f47939a;
        }
        if (d() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void c(okhttp3.internal.connection.e.a call) {
        kotlin.jvm.internal.i.e(call, "call");
        call.f45495c.decrementAndGet();
        b(this.f45550e, call);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    public final boolean d() {
        int size;
        int i10;
        int size2;
        okhttp3.internal.connection.e.a aVar;
        byte[] bArr = p172nb.b.f45026a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<okhttp3.internal.connection.e.a> it = this.f45549d.iterator();
                kotlin.jvm.internal.i.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    okhttp3.internal.connection.e.a next = it.next();
                    if (this.f45550e.size() >= this.f45546a) {
                        break;
                    }
                    if (next.f45495c.get() < 5) {
                        it.remove();
                        next.f45495c.incrementAndGet();
                        arrayList.add(next);
                        this.f45550e.add(next);
                    }
                }
                synchronized (this) {
                    size = this.f45550e.size() + this.f45551f.size();
                }
                size2 = arrayList.size();
                for (i10 = 0; i10 < size2; i10++) {
                    aVar = (okhttp3.internal.connection.e.a) arrayList.get(i10);
                    ExecutorService executorServiceA = a();
                    aVar.getClass();
                    okhttp3.internal.connection.e eVar = okhttp3.internal.connection.e.this;
                    k kVar = eVar.f45477b.f45611b;
                    byte[] bArr2 = p172nb.b.f45026a;
                    try {
                        try {
                            ((ThreadPoolExecutor) executorServiceA).execute(aVar);
                        } catch (RejectedExecutionException e10) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e10);
                            eVar.g(interruptedIOException);
                            aVar.f45494b.onFailure(eVar, interruptedIOException);
                            eVar.f45477b.f45611b.c(aVar);
                        }
                    } catch (Throwable th) {
                        eVar.f45477b.f45611b.c(aVar);
                        throw th;
                    }
                }
                return z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = size > 0;
        p293xa.r rVar = p293xa.r.f47939a;
        size2 = arrayList.size();
        while (i10 < size2) {
            aVar = (okhttp3.internal.connection.e.a) arrayList.get(i10);
            ExecutorService executorServiceA2 = a();
            aVar.getClass();
            okhttp3.internal.connection.e eVar2 = okhttp3.internal.connection.e.this;
            k kVar2 = eVar2.f45477b.f45611b;
            byte[] bArr3 = p172nb.b.f45026a;
            ((ThreadPoolExecutor) executorServiceA2).execute(aVar);
        }
        return z10;
    }
}
