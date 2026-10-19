package io.reactivex.internal.operators.observable;

import p123ja.l;
import p123ja.n;

/* JADX INFO: compiled from: ObservableMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p183oa.c<? super T, ? extends U> f40862c;

    /* JADX INFO: compiled from: ObservableMap.java */
    public static final class a<T, U> extends io.reactivex.internal.observers.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p183oa.c<? super T, ? extends U> f40863f;

        public a(n<? super U> nVar, p183oa.c<? super T, ? extends U> cVar) {
            super(nVar);
            this.f40863f = cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p123ja.n
        public final void c(T t8) {
            if (this.f40669e) {
                return;
            }
            n<? super R> nVar = this.f40666b;
            try {
                U uApply = this.f40863f.apply(t8);
                Q3.d.I(uApply, "The mapper function returned a null value.");
                nVar.c((Object) uApply);
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40667c.dispose();
                onError(th);
            }
        }

        @Override // ra.f
        public final int h(int i10) {
            return 0;
        }

        @Override // ra.j
        public final U poll() throws Exception {
            T tPoll = this.f40668d.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f40863f.apply(tPoll);
            Q3.d.I(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public h(l lVar, p183oa.c cVar) {
        super(lVar);
        this.f40862c = cVar;
    }

    @Override // p123ja.l
    public final void e(n<? super U> nVar) {
        this.f40839b.d(new a(nVar, this.f40862c));
    }
}
