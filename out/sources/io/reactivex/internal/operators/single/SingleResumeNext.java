package io.reactivex.internal.operators.single;

import Q3.d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.p;
import p123ja.q;
import p123ja.r;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleResumeNext<T> extends p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f40871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.g f40872c;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<p148la.b> implements q<T>, p148la.b {
        private static final long serialVersionUID = -5314538511045349925L;
        final q<? super T> actual;
        final p183oa.c<? super Throwable, ? extends r<? extends T>> nextFunction;

        public ResumeMainSingleObserver(q qVar, qa.a.g gVar) {
            this.actual = qVar;
            this.nextFunction = gVar;
        }

        @Override // p123ja.q
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

        @Override // p123ja.q
        public final void onError(Throwable th) {
            try {
                r<? extends T> rVarApply = this.nextFunction.apply(th);
                d.I(rVarApply, "The nextFunction returned a null SingleSource.");
                rVarApply.c(new D7.r(this, this.actual));
            } catch (Throwable th2) {
                Fa.d.g(th2);
                this.actual.onError(new CompositeException(th, th2));
            }
        }

        @Override // p123ja.q
        public final void onSuccess(T t8) {
            this.actual.onSuccess(t8);
        }
    }

    public SingleResumeNext(p pVar, qa.a.g gVar) {
        this.f40871b = pVar;
        this.f40872c = gVar;
    }

    @Override // p123ja.p
    public final void e(q<? super T> qVar) {
        this.f40871b.c(new ResumeMainSingleObserver(qVar, this.f40872c));
    }
}
