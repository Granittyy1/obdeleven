package androidx.compose.animation.core;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f9522a;

    public a0(Transition transition) {
        this.f9522a = transition;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        Transition transition = this.f9522a;
        transition.i();
        transition.f9429a.e();
    }
}
