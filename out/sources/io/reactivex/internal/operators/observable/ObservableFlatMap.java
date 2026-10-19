package io.reactivex.internal.operators.observable;

import com.braze.support.BrazeLogger;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.l;
import p123ja.m;
import p123ja.n;

/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.b f40828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40830e;

    public static final class InnerObserver<T, U> extends AtomicReference<p148la.b> implements n<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;
        final long id;
        final MergeObserver<T, U> parent;
        volatile ra.j<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.id = j;
            this.parent = mergeObserver;
        }

        @Override // p123ja.n
        public final void a() throws Exception {
            this.done = true;
            this.parent.g();
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) throws Exception {
            if (DisposableHelper.f(this, bVar) && (bVar instanceof ra.e)) {
                ra.e eVar = (ra.e) bVar;
                int iH = eVar.h(7);
                if (iH == 1) {
                    this.fusionMode = iH;
                    this.queue = eVar;
                    this.done = true;
                    this.parent.g();
                    return;
                }
                if (iH == 2) {
                    this.fusionMode = iH;
                    this.queue = eVar;
                }
            }
        }

        @Override // p123ja.n
        public final void c(U u10) throws Exception {
            if (this.fusionMode != 0) {
                this.parent.g();
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.actual.c(u10);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                ra.j aVar = this.queue;
                if (aVar == null) {
                    aVar = new io.reactivex.internal.queue.a(mergeObserver.bufferSize);
                    this.queue = aVar;
                }
                aVar.offer(u10);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.h();
        }

        @Override // p123ja.n
        public final void onError(Throwable th) throws Exception {
            AtomicThrowable atomicThrowable = this.parent.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.f();
            }
            this.done = true;
            this.parent.g();
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements p148la.b, n<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InnerObserver<?, ?>[] f40831b = new InnerObserver[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InnerObserver<?, ?>[] f40832c = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final n<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        long lastId;
        int lastIndex;
        final p183oa.c<? super T, ? extends m<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile ra.i<U> queue;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p148la.b f40833s;
        Queue<m<? extends U>> sources;
        long uniqueId;
        int wip;
        final AtomicThrowable errors = new AtomicThrowable();
        final boolean delayErrors = false;

        public MergeObserver(n nVar, C4.b bVar, int i10, int i11) {
            this.actual = nVar;
            this.mapper = bVar;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i10);
            }
            this.observers = new AtomicReference<>(f40831b);
        }

        @Override // p123ja.n
        public final void a() throws Exception {
            if (this.done) {
                return;
            }
            this.done = true;
            g();
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40833s, bVar)) {
                this.f40833s = bVar;
                this.actual.b(this);
            }
        }

        @Override // p123ja.n
        public final void c(T t8) throws Exception {
            if (this.done) {
                return;
            }
            try {
                m<? extends U> mVarApply = this.mapper.apply(t8);
                Q3.d.I(mVarApply, "The mapper returned a null ObservableSource");
                m<? extends U> mVar = mVarApply;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.wip;
                            if (i10 == this.maxConcurrency) {
                                this.sources.offer(mVar);
                                return;
                            }
                            this.wip = i10 + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                j(mVar);
            } catch (Throwable th2) {
                Fa.d.g(th2);
                this.f40833s.dispose();
                onError(th2);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.cancelled;
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (f()) {
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB == null || thB == ExceptionHelper.f40974a) {
                    return;
                }
                p231sa.a.c(thB);
            }
        }

        public final boolean e() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            f();
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != ExceptionHelper.f40974a) {
                this.actual.onError(thB);
            }
            return true;
        }

        public final boolean f() {
            InnerObserver<?, ?>[] andSet;
            this.f40833s.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = f40832c;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.getClass();
                DisposableHelper.a(innerObserver);
            }
            return true;
        }

        public final void g() throws Exception {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h() throws Exception {
            int size;
            n<? super U> nVar = this.actual;
            int iAddAndGet = 1;
            while (!e()) {
                ra.i<U> iVar = this.queue;
                if (iVar != null) {
                    while (!e()) {
                        U uPoll = iVar.poll();
                        if (uPoll != null) {
                            nVar.c(uPoll);
                        } else if (uPoll == null) {
                        }
                    }
                    return;
                }
                boolean z10 = this.done;
                ra.i<U> iVar2 = this.queue;
                InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                boolean z11 = false;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.sources.size();
                    }
                } else {
                    size = 0;
                }
                if (z10 && ((iVar2 == null || iVar2.isEmpty()) && length == 0 && size == 0)) {
                    AtomicThrowable atomicThrowable = this.errors;
                    atomicThrowable.getClass();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (thB != ExceptionHelper.f40974a) {
                        if (thB == null) {
                            nVar.a();
                            return;
                        } else {
                            nVar.onError(thB);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.lastId;
                    int i10 = this.lastIndex;
                    if (length <= i10 || innerObserverArr[i10].id != j) {
                        if (length <= i10) {
                            i10 = 0;
                        }
                        for (int i11 = 0; i11 < length && innerObserverArr[i10].id != j; i11++) {
                            i10++;
                            if (i10 == length) {
                                i10 = 0;
                            }
                        }
                        this.lastIndex = i10;
                        this.lastId = innerObserverArr[i10].id;
                    }
                    int i12 = 0;
                    boolean z12 = false;
                    while (i12 < length) {
                        if (e()) {
                            return;
                        }
                        InnerObserver<T, U> innerObserver = innerObserverArr[i10];
                        while (!e()) {
                            ra.j<U> jVar = innerObserver.queue;
                            if (jVar != null) {
                                do {
                                    try {
                                        U uPoll2 = jVar.poll();
                                        if (uPoll2 != null) {
                                            nVar.c(uPoll2);
                                        } else if (uPoll2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        Fa.d.g(th);
                                        DisposableHelper.a(innerObserver);
                                        AtomicThrowable atomicThrowable2 = this.errors;
                                        atomicThrowable2.getClass();
                                        ExceptionHelper.a(atomicThrowable2, th);
                                        if (e()) {
                                            return;
                                        }
                                        i(innerObserver);
                                        i12++;
                                        z12 = true;
                                    }
                                } while (!e());
                                return;
                            }
                            boolean z13 = innerObserver.done;
                            ra.j<U> jVar2 = innerObserver.queue;
                            if (z13 && (jVar2 == null || jVar2.isEmpty())) {
                                i(innerObserver);
                                if (e()) {
                                    return;
                                } else {
                                    z12 = true;
                                }
                            }
                            i10++;
                            if (i10 == length) {
                                i10 = 0;
                            }
                            i12++;
                        }
                        return;
                    }
                    this.lastIndex = i10;
                    this.lastId = innerObserverArr[i10].id;
                    z11 = z12;
                }
                if (!z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            m<? extends U> mVarPoll = this.sources.poll();
                            if (mVarPoll == null) {
                                this.wip--;
                            } else {
                                j(mVarPoll);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            while (true) {
                InnerObserver<?, ?>[] innerObserverArr2 = this.observers.get();
                int length = innerObserverArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerObserverArr2[i10] == innerObserver) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr = f40831b;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr2, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr = innerObserverArr3;
                }
                AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                    if (atomicReference.get() != innerObserverArr2) {
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v6, types: [ra.j] */
        public final void j(m<? extends U> mVar) throws Exception {
            boolean z10;
            do {
                z10 = false;
                if (mVar instanceof Callable) {
                    try {
                        Object objCall = ((Callable) mVar).call();
                        if (objCall != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                this.actual.c(objCall);
                                if (decrementAndGet() != 0) {
                                    h();
                                }
                            } else {
                                ra.i<U> iVar = this.queue;
                                ?? r10 = iVar;
                                if (iVar == false) {
                                    ra.i<U> aVar = this.maxConcurrency == Integer.MAX_VALUE ? new io.reactivex.internal.queue.a(this.bufferSize) : new SpscArrayQueue(this.maxConcurrency);
                                    this.queue = aVar;
                                    r10 = aVar;
                                }
                                if (r10.offer(objCall)) {
                                    if (getAndIncrement() != 0) {
                                        return;
                                    }
                                    h();
                                } else {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        AtomicThrowable atomicThrowable = this.errors;
                        atomicThrowable.getClass();
                        ExceptionHelper.a(atomicThrowable, th);
                        g();
                    }
                    if (this.maxConcurrency == Integer.MAX_VALUE) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            mVar = this.sources.poll();
                            if (mVar == null) {
                                this.wip--;
                                z10 = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    InnerObserver<?, ?> innerObserver = new InnerObserver<>(this, j);
                    while (true) {
                        InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                        if (innerObserverArr == f40832c) {
                            DisposableHelper.a(innerObserver);
                            return;
                        }
                        int length = innerObserverArr.length;
                        InnerObserver<?, ?>[] innerObserverArr2 = new InnerObserver[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = innerObserver;
                        AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                        do {
                            if (atomicReference.compareAndSet(innerObserverArr, innerObserverArr2)) {
                                mVar.d(innerObserver);
                                return;
                            }
                        } while (atomicReference.get() == innerObserverArr);
                    }
                }
            } while (!z10);
            g();
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            if (this.done) {
                p231sa.a.c(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
            } else {
                this.done = true;
                g();
            }
        }
    }

    public ObservableFlatMap(l lVar, C4.b bVar, int i10) {
        super(lVar);
        this.f40828c = bVar;
        this.f40829d = BrazeLogger.SUPPRESS;
        this.f40830e = i10;
    }

    @Override // p123ja.l
    public final void e(n<? super U> nVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
        m mVar = this.f40839b;
        boolean z10 = mVar instanceof Callable;
        C4.b bVar = this.f40828c;
        if (!z10) {
            mVar.d(new MergeObserver(nVar, bVar, this.f40829d, this.f40830e));
            return;
        }
        try {
            Object objCall = ((Callable) mVar).call();
            if (objCall == null) {
                nVar.b(emptyDisposable);
                nVar.a();
                return;
            }
            try {
                m mVar2 = (m) bVar.apply(objCall);
                if (!(mVar2 instanceof Callable)) {
                    mVar2.d(nVar);
                    return;
                }
                try {
                    Object objCall2 = ((Callable) mVar2).call();
                    if (objCall2 == null) {
                        nVar.b(emptyDisposable);
                        nVar.a();
                    } else {
                        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(nVar, objCall2);
                        nVar.b(observableScalarXMap$ScalarDisposable);
                        observableScalarXMap$ScalarDisposable.run();
                    }
                } catch (Throwable th) {
                    Fa.d.g(th);
                    nVar.b(emptyDisposable);
                    nVar.onError(th);
                }
            } catch (Throwable th2) {
                Fa.d.g(th2);
                nVar.b(emptyDisposable);
                nVar.onError(th2);
            }
        } catch (Throwable th3) {
            Fa.d.g(th3);
            nVar.b(emptyDisposable);
            nVar.onError(th3);
        }
    }
}
