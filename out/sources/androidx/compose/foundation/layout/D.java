package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p013b0.c f10108b;

    public D(a0 a0Var, p013b0.c cVar) {
        this.f10107a = a0Var;
        this.f10108b = cVar;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float a() {
        a0 a0Var = this.f10107a;
        p013b0.c cVar = this.f10108b;
        return cVar.u(a0Var.b(cVar));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float b(LayoutDirection layoutDirection) {
        a0 a0Var = this.f10107a;
        p013b0.c cVar = this.f10108b;
        return cVar.u(a0Var.a(cVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float c(LayoutDirection layoutDirection) {
        a0 a0Var = this.f10107a;
        p013b0.c cVar = this.f10108b;
        return cVar.u(a0Var.c(cVar, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.L
    public final float d() {
        a0 a0Var = this.f10107a;
        p013b0.c cVar = this.f10108b;
        return cVar.u(a0Var.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return kotlin.jvm.internal.i.a(this.f10107a, d10.f10107a) && kotlin.jvm.internal.i.a(this.f10108b, d10.f10108b);
    }

    public final int hashCode() {
        return this.f10108b.hashCode() + (this.f10107a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f10107a + ", density=" + this.f10108b + ')';
    }
}
