package androidx.lifecycle;

import kotlinx.coroutines.C2702l0;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1373p extends AbstractC1372o implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f17823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.coroutines.e f17824c;

    public C1373p(Lifecycle lifecycle, kotlin.coroutines.e coroutineContext) {
        kotlin.jvm.internal.i.e(coroutineContext, "coroutineContext");
        this.f17823b = lifecycle;
        this.f17824c = coroutineContext;
        if (lifecycle.b() == Lifecycle.State.f17749b) {
            C2702l0.b(coroutineContext, null);
        }
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f17824c;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f17823b;
        if (lifecycle.b().compareTo(Lifecycle.State.f17749b) <= 0) {
            lifecycle.c(this);
            C2702l0.b(this.f17824c, null);
        }
    }
}
