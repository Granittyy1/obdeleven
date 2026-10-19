package com.google.android.gms.internal.play_billing;

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

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class v2 implements U {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f26286e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f26287f = Logger.getLogger(v2.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final V f26288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f26289h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f26290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C2005s1 f26291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile u2 f26292d;

    static {
        V t2Var;
        try {
            t2Var = new b2(AtomicReferenceFieldUpdater.newUpdater(u2.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY), AtomicReferenceFieldUpdater.newUpdater(u2.class, u2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(v2.class, u2.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE), AtomicReferenceFieldUpdater.newUpdater(v2.class, C2005s1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            t2Var = new t2();
        }
        Throwable th2 = th;
        f26288g = t2Var;
        if (th2 != null) {
            f26287f.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f26289h = new Object();
    }

    public static void d(v2 v2Var) {
        u2 u2Var;
        V v10;
        C2005s1 c2005s1;
        do {
            u2Var = v2Var.f26292d;
            v10 = f26288g;
        } while (!v10.e(v2Var, u2Var, u2.f26270c));
        while (u2Var != null) {
            Thread thread = u2Var.f26271a;
            if (thread != null) {
                u2Var.f26271a = null;
                LockSupport.unpark(thread);
            }
            u2Var = u2Var.f26272b;
        }
        do {
            c2005s1 = v2Var.f26291c;
        } while (!v10.c(v2Var, c2005s1, C2005s1.f26250d));
        C2005s1 c2005s2 = null;
        while (c2005s1 != null) {
            C2005s1 c2005s3 = c2005s1.f26253c;
            c2005s1.f26253c = c2005s2;
            c2005s2 = c2005s1;
            c2005s1 = c2005s3;
        }
        while (c2005s2 != null) {
            Runnable runnable = c2005s2.f26251a;
            C2005s1 c2005s4 = c2005s2.f26253c;
            if (runnable instanceof s2) {
                ((s2) runnable).getClass();
                throw null;
            }
            f(runnable, c2005s2.f26252b);
            c2005s2 = c2005s4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f26287f.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", B6.c.d("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof C1990n0) {
            CancellationException cancellationException = ((C1990n0) obj).f26225a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof V0) {
            throw new ExecutionException(((V0) obj).f26162a);
        }
        if (obj == f26289h) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        C2005s1 c2005s1 = this.f26291c;
        C2005s1 c2005s2 = C2005s1.f26250d;
        if (c2005s1 != c2005s2) {
            C2005s1 c2005s3 = new C2005s1(runnable, executor);
            do {
                c2005s3.f26253c = c2005s1;
                if (f26288g.c(this, c2005s1, c2005s3)) {
                    return;
                } else {
                    c2005s1 = this.f26291c;
                }
            } while (c2005s1 != c2005s2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        Object obj = this.f26290b;
        if (obj instanceof s2) {
            ((s2) obj).getClass();
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C1990n0 c1990n0;
        Object obj = this.f26290b;
        if ((obj instanceof s2) | (obj == null)) {
            if (f26286e) {
                c1990n0 = new C1990n0(new CancellationException("Future.cancel() was called."));
            } else {
                c1990n0 = z10 ? C1990n0.f26223b : C1990n0.f26224c;
            }
            while (!f26288g.d(this, obj, c1990n0)) {
                obj = this.f26290b;
                if (!(obj instanceof s2)) {
                }
            }
            d(this);
            if (!(obj instanceof s2)) {
                return true;
            }
            ((s2) obj).getClass();
            throw null;
        }
        return false;
    }

    public final void e(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    public final void g(u2 u2Var) {
        u2Var.f26271a = null;
        while (true) {
            u2 u2Var2 = this.f26292d;
            if (u2Var2 != u2.f26270c) {
                u2 u2Var3 = null;
                while (u2Var2 != null) {
                    u2 u2Var4 = u2Var2.f26272b;
                    if (u2Var2.f26271a != null) {
                        u2Var3 = u2Var2;
                    } else if (u2Var3 != null) {
                        u2Var3.f26272b = u2Var4;
                        if (u2Var3.f26271a == null) {
                        }
                    } else if (!f26288g.e(this, u2Var2, u2Var4)) {
                    }
                    u2Var2 = u2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f26290b;
        if ((obj2 != null) && (!(obj2 instanceof s2))) {
            return h(obj2);
        }
        u2 u2Var = this.f26292d;
        u2 u2Var2 = u2.f26270c;
        if (u2Var != u2Var2) {
            u2 u2Var3 = new u2();
            do {
                V v10 = f26288g;
                v10.a(u2Var3, u2Var);
                if (v10.e(this, u2Var, u2Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(u2Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f26290b;
                    } while (!((obj != null) & (!(obj instanceof s2))));
                    return h(obj);
                }
                u2Var = this.f26292d;
            } while (u2Var != u2Var2);
        }
        return h(this.f26290b);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26290b instanceof C1990n0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f26290b;
        return (obj != null) & (!(obj instanceof s2));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f26290b instanceof C1990n0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            e(sb2);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                B6.c.f(sb2, "PENDING, info=[", strConcat, "]");
            } else if (isDone()) {
                e(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.v2.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
