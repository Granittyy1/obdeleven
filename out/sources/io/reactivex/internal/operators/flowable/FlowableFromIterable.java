package io.reactivex.internal.operators.flowable;

import S4.o;
import com.google.protobuf.C2078u;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromIterable<T> extends p123ja.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2078u.d f40716c;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> it;
        boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.it = it;
        }

        public abstract void a();

        public abstract void b(long j);

        @Override // bc.c
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // ra.j
        public final void clear() {
            this.it = null;
        }

        @Override // bc.c
        public final void g(long j) {
            if (SubscriptionHelper.c(j) && o.b(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j);
                }
            }
        }

        @Override // ra.f
        public final int h(int i10) {
            return 1;
        }

        @Override // ra.j
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.it;
            return it == null || !it.hasNext();
        }

        @Override // ra.j
        public final T poll() {
            Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.it.next();
            Q3.d.I(next, "Iterator.next() returned a null value");
            return next;
        }
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final ra.a<? super T> actual;

        public IteratorConditionalSubscription(ra.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.actual = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void a() {
            Iterator<? extends T> it = this.it;
            ra.a<? super T> aVar = this.actual;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.f(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            aVar.a();
                            return;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        aVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Fa.d.g(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void b(long j) {
            Iterator<? extends T> it = this.it;
            ra.a<? super T> aVar = this.actual;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == j) {
                        j = get();
                        if (j10 == j) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zF = aVar.f(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    aVar.a();
                                    return;
                                } else if (zF) {
                                    j10++;
                                }
                            } catch (Throwable th) {
                                Fa.d.g(th);
                                aVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Fa.d.g(th2);
                            aVar.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j10);
            } while (j != 0);
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final bc.b<? super T> actual;

        public IteratorSubscription(p123ja.g gVar, Iterator it) {
            super(it);
            this.actual = gVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void a() {
            Iterator<? extends T> it = this.it;
            bc.b<? super T> bVar = this.actual;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.c(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            bVar.a();
                            return;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        bVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Fa.d.g(th2);
                    bVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public final void b(long j) {
            Iterator<? extends T> it = this.it;
            bc.b<? super T> bVar = this.actual;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == j) {
                        j = get();
                        if (j10 == j) {
                            break;
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (next == null) {
                                bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            bVar.c(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    bVar.a();
                                    return;
                                }
                                j10++;
                            } catch (Throwable th) {
                                Fa.d.g(th);
                                bVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Fa.d.g(th2);
                            bVar.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j10);
            } while (j != 0);
        }
    }

    public FlowableFromIterable(C2078u.d dVar) {
        this.f40716c = dVar;
    }

    public static void f(p123ja.g gVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.a(gVar);
            } else if (gVar instanceof ra.a) {
                gVar.e(new IteratorConditionalSubscription((ra.a) gVar, it));
            } else {
                gVar.e(new IteratorSubscription(gVar, it));
            }
        } catch (Throwable th) {
            Fa.d.g(th);
            EmptySubscription.b(th, gVar);
        }
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        try {
            f(gVar, this.f40716c.iterator());
        } catch (Throwable th) {
            Fa.d.g(th);
            EmptySubscription.b(th, gVar);
        }
    }
}
