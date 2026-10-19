package androidx.compose.animation.core;

import androidx.lifecycle.InterfaceC1376t;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9360c;

    public /* synthetic */ F(Object obj, int i10, Object obj2) {
        this.f9358a = i10;
        this.f9359b = obj;
        this.f9360c = obj2;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        switch (this.f9358a) {
            case 0:
                ((InfiniteTransition) this.f9359b).f9366a.m((InfiniteTransition.a) this.f9360c);
                break;
            default:
                ((InterfaceC1376t) this.f9359b).getLifecycle().c((androidx.activity.e) this.f9360c);
                break;
        }
    }
}
