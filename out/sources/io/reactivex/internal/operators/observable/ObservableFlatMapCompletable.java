package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p033c7.b0;
import p123ja.n;

/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlatMapCompletable<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f40834c;

    public ObservableFlatMapCompletable(h hVar, b0 b0Var) {
        super(hVar);
        this.f40834c = b0Var;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        this.f40839b.d(new FlatMapCompletableMainObserver(nVar, this.f40834c));
    }

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements n<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final n<? super T> actual;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p148la.b f40835d;
        volatile boolean disposed;
        final p183oa.c<? super T, ? extends p123ja.c> mapper;
        final boolean delayErrors = false;
        final AtomicThrowable errors = new AtomicThrowable();
        final p148la.a set = new p148la.a();

        public final class InnerObserver extends AtomicReference<p148la.b> implements p123ja.b, p148la.b {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            @Override // p123ja.b
            public final void a() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.a(this);
                flatMapCompletableMainObserver.a();
            }

            @Override // p123ja.b
            public final void b(p148la.b bVar) {
                DisposableHelper.f(this, bVar);
            }

            @Override // p148la.b
            public final boolean d() {
                return DisposableHelper.b(get());
            }

            @Override // p148la.b
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // p123ja.b
            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.a(this);
                flatMapCompletableMainObserver.onError(th);
            }
        }

        public FlatMapCompletableMainObserver(n nVar, b0 b0Var) {
            this.actual = nVar;
            this.mapper = b0Var;
            lazySet(1);
        }

        @Override // p123ja.n
        public final void a() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null) {
                    this.actual.onError(thB);
                } else {
                    this.actual.a();
                }
            }
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40835d, bVar)) {
                this.f40835d = bVar;
                this.actual.b(this);
            }
        }

        @Override // p123ja.n
        public final void c(T t8) {
            try {
                p123ja.c cVarApply = this.mapper.apply(t8);
                Q3.d.I(cVarApply, "The mapper returned a null CompletableSource");
                p123ja.c cVar = cVarApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.disposed || !this.set.b(innerObserver)) {
                    return;
                }
                cVar.b(innerObserver);
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40835d.dispose();
                onError(th);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40835d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.disposed = true;
            this.f40835d.dispose();
            this.set.dispose();
        }

        @Override // ra.f
        public final int h(int i10) {
            return 2;
        }

        @Override // ra.j
        public final boolean isEmpty() {
            return true;
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            if (this.delayErrors) {
                if (decrementAndGet() == 0) {
                    AtomicThrowable atomicThrowable2 = this.errors;
                    atomicThrowable2.getClass();
                    this.actual.onError(ExceptionHelper.b(atomicThrowable2));
                    return;
                }
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                AtomicThrowable atomicThrowable3 = this.errors;
                atomicThrowable3.getClass();
                this.actual.onError(ExceptionHelper.b(atomicThrowable3));
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            return null;
        }

        @Override // ra.j
        public final void clear() {
        }
    }
}
