package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b {
    private static final long serialVersionUID = -6076952298809384986L;
    final p183oa.a onComplete;
    final p183oa.b<? super Throwable> onError;
    final p183oa.b<? super T> onSuccess;

    public MaybeCallbackObserver() {
        qa.a.c cVar = qa.a.f46191d;
        qa.a.i iVar = qa.a.f46192e;
        qa.a.b bVar = qa.a.f46190c;
        this.onSuccess = cVar;
        this.onError = iVar;
        this.onComplete = bVar;
    }

    @Override // p123ja.j
    public final void a() {
        lazySet(DisposableHelper.f40662b);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            Fa.d.g(th);
            p231sa.a.c(th);
        }
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
    }

    @Override // p123ja.j
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f40662b);
        try {
            this.onError.a(th);
        } catch (Throwable th2) {
            Fa.d.g(th2);
            p231sa.a.c(new CompositeException(th, th2));
        }
    }

    @Override // p123ja.j
    public final void onSuccess(T t8) {
        lazySet(DisposableHelper.f40662b);
        try {
            this.onSuccess.a(t8);
        } catch (Throwable th) {
            Fa.d.g(th);
            p231sa.a.c(th);
        }
    }
}
