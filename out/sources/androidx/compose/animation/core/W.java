package androidx.compose.animation.core;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class W implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f9504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f9505b;

    public W(Transition transition, Transition transition2) {
        this.f9504a = transition;
        this.f9505b = transition2;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f9504a.j.remove(this.f9505b);
    }
}
