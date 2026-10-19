package androidx.concurrent.futures;

import p052e0.b;

/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p052e0.a<T> f15870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<Void> f15871c = new b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15872d;

    public final void finalize() {
        b<Void> bVar;
        p052e0.a<T> aVar = this.f15870b;
        if (aVar != null) {
            p052e0.a.C0358a c0358a = aVar.f34708c;
            if (!c0358a.isDone()) {
                c0358a.l(new CallbackToFutureAdapter$FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15869a));
            }
        }
        if (this.f15872d || (bVar = this.f15871c) == null) {
            return;
        }
        bVar.k(null);
    }
}
