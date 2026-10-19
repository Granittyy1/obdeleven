package io.reactivex.internal.subscriptions;

import Q3.d;
import S4.o;
import bc.c;
import com.google.gson.internal.b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p231sa.a;

/* JADX INFO: loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements c {
    private static final long serialVersionUID = -2189523197179400958L;
    c actual;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<c> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        d();
    }

    @Override // bc.c
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        b();
    }

    public final void d() {
        int iAddAndGet = 1;
        long jC = 0;
        c cVar = null;
        do {
            c andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            c cVar2 = this.actual;
            if (this.cancelled) {
                if (cVar2 != null) {
                    cVar2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.requested;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = o.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            a.c(new ProtocolViolationException(b.b(jC2, "More produced than requested: ")));
                            jC2 = 0;
                        }
                    }
                    this.requested = jC2;
                }
                if (andSet != null) {
                    if (cVar2 != null) {
                        cVar2.cancel();
                    }
                    this.actual = andSet;
                    if (jC2 != 0) {
                        jC = o.c(jC, jC2);
                        cVar = andSet;
                    }
                } else if (cVar2 != null && andSet2 != 0) {
                    jC = o.c(jC, andSet2);
                    cVar = cVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            cVar.g(jC);
        }
    }

    public void e(c cVar) {
        j(cVar);
    }

    @Override // bc.c
    public final void g(long j) {
        if (!SubscriptionHelper.c(j) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            o.b(this.missedRequested, j);
            b();
            return;
        }
        long j10 = this.requested;
        if (j10 != Long.MAX_VALUE) {
            long jC = o.c(j10, j);
            this.requested = jC;
            if (jC == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        c cVar = this.actual;
        if (decrementAndGet() != 0) {
            d();
        }
        if (cVar != null) {
            cVar.g(j);
        }
    }

    public final boolean h() {
        return this.unbounded;
    }

    public final void i(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            o.b(this.missedProduced, j);
            b();
            return;
        }
        long j10 = this.requested;
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 - j;
            if (j11 < 0) {
                a.c(new ProtocolViolationException(b.b(j11, "More produced than requested: ")));
                j11 = 0;
            }
            this.requested = j11;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        d();
    }

    public final void j(c cVar) {
        if (this.cancelled) {
            cVar.cancel();
            return;
        }
        d.I(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            c andSet = this.missedSubscription.getAndSet(cVar);
            if (andSet != null) {
                andSet.cancel();
            }
            b();
            return;
        }
        c cVar2 = this.actual;
        if (cVar2 != null) {
            cVar2.cancel();
        }
        this.actual = cVar;
        long j = this.requested;
        if (decrementAndGet() != 0) {
            d();
        }
        if (j != 0) {
            cVar.g(j);
        }
    }
}
