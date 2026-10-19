package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.c<? super T, ? extends R> f40815c;

    /* JADX INFO: compiled from: MaybeMap.java */
    public static final class a<T, R> implements p123ja.j<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super R> f40816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p183oa.c<? super T, ? extends R> f40817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40818d;

        public a(p123ja.j<? super R> jVar, p183oa.c<? super T, ? extends R> cVar) {
            this.f40816b = jVar;
            this.f40817c = cVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.f40816b.a();
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40818d, bVar)) {
                this.f40818d = bVar;
                this.f40816b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40818d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            p148la.b bVar = this.f40818d;
            this.f40818d = DisposableHelper.f40662b;
            bVar.dispose();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.f40816b.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            p123ja.j<? super R> jVar = this.f40816b;
            try {
                R rApply = this.f40817c.apply(t8);
                Q3.d.I(rApply, "The mapper returned a null item");
                jVar.onSuccess(rApply);
            } catch (Throwable th) {
                Fa.d.g(th);
                jVar.onError(th);
            }
        }
    }

    public j(p123ja.h hVar, p183oa.c cVar) {
        super(hVar);
        this.f40815c = cVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super R> jVar) {
        this.f40794b.a(new a(jVar, this.f40815c));
    }
}
