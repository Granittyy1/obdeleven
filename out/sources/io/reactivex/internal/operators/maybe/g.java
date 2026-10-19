package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: MaybeIsEmpty.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g<T> extends io.reactivex.internal.operators.maybe.a<T, Boolean> {

    /* JADX INFO: compiled from: MaybeIsEmpty.java */
    public static final class a<T> implements p123ja.j<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super Boolean> f40809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p148la.b f40810c;

        public a(p123ja.j<? super Boolean> jVar) {
            this.f40809b = jVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.f40809b.onSuccess(Boolean.TRUE);
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40810c, bVar)) {
                this.f40810c = bVar;
                this.f40809b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40810c.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40810c.dispose();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.f40809b.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.f40809b.onSuccess(Boolean.FALSE);
        }
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super Boolean> jVar) {
        this.f40794b.a(new a(jVar));
    }
}
