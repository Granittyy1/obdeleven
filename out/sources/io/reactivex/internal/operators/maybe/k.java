package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: MaybePeek.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa.a.c f40819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p183oa.b<? super T> f40820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p183oa.b<? super Throwable> f40821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qa.a.b f40822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qa.a.b f40823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qa.a.b f40824h;

    /* JADX INFO: compiled from: MaybePeek.java */
    public static final class a<T> implements p123ja.j<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p123ja.j<? super T> f40825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k<T> f40826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p148la.b f40827d;

        public a(p123ja.j<? super T> jVar, k<T> kVar) {
            this.f40825b = jVar;
            this.f40826c = kVar;
        }

        @Override // p123ja.j
        public final void a() {
            p148la.b bVar = this.f40827d;
            DisposableHelper disposableHelper = DisposableHelper.f40662b;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f40826c.f40822f.getClass();
                this.f40827d = disposableHelper;
                this.f40825b.a();
                c();
            } catch (Throwable th) {
                Fa.d.g(th);
                e(th);
            }
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            p123ja.j<? super T> jVar = this.f40825b;
            if (DisposableHelper.g(this.f40827d, bVar)) {
                try {
                    this.f40826c.f40819c.getClass();
                    this.f40827d = bVar;
                    jVar.b(this);
                } catch (Throwable th) {
                    Fa.d.g(th);
                    bVar.dispose();
                    this.f40827d = DisposableHelper.f40662b;
                    jVar.b(EmptyDisposable.f40664b);
                    jVar.onError(th);
                }
            }
        }

        public final void c() {
            try {
                this.f40826c.f40823g.getClass();
            } catch (Throwable th) {
                Fa.d.g(th);
                p231sa.a.c(th);
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40827d.d();
        }

        @Override // p148la.b
        public final void dispose() {
            try {
                this.f40826c.f40824h.getClass();
            } catch (Throwable th) {
                Fa.d.g(th);
                p231sa.a.c(th);
            }
            this.f40827d.dispose();
            this.f40827d = DisposableHelper.f40662b;
        }

        public final void e(Throwable th) {
            try {
                this.f40826c.f40821e.a(th);
            } catch (Throwable th2) {
                Fa.d.g(th2);
                th = new CompositeException(th, th2);
            }
            this.f40827d = DisposableHelper.f40662b;
            this.f40825b.onError(th);
            c();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            if (this.f40827d == DisposableHelper.f40662b) {
                p231sa.a.c(th);
            } else {
                e(th);
            }
        }

        @Override // p123ja.j
        public final void onSuccess(T t8) {
            p148la.b bVar = this.f40827d;
            DisposableHelper disposableHelper = DisposableHelper.f40662b;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f40826c.f40820d.a(t8);
                this.f40827d = disposableHelper;
                this.f40825b.onSuccess(t8);
                c();
            } catch (Throwable th) {
                Fa.d.g(th);
                e(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p123ja.h hVar, p183oa.b bVar, p183oa.b bVar2) {
        super(hVar);
        qa.a.c cVar = qa.a.f46191d;
        qa.a.b bVar3 = qa.a.f46190c;
        this.f40819c = cVar;
        this.f40820d = bVar;
        this.f40821e = bVar2;
        this.f40822f = bVar3;
        this.f40823g = bVar3;
        this.f40824h = bVar3;
    }

    @Override // p123ja.h
    public final void c(p123ja.j<? super T> jVar) {
        this.f40794b.a(new a(jVar, this));
    }
}
