package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f10243b;

    public X(a0 a0Var, a0 a0Var2) {
        this.f10242a = a0Var;
        this.f10243b = a0Var2;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return Math.max(this.f10242a.a(cVar, layoutDirection), this.f10243b.a(cVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return Math.max(this.f10242a.b(cVar), this.f10243b.b(cVar));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return Math.max(this.f10242a.c(cVar, layoutDirection), this.f10243b.c(cVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return Math.max(this.f10242a.d(cVar), this.f10243b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return kotlin.jvm.internal.i.a(x10.f10242a, this.f10242a) && kotlin.jvm.internal.i.a(x10.f10243b, this.f10243b);
    }

    public final int hashCode() {
        return (this.f10243b.hashCode() * 31) + this.f10242a.hashCode();
    }

    public final String toString() {
        return "(" + this.f10242a + " ∪ " + this.f10243b + ')';
    }
}
