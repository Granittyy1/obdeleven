package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n0<V extends AbstractC0913m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0921v f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9582c;

    public n0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(AbstractC0913m abstractC0913m, InterfaceC0921v interfaceC0921v, int i10) {
        this.f9580a = abstractC0913m;
        this.f9581b = interfaceC0921v;
        this.f9582c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.i.a(this.f9580a, n0Var.f9580a) && kotlin.jvm.internal.i.a(this.f9581b, n0Var.f9581b) && this.f9582c == n0Var.f9582c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9582c) + ((this.f9581b.hashCode() + (this.f9580a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f9580a + ", easing=" + this.f9581b + ", arcMode=" + ((Object) ("ArcMode(value=" + this.f9582c + ')')) + ')';
    }
}
