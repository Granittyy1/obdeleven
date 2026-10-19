package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapCompletable<T> extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.h f40771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.c<? super T, ? extends p123ja.c> f40772c;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p123ja.b, p148la.b {
        private static final long serialVersionUID = -2177128922851101253L;
        final p123ja.b actual;
        final p183oa.c<? super T, ? extends p123ja.c> mapper;

        public FlatMapCompletableObserver(p123ja.b bVar, p183oa.c<? super T, ? extends p123ja.c> cVar) {
            this.actual = bVar;
            this.mapper = cVar;
        }

        @Override // p123ja.j
        public final void a() {
            this.actual.a();
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            DisposableHelper.c(this, bVar);
        }

        @Override // p148la.b
        public final boolean d() {
            return DisposableHelper.b(get());
        }

        @Override // p148la.b
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            try {
                p123ja.c cVarApply = this.mapper.apply(t8);
                Q3.d.I(cVarApply, "The mapper returned a null CompletableSource");
                p123ja.c cVar = cVarApply;
                if (d()) {
                    return;
                }
                cVar.b(this);
            } catch (Throwable th) {
                Fa.d.g(th);
                onError(th);
            }
        }
    }

    public MaybeFlatMapCompletable(p123ja.h hVar, p183oa.c cVar) {
        this.f40771b = hVar;
        this.f40772c = cVar;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(bVar, this.f40772c);
        bVar.b(flatMapCompletableObserver);
        this.f40771b.a(flatMapCompletableObserver);
    }
}
