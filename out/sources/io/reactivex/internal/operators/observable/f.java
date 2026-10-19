package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.List;
import p123ja.l;
import p123ja.n;

/* JADX INFO: compiled from: ObservableFromIterable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f<T> extends l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40854b;

    /* JADX INFO: compiled from: ObservableFromIterable.java */
    public static final class a<T> extends io.reactivex.internal.observers.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<? super T> f40855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<? extends T> f40856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f40857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40860g;

        public a(n<? super T> nVar, Iterator<? extends T> it) {
            this.f40855b = nVar;
            this.f40856c = it;
        }

        @Override // ra.j
        public final void clear() {
            this.f40859f = true;
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40857d;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40857d = true;
        }

        @Override // ra.f
        public final int h(int i10) {
            this.f40858e = true;
            return 1;
        }

        @Override // ra.j
        public final boolean isEmpty() {
            return this.f40859f;
        }

        @Override // ra.j
        public final T poll() {
            if (this.f40859f) {
                return null;
            }
            boolean z10 = this.f40860g;
            Iterator<? extends T> it = this.f40856c;
            if (!z10) {
                this.f40860g = true;
            } else if (!it.hasNext()) {
                this.f40859f = true;
                return null;
            }
            T next = it.next();
            Q3.d.I(next, "The iterator returned a null value");
            return next;
        }
    }

    public f(List list) {
        this.f40854b = list;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
        try {
            Iterator<T> it = this.f40854b.iterator();
            try {
                if (!it.hasNext()) {
                    nVar.b(emptyDisposable);
                    nVar.a();
                    return;
                }
                a aVar = new a(nVar, it);
                nVar.b(aVar);
                if (aVar.f40858e) {
                    return;
                }
                while (!aVar.f40857d) {
                    try {
                        T next = aVar.f40856c.next();
                        Q3.d.I(next, "The iterator returned a null value");
                        aVar.f40855b.c(next);
                        if (aVar.f40857d) {
                            return;
                        }
                        try {
                            if (!aVar.f40856c.hasNext()) {
                                if (aVar.f40857d) {
                                    return;
                                }
                                aVar.f40855b.a();
                                return;
                            }
                        } catch (Throwable th) {
                            Fa.d.g(th);
                            aVar.f40855b.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Fa.d.g(th2);
                        aVar.f40855b.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Fa.d.g(th3);
                nVar.b(emptyDisposable);
                nVar.onError(th3);
            }
        } catch (Throwable th4) {
            Fa.d.g(th4);
            nVar.b(emptyDisposable);
            nVar.onError(th4);
        }
    }
}
