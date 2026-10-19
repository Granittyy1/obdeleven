package io.reactivex.internal.operators.completable;

import p033c7.S;

/* JADX INFO: compiled from: CompletableFromCallable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f40673b;

    public c(S s10) {
        this.f40673b = s10;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        p148la.b bVarA = io.reactivex.disposables.a.a(qa.a.f46189b);
        bVar.b(bVarA);
        try {
            this.f40673b.call();
            if (bVarA.d()) {
                return;
            }
            bVar.a();
        } catch (Throwable th) {
            Fa.d.g(th);
            if (bVarA.d()) {
                return;
            }
            bVar.onError(th);
        }
    }
}
