package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.SequentialDisposable;
import p123ja.n;

/* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f40866c;

    /* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
    public static final class a<T> implements n<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<? super T> f40867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f40868c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40870e = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SequentialDisposable f40869d = new SequentialDisposable();

        public a(n nVar, g gVar) {
            this.f40867b = nVar;
            this.f40868c = gVar;
        }

        @Override // p123ja.n
        public final void a() {
            if (!this.f40870e) {
                this.f40867b.a();
            } else {
                this.f40870e = false;
                this.f40868c.d(this);
            }
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            this.f40869d.a(bVar);
        }

        @Override // p123ja.n
        public final void c(T t8) {
            if (this.f40870e) {
                this.f40870e = false;
            }
            this.f40867b.c(t8);
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            this.f40867b.onError(th);
        }
    }

    public j(e eVar, g gVar) {
        super(eVar);
        this.f40866c = gVar;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        a aVar = new a(nVar, this.f40866c);
        nVar.b(aVar.f40869d);
        this.f40839b.d(aVar);
    }
}
