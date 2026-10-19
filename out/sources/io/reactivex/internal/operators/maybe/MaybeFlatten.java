package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatten<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.c<? super T, ? extends p123ja.k<? extends R>> f40773c;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b {
        private static final long serialVersionUID = 4375739915521278546L;
        final p123ja.j<? super R> actual;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p148la.b f40774d;
        final p183oa.c<? super T, ? extends p123ja.k<? extends R>> mapper;

        public final class a implements p123ja.j<R> {
            public a() {
            }

            @Override // p123ja.j
            public final void a() {
                FlatMapMaybeObserver.this.actual.a();
            }

            @Override // p123ja.j
            public final void b(p148la.b bVar) {
                DisposableHelper.f(FlatMapMaybeObserver.this, bVar);
            }

            @Override // p123ja.j
            public final void onError(Throwable th) {
                FlatMapMaybeObserver.this.actual.onError(th);
            }

            @Override // p123ja.j
            public final void onSuccess(R r10) {
                FlatMapMaybeObserver.this.actual.onSuccess(r10);
            }
        }

        public FlatMapMaybeObserver(p123ja.j<? super R> jVar, p183oa.c<? super T, ? extends p123ja.k<? extends R>> cVar) {
            this.actual = jVar;
            this.mapper = cVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.actual.a();
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40774d, bVar)) {
                this.f40774d = bVar;
                this.actual.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return DisposableHelper.b(get());
        }

        @Override // p148la.b
        public final void dispose() {
            DisposableHelper.a(this);
            this.f40774d.dispose();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            try {
                p123ja.k<? extends R> kVarApply = this.mapper.apply(t8);
                Q3.d.I(kVarApply, "The mapper returned a null MaybeSource");
                p123ja.k<? extends R> kVar = kVarApply;
                if (d()) {
                    return;
                }
                kVar.a(new a());
            } catch (Exception e10) {
                Fa.d.g(e10);
                this.actual.onError(e10);
            }
        }
    }

    public MaybeFlatten(p123ja.h hVar, p183oa.c cVar) {
        super(hVar);
        this.f40773c = cVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super R> jVar) {
        this.f40794b.a(new FlatMapMaybeObserver(jVar, this.f40773c));
    }
}
