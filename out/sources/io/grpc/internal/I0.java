package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SerializeReentrantCallsDirectExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f37230d = Logger.getLogger(I0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayDeque<Runnable> f37232c;

    public final void a() {
        while (true) {
            Runnable runnablePoll = this.f37232c.poll();
            if (runnablePoll == null) {
                return;
            }
            try {
                runnablePoll.run();
            } catch (Throwable th) {
                f37230d.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A8.p.j(runnable, "'task' must not be null.");
        if (this.f37231b) {
            if (this.f37232c == null) {
                this.f37232c = new ArrayDeque<>(4);
            }
            this.f37232c.add(runnable);
            return;
        }
        this.f37231b = true;
        try {
            runnable.run();
            if (this.f37232c != null) {
            }
        } catch (Throwable th) {
            try {
                f37230d.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f37232c != null) {
                    a();
                }
                this.f37231b = false;
            }
        }
    }
}
