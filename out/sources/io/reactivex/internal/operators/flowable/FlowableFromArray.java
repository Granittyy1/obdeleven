package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromArray<T> extends p123ja.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f40715c;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ra.a<? super T> actual;

        public ArrayConditionalSubscription(ra.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.actual = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void a() {
            T[] tArr = this.array;
            int length = tArr.length;
            ra.a<? super T> aVar = this.actual;
            for (int i10 = this.index; i10 != length; i10++) {
                if (this.cancelled) {
                    return;
                }
                T t8 = tArr[i10];
                if (t8 == null) {
                    aVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                aVar.f(t8);
            }
            if (this.cancelled) {
                return;
            }
            aVar.a();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i10 = this.index;
            ra.a<? super T> aVar = this.actual;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == j || i10 == length) {
                        if (i10 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            aVar.a();
                            return;
                        } else {
                            j = get();
                            if (j10 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t8 = tArr[i10];
                        if (t8 == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            if (aVar.f(t8)) {
                                j10++;
                            }
                            i10++;
                        }
                    }
                }
                this.index = i10;
                j = addAndGet(-j10);
            } while (j != 0);
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final bc.b<? super T> actual;

        public ArraySubscription(p123ja.g gVar, Object[] objArr) {
            super(objArr);
            this.actual = gVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void a() {
            T[] tArr = this.array;
            int length = tArr.length;
            bc.b<? super T> bVar = this.actual;
            for (int i10 = this.index; i10 != length; i10++) {
                if (this.cancelled) {
                    return;
                }
                T t8 = tArr[i10];
                if (t8 == null) {
                    bVar.onError(new NullPointerException("array element is null"));
                    return;
                }
                bVar.c(t8);
            }
            if (this.cancelled) {
                return;
            }
            bVar.a();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i10 = this.index;
            bc.b<? super T> bVar = this.actual;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == j || i10 == length) {
                        if (i10 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            bVar.a();
                            return;
                        } else {
                            j = get();
                            if (j10 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t8 = tArr[i10];
                        if (t8 == null) {
                            bVar.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            bVar.c(t8);
                            j10++;
                            i10++;
                        }
                    }
                }
                this.index = i10;
                j = addAndGet(-j10);
            } while (j != 0);
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        public BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        public abstract void a();

        public abstract void b(long j);

        @Override // bc.c
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // ra.j
        public final void clear() {
            this.index = this.array.length;
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
            return this.index == this.array.length;
        }

        @Override // ra.j
        public final T poll() {
            int i10 = this.index;
            T[] tArr = this.array;
            if (i10 == tArr.length) {
                return null;
            }
            this.index = i10 + 1;
            T t8 = tArr[i10];
            Q3.d.I(t8, "array element is null");
            return t8;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.f40715c = tArr;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        boolean z10 = gVar instanceof ra.a;
        T[] tArr = this.f40715c;
        if (z10) {
            gVar.e(new ArrayConditionalSubscription((ra.a) gVar, tArr));
        } else {
            gVar.e(new ArraySubscription(gVar, tArr));
        }
    }
}
