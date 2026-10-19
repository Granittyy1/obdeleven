package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa.a.h f40760d;

    /* JADX INFO: compiled from: FlowableMap.java */
    public static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final qa.a.h f40761g;

        public a(ra.a aVar, qa.a.h hVar) {
            super(aVar);
            this.f40761g = hVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // bc.b
        public final void c(T t8) {
            if (this.f40959e) {
                return;
            }
            int i10 = this.f40960f;
            ra.a<? super R> aVar = this.f40956b;
            if (i10 != 0) {
                aVar.c(null);
                return;
            }
            try {
                Object objApply = this.f40761g.apply(t8);
                Q3.d.I(objApply, "The mapper function returned a null value.");
                aVar.c((Object) objApply);
            } catch (Throwable th) {
                b(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // ra.a
        public final boolean f(T t8) {
            if (this.f40959e) {
                return false;
            }
            try {
                Object objApply = this.f40761g.apply(t8);
                Q3.d.I(objApply, "The mapper function returned a null value.");
                return this.f40956b.f((Object) objApply);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // ra.j
        public final U poll() throws Exception {
            T tPoll = this.f40958d.poll();
            if (tPoll == null) {
                return null;
            }
            U u10 = (U) this.f40761g.apply(tPoll);
            Q3.d.I(u10, "The mapper function returned a null value.");
            return u10;
        }
    }

    /* JADX INFO: compiled from: FlowableMap.java */
    public static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final qa.a.h f40762g;

        public b(p123ja.g gVar, qa.a.h hVar) {
            super(gVar);
            this.f40762g = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bc.b
        public final void c(T t8) {
            if (this.f40964e) {
                return;
            }
            int i10 = this.f40965f;
            p123ja.g gVar = this.f40961b;
            if (i10 != 0) {
                gVar.c(null);
                return;
            }
            try {
                Object objApply = this.f40762g.apply(t8);
                Q3.d.I(objApply, "The mapper function returned a null value.");
                gVar.c(objApply);
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40962c.cancel();
                onError(th);
            }
        }

        @Override // ra.j
        public final U poll() throws Exception {
            T tPoll = this.f40963d.poll();
            if (tPoll == null) {
                return null;
            }
            U u10 = (U) this.f40762g.apply(tPoll);
            Q3.d.I(u10, "The mapper function returned a null value.");
            return u10;
        }
    }

    public g(p123ja.d dVar, qa.a.h hVar) {
        super(dVar);
        this.f40760d = hVar;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        boolean z10 = gVar instanceof ra.a;
        qa.a.h hVar = this.f40760d;
        p123ja.d<T> dVar = this.f40737c;
        if (z10) {
            dVar.d(new a((ra.a) gVar, hVar));
        } else {
            dVar.d(new b(gVar, hVar));
        }
    }
}
