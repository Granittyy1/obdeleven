package com.google.common.util.concurrent;

import A8.p;
import com.braze.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFuture<V> extends p119j6.a implements p107i6.f<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f28013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p107i6.e f28014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f28016h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f28017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f28018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f28019d;

    public static final class Failure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f28020a;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1, reason: invalid class name */
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
            th.getClass();
            this.f28020a = th;
        }
    }

    public static abstract class a {
        public abstract boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        public abstract c d(AbstractFuture<?> abstractFuture, c cVar);

        public abstract h e(AbstractFuture abstractFuture);

        public abstract void f(h hVar, h hVar2);

        public abstract void g(h hVar, Thread thread);
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f28021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f28022c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RuntimeException f28023a;

        static {
            if (AbstractFuture.f28013e) {
                f28022c = null;
                f28021b = null;
            } else {
                f28022c = new b(false, null);
                f28021b = new b(true, null);
            }
        }

        public b(boolean z10, RuntimeException runtimeException) {
            this.f28023a = runtimeException;
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f28028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f28029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super AbstractFuture<?>, h> f28030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super AbstractFuture<?>, c> f28031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super AbstractFuture<?>, Object> f28032e;

        public d(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super AbstractFuture<?>, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super AbstractFuture<?>, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super AbstractFuture<?>, Object> atomicReferenceFieldUpdater5) {
            this.f28028a = atomicReferenceFieldUpdater;
            this.f28029b = atomicReferenceFieldUpdater2;
            this.f28030c = atomicReferenceFieldUpdater3;
            this.f28031d = atomicReferenceFieldUpdater4;
            this.f28032e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<? super AbstractFuture<?>, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f28031d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == cVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super AbstractFuture<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f28032e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<? super AbstractFuture<?>, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f28030c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == hVar);
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final c d(AbstractFuture<?> abstractFuture, c cVar) {
            return this.f28031d.getAndSet(abstractFuture, cVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final h e(AbstractFuture abstractFuture) {
            return this.f28030c.getAndSet(abstractFuture, h.f28039c);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void f(h hVar, h hVar2) {
            this.f28029b.lazySet(hVar, hVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void g(h hVar, Thread thread) {
            this.f28028a.lazySet(hVar, thread);
        }
    }

    public static final class e<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class f extends a {
        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f28018c != cVar) {
                        return false;
                    }
                    abstractFuture.f28018c = cVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f28017b != obj) {
                        return false;
                    }
                    abstractFuture.f28017b = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f28019d != hVar) {
                        return false;
                    }
                    abstractFuture.f28019d = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final c d(AbstractFuture<?> abstractFuture, c cVar) {
            c cVar2;
            synchronized (abstractFuture) {
                cVar2 = abstractFuture.f28018c;
                if (cVar2 != cVar) {
                    abstractFuture.f28018c = cVar;
                }
            }
            return cVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final h e(AbstractFuture abstractFuture) {
            h hVar;
            h hVar2 = h.f28039c;
            synchronized (abstractFuture) {
                hVar = abstractFuture.f28019d;
                if (hVar != hVar2) {
                    abstractFuture.f28019d = hVar2;
                }
            }
            return hVar;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void f(h hVar, h hVar2) {
            hVar.f28041b = hVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void g(h hVar, Thread thread) {
            hVar.f28040a = thread;
        }
    }

    public static final class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f28033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f28034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f28035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f28036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f28037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f28038f;

        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f28035c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE));
                f28034b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("c"));
                f28036d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                f28037e = unsafe.objectFieldOffset(h.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
                f28038f = unsafe.objectFieldOffset(h.class.getDeclaredField("b"));
                f28033a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            return p107i6.b.a(f28033a, abstractFuture, f28034b, cVar, cVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return p107i6.c.a(f28033a, abstractFuture, f28036d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            return p107i6.a.a(f28033a, abstractFuture, f28035c, hVar, hVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final c d(AbstractFuture<?> abstractFuture, c cVar) {
            c cVar2;
            do {
                cVar2 = abstractFuture.f28018c;
                if (cVar == cVar2) {
                    return cVar2;
                }
            } while (!a(abstractFuture, cVar2, cVar));
            return cVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final h e(AbstractFuture abstractFuture) {
            h hVar;
            h hVar2 = h.f28039c;
            do {
                hVar = abstractFuture.f28019d;
                if (hVar2 == hVar) {
                    return hVar;
                }
            } while (!c(abstractFuture, hVar, hVar2));
            return hVar;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void f(h hVar, h hVar2) {
            f28033a.putObject(hVar, f28038f, hVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.a
        public final void g(h hVar, Thread thread) {
            f28033a.putObject(hVar, f28037e, thread);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f28039c = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f28040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile h f28041b;

        public h() {
            AbstractFuture.f28015g.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        a fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f28013e = z10;
        f28014f = new p107i6.e();
        Throwable th = null;
        try {
            fVar = new g();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                fVar = new d(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, c.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Error | Exception e11) {
                th = e11;
                fVar = new f();
            }
        }
        f28015g = fVar;
        if (th != null) {
            p107i6.e eVar = f28014f;
            Logger loggerA = eVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            eVar.a().log(level, "SafeAtomicHelper is broken!", th);
        }
        f28016h = new Object();
    }

    public static void e(AbstractFuture<?> abstractFuture, boolean z10) {
        abstractFuture.getClass();
        for (h hVarE = f28015g.e(abstractFuture); hVarE != null; hVarE = hVarE.f28041b) {
            Thread thread = hVarE.f28040a;
            if (thread != null) {
                hVarE.f28040a = null;
                LockSupport.unpark(thread);
            }
        }
        if (z10) {
            abstractFuture.i();
        }
        c cVarD = f28015g.d(abstractFuture, c.f28024d);
        c cVar = null;
        while (cVarD != null) {
            c cVar2 = cVarD.f28027c;
            cVarD.f28027c = cVar;
            cVar = cVarD;
            cVarD = cVar2;
        }
        while (cVar != null) {
            c cVar3 = cVar.f28027c;
            Runnable runnable = cVar.f28025a;
            Objects.requireNonNull(runnable);
            if (runnable instanceof e) {
                throw null;
            }
            Executor executor = cVar.f28026b;
            Objects.requireNonNull(executor);
            f(runnable, executor);
            cVar = cVar3;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f28014f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            RuntimeException runtimeException = ((b) obj).f28023a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f28020a);
        }
        if (obj == f28016h) {
            return null;
        }
        return obj;
    }

    public static Object h(AbstractFuture abstractFuture) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = abstractFuture.get();
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
        c cVar;
        p.j(executor, "Executor was null.");
        if (!isDone() && (cVar = this.f28018c) != c.f28024d) {
            c cVar2 = new c(runnable, executor);
            do {
                cVar2.f28027c = cVar;
                if (f28015g.a(this, cVar, cVar2)) {
                    return;
                } else {
                    cVar = this.f28018c;
                }
            } while (cVar != c.f28024d);
        }
        f(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            d(sb2, objH);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.f28017b;
        if ((obj == null) | (obj instanceof e)) {
            if (f28013e) {
                bVar = new b(z10, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z10 ? b.f28021b : b.f28022c;
                Objects.requireNonNull(bVar);
            }
            while (!f28015g.b(this, obj, bVar)) {
                obj = this.f28017b;
                if (!(obj instanceof e)) {
                }
            }
            e(this, z10);
            if (!(obj instanceof e)) {
                return true;
            }
            ((e) obj).getClass();
            throw null;
        }
        return false;
    }

    public final void d(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4 A[EDGE_INSN: B:56:0x00b4->B:36:0x007d BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f28017b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f28017b;
        return (!(obj instanceof e)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(h hVar) {
        hVar.f28040a = null;
        while (true) {
            h hVar2 = this.f28019d;
            if (hVar2 == h.f28039c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f28041b;
                if (hVar2.f28040a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f28041b = hVar4;
                    if (hVar3.f28040a == null) {
                    }
                } else if (!f28015g.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f28017b instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f28017b;
            String str = null;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                ((e) obj).getClass();
                try {
                    sb2.append((Object) null);
                } catch (Exception | StackOverflowError e10) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e10.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    String strJ = j();
                    if (!Cb.a.m(strJ)) {
                        str = strJ;
                    }
                } catch (Exception | StackOverflowError e11) {
                    str = "Exception thrown from implementation: " + e11.getClass();
                }
                if (str != null) {
                    B6.c.f(sb2, ", info=[", str, "]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                c(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f28024d = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f28025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f28026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f28027c;

        public c(Runnable runnable, Executor executor) {
            this.f28025a = runnable;
            this.f28026b = executor;
        }

        public c() {
            this.f28025a = null;
            this.f28026b = null;
        }
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f28017b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return (V) g(obj2);
            }
            h hVar = this.f28019d;
            h hVar2 = h.f28039c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = f28015g;
                    aVar.f(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f28017b;
                            } else {
                                k(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) g(obj);
                    }
                    hVar = this.f28019d;
                } while (hVar != hVar2);
            }
            Object obj3 = this.f28017b;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        throw new InterruptedException();
    }
}
