package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0941a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f10247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f10248b;

    public C0941a(O o10, a0 a0Var) {
        this.f10247a = o10;
        this.f10248b = a0Var;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return this.f10248b.a(cVar, layoutDirection) + this.f10247a.a(cVar, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return this.f10248b.b(cVar) + this.f10247a.b(cVar);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return this.f10248b.c(cVar, layoutDirection) + this.f10247a.c(cVar, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return this.f10248b.d(cVar) + this.f10247a.d(cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0941a)) {
            return false;
        }
        C0941a c0941a = (C0941a) obj;
        return c0941a.f10247a.equals(this.f10247a) && kotlin.jvm.internal.i.a(c0941a.f10248b, this.f10248b);
    }

    public final int hashCode() {
        return (this.f10248b.hashCode() * 31) + this.f10247a.f10173a.hashCode();
    }

    public final String toString() {
        return "(" + this.f10247a + " + " + this.f10248b + ')';
    }
}
