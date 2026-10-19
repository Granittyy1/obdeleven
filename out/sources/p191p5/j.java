package p191p5;

import F6.a;
import U4.C0804l;
import android.os.Looper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public static <TResult> TResult a(g<TResult> gVar) throws ExecutionException, InterruptedException {
        C0804l.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        C0804l.i(gVar, "Task must not be null");
        if (gVar.n()) {
            return (TResult) h(gVar);
        }
        a aVar = new a(5);
        y yVar = i.f45813b;
        gVar.f(yVar, aVar);
        gVar.d(yVar, aVar);
        gVar.a(yVar, aVar);
        ((CountDownLatch) aVar.f3259c).await();
        return (TResult) h(gVar);
    }

    public static <TResult> TResult b(g<TResult> gVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C0804l.g("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        C0804l.i(gVar, "Task must not be null");
        C0804l.i(timeUnit, "TimeUnit must not be null");
        if (gVar.n()) {
            return (TResult) h(gVar);
        }
        a aVar = new a(5);
        y yVar = i.f45813b;
        gVar.f(yVar, aVar);
        gVar.d(yVar, aVar);
        gVar.a(yVar, aVar);
        if (((CountDownLatch) aVar.f3259c).await(j, timeUnit)) {
            return (TResult) h(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static B c(Callable callable, Executor executor) {
        C0804l.i(executor, "Executor must not be null");
        B b10 = new B();
        executor.execute(new L2.a(b10, callable));
        return b10;
    }

    public static B d(Exception exc) {
        B b10 = new B();
        b10.s(exc);
        return b10;
    }

    public static B e(Object obj) {
        B b10 = new B();
        b10.t(obj);
        return b10;
    }

    public static B f(List list) {
        if (list == null || list.isEmpty()) {
            return e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((g) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        B b10 = new B();
        l lVar = new l(list.size(), b10);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            g gVar = (g) it2.next();
            y yVar = i.f45813b;
            gVar.f(yVar, lVar);
            gVar.d(yVar, lVar);
            gVar.a(yVar, lVar);
        }
        return b10;
    }

    public static g<List<g<?>>> g(g<?>... gVarArr) {
        if (gVarArr.length == 0) {
            return e(Collections.emptyList());
        }
        List listAsList = Arrays.asList(gVarArr);
        z zVar = i.f45812a;
        if (listAsList == null || listAsList.isEmpty()) {
            return e(Collections.emptyList());
        }
        List list = listAsList;
        return f(list).i(zVar, new k(list));
    }

    public static Object h(g gVar) throws ExecutionException {
        if (gVar.o()) {
            return gVar.k();
        }
        if (gVar.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.j());
    }
}
