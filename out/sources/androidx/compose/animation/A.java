package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f9228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0923x<p013b0.j> f9229b;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Ia.l<? super p013b0.l, p013b0.j> lVar, InterfaceC0923x<p013b0.j> interfaceC0923x) {
        this.f9228a = (Lambda) lVar;
        this.f9229b = interfaceC0923x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f9228a.equals(a10.f9228a) && kotlin.jvm.internal.i.a(this.f9229b, a10.f9229b);
    }

    public final int hashCode() {
        return this.f9229b.hashCode() + (this.f9228a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f9228a + ", animationSpec=" + this.f9229b + ')';
    }
}
