package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: MaybeIsEmptySingle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends p<Boolean> implements ra.c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.h f40811b;

    /* JADX INFO: compiled from: MaybeIsEmptySingle.java */
    public static final class a<T> implements p123ja.j<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super Boolean> f40812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p148la.b f40813c;

        public a(q<? super Boolean> qVar) {
            this.f40812b = qVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.f40813c = DisposableHelper.f40662b;
            this.f40812b.onSuccess(Boolean.TRUE);
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40813c, bVar)) {
                this.f40813c = bVar;
                this.f40812b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40813c.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40813c.dispose();
            this.f40813c = DisposableHelper.f40662b;
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.f40813c = DisposableHelper.f40662b;
            this.f40812b.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.f40813c = DisposableHelper.f40662b;
            this.f40812b.onSuccess(Boolean.FALSE);
        }
    }

    public h(p123ja.h hVar) {
        this.f40811b = hVar;
    }

    @Override // ra.c
    public final g b() {
        return new g(this.f40811b);
    }

    @Override // p123ja.p
    public final void e(q<? super Boolean> qVar) {
        this.f40811b.a(new a(qVar));
    }
}
