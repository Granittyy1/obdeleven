package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import p123ja.n;
import ra.e;

/* JADX INFO: compiled from: BasicFuseableObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, R> implements n<T>, e<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n<? super R> f40666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p148la.b f40667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<T> f40668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40669e;

    public a(n<? super R> nVar) {
        this.f40666b = nVar;
    }

    @Override // p123ja.n
    public final void a() {
        if (this.f40669e) {
            return;
        }
        this.f40669e = true;
        this.f40666b.a();
    }

    @Override // p123ja.n
    public final void b(p148la.b bVar) {
        if (DisposableHelper.g(this.f40667c, bVar)) {
            this.f40667c = bVar;
            if (bVar instanceof e) {
                this.f40668d = (e) bVar;
            }
            this.f40666b.b(this);
        }
    }

    @Override // ra.j
    public final void clear() {
        this.f40668d.clear();
    }

    @Override // p148la.b
    public final boolean d() {
        return this.f40667c.d();
    }

    @Override // p148la.b
    public final void dispose() {
        this.f40667c.dispose();
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return this.f40668d.isEmpty();
    }

    @Override // ra.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p123ja.n
    public final void onError(Throwable th) {
        if (this.f40669e) {
            p231sa.a.c(th);
        } else {
            this.f40669e = true;
            this.f40666b.onError(th);
        }
    }
}
