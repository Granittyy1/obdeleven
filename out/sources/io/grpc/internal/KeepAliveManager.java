package io.grpc.internal;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class KeepAliveManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.common.base.i f37245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f37246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public State f37247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture<?> f37248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduledFuture<?> f37249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RunnableC2221g0 f37250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC2221g0 f37251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37252i;
    public final long j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f37253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f37254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f37255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f37256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final State f37257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final State f37258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f37259h;

        static {
            State state = new State("IDLE", 0);
            f37253b = state;
            State state2 = new State("PING_SCHEDULED", 1);
            f37254c = state2;
            State state3 = new State("PING_DELAYED", 2);
            f37255d = state3;
            State state4 = new State("PING_SENT", 3);
            f37256e = state4;
            State state5 = new State("IDLE_AND_PING_SENT", 4);
            f37257f = state5;
            State state6 = new State("DISCONNECTED", 5);
            f37258g = state6;
            f37259h = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f37259h.clone();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            KeepAliveManager keepAliveManager;
            boolean z10;
            synchronized (KeepAliveManager.this) {
                keepAliveManager = KeepAliveManager.this;
                State state = keepAliveManager.f37247d;
                State state2 = State.f37258g;
                if (state != state2) {
                    keepAliveManager.f37247d = state2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c cVar = keepAliveManager.f37246c;
                cVar.getClass();
                cVar.f37262a.q(Status.f36905l.h("Keepalive failed. The connection is likely gone"));
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            long jNextLong;
            boolean z11 = true;
            synchronized (KeepAliveManager.this) {
                try {
                    KeepAliveManager keepAliveManager = KeepAliveManager.this;
                    keepAliveManager.f37249f = null;
                    State state = keepAliveManager.f37247d;
                    State state2 = State.f37254c;
                    if (state == state2) {
                        keepAliveManager.f37247d = State.f37256e;
                        keepAliveManager.f37248e = keepAliveManager.f37244a.schedule(keepAliveManager.f37250g, keepAliveManager.j, TimeUnit.NANOSECONDS);
                        z10 = true;
                    } else {
                        if (state == State.f37255d) {
                            ScheduledExecutorService scheduledExecutorService = keepAliveManager.f37244a;
                            RunnableC2221g0 runnableC2221g0 = keepAliveManager.f37251h;
                            long j = keepAliveManager.f37252i;
                            com.google.common.base.i iVar = keepAliveManager.f37245b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            keepAliveManager.f37249f = scheduledExecutorService.schedule(runnableC2221g0, j - iVar.a(timeUnit), timeUnit);
                            KeepAliveManager.this.f37247d = state2;
                        }
                        z10 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                c cVar = KeepAliveManager.this.f37246c;
                cVar.getClass();
                C2219f0 c2219f0 = new C2219f0(cVar);
                Executor executorA = com.google.common.util.concurrent.a.a();
                io.grpc.okhttp.d dVar = cVar.f37262a;
                synchronized (dVar.f37895k) {
                    try {
                        A8.p.q(dVar.f37894i != null);
                        if (dVar.f37909y) {
                            StatusException statusExceptionK = dVar.k();
                            Logger logger = T.f37441g;
                            try {
                                executorA.execute(new S(c2219f0, statusExceptionK));
                            } catch (Throwable th2) {
                                T.f37441g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                            return;
                        }
                        T t8 = dVar.f37908x;
                        if (t8 != null) {
                            jNextLong = 0;
                            z11 = false;
                        } else {
                            jNextLong = dVar.f37889d.nextLong();
                            dVar.f37890e.getClass();
                            com.google.common.base.i iVar2 = new com.google.common.base.i();
                            iVar2.b();
                            T t10 = new T(jNextLong, iVar2);
                            dVar.f37908x = t10;
                            dVar.f37882L.getClass();
                            t8 = t10;
                        }
                        if (z11) {
                            dVar.f37894i.W((int) (jNextLong >>> 32), (int) jNextLong, false);
                        }
                        synchronized (t8) {
                            try {
                                if (!t8.f37445d) {
                                    t8.f37444c.put(c2219f0, executorA);
                                    return;
                                }
                                StatusException statusException = t8.f37446e;
                                Runnable s10 = statusException != null ? new S(c2219f0, statusException) : new Q(c2219f0, t8.f37447f);
                                try {
                                    executorA.execute(s10);
                                } catch (Throwable th3) {
                                    T.f37441g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.okhttp.d f37262a;

        public c(io.grpc.okhttp.d dVar) {
            this.f37262a = dVar;
        }
    }

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public KeepAliveManager(c cVar, ScheduledExecutorService scheduledExecutorService, long j, long j10) {
        com.google.common.base.i iVar = new com.google.common.base.i();
        this.f37247d = State.f37253b;
        this.f37250g = new RunnableC2221g0(new a());
        this.f37251h = new RunnableC2221g0(new b());
        this.f37246c = cVar;
        A8.p.j(scheduledExecutorService, "scheduler");
        this.f37244a = scheduledExecutorService;
        this.f37245b = iVar;
        this.f37252i = j;
        this.j = j10;
        iVar.f27807a = false;
        iVar.b();
    }

    public final synchronized void a() {
        try {
            com.google.common.base.i iVar = this.f37245b;
            iVar.f27807a = false;
            iVar.b();
            State state = this.f37247d;
            State state2 = State.f37254c;
            if (state == state2) {
                this.f37247d = State.f37255d;
            } else if (state == State.f37256e || state == State.f37257f) {
                ScheduledFuture<?> scheduledFuture = this.f37248e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f37247d == State.f37257f) {
                    this.f37247d = State.f37253b;
                } else {
                    this.f37247d = state2;
                    A8.p.p("There should be no outstanding pingFuture", this.f37249f == null);
                    this.f37249f = this.f37244a.schedule(this.f37251h, this.f37252i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            State state = this.f37247d;
            if (state == State.f37253b) {
                this.f37247d = State.f37254c;
                if (this.f37249f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f37244a;
                    RunnableC2221g0 runnableC2221g0 = this.f37251h;
                    long j = this.f37252i;
                    com.google.common.base.i iVar = this.f37245b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f37249f = scheduledExecutorService.schedule(runnableC2221g0, j - iVar.a(timeUnit), timeUnit);
                }
            } else if (state == State.f37257f) {
                this.f37247d = State.f37256e;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            State state = this.f37247d;
            if (state == State.f37254c || state == State.f37255d) {
                this.f37247d = State.f37253b;
            }
            if (this.f37247d == State.f37256e) {
                this.f37247d = State.f37257f;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            State state = this.f37247d;
            State state2 = State.f37258g;
            if (state != state2) {
                this.f37247d = state2;
                ScheduledFuture<?> scheduledFuture = this.f37248e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture<?> scheduledFuture2 = this.f37249f;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f37249f = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
