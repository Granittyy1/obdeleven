package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import p123ja.l;
import p123ja.n;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToObservable<T> extends l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.h f40789b;

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements p123ja.j<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p148la.b f40790d;

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40790d, bVar)) {
                this.f40790d = bVar;
                this.actual.b(this);
            }
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, p148la.b
        public final void dispose() {
            super.dispose();
            this.f40790d.dispose();
        }
    }

    public MaybeToObservable(p123ja.h hVar) {
        this.f40789b = hVar;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        this.f40789b.a(new MaybeToObservableObserver(nVar));
    }
}
