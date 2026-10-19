package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: MaybeFromCallable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends p123ja.h<T> implements Callable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f40805b;

    public e(Callable<? extends T> callable) {
        this.f40805b = callable;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        p148la.b bVarA = io.reactivex.disposables.a.a(qa.a.f46189b);
        jVar.b(bVarA);
        if (bVarA.d()) {
            return;
        }
        try {
            T tCall = this.f40805b.call();
            if (bVarA.d()) {
                return;
            }
            if (tCall == null) {
                jVar.a();
            } else {
                jVar.onSuccess(tCall);
            }
        } catch (Throwable th) {
            Fa.d.g(th);
            if (bVarA.d()) {
                p231sa.a.c(th);
            } else {
                jVar.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return this.f40805b.call();
    }
}
