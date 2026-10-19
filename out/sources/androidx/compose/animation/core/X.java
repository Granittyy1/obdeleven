package androidx.compose.animation.core;

import androidx.compose.foundation.text.TextLinkScope;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9508c;

    public /* synthetic */ X(Object obj, int i10, Object obj2) {
        this.f9506a = i10;
        this.f9507b = obj;
        this.f9508c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.A
    public final void dispose() {
        switch (this.f9506a) {
            case 0:
                Transition transition = (Transition) this.f9507b;
                transition.getClass();
                Transition.a.C0121a c0121a = (Transition.a.C0121a) ((Transition.a) this.f9508c).f9441b.getValue();
                if (c0121a != null) {
                    transition.f9437i.remove(c0121a.f9443b);
                }
                break;
            default:
                ((TextLinkScope) this.f9507b).f11236c.remove((Ia.l) this.f9508c);
                break;
        }
    }
}
