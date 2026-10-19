package io.reactivex.internal.operators.single;

import Fa.d;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: SingleDoOnSuccess.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f40877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.b<? super T> f40878c;

    /* JADX INFO: compiled from: SingleDoOnSuccess.java */
    public final class a implements q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super T> f40879b;

        public a(q<? super T> qVar) {
            this.f40879b = qVar;
        }

        @Override // p123ja.q
        public final void b(p148la.b bVar) {
            this.f40879b.b(bVar);
        }

        @Override // p123ja.q
        public final void onError(Throwable th) {
            this.f40879b.onError(th);
        }

        @Override // p123ja.q
        public final void onSuccess(T t8) {
            q<? super T> qVar = this.f40879b;
            try {
                b.this.f40878c.a(t8);
                qVar.onSuccess(t8);
            } catch (Throwable th) {
                d.g(th);
                qVar.onError(th);
            }
        }
    }

    public b(p pVar, p183oa.b bVar) {
        this.f40877b = pVar;
        this.f40878c = bVar;
    }

    @Override // p123ja.p
    public final void e(q<? super T> qVar) {
        this.f40877b.c(new a(qVar));
    }
}
