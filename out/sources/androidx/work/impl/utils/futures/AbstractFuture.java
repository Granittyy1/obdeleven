package androidx.work.impl.utils.futures;

import com.braze.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFuture<V> implements p107i6.f<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20423e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f20424f = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f20426h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f20427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f20428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f20429d;

    public static final class Failure {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Failure f20430b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f20431a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            boolean z10 = AbstractFuture.f20423e;
            th.getClass();
            this.f20431a = th;
        }
    }

    public static abstract class a {
        public abstract boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f20432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f20433d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationException f20435b;

        static {
            if (AbstractFuture.f20423e) {
                f20433d = null;
                f20432c = null;
            } else {
                f20433d = new b(false, null);
                f20432c = new b(true, null);
            }
        }

        public b(boolean z10, CancellationException cancellationException) {
            this.f20434a = z10;
            this.f20435b = cancellationException;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f20436d = new c(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f20437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f20438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f20439c;

        public c(Runnable runnable, Executor executor) {
            this.f20437a = runnable;
            this.f20438b = executor;
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f20440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f20441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, g> f20442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, c> f20443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f20444e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f20440a = atomicReferenceFieldUpdater;
            this.f20441b = atomicReferenceFieldUpdater2;
            this.f20442c = atomicReferenceFieldUpdater3;
            this.f20443d = atomicReferenceFieldUpdater4;
            this.f20444e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20443d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == cVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20444e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20442c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == gVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            this.f20441b.lazySet(gVar, gVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            this.f20440a.lazySet(gVar, thread);
        }
    }

    public static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.work.impl.utils.futures.a f20445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p107i6.f<? extends V> f20446c;

        public e(androidx.work.impl.utils.futures.a aVar, p107i6.f fVar) {
            this.f20445b = aVar;
            this.f20446c = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20445b.f20427b != this) {
                return;
            }
            if (AbstractFuture.f20425g.b(this.f20445b, this, AbstractFuture.g(this.f20446c))) {
                AbstractFuture.d(this.f20445b);
            }
        }
    }

    public static final class f extends a {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f20428c != cVar) {
                        return false;
                    }
                    abstractFuture.f20428c = cVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f20427b != obj) {
                        return false;
                    }
                    abstractFuture.f20427b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f20429d != gVar) {
                        return false;
                    }
                    abstractFuture.f20429d = gVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f20449b = gVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f20448a = thread;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f20447c = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f20448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile g f20449b;

        public g() {
            AbstractFuture.f20425g.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, g.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f20425g = fVar;
        if (th != null) {
            f20424f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20426h = new Object();
    }

    public static void d(AbstractFuture<?> abstractFuture) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = abstractFuture.f20429d;
            if (f20425g.c(abstractFuture, gVar, g.f20447c)) {
                while (gVar != null) {
                    Thread thread = gVar.f20448a;
                    if (thread != null) {
                        gVar.f20448a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f20449b;
                }
                do {
                    cVar = abstractFuture.f20428c;
                } while (!f20425g.a(abstractFuture, cVar, c.f20436d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f20439c;
                    cVar3.f20439c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f20439c;
                    Runnable runnable = cVar2.f20437a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        abstractFuture = eVar.f20445b;
                        if (abstractFuture.f20427b == eVar) {
                            if (f20425g.b(abstractFuture, eVar, g(eVar.f20446c))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, cVar2.f20438b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f20424f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f20435b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f20431a);
        }
        if (obj == f20426h) {
            return null;
        }
        return obj;
    }

    public static Object g(p107i6.f<?> fVar) {
        if (fVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) fVar).f20427b;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (bVar.f20434a) {
                return bVar.f20435b != null ? new b(false, bVar.f20435b) : b.f20433d;
            }
            return obj;
        }
        boolean zIsCancelled = fVar.isCancelled();
        if ((!f20423e) && zIsCancelled) {
            return b.f20433d;
        }
        try {
            Object objH = h(fVar);
            return objH == null ? f20426h : objH;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new b(false, e10);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fVar, e10));
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static Object h(p107i6.f fVar) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = fVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @Override // p107i6.f
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f20428c;
        c cVar2 = c.f20436d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f20439c = cVar;
                if (f20425g.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f20428c;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.f20427b;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (f20423e) {
            bVar = new b(z10, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z10 ? b.f20432c : b.f20433d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f20425g.b(abstractFuture, obj, bVar)) {
                d(abstractFuture);
                if (!(obj instanceof e)) {
                    return true;
                }
                p107i6.f<? extends V> fVar = ((e) obj).f20446c;
                if (!(fVar instanceof AbstractFuture)) {
                    fVar.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) fVar;
                obj = abstractFuture.f20427b;
                if (!(obj == null) && !(obj instanceof e)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f20427b;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String i() {
        Object obj = this.f20427b;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            p107i6.f<? extends V> fVar = ((e) obj).f20446c;
            return Q8.d.a(sb2, fVar == this ? "this future" : String.valueOf(fVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20427b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f20427b;
        return (!(obj instanceof e)) & (obj != null);
    }

    public final void j(g gVar) {
        gVar.f20448a = null;
        while (true) {
            g gVar2 = this.f20429d;
            if (gVar2 == g.f20447c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f20449b;
                if (gVar2.f20448a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f20449b = gVar4;
                    if (gVar3.f20448a == null) {
                    }
                } else if (!f20425g.c(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f20427b instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e10) {
                strI = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                B6.c.f(sb2, "PENDING, info=[", strI, "]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20427b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return (V) f(obj2);
            }
            g gVar = this.f20429d;
            g gVar2 = g.f20447c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f20425g;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20427b;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) f(obj);
                    }
                    gVar = this.f20429d;
                } while (gVar != gVar2);
            }
            return (V) f(this.f20427b);
        }
        throw new InterruptedException();
    }
}
