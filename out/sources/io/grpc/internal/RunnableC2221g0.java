package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LogExceptionRunnable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2221g0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f37545c = Logger.getLogger(RunnableC2221g0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f37546b;

    public RunnableC2221g0(Runnable runnable) {
        this.f37546b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f37546b;
        try {
            runnable.run();
        } catch (Throwable th) {
            f37545c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = com.google.common.base.l.f27810a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new AssertionError(th);
            }
            throw ((Error) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f37546b + ")";
    }
}
