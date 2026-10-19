package io.reactivex.internal.operators.single;

import Fa.d;
import io.reactivex.exceptions.CompositeException;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: SingleDoOnError.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> extends p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.reactivex.internal.operators.observable.c f40873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B6.c f40874c;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.single.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SingleDoOnError.java */
    public final class C0462a implements q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super T> f40875b;

        public C0462a(q<? super T> qVar) {
            this.f40875b = qVar;
        }

        @Override // p123ja.q
        public final void b(p148la.b bVar) {
            this.f40875b.b(bVar);
        }

        @Override // p123ja.q
        public final void onError(Throwable th) {
            try {
                a.this.f40874c.getClass();
                th.getMessage();
            } catch (Throwable th2) {
                d.g(th2);
                th = new CompositeException(th, th2);
            }
            this.f40875b.onError(th);
        }

        @Override // p123ja.q
        public final void onSuccess(T t8) {
            this.f40875b.onSuccess(t8);
        }
    }

    public a(io.reactivex.internal.operators.observable.c cVar, B6.c cVar2) {
        this.f40873b = cVar;
        this.f40874c = cVar2;
    }

    @Override // p123ja.p
    public final void e(q<? super T> qVar) {
        this.f40873b.c(new C0462a(qVar));
    }
}
