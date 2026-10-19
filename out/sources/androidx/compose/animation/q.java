package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0923x<Float> f9663b;

    public q(float f10, InterfaceC0923x<Float> interfaceC0923x) {
        this.f9662a = f10;
        this.f9663b = interfaceC0923x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f9662a, qVar.f9662a) == 0 && kotlin.jvm.internal.i.a(this.f9663b, qVar.f9663b);
    }

    public final int hashCode() {
        return this.f9663b.hashCode() + (Float.hashCode(this.f9662a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f9662a + ", animationSpec=" + this.f9663b + ')';
    }
}
