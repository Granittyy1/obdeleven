package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f10173a;

    public O(L l10) {
        this.f10173a = l10;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return cVar.e1(this.f10173a.b(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return cVar.e1(this.f10173a.a());
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return cVar.e1(this.f10173a.c(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return cVar.e1(this.f10173a.d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            return kotlin.jvm.internal.i.a(((O) obj).f10173a, this.f10173a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10173a.hashCode();
    }

    public final String toString() {
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        L l10 = this.f10173a;
        return "PaddingValues(" + ((Object) p013b0.f.b(l10.b(layoutDirection))) + ", " + ((Object) p013b0.f.b(l10.d())) + ", " + ((Object) p013b0.f.b(l10.c(layoutDirection))) + ", " + ((Object) p013b0.f.b(l10.a())) + ')';
    }
}
