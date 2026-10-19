package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import p123ja.l;
import p123ja.n;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: ObservableAnySingle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends p<Boolean> implements ra.d<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f40845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.e f40846c;

    /* JADX INFO: compiled from: ObservableAnySingle.java */
    public static final class a<T> implements n<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super Boolean> f40847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qa.a.e f40848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40850e;

        public a(q qVar, qa.a.e eVar) {
            this.f40847b = qVar;
            this.f40848c = eVar;
        }

        @Override // p123ja.n
        public final void a() {
            if (this.f40850e) {
                return;
            }
            this.f40850e = true;
            this.f40847b.onSuccess(Boolean.FALSE);
        }

        @Override // p123ja.n
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40849d, bVar)) {
                this.f40849d = bVar;
                this.f40847b.b(this);
            }
        }

        @Override // p123ja.n
        public final void c(T t8) {
            if (this.f40850e) {
                return;
            }
            try {
                if (this.f40848c.a(t8)) {
                    this.f40850e = true;
                    this.f40849d.dispose();
                    this.f40847b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40849d.dispose();
                onError(th);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40849d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40849d.dispose();
        }

        @Override // p123ja.n
        public final void onError(Throwable th) {
            if (this.f40850e) {
                p231sa.a.c(th);
            } else {
                this.f40850e = true;
                this.f40847b.onError(th);
            }
        }
    }

    public c(h hVar, qa.a.e eVar) {
        this.f40845b = hVar;
        this.f40846c = eVar;
    }

    @Override // ra.d
    public final l<Boolean> a() {
        return new b(this.f40845b, this.f40846c);
    }

    @Override // p123ja.p
    public final void e(q<? super Boolean> qVar) {
        this.f40845b.d(new a(qVar, this.f40846c));
    }
}
