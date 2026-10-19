package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeFilter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.d<? super T> f40796c;

    /* JADX INFO: compiled from: MaybeFilter.java */
    public static final class a<T> implements p123ja.j<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super T> f40797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p183oa.d<? super T> f40798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40799d;

        public a(p123ja.j<? super T> jVar, p183oa.d<? super T> dVar) {
            this.f40797b = jVar;
            this.f40798c = dVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.f40797b.a();
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40799d, bVar)) {
                this.f40799d = bVar;
                this.f40797b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40799d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            p148la.b bVar = this.f40799d;
            this.f40799d = DisposableHelper.f40662b;
            bVar.dispose();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.f40797b.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            p123ja.j<? super T> jVar = this.f40797b;
            try {
                if (this.f40798c.a(t8)) {
                    jVar.onSuccess(t8);
                } else {
                    jVar.a();
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                jVar.onError(th);
            }
        }
    }

    public c(p123ja.h hVar, p183oa.d dVar) {
        super(hVar);
        this.f40796c = dVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40794b.a(new a(jVar, this.f40796c));
    }
}
