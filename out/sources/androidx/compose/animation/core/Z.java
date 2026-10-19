package androidx.compose.animation.core;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Z implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9513b;

    public /* synthetic */ Z(int i10, Object obj) {
        this.f9512a = i10;
        this.f9513b = obj;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        switch (this.f9512a) {
            case 0:
                Transition transition = (Transition) this.f9513b;
                transition.i();
                transition.f9429a.e();
                break;
            default:
                ((androidx.compose.foundation.lazy.layout.H) this.f9513b).f10587d = null;
                break;
        }
    }
}
