package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeOnErrorNext<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.c<? super Throwable, ? extends p123ja.k<? extends T>> f40777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40778d;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<p148la.b> implements p123ja.j<T>, p148la.b {
        private static final long serialVersionUID = 2026620218879969836L;
        final p123ja.j<? super T> actual;
        final boolean allowFatal;
        final p183oa.c<? super Throwable, ? extends p123ja.k<? extends T>> resumeFunction;

        public static final class a<T> implements p123ja.j<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p123ja.j<? super T> f40779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AtomicReference<p148la.b> f40780c;

            public a(p123ja.j<? super T> jVar, AtomicReference<p148la.b> atomicReference) {
                this.f40779b = jVar;
                this.f40780c = atomicReference;
            }

            @Override // p123ja.j
            public final void a() {
                this.f40779b.a();
            }

            @Override // p123ja.j
            public final void b(p148la.b bVar) {
                DisposableHelper.f(this.f40780c, bVar);
            }

            @Override // p123ja.j
            public final void onError(Throwable th) {
                this.f40779b.onError(th);
            }

            @Override // p123ja.j
            public final void onSuccess(T t8) {
                this.f40779b.onSuccess(t8);
            }
        }

        public OnErrorNextMaybeObserver(p123ja.j<? super T> jVar, p183oa.c<? super Throwable, ? extends p123ja.k<? extends T>> cVar, boolean z10) {
            this.actual = jVar;
            this.resumeFunction = cVar;
            this.allowFatal = z10;
        }

        @Override // p123ja.j
        public final void a() {
            this.actual.a();
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
            if (!this.allowFatal && !(th instanceof Exception)) {
                this.actual.onError(th);
                return;
            }
            try {
                p123ja.k<? extends T> kVarApply = this.resumeFunction.apply(th);
                Q3.d.I(kVarApply, "The resumeFunction returned a null MaybeSource");
                p123ja.k<? extends T> kVar = kVarApply;
                DisposableHelper.c(this, null);
                kVar.a(new a(this.actual, this));
            } catch (Throwable th2) {
                Fa.d.g(th2);
                this.actual.onError(new CompositeException(th, th2));
            }
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            this.actual.onSuccess(t8);
        }
    }

    public MaybeOnErrorNext(p123ja.h hVar, p183oa.c cVar) {
        super(hVar);
        this.f40777c = cVar;
        this.f40778d = true;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40794b.a(new OnErrorNextMaybeObserver(jVar, this.f40777c, this.f40778d));
    }
}
