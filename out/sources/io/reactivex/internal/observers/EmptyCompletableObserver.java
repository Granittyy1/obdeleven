package io.reactivex.internal.observers;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class EmptyCompletableObserver extends AtomicReference<p148la.b> implements p123ja.b, p148la.b {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // p123ja.b
    public final void a() {
        lazySet(DisposableHelper.f40662b);
    }

    @Override // p123ja.b
    public final void b(p148la.b bVar) {
        DisposableHelper.f(this, bVar);
    }

    @Override // p148la.b
    public final boolean d() {
        return get() == DisposableHelper.f40662b;
    }

    @Override // p148la.b
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // p123ja.b
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.f40662b);
        p231sa.a.c(new OnErrorNotImplementedException(th));
    }
}
