package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.ui.graphics.q0;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0923x<Float> f9673c;

    public w() {
        throw null;
    }

    public w(float f10, long j, InterfaceC0923x interfaceC0923x) {
        this.f9671a = f10;
        this.f9672b = j;
        this.f9673c = interfaceC0923x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f9671a, wVar.f9671a) == 0 && q0.a(this.f9672b, wVar.f9672b) && kotlin.jvm.internal.i.a(this.f9673c, wVar.f9673c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f9671a) * 31;
        int i10 = q0.f13792c;
        return this.f9673c.hashCode() + C4.b.c(this.f9672b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f9671a + ", transformOrigin=" + ((Object) q0.d(this.f9672b)) + ", animationSpec=" + this.f9673c + ')';
    }
}
