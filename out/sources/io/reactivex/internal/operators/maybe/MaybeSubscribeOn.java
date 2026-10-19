package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.o;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSubscribeOn<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f40781c;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b {
        private static final long serialVersionUID = 8571289934935992137L;
        final p123ja.j<? super T> actual;
        final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnMaybeObserver(p123ja.j<? super T> jVar) {
            this.actual = jVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.actual.a();
        }

        @Override // p123ja.j
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
            SequentialDisposable sequentialDisposable = this.task;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.actual.onSuccess(t8);
        }
    }

    public static final class a<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super T> f40782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p123ja.h f40783c;

        public a(p123ja.j jVar, p123ja.h hVar) {
            this.f40782b = jVar;
            this.f40783c = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f40783c.a(this.f40782b);
        }
    }

    public MaybeSubscribeOn(p123ja.h hVar, o oVar) {
        super(hVar);
        this.f40781c = oVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(jVar);
        jVar.b(subscribeOnMaybeObserver);
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.task;
        p148la.b bVarB = this.f40781c.b(new a(subscribeOnMaybeObserver, this.f40794b));
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, bVarB);
    }
}
