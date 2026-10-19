package androidx.compose.animation.core;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K<S> extends b0<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f9381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f9382c;

    public K(S s10) {
        this.f9381b = J0.f(s10);
        this.f9382c = J0.f(s10);
    }

    @Override // androidx.compose.animation.core.b0
    public final S a() {
        return (S) this.f9381b.getValue();
    }

    @Override // androidx.compose.animation.core.b0
    public final S b() {
        return (S) this.f9382c.getValue();
    }

    @Override // androidx.compose.animation.core.b0
    public final void c(S s10) {
        this.f9381b.setValue(s10);
    }

    public final void f(Boolean bool) {
        this.f9382c.setValue(bool);
    }

    @Override // androidx.compose.animation.core.b0
    public final void e() {
    }

    @Override // androidx.compose.animation.core.b0
    public final void d(Transition<S> transition) {
    }
}
