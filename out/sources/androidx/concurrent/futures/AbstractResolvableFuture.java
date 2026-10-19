package androidx.concurrent.futures;

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
public abstract class AbstractResolvableFuture<V> implements p107i6.f<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f15845e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f15846f = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f15848h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f15849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f15850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f15851d;

    public static final class Failure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f15852a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));
        }

        public Failure(Throwable th) {
            boolean z10 = AbstractResolvableFuture.f15845e;
            th.getClass();
            this.f15852a = th;
        }
    }

    public static abstract class a {
        public abstract boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f15854d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f15855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationException f15856b;

        static {
            if (AbstractResolvableFuture.f15845e) {
                f15854d = null;
                f15853c = null;
            } else {
                f15854d = new b(false, null);
                f15853c = new b(true, null);
            }
        }

        public b(boolean z10, CancellationException cancellationException) {
            this.f15855a = z10;
            this.f15856b = cancellationException;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f15857d = new c(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f15858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f15859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f15860c;

        public c(Runnable runnable, Executor executor) {
            this.f15858a = runnable;
            this.f15859b = executor;
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f15861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f15862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> f15863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> f15864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f15865e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f15861a = atomicReferenceFieldUpdater;
            this.f15862b = atomicReferenceFieldUpdater2;
            this.f15863c = atomicReferenceFieldUpdater3;
            this.f15864d = atomicReferenceFieldUpdater4;
            this.f15865e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15864d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == cVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15865e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15863c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == gVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            this.f15862b.lazySet(gVar, gVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            this.f15861a.lazySet(gVar, thread);
        }
    }

    public static final class e<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class f extends a {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f15850c != cVar) {
                        return false;
                    }
                    abstractResolvableFuture.f15850c = cVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f15849b != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f15849b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f15851d != gVar) {
                        return false;
                    }
                    abstractResolvableFuture.f15851d = gVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f15868b = gVar2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f15867a = thread;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f15866c = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f15867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile g f15868b;

        public g() {
            AbstractResolvableFuture.f15847g.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, g.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f15847g = fVar;
        if (th != null) {
            f15846f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15848h = new Object();
    }

    public static void e(AbstractResolvableFuture<?> abstractResolvableFuture) {
        g gVar;
        c cVar;
        do {
            gVar = abstractResolvableFuture.f15851d;
        } while (!f15847g.c(abstractResolvableFuture, gVar, g.f15866c));
        while (gVar != null) {
            Thread thread = gVar.f15867a;
            if (thread != null) {
                gVar.f15867a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f15868b;
        }
        abstractResolvableFuture.d();
        do {
            cVar = abstractResolvableFuture.f15850c;
        } while (!f15847g.a(abstractResolvableFuture, cVar, c.f15857d));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f15860c;
            cVar.f15860c = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            c cVar4 = cVar2.f15860c;
            Runnable runnable = cVar2.f15858a;
            if (runnable instanceof e) {
                ((e) runnable).getClass();
                throw null;
            }
            f(runnable, cVar2.f15859b);
            cVar2 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f15846f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).f15856b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f15852a);
        }
        if (obj == f15848h) {
            return null;
        }
        return obj;
    }

    public static Object h(AbstractResolvableFuture abstractResolvableFuture) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = abstractResolvableFuture.get();
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
        return obj;
    }

    @Override // p107i6.f
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f15850c;
        c cVar2 = c.f15857d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f15860c = cVar;
                if (f15847g.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f15850c;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
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
        Object obj = this.f15849b;
        if ((obj == null) | (obj instanceof e)) {
            if (f15845e) {
                bVar = new b(z10, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z10 ? b.f15853c : b.f15854d;
            }
            while (!f15847g.b(this, obj, bVar)) {
                obj = this.f15849b;
                if (!(obj instanceof e)) {
                }
            }
            e(this);
            if (!(obj instanceof e)) {
                return true;
            }
            ((e) obj).getClass();
            throw null;
        }
        return false;
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
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        Object obj = this.f15849b;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((e) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15849b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f15849b;
        return (!(obj instanceof e)) & (obj != null);
    }

    public final void j(g gVar) {
        gVar.f15867a = null;
        while (true) {
            g gVar2 = this.f15851d;
            if (gVar2 == g.f15866c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f15868b;
                if (gVar2.f15867a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f15868b = gVar4;
                    if (gVar3.f15867a == null) {
                    }
                } else if (!f15847g.c(this, gVar2, gVar4)) {
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean k(V v10) {
        if (v10 == null) {
            v10 = (V) f15848h;
        }
        if (!f15847g.b(this, null, v10)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f15847g.b(this, null, new Failure(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f15849b instanceof b) {
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

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15849b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return (V) g(obj2);
            }
            g gVar = this.f15851d;
            g gVar2 = g.f15866c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f15847g;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15849b;
                            } else {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) g(obj);
                    }
                    gVar = this.f15851d;
                } while (gVar != gVar2);
            }
            return (V) g(this.f15849b);
        }
        throw new InterruptedException();
    }
}
