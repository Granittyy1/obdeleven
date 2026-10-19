package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0958s implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f10319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f10320b;

    public C0958s(a0 a0Var, a0 a0Var2) {
        this.f10319a = a0Var;
        this.f10320b = a0Var2;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        int iA = this.f10319a.a(cVar, layoutDirection) - this.f10320b.a(cVar, layoutDirection);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        int iB = this.f10319a.b(cVar) - this.f10320b.b(cVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        int iC = this.f10319a.c(cVar, layoutDirection) - this.f10320b.c(cVar, layoutDirection);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        int iD = this.f10319a.d(cVar) - this.f10320b.d(cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0958s)) {
            return false;
        }
        C0958s c0958s = (C0958s) obj;
        return kotlin.jvm.internal.i.a(c0958s.f10319a, this.f10319a) && kotlin.jvm.internal.i.a(c0958s.f10320b, this.f10320b);
    }

    public final int hashCode() {
        return this.f10320b.hashCode() + (this.f10319a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f10319a + " - " + this.f10320b + ')';
    }
}
