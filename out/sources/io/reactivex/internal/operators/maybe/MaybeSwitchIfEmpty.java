package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSwitchIfEmpty<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p123ja.h f40784c;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b {
        private static final long serialVersionUID = -2223459372976438024L;
        final p123ja.j<? super T> actual;
        final p123ja.k<? extends T> other;

        public static final class a<T> implements p123ja.j<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p123ja.j<? super T> f40785b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AtomicReference<p148la.b> f40786c;

            public a(p123ja.j<? super T> jVar, AtomicReference<p148la.b> atomicReference) {
                this.f40785b = jVar;
                this.f40786c = atomicReference;
            }

            @Override // p123ja.j
            public final void a() {
                this.f40785b.a();
            }

            @Override // p123ja.j
            public final void b(p148la.b bVar) {
                DisposableHelper.f(this.f40786c, bVar);
            }

            @Override // p123ja.j
            public final void onError(Throwable th) {
                this.f40785b.onError(th);
            }

            @Override // p123ja.j
            public final void onSuccess(T t8) {
                this.f40785b.onSuccess(t8);
            }
        }

        public SwitchIfEmptyMaybeObserver(p123ja.j jVar, p123ja.h hVar) {
            this.actual = jVar;
            this.other = hVar;
        }

        @Override // p123ja.j
        public final void a() {
            p148la.b bVar = get();
            if (bVar == DisposableHelper.f40662b || !compareAndSet(bVar, null)) {
                return;
            }
            this.other.a(new a(this.actual, this));
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.f(this, bVar)) {
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
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.actual.onSuccess(t8);
        }
    }

    public MaybeSwitchIfEmpty(p123ja.h hVar, p123ja.h hVar2) {
        super(hVar);
        this.f40784c = hVar2;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40794b.a(new SwitchIfEmptyMaybeObserver(jVar, this.f40784c));
    }
}
