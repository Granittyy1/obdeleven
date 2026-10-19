package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import p123ja.n;

/* JADX INFO: compiled from: ObservableAny.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends io.reactivex.internal.operators.observable.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.e f40840c;

    /* JADX INFO: compiled from: ObservableAny.java */
    public static final class a<T> implements n<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<? super Boolean> f40841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qa.a.e f40842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40844e;

        public a(n nVar, qa.a.e eVar) {
            this.f40841b = nVar;
            this.f40842c = eVar;
        }

        @Override // p123ja.n
        public final void a() {
            if (this.f40844e) {
                return;
            }
            this.f40844e = true;
            Boolean bool = Boolean.FALSE;
            n<? super Boolean> nVar = this.f40841b;
            nVar.c(bool);
            nVar.a();
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40843d, bVar)) {
                this.f40843d = bVar;
                this.f40841b.b(this);
            }
        }

        @Override // p123ja.n
        public final void c(T t8) {
            if (this.f40844e) {
                return;
            }
            try {
                if (this.f40842c.a(t8)) {
                    this.f40844e = true;
                    this.f40843d.dispose();
                    Boolean bool = Boolean.TRUE;
                    n<? super Boolean> nVar = this.f40841b;
                    nVar.c(bool);
                    nVar.a();
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40843d.dispose();
                onError(th);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40843d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40843d.dispose();
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            if (this.f40844e) {
                p231sa.a.c(th);
            } else {
                this.f40844e = true;
                this.f40841b.onError(th);
            }
        }
    }

    public b(h hVar, qa.a.e eVar) {
        super(hVar);
        this.f40840c = eVar;
    }

    @Override // p123ja.l
    public final void e(n<? super Boolean> nVar) {
        this.f40839b.d(new a(nVar, this.f40840c));
    }
}
