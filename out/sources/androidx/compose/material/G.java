package androidx.compose.material;

import androidx.compose.foundation.layout.C0960u;
import androidx.compose.foundation.layout.a0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: MutableWindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f0 f11753a;

    public G(a0 a0Var) {
        this.f11753a = J0.f(a0Var);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return ((a0) this.f11753a.getValue()).a(cVar, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return ((a0) this.f11753a.getValue()).b(cVar);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return ((a0) this.f11753a.getValue()).c(cVar, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return ((a0) this.f11753a.getValue()).d(cVar);
    }

    public G() {
        this(new C0960u());
    }
}
