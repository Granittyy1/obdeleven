package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybeJust.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends p123ja.h<T> implements ra.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f40814b;

    public i(T t8) {
        this.f40814b = t8;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        jVar.b(EmptyDisposable.f40664b);
        jVar.onSuccess(this.f40814b);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f40814b;
    }
}
