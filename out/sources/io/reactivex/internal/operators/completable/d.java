package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: compiled from: CompletableOnErrorComplete.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f40674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.j f40675c;

    /* JADX INFO: compiled from: CompletableOnErrorComplete.java */
    public final class a implements p123ja.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.b f40676b;

        public a(p123ja.b bVar) {
            this.f40676b = bVar;
        }

        @Override // p123ja.b
        public final void a() {
            this.f40676b.a();
        }

        @Override // p123ja.b
        public final void b(p148la.b bVar) {
            this.f40676b.b(bVar);
        }

        @Override // p123ja.b
        public final void onError(Throwable th) {
            p123ja.b bVar = this.f40676b;
            try {
                d.this.f40675c.getClass();
                bVar.a();
            } catch (Throwable th2) {
                Fa.d.g(th2);
                bVar.onError(new CompositeException(th, th2));
            }
        }
    }

    public d(e eVar) {
        qa.a.j jVar = qa.a.f46193f;
        this.f40674b = eVar;
        this.f40675c = jVar;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        this.f40674b.b(new a(bVar));
    }
}
