package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeFromCompletable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends p123ja.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.a f40806b;

    /* JADX INFO: compiled from: MaybeFromCompletable.java */
    public static final class a<T> implements p123ja.b, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super T> f40807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p148la.b f40808c;

        public a(p123ja.j<? super T> jVar) {
            this.f40807b = jVar;
        }

        @Override // p123ja.b
        public final void a() {
            this.f40808c = DisposableHelper.f40662b;
            this.f40807b.a();
        }

        @Override // p123ja.b
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40808c, bVar)) {
                this.f40808c = bVar;
                this.f40807b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40808c.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40808c.dispose();
            this.f40808c = DisposableHelper.f40662b;
        }

        @Override // p123ja.b
        public final void onError(Throwable th) {
            this.f40808c = DisposableHelper.f40662b;
            this.f40807b.onError(th);
        }
    }

    public f(p123ja.a aVar) {
        this.f40806b = aVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40806b.b(new a(jVar));
    }
}
