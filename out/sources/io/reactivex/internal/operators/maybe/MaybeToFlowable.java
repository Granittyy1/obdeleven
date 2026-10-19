package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToFlowable<T> extends p123ja.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p123ja.h f40787c;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements p123ja.j<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p148la.b f40788d;

        @Override // p123ja.j
        public final void a() {
            this.actual.a();
        }

        @Override // p123ja.j
        public final void b(p148la.b bVar) {
            if (DisposableHelper.g(this.f40788d, bVar)) {
                this.f40788d = bVar;
                this.actual.e(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, bc.c
        public final void cancel() {
            super.cancel();
            this.f40788d.dispose();
        }

        @Override // p123ja.j
        public final void onError(Throwable th) {
            this.actual.onError(th);
        }
    }

    public MaybeToFlowable(p123ja.h hVar) {
        this.f40787c = hVar;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40787c.a(new MaybeToFlowableSubscriber(gVar));
    }
}
