package io.reactivex.internal.operators.flowable;

import p123ja.n;

/* JADX INFO: compiled from: FlowableFromObservable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends p123ja.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p256ua.a f40757c;

    public f(p256ua.a aVar) {
        this.f40757c = aVar;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40757c.d(new a(gVar));
    }

    /* JADX INFO: compiled from: FlowableFromObservable.java */
    public static class a<T> implements n<T>, bc.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.g f40758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p148la.b f40759c;

        public a(p123ja.g gVar) {
            this.f40758b = gVar;
        }

        @Override // p123ja.n
        public final void a() {
            this.f40758b.a();
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            this.f40759c = bVar;
            this.f40758b.e(this);
        }

        @Override // p123ja.n
        public final void c(T t8) {
            this.f40758b.c(t8);
        }

        @Override // bc.c
        public final void cancel() {
            this.f40759c.dispose();
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            this.f40758b.onError(th);
        }

        @Override // bc.c
        public final void g(long j) {
        }
    }
}
