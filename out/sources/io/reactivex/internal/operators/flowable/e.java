package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableFilter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p183oa.d<? super T> f40754d;

    /* JADX INFO: compiled from: FlowableFilter.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p183oa.d<? super T> f40755g;

        public a(ra.a<? super T> aVar, p183oa.d<? super T> dVar) {
            super(aVar);
            this.f40755g = dVar;
        }

        @Override // bc.b
        public final void c(T t8) {
            if (f(t8)) {
                return;
            }
            this.f40957c.g(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ra.a
        public final boolean f(T t8) {
            if (this.f40959e) {
                return false;
            }
            int i10 = this.f40960f;
            ra.a<? super R> aVar = this.f40956b;
            if (i10 != 0) {
                return aVar.f(null);
            }
            try {
                return this.f40755g.a(t8) && aVar.f((Object) t8);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            ra.g<T> gVar = this.f40958d;
            while (true) {
                T tPoll = gVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f40755g.a(tPoll)) {
                    return tPoll;
                }
                if (this.f40960f == 2) {
                    gVar.g(1L);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FlowableFilter.java */
    public static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements ra.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p183oa.d<? super T> f40756g;

        public b(p123ja.g gVar, p183oa.d dVar) {
            super(gVar);
            this.f40756g = dVar;
        }

        @Override // bc.b
        public final void c(T t8) {
            if (f(t8)) {
                return;
            }
            this.f40962c.g(1L);
        }

        @Override // ra.a
        public final boolean f(T t8) {
            if (this.f40964e) {
                return false;
            }
            int i10 = this.f40965f;
            p123ja.g gVar = this.f40961b;
            if (i10 != 0) {
                gVar.c(null);
                return true;
            }
            try {
                boolean zA = this.f40756g.a(t8);
                if (zA) {
                    gVar.c(t8);
                }
                return zA;
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40962c.cancel();
                onError(th);
                return true;
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            ra.g<T> gVar = this.f40963d;
            while (true) {
                T tPoll = gVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f40756g.a(tPoll)) {
                    return tPoll;
                }
                if (this.f40965f == 2) {
                    gVar.g(1L);
                }
            }
        }
    }

    public e(p123ja.d<T> dVar, p183oa.d<? super T> dVar2) {
        super(dVar);
        this.f40754d = dVar2;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        boolean z10 = gVar instanceof ra.a;
        p183oa.d<? super T> dVar = this.f40754d;
        p123ja.d<T> dVar2 = this.f40737c;
        if (z10) {
            dVar2.d(new a((ra.a) gVar, dVar));
        } else {
            dVar2.d(new b(gVar, dVar));
        }
    }
}
