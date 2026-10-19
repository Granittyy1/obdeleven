package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import p123ja.l;
import p123ja.m;
import p123ja.n;

/* JADX INFO: compiled from: ObservableScalarXMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i<T, R> extends l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f40864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.b f40865c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Object obj, C4.b bVar) {
        this.f40864b = obj;
        this.f40865c = bVar;
    }

    @Override // p123ja.l
    public final void e(n<? super R> nVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
        try {
            m mVar = (m) this.f40865c.apply(this.f40864b);
            if (!(mVar instanceof Callable)) {
                mVar.d(nVar);
                return;
            }
            try {
                Object objCall = ((Callable) mVar).call();
                if (objCall == null) {
                    nVar.b(emptyDisposable);
                    nVar.a();
                } else {
                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(nVar, objCall);
                    nVar.b(observableScalarXMap$ScalarDisposable);
                    observableScalarXMap$ScalarDisposable.run();
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                nVar.b(emptyDisposable);
                nVar.onError(th);
            }
        } catch (Throwable th2) {
            nVar.b(emptyDisposable);
            nVar.onError(th2);
        }
    }
}
