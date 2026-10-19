package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.o;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeObserveOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f40776c;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final p123ja.j<? super T> actual;
        Throwable error;
        final o scheduler;
        T value;

        public ObserveOnMaybeObserver(p123ja.j<? super T> jVar, o oVar) {
            this.actual = jVar;
            this.scheduler = oVar;
        }

        @Override // p123ja.j
        public final void a() {
            DisposableHelper.c(this, this.scheduler.b(this));
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.f(this, bVar)) {
                this.actual.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return DisposableHelper.b(get());
        }

        @Override // p148la.b
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.c(this, this.scheduler.b(this));
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.value = t8;
            DisposableHelper.c(this, this.scheduler.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.error = null;
                this.actual.onError(th);
                return;
            }
            T t8 = this.value;
            if (t8 == null) {
                this.actual.a();
            } else {
                this.value = null;
                this.actual.onSuccess(t8);
            }
        }
    }

    public MaybeObserveOn(p123ja.h hVar, o oVar) {
        super(hVar);
        this.f40776c = oVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40794b.a(new ObserveOnMaybeObserver(jVar, this.f40776c));
    }
}
