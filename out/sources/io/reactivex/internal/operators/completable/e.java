package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: CompletablePeek.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.a f40678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.c f40679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p183oa.b<? super Throwable> f40680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p183oa.a f40681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qa.a.b f40682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qa.a.b f40683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qa.a.b f40684h;

    /* JADX INFO: compiled from: CompletablePeek.java */
    public final class a implements p123ja.b, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.b f40685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p148la.b f40686c;

        public a(p123ja.b bVar) {
            this.f40685b = bVar;
        }

        @Override // p123ja.b
        public final void a() {
            p123ja.b bVar = this.f40685b;
            e eVar = e.this;
            if (this.f40686c == DisposableHelper.f40662b) {
                return;
            }
            try {
                eVar.f40681e.run();
                eVar.f40682f.getClass();
                bVar.a();
                try {
                    eVar.f40683g.getClass();
                } catch (Throwable th) {
                    Fa.d.g(th);
                    p231sa.a.c(th);
                }
            } catch (Throwable th2) {
                Fa.d.g(th2);
                bVar.onError(th2);
            }
        }

        @Override // p123ja.b
        public final void b(p148la.b bVar) {
            p123ja.b bVar2 = this.f40685b;
            try {
                e.this.f40679c.getClass();
                if (DisposableHelper.g(this.f40686c, bVar)) {
                    this.f40686c = bVar;
                    bVar2.b(this);
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                bVar.dispose();
                this.f40686c = DisposableHelper.f40662b;
                bVar2.b(EmptyDisposable.f40664b);
                bVar2.onError(th);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40686c.d();
        }

        @Override // p148la.b
        public final void dispose() {
            try {
                e.this.f40684h.getClass();
            } catch (Throwable th) {
                Fa.d.g(th);
                p231sa.a.c(th);
            }
            this.f40686c.dispose();
        }

        @Override // p123ja.b
        public final void onError(Throwable th) {
            e eVar = e.this;
            if (this.f40686c == DisposableHelper.f40662b) {
                p231sa.a.c(th);
                return;
            }
            try {
                eVar.f40680d.a(th);
                eVar.f40682f.getClass();
            } catch (Throwable th2) {
                Fa.d.g(th2);
                th = new CompositeException(th, th2);
            }
            this.f40685b.onError(th);
            try {
                eVar.f40683g.getClass();
            } catch (Throwable th3) {
                Fa.d.g(th3);
                p231sa.a.c(th3);
            }
        }
    }

    public e(p123ja.a aVar, p183oa.b bVar, p183oa.a aVar2) {
        qa.a.c cVar = qa.a.f46191d;
        qa.a.b bVar2 = qa.a.f46190c;
        this.f40678b = aVar;
        this.f40679c = cVar;
        this.f40680d = bVar;
        this.f40681e = aVar2;
        this.f40682f = bVar2;
        this.f40683g = bVar2;
        this.f40684h = bVar2;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        this.f40678b.b(new a(bVar));
    }
}
