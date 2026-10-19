package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: MaybeFilterSingle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends p123ja.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f40800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.d<? super T> f40801c;

    /* JADX INFO: compiled from: MaybeFilterSingle.java */
    public static final class a<T> implements q<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super T> f40802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p183oa.d<? super T> f40803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40804d;

        public a(p123ja.j<? super T> jVar, p183oa.d<? super T> dVar) {
            this.f40802b = jVar;
            this.f40803c = dVar;
        }

        @Override // p123ja.q
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40804d, bVar)) {
                this.f40804d = bVar;
                this.f40802b.b(this);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40804d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            p148la.b bVar = this.f40804d;
            this.f40804d = DisposableHelper.f40662b;
            bVar.dispose();
        }

        @Override // p123ja.q
        public final void onError(Throwable th) {
            this.f40802b.onError(th);
        }

        @Override // p123ja.q
        public final void onSuccess(T t8) {
            p123ja.j<? super T> jVar = this.f40802b;
            try {
                if (this.f40803c.a(t8)) {
                    jVar.onSuccess(t8);
                } else {
                    jVar.a();
                }
            } catch (Throwable th) {
                Fa.d.g(th);
                jVar.onError(th);
            }
        }
    }

    public d(p pVar, p183oa.d dVar) {
        this.f40800b = pVar;
        this.f40801c = dVar;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40800b.c(new a(jVar, this.f40801c));
    }
}
