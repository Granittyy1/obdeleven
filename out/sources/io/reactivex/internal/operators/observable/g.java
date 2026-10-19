package io.reactivex.internal.operators.observable;

import p033c7.Y;
import p123ja.l;
import p123ja.n;

/* JADX INFO: compiled from: ObservableJust.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends l<T> implements ra.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f40861b;

    public g(Y y10) {
        this.f40861b = y10;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f40861b;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(nVar, this.f40861b);
        nVar.b(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }
}
