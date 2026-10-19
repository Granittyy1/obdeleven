package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C<V> extends I<V> {
    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C2021y) {
            RuntimeException runtimeException = ((C2021y) obj).f26308b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (!(obj instanceof zzcj$zzc)) {
            if (obj == I.f26135e) {
                return null;
            }
            return obj;
        }
        Throwable th = ((zzcj$zzc) obj).f26342a;
        if (th != null) {
            throw new ExecutionException(th);
        }
        I.f26136f.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(zzcj$zzc.f26341c.f26342a);
    }

    public static boolean h(Object obj) {
        return !(obj instanceof RunnableC2024z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(U u10) {
        Throwable thC;
        if (u10 instanceof B) {
            Object c2021y = ((C) u10).f26139b;
            if (c2021y instanceof C2021y) {
                C2021y c2021y2 = (C2021y) c2021y;
                if (c2021y2.f26307a) {
                    RuntimeException runtimeException = c2021y2.f26308b;
                    c2021y = runtimeException != null ? new C2021y(false, runtimeException) : C2021y.f26306d;
                }
            }
            Objects.requireNonNull(c2021y);
            return c2021y;
        }
        if ((u10 instanceof Y) && (thC = ((Y) u10).c()) != null) {
            return new zzcj$zzc(thC);
        }
        boolean zIsCancelled = u10.isCancelled();
        if ((!I.f26137g) && zIsCancelled) {
            C2021y c2021y3 = C2021y.f26306d;
            Objects.requireNonNull(c2021y3);
            return c2021y3;
        }
        try {
            Object objJ = j(u10);
            if (zIsCancelled) {
                return new C2021y(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u10))));
            }
            return objJ == null ? I.f26135e : objJ;
        } catch (Error e10) {
            e = e10;
            return new zzcj$zzc(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzcj$zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(u10)), e11)) : new C2021y(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new C2021y(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u10)), e12)) : new zzcj$zzc(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new zzcj$zzc(e);
        }
    }

    public static Object j(U u10) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = u10.get();
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

    public static void l(C c10) {
        A a10 = null;
        while (true) {
            c10.getClass();
            for (H hB = I.f26138h.b(c10); hB != null; hB = hB.f26134b) {
                Thread thread = hB.f26133a;
                if (thread != null) {
                    hB.f26133a = null;
                    LockSupport.unpark(thread);
                }
            }
            c10.g();
            A a11 = a10;
            A a12 = I.f26138h.a(c10, A.f26098d);
            A a13 = a11;
            while (a12 != null) {
                A a14 = a12.f26101c;
                a12.f26101c = a13;
                a13 = a12;
                a12 = a14;
            }
            while (a13 != null) {
                Runnable runnable = a13.f26099a;
                A a15 = a13.f26101c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC2024z) {
                    RunnableC2024z runnableC2024z = (RunnableC2024z) runnable;
                    c10 = runnableC2024z.f26312b;
                    if (c10.f26139b == runnableC2024z) {
                        if (I.f26138h.f(c10, runnableC2024z, i(runnableC2024z.f26313c))) {
                            a10 = a15;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = a13.f26100b;
                    Objects.requireNonNull(executor);
                    m(runnable, executor);
                }
                a13 = a15;
            }
            return;
        }
    }

    public static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            I.f26136f.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", B6.c.d("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void b(Runnable runnable, Executor executor) {
        A a10;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (a10 = this.f26140c) != A.f26098d) {
            A a11 = new A(runnable, executor);
            do {
                a11.f26101c = a10;
                if (I.f26138h.e(this, a10, a11)) {
                    return;
                } else {
                    a10 = this.f26140c;
                }
            } while (a10 != A.f26098d);
        }
        m(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.Y
    public final Throwable c() {
        if (!(this instanceof B)) {
            return null;
        }
        Object obj = this.f26139b;
        if (obj instanceof zzcj$zzc) {
            return ((zzcj$zzc) obj).f26342a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C2021y c2021y;
        Object obj = this.f26139b;
        if (!(obj instanceof RunnableC2024z) && !(obj == null)) {
            return false;
        }
        if (I.f26137g) {
            c2021y = new C2021y(z10, new CancellationException("Future.cancel() was called."));
        } else {
            c2021y = z10 ? C2021y.f26305c : C2021y.f26306d;
            Objects.requireNonNull(c2021y);
        }
        C<V> c10 = this;
        boolean z11 = false;
        while (true) {
            if (I.f26138h.f(c10, obj, c2021y)) {
                l(c10);
                if (obj instanceof RunnableC2024z) {
                    U<? extends V> u10 = ((RunnableC2024z) obj).f26313c;
                    if (u10 instanceof B) {
                        c10 = (C) u10;
                        obj = c10.f26139b;
                        if ((obj == null) | (obj instanceof RunnableC2024z)) {
                            z11 = true;
                        }
                    } else {
                        u10.cancel(z10);
                    }
                }
                return true;
            }
            obj = c10.f26139b;
            if (h(obj)) {
                return z11;
            }
        }
    }

    public String f() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f26139b;
        if ((obj2 != null) && h(obj2)) {
            return e(obj2);
        }
        H h8 = this.f26141d;
        H h10 = H.f26132c;
        if (h8 != h10) {
            H h11 = new H();
            do {
                D d10 = I.f26138h;
                d10.c(h11, h8);
                if (d10.g(this, h8, h11)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(h11);
                            throw new InterruptedException();
                        }
                        obj = this.f26139b;
                    } while (!((obj != null) & h(obj)));
                    return e(obj);
                }
                h8 = this.f26141d;
            } while (h8 != h10);
        }
        Object obj3 = this.f26139b;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26139b instanceof C2021y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f26139b;
        return (obj != null) & h(obj);
    }

    public final void k(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            if (objJ == null) {
                sb2.append("null");
            } else if (objJ == this) {
                sb2.append("this future");
            } else {
                sb2.append(objJ.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objJ)));
            }
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

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f26139b instanceof C2021y) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            k(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f26139b;
            if (obj instanceof RunnableC2024z) {
                sb2.append(", setFuture=[");
                U<? extends V> u10 = ((RunnableC2024z) obj).f26313c;
                try {
                    if (u10 == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(u10);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    B6.c.f(sb2, ", info=[", strConcat, "]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                k(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void g() {
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb A[EDGE_INSN: B:55:0x00bb->B:34:0x007f BREAK  A[LOOP:0: B:20:0x0042->B:40:0x0090]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00bb -> B:34:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
