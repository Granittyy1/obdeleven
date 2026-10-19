package io.reactivex.internal.operators.observable;

import androidx.compose.foundation.text.B;
import p123ja.n;

/* JADX INFO: compiled from: ObservableFilter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f40852c;

    /* JADX INFO: compiled from: ObservableFilter.java */
    public static final class a<T> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final B f40853f;

        public a(n nVar, B b10) {
            super(nVar);
            this.f40853f = b10;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p123ja.n
        public final void c(T t8) {
            n<? super R> nVar = this.f40666b;
            try {
                if (this.f40853f.a(t8)) {
                    nVar.c((Object) t8);
                }
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
        public final T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f40668d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f40853f.a(tPoll));
            return tPoll;
        }
    }

    public e(g gVar, B b10) {
        super(gVar);
        this.f40852c = b10;
    }

    @Override // p123ja.l
    public final void e(n<? super T> nVar) {
        this.f40839b.d(new a(nVar, this.f40852c));
    }
}
