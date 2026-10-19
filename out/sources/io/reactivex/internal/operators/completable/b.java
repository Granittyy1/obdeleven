package io.reactivex.internal.operators.completable;

/* JADX INFO: compiled from: CompletableFromAction.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p183oa.a f40672b;

    public b(p183oa.a aVar) {
        this.f40672b = aVar;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        p148la.b bVarA = io.reactivex.disposables.a.a(qa.a.f46189b);
        bVar.b(bVarA);
        try {
            this.f40672b.run();
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
