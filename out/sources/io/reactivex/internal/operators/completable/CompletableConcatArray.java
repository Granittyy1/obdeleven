package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class CompletableConcatArray extends p123ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p123ja.c[] f40670b;

    public static final class ConcatInnerObserver extends AtomicInteger implements p123ja.b {
        private static final long serialVersionUID = -7965400327305809232L;
        final p123ja.b actual;
        int index;
        final SequentialDisposable sd = new SequentialDisposable();
        final p123ja.c[] sources;

        public ConcatInnerObserver(p123ja.b bVar, p123ja.c[] cVarArr) {
            this.actual = bVar;
            this.sources = cVarArr;
        }

        @Override // p123ja.b
        public final void a() {
            c();
        }

        @Override // p123ja.b
        public final void b(p148la.b bVar) {
            SequentialDisposable sequentialDisposable = this.sd;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, bVar);
        }

        public final void c() {
            if (!this.sd.d() && getAndIncrement() == 0) {
                p123ja.c[] cVarArr = this.sources;
                while (!this.sd.d()) {
                    int i10 = this.index;
                    this.index = i10 + 1;
                    if (i10 == cVarArr.length) {
                        this.actual.a();
                        return;
                    } else {
                        cVarArr[i10].b(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p123ja.b
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }
    }

    public CompletableConcatArray(p123ja.c[] cVarArr) {
        this.f40670b = cVarArr;
    }

    @Override // p123ja.a
    public final void f(p123ja.b bVar) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(bVar, this.f40670b);
        bVar.b(concatInnerObserver.sd);
        concatInnerObserver.c();
    }
}
